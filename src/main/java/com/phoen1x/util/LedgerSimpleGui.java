package com.phoen1x.util;

import eu.pb4.sgui.api.gui.SimpleGui;
import eu.pb4.sgui.virtual.inventory.VirtualSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.server.network.ServerPlayerEntity;

public class LedgerSimpleGui extends SimpleGui {
    public LedgerSimpleGui(ScreenHandlerType<?> type, ServerPlayerEntity player, boolean manipulatePlayerSlots) {
        super(type, player, manipulatePlayerSlots);
    }

    @Override
    public ItemStack quickMove(int index) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.getSlotRedirectOrPlayer(index);
        if (slot != null && slot.hasStack() && !(slot instanceof VirtualSlot)) {
            ItemStack itemStack2 = slot.getStack();
            itemStack = itemStack2.copy();
            int inventorySize = this.getVirtualSize();
            if (index < inventorySize) {
                if (!this.insertItem(itemStack2, inventorySize, inventorySize + 36, true)) {
                    return ItemStack.EMPTY;
                }
            } else {
                if (!this.insertItem(itemStack2, 0, inventorySize, false)) {
                    return ItemStack.EMPTY;
                }
            }
            if (itemStack2.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
            slot.onTakeItem(this.player, itemStack);
        }
        return itemStack;
    }

    @Override
    public boolean insertItem(ItemStack stack, int startIndex, int endIndex, boolean fromEnd) {
        boolean inserted = false;
        int step = fromEnd ? -1 : 1;
        int i = fromEnd ? endIndex - 1 : startIndex;

        while (i >= startIndex && i < endIndex) {
            Slot slot = this.getSlotRedirectOrPlayer(i);
            if (slot != null && slot.canInsert(stack)) {
                ItemStack slotStack = slot.getStack();
                if (slotStack.isEmpty()) {
                    slot.setStack(stack.copy());
                    stack.setCount(0);
                    slot.markDirty();
                    inserted = true;
                    break;
                } else if (ItemStack.areItemsAndComponentsEqual(slotStack, stack)) {
                    int space = slotStack.getMaxCount() - slotStack.getCount();
                    if (space > 0) {
                        int toAdd = Math.min(space, stack.getCount());
                        slotStack.increment(toAdd);
                        stack.decrement(toAdd);
                        slot.markDirty();
                        inserted = true;
                        if (stack.isEmpty()) {
                            break;
                        }
                    }
                }
            }
            i += step;
        }

        if (!stack.isEmpty()) {
            i = fromEnd ? endIndex - 1 : startIndex;
            while (i >= startIndex && i < endIndex) {
                Slot slot = this.getSlotRedirectOrPlayer(i);
                if (slot != null && slot.canInsert(stack) && slot.getStack().isEmpty()) {
                    slot.setStack(stack.copy());
                    stack.setCount(0);
                    slot.markDirty();
                    inserted = true;
                    break;
                }
                i += step;
            }
        }

        return inserted;
    }
}