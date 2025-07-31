package com.phoen1x.registry;

import com.phoen1x.StorageDelightPort;
import com.phoen1x.block.entity.*;
import eu.pb4.polymer.core.api.block.PolymerBlockUtils;
import eu.pb4.polymer.core.api.entity.PolymerEntityUtils;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final BlockEntityType<BookshelfDoorBlockEntity> BOOKSHELF_DOOR = register("bookshelf_door", FabricBlockEntityTypeBuilder.create(BookshelfDoorBlockEntity::new,
            ModBlocks.OAK_BOOKSHELF_WITH_DOOR,
            ModBlocks.BIRCH_BOOKSHELF_WITH_DOOR,
            ModBlocks.SPRUCE_BOOKSHELF_WITH_DOOR,
            ModBlocks.JUNGLE_BOOKSHELF_WITH_DOOR,
            ModBlocks.ACACIA_BOOKSHELF_WITH_DOOR,
            ModBlocks.DARK_OAK_BOOKSHELF_WITH_DOOR,
            ModBlocks.MANGROVE_BOOKSHELF_WITH_DOOR,
            ModBlocks.CHERRY_BOOKSHELF_WITH_DOOR,
            ModBlocks.PALE_OAK_BOOKSHELF_WITH_DOOR,
            ModBlocks.BAMBOO_BOOKSHELF_WITH_DOOR,
            ModBlocks.CRIMSON_BOOKSHELF_WITH_DOOR,
            ModBlocks.WARPED_BOOKSHELF_WITH_DOOR));

    public static final BlockEntityType<CabinetVariantBlockEntity> CABINET_VARIANT  = register("cabinet_variant", FabricBlockEntityTypeBuilder.create(CabinetVariantBlockEntity::new,
            ModBlocks.OAK_CABINET_WITH_GLASS_DOORS,
            ModBlocks.BIRCH_CABINET_WITH_GLASS_DOORS,
            ModBlocks.SPRUCE_CABINET_WITH_GLASS_DOORS,
            ModBlocks.JUNGLE_CABINET_WITH_GLASS_DOORS,
            ModBlocks.ACACIA_CABINET_WITH_GLASS_DOORS,
            ModBlocks.DARK_OAK_CABINET_WITH_GLASS_DOORS,
            ModBlocks.MANGROVE_CABINET_WITH_GLASS_DOORS,
            ModBlocks.CHERRY_CABINET_WITH_GLASS_DOORS,
            ModBlocks.PALE_OAK_CABINET_WITH_GLASS_DOORS,
            ModBlocks.BAMBOO_CABINET_WITH_GLASS_DOORS,
            ModBlocks.CRIMSON_CABINET_WITH_GLASS_DOORS,
            ModBlocks.WARPED_CABINET_WITH_GLASS_DOORS,
            ModBlocks.OAK_SINGLE_DOOR_CABINET,
            ModBlocks.BIRCH_SINGLE_DOOR_CABINET,
            ModBlocks.SPRUCE_SINGLE_DOOR_CABINET,
            ModBlocks.JUNGLE_SINGLE_DOOR_CABINET,
            ModBlocks.ACACIA_SINGLE_DOOR_CABINET,
            ModBlocks.DARK_OAK_SINGLE_DOOR_CABINET,
            ModBlocks.MANGROVE_SINGLE_DOOR_CABINET,
            ModBlocks.CHERRY_SINGLE_DOOR_CABINET,
            ModBlocks.PALE_OAK_SINGLE_DOOR_CABINET,
            ModBlocks.BAMBOO_SINGLE_DOOR_CABINET,
            ModBlocks.CRIMSON_SINGLE_DOOR_CABINET,
            ModBlocks.WARPED_SINGLE_DOOR_CABINET));

    public static final BlockEntityType<DrawerBlockEntity> DRAWER = register("drawer", FabricBlockEntityTypeBuilder.create(DrawerBlockEntity::new,
            ModBlocks.OAK_DRAWER,
            ModBlocks.BIRCH_DRAWER,
            ModBlocks.SPRUCE_DRAWER,
            ModBlocks.JUNGLE_DRAWER,
            ModBlocks.ACACIA_DRAWER,
            ModBlocks.DARK_OAK_DRAWER,
            ModBlocks.MANGROVE_DRAWER,
            ModBlocks.CHERRY_DRAWER,
            ModBlocks.PALE_OAK_DRAWER,
            ModBlocks.BAMBOO_DRAWER,
            ModBlocks.CRIMSON_DRAWER,
            ModBlocks.WARPED_DRAWER));

    public static final BlockEntityType<DrawerDoorBlockEntity> DRAWER_DOOR  = register("drawer_door", FabricBlockEntityTypeBuilder.create(DrawerDoorBlockEntity::new,
            ModBlocks.OAK_DRAWER_WITH_DOOR,
            ModBlocks.BIRCH_DRAWER_WITH_DOOR,
            ModBlocks.SPRUCE_DRAWER_WITH_DOOR,
            ModBlocks.JUNGLE_DRAWER_WITH_DOOR,
            ModBlocks.ACACIA_DRAWER_WITH_DOOR,
            ModBlocks.DARK_OAK_DRAWER_WITH_DOOR,
            ModBlocks.MANGROVE_DRAWER_WITH_DOOR,
            ModBlocks.CHERRY_DRAWER_WITH_DOOR,
            ModBlocks.PALE_OAK_DRAWER_WITH_DOOR,
            ModBlocks.BAMBOO_DRAWER_WITH_DOOR,
            ModBlocks.CRIMSON_DRAWER_WITH_DOOR,
            ModBlocks.WARPED_DRAWER_WITH_DOOR));

    public static final BlockEntityType<DrawerBooksBlockEntity> DRAWER_BOOKS  = register("drawer_books", FabricBlockEntityTypeBuilder.create(DrawerBooksBlockEntity::new,
            ModBlocks.OAK_DRAWER_WITH_BOOKS,
            ModBlocks.BIRCH_DRAWER_WITH_BOOKS,
            ModBlocks.SPRUCE_DRAWER_WITH_BOOKS,
            ModBlocks.JUNGLE_DRAWER_WITH_BOOKS,
            ModBlocks.ACACIA_DRAWER_WITH_BOOKS,
            ModBlocks.DARK_OAK_DRAWER_WITH_BOOKS,
            ModBlocks.MANGROVE_DRAWER_WITH_BOOKS,
            ModBlocks.CHERRY_DRAWER_WITH_BOOKS,
            ModBlocks.PALE_OAK_DRAWER_WITH_BOOKS,
            ModBlocks.BAMBOO_DRAWER_WITH_BOOKS,
            ModBlocks.CRIMSON_DRAWER_WITH_BOOKS,
            ModBlocks.WARPED_DRAWER_WITH_BOOKS));

    public static final BlockEntityType<SmallDrawersBlockEntity> SMALL_DRAWERS  = register("small_drawers", FabricBlockEntityTypeBuilder.create(SmallDrawersBlockEntity::new,
            ModBlocks.SMALL_OAK_DRAWERS,
            ModBlocks.SMALL_BIRCH_DRAWERS,
            ModBlocks.SMALL_SPRUCE_DRAWERS,
            ModBlocks.SMALL_JUNGLE_DRAWERS,
            ModBlocks.SMALL_ACACIA_DRAWERS,
            ModBlocks.SMALL_DARK_OAK_DRAWERS,
            ModBlocks.SMALL_MANGROVE_DRAWERS,
            ModBlocks.SMALL_CHERRY_DRAWERS,
            ModBlocks.SMALL_PALE_OAK_DRAWERS,
            ModBlocks.SMALL_BAMBOO_DRAWERS,
            ModBlocks.SMALL_CRIMSON_DRAWERS,
            ModBlocks.SMALL_WARPED_DRAWERS));

    public static final BlockEntityType<GlassCabinetBlockEntity> GLASS_CABINET  = register("glass_cabinet", FabricBlockEntityTypeBuilder.create(GlassCabinetBlockEntity::new,
            ModBlocks.GLASS_OAK_CABINET,
            ModBlocks.GLASS_BIRCH_CABINET,
            ModBlocks.GLASS_SPRUCE_CABINET,
            ModBlocks.GLASS_JUNGLE_CABINET,
            ModBlocks.GLASS_ACACIA_CABINET,
            ModBlocks.GLASS_DARK_OAK_CABINET,
            ModBlocks.GLASS_MANGROVE_CABINET,
            ModBlocks.GLASS_CHERRY_CABINET,
            ModBlocks.GLASS_PALE_OAK_CABINET,
            ModBlocks.GLASS_BAMBOO_CABINET,
            ModBlocks.GLASS_CRIMSON_CABINET,
            ModBlocks.GLASS_WARPED_CABINET));

    public static void register() {}

    public static <T extends BlockEntity> BlockEntityType<T> register(String path, FabricBlockEntityTypeBuilder<T> factory) {
        BlockEntityType<T> blockEntityType = Registry.register(Registries.BLOCK_ENTITY_TYPE,Identifier.of(StorageDelightPort.MOD_ID, path), factory.build());
        PolymerBlockUtils.registerBlockEntity(blockEntityType);

        return blockEntityType;
    }
    public static <T extends Entity> EntityType<T> register(String path, EntityType.Builder<T> item) {
        var x = Registry.register(Registries.ENTITY_TYPE, Identifier.of(StorageDelightPort.MOD_ID, path), item.build(RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(StorageDelightPort.MOD_ID, path))));
        PolymerEntityUtils.registerType(x);
        return x;
    }
}