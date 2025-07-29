package com.phoen1x.block.entity;

import com.phoen1x.StorageDelightPort;
import com.phoen1x.block.BookshelfDoorBlock;
import com.phoen1x.registry.*;
import com.phoen1x.util.LedgerSimpleGui;
import com.phoen1x.util.LedgerSlot;
import com.phoen1x.util.MinimalSidedInventory;
import eu.pb4.factorytools.api.block.entity.LockableBlockEntity;
import eu.pb4.factorytools.api.block.BlockEntityExtraListener;
import eu.pb4.polymer.virtualentity.api.attachment.BlockAwareAttachment;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ViewerCountManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.chunk.WorldChunk;
import org.jetbrains.annotations.Nullable;

public class BookshelfDoorBlockEntity extends LockableBlockEntity implements MinimalSidedInventory, SidedInventory, BlockEntityExtraListener {
    private static final int[] SLOTS = new int[27];
    static {
        for (int i = 0; i < 27; i++) {
            SLOTS[i] = i;
        }
    }
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(27, ItemStack.EMPTY);

    public BookshelfDoorBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityTypesRegistry.BOOKSHELF_DOOR, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getStacks() {
        return this.inventory;
    }

    public static <T extends BlockEntity> void tick(World world, BlockPos pos, BlockState state, T t) {
        if (t instanceof BookshelfDoorBlockEntity entity) {
            entity.stateManager.updateViewerCount(world, pos, state);
        }
    }

    private final ViewerCountManager stateManager = new ViewerCountManager() {
        @Override
        protected void onContainerOpen(World world, BlockPos pos, BlockState state) {
            BookshelfDoorBlockEntity.this.playSound(state, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN);
            BookshelfDoorBlockEntity.this.setOpen(state, true);
        }

        @Override
        protected void onContainerClose(World world, BlockPos pos, BlockState state) {
            BookshelfDoorBlockEntity.this.playSound(state, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE);
            BookshelfDoorBlockEntity.this.setOpen(state, false);
        }

        @Override
        protected void onViewerCountUpdate(World world, BlockPos pos, BlockState state, int oldViewerCount, int newViewerCount) {
        }

        @Override
        protected boolean isPlayerViewing(PlayerEntity player) {
            var handler = player.currentScreenHandler;
            if (handler != null && !handler.slots.isEmpty()) {
                var slotInventory = handler.slots.get(0).inventory;
                return slotInventory == BookshelfDoorBlockEntity.this;
            }

            return false;
        }
    };

    @Override
    public void markDirty() {
        super.markDirty();
        if (this.world != null && !this.world.isClient) {
            this.world.markDirty(this.pos);
        }
    }

    @Override
    public int[] getAvailableSlots(Direction side) {
        return SLOTS;
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return true;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return true;
    }

    @Override
    public void onListenerUpdate(WorldChunk chunk) {
        try {
            BlockAwareAttachment.get(chunk, this.getPos());
        } catch (Throwable e) {
            StorageDelightPort.LOGGER.debug("Error updating bookshelf model: ", e);
        }
    }

    @Override
    protected void writeData(WriteView view) {
        super.writeData(view);
        Inventories.writeData(view, this.inventory);
    }

    @Override
    public void readData(ReadView view) {
        super.readData(view);
        Inventories.readData(view, this.inventory);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.storagedelight.bookshelf_door");
    }

    @Override
    protected void createGui(ServerPlayerEntity player) {
        new Gui(player).open();
    }

    void setOpen(BlockState state, boolean open) {
        if (this.world != null) {
            this.world.setBlockState(this.getPos(), state.with(BookshelfDoorBlock.OPEN, open), 3);
        }
    }

    void playSound(BlockState state, SoundEvent soundEvent) {
        Vec3i vec3i = state.get(BookshelfDoorBlock.FACING).getVector();
        double d = this.pos.getX() + 0.5 + vec3i.getX() / 2.0;
        double e = this.pos.getY() + 0.5 + vec3i.getY() / 2.0;
        double f = this.pos.getZ() + 0.5 + vec3i.getZ() / 2.0;
        this.world.playSound(null, d, e, f, soundEvent, SoundCategory.BLOCKS, 0.5F, this.world.random.nextFloat() * 0.1F + 0.9F);
    }

    private class Gui extends LedgerSimpleGui {
        public Gui(ServerPlayerEntity player) {
            super(ScreenHandlerType.GENERIC_9X3, player, false);
            this.setTitle(Text.translatable("container.storagedelight.bookshelf_door"));
            for (int i = 0; i < 27; i++) {
                this.setSlotRedirect(i, new LedgerSlot(pos, player, BookshelfDoorBlockEntity.this, i, 1, 1));
            }
        }

        @Override
        public void onTick() {
            if (player.getPos().squaredDistanceTo(Vec3d.ofCenter(BookshelfDoorBlockEntity.this.pos)) > (18 * 18)) {
                this.close();
            }
            super.onTick();
        }
    }
}