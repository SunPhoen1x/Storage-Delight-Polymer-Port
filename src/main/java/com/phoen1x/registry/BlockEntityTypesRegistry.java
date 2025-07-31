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

public class BlockEntityTypesRegistry {
    public static final BlockEntityType<BookshelfDoorBlockEntity> BOOKSHELF_DOOR = register("bookshelf_door", FabricBlockEntityTypeBuilder.create(BookshelfDoorBlockEntity::new,
            BlockRegistry.OAK_BOOKSHELF_WITH_DOOR,
            BlockRegistry.BIRCH_BOOKSHELF_WITH_DOOR,
            BlockRegistry.SPRUCE_BOOKSHELF_WITH_DOOR,
            BlockRegistry.JUNGLE_BOOKSHELF_WITH_DOOR,
            BlockRegistry.ACACIA_BOOKSHELF_WITH_DOOR,
            BlockRegistry.DARK_OAK_BOOKSHELF_WITH_DOOR,
            BlockRegistry.MANGROVE_BOOKSHELF_WITH_DOOR,
            BlockRegistry.CHERRY_BOOKSHELF_WITH_DOOR,
            BlockRegistry.PALE_OAK_BOOKSHELF_WITH_DOOR,
            BlockRegistry.BAMBOO_BOOKSHELF_WITH_DOOR,
            BlockRegistry.CRIMSON_BOOKSHELF_WITH_DOOR,
            BlockRegistry.WARPED_BOOKSHELF_WITH_DOOR));

    public static final BlockEntityType<CabinetVariantBlockEntity> CABINET_VARIANT  = register("cabinet_variant", FabricBlockEntityTypeBuilder.create(CabinetVariantBlockEntity::new,
            BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.PALE_OAK_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS,
            BlockRegistry.OAK_SINGLE_DOOR_CABINET,
            BlockRegistry.BIRCH_SINGLE_DOOR_CABINET,
            BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET,
            BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET,
            BlockRegistry.ACACIA_SINGLE_DOOR_CABINET,
            BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET,
            BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET,
            BlockRegistry.CHERRY_SINGLE_DOOR_CABINET,
            BlockRegistry.PALE_OAK_SINGLE_DOOR_CABINET,
            BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET,
            BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET,
            BlockRegistry.WARPED_SINGLE_DOOR_CABINET));

    public static final BlockEntityType<DrawerBlockEntity> DRAWER = register("drawer", FabricBlockEntityTypeBuilder.create(DrawerBlockEntity::new,
            BlockRegistry.OAK_DRAWER,
            BlockRegistry.BIRCH_DRAWER,
            BlockRegistry.SPRUCE_DRAWER,
            BlockRegistry.JUNGLE_DRAWER,
            BlockRegistry.ACACIA_DRAWER,
            BlockRegistry.DARK_OAK_DRAWER,
            BlockRegistry.MANGROVE_DRAWER,
            BlockRegistry.CHERRY_DRAWER,
            BlockRegistry.PALE_OAK_DRAWER,
            BlockRegistry.BAMBOO_DRAWER,
            BlockRegistry.CRIMSON_DRAWER,
            BlockRegistry.WARPED_DRAWER));

    public static final BlockEntityType<DrawerDoorBlockEntity> DRAWER_DOOR  = register("drawer_door", FabricBlockEntityTypeBuilder.create(DrawerDoorBlockEntity::new,
            BlockRegistry.OAK_DRAWER_WITH_DOOR,
            BlockRegistry.BIRCH_DRAWER_WITH_DOOR,
            BlockRegistry.SPRUCE_DRAWER_WITH_DOOR,
            BlockRegistry.JUNGLE_DRAWER_WITH_DOOR,
            BlockRegistry.ACACIA_DRAWER_WITH_DOOR,
            BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR,
            BlockRegistry.MANGROVE_DRAWER_WITH_DOOR,
            BlockRegistry.CHERRY_DRAWER_WITH_DOOR,
            BlockRegistry.PALE_OAK_DRAWER_WITH_DOOR,
            BlockRegistry.BAMBOO_DRAWER_WITH_DOOR,
            BlockRegistry.CRIMSON_DRAWER_WITH_DOOR,
            BlockRegistry.WARPED_DRAWER_WITH_DOOR));

    public static final BlockEntityType<DrawerBooksBlockEntity> DRAWER_BOOKS  = register("drawer_books", FabricBlockEntityTypeBuilder.create(DrawerBooksBlockEntity::new,
            BlockRegistry.OAK_DRAWER_WITH_BOOKS,
            BlockRegistry.BIRCH_DRAWER_WITH_BOOKS,
            BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS,
            BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS,
            BlockRegistry.ACACIA_DRAWER_WITH_BOOKS,
            BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS,
            BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS,
            BlockRegistry.CHERRY_DRAWER_WITH_BOOKS,
            BlockRegistry.PALE_OAK_DRAWER_WITH_BOOKS,
            BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS,
            BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS,
            BlockRegistry.WARPED_DRAWER_WITH_BOOKS));

    public static final BlockEntityType<SmallDrawersBlockEntity> SMALL_DRAWERS  = register("small_drawers", FabricBlockEntityTypeBuilder.create(SmallDrawersBlockEntity::new,
            BlockRegistry.SMALL_OAK_DRAWERS,
            BlockRegistry.SMALL_BIRCH_DRAWERS,
            BlockRegistry.SMALL_SPRUCE_DRAWERS,
            BlockRegistry.SMALL_JUNGLE_DRAWERS,
            BlockRegistry.SMALL_ACACIA_DRAWERS,
            BlockRegistry.SMALL_DARK_OAK_DRAWERS,
            BlockRegistry.SMALL_MANGROVE_DRAWERS,
            BlockRegistry.SMALL_CHERRY_DRAWERS,
            BlockRegistry.SMALL_PALE_OAK_DRAWERS,
            BlockRegistry.SMALL_BAMBOO_DRAWERS,
            BlockRegistry.SMALL_CRIMSON_DRAWERS,
            BlockRegistry.SMALL_WARPED_DRAWERS));

    public static final BlockEntityType<GlassCabinetBlockEntity> GLASS_CABINET  = register("glass_cabinet", FabricBlockEntityTypeBuilder.create(GlassCabinetBlockEntity::new,
            BlockRegistry.GLASS_OAK_CABINET,
            BlockRegistry.GLASS_BIRCH_CABINET,
            BlockRegistry.GLASS_SPRUCE_CABINET,
            BlockRegistry.GLASS_JUNGLE_CABINET,
            BlockRegistry.GLASS_ACACIA_CABINET,
            BlockRegistry.GLASS_DARK_OAK_CABINET,
            BlockRegistry.GLASS_MANGROVE_CABINET,
            BlockRegistry.GLASS_CHERRY_CABINET,
            BlockRegistry.GLASS_PALE_OAK_CABINET,
            BlockRegistry.GLASS_BAMBOO_CABINET,
            BlockRegistry.GLASS_CRIMSON_CABINET,
            BlockRegistry.GLASS_WARPED_CABINET));

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