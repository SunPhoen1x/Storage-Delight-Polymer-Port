package com.phoen1x.block;

import com.mojang.serialization.MapCodec;
import com.phoen1x.StorageDelightPort;
import com.phoen1x.block.entity.GlassCabinetBlockEntity;
import eu.pb4.factorytools.api.block.FactoryBlock;
import eu.pb4.factorytools.api.virtualentity.BlockModel;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import eu.pb4.polymer.virtualentity.api.attachment.BlockBoundAttachment;
import eu.pb4.polymer.virtualentity.api.attachment.HolderAttachment;
import eu.pb4.polymer.virtualentity.api.elements.ItemDisplayElement;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;
import xyz.nucleoid.packettweaker.PacketContext;

public class GlassCabinetBlock extends BlockWithEntity implements FactoryBlock, InventoryProvider {
    public static final MapCodec<GlassCabinetBlock> CODEC = createCodec(GlassCabinetBlock::new);
    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;
    public static final BooleanProperty OPEN = Properties.OPEN;
    private Model model;

    public GlassCabinetBlock(Settings settings) {
        super(settings.nonOpaque());
        this.setDefaultState(getStateManager().getDefaultState().with(FACING, Direction.NORTH).with(OPEN, false));
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state, PacketContext context) {
        return Blocks.BARRIER.getDefaultState();
    }

    @Override
    public BlockState getPolymerBreakEventBlockState(BlockState state, PacketContext context) {
        return Blocks.BOOKSHELF.getDefaultState();
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GlassCabinetBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return GlassCabinetBlockEntity::tick;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!player.isSneaking() && world.getBlockEntity(pos) instanceof GlassCabinetBlockEntity entity) {
            entity.openGui((ServerPlayerEntity) player);
            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hit);
    }

    @Override
    public SidedInventory getInventory(BlockState state, WorldAccess world, BlockPos pos) {
        var inv = world.getBlockEntity(pos);
        return inv instanceof SidedInventory ? (SidedInventory) inv : null;
    }

    @Override
    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite()).with(OPEN, false);
    }

    @Override
    public @Nullable ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        Identifier blockId = Registries.BLOCK.getId(this);
        model = new Model(initialBlockState, world, pos, blockId);
        return model;
    }

    @Override
    public boolean tickElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        this.model.tick();
        return true;
    }

    public static class Model extends BlockModel {
        private final ItemStack OPEN_FALSE;
        private final ItemStack OPEN_TRUE;
        private final ItemDisplayElement glass_cabinet;
        private final ItemDisplayElement[] items = new ItemDisplayElement[3];
        private final ServerWorld world;
        private final BlockPos pos;

        public Model(BlockState state, ServerWorld world, BlockPos pos, Identifier blockId) {
            this.world = world;
            this.pos = pos;
            String blockName = blockId.getPath();
            this.OPEN_FALSE = ItemDisplayElementUtil.getModel(Identifier.of(StorageDelightPort.MOD_ID, "block/" + blockName));
            this.OPEN_TRUE = ItemDisplayElementUtil.getModel(Identifier.of(StorageDelightPort.MOD_ID, "block/" + blockName + "_open"));
            this.glass_cabinet = state.get(OPEN) ? ItemDisplayElementUtil.createSimple(OPEN_TRUE) : ItemDisplayElementUtil.createSimple(OPEN_FALSE);
            this.glass_cabinet.setScale(new Vector3f(2.0f));
            this.updateStatePos(state);
            this.addElement(glass_cabinet);
        }

        private void updateStatePos(BlockState state) {
            var direction = state.get(FACING);
            var yaw = direction.getPositiveHorizontalDegrees();
            this.glass_cabinet.setYaw(yaw);
            for (var item : this.items) {
                if (item != null) {
                    item.setYaw(yaw + 180);
                    item.setPitch(-90f);
                }
            }
        }

        private void updateBookshelfModel(BlockState state) {
            ItemStack newModel = state.get(OPEN) ? OPEN_TRUE : OPEN_FALSE;
            this.glass_cabinet.setItem(newModel);
            this.glass_cabinet.tick();
        }

        public void setItem(int i, ItemStack stack) {
            if (i < items.length) {
                this.items[i].setItem(stack.copy());
                this.items[i].tick();
            }
        }

        public void updateItems(DefaultedList<ItemStack> stacks) {
            for (int i = 0; i < Math.min(stacks.size(), items.length); i++) {
                setItem(i, stacks.get(i));
            }
        }

        @Override
        protected void onTick() {
        }

        @Override
        public void notifyUpdate(HolderAttachment.UpdateType updateType) {
            if (updateType == BlockBoundAttachment.BLOCK_STATE_UPDATE) {
                updateBookshelfModel(this.blockState());
                updateStatePos(this.blockState());
            }
            super.notifyUpdate(updateType);
        }
    }
}