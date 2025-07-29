package com.phoen1x.registry.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static com.phoen1x.registry.BlockRegistry.*;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(OAK_DRAWER);
        addDrop(OAK_DRAWER_WITH_DOOR);
        addDrop(OAK_DRAWER_WITH_BOOKS);
        addDrop(SMALL_OAK_DRAWERS);
        addDrop(OAK_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_OAK_CABINET);
        addDrop(OAK_CABINET_WITH_GLASS_DOORS);
        addDrop(OAK_SINGLE_DOOR_CABINET);

        addDrop(BIRCH_DRAWER);
        addDrop(BIRCH_DRAWER_WITH_DOOR);
        addDrop(BIRCH_DRAWER_WITH_BOOKS);
        addDrop(SMALL_BIRCH_DRAWERS);
        addDrop(BIRCH_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_BIRCH_CABINET);
        addDrop(BIRCH_CABINET_WITH_GLASS_DOORS);
        addDrop(BIRCH_SINGLE_DOOR_CABINET);

        addDrop(SPRUCE_DRAWER);
        addDrop(SPRUCE_DRAWER_WITH_DOOR);
        addDrop(SPRUCE_DRAWER_WITH_BOOKS);
        addDrop(SMALL_SPRUCE_DRAWERS);
        addDrop(SPRUCE_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_SPRUCE_CABINET);
        addDrop(SPRUCE_CABINET_WITH_GLASS_DOORS);
        addDrop(SPRUCE_SINGLE_DOOR_CABINET);

        addDrop(JUNGLE_DRAWER);
        addDrop(JUNGLE_DRAWER_WITH_DOOR);
        addDrop(JUNGLE_DRAWER_WITH_BOOKS);
        addDrop(SMALL_JUNGLE_DRAWERS);
        addDrop(JUNGLE_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_JUNGLE_CABINET);
        addDrop(JUNGLE_CABINET_WITH_GLASS_DOORS);
        addDrop(JUNGLE_SINGLE_DOOR_CABINET);

        addDrop(ACACIA_DRAWER);
        addDrop(ACACIA_DRAWER_WITH_DOOR);
        addDrop(ACACIA_DRAWER_WITH_BOOKS);
        addDrop(SMALL_ACACIA_DRAWERS);
        addDrop(ACACIA_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_ACACIA_CABINET);
        addDrop(ACACIA_CABINET_WITH_GLASS_DOORS);
        addDrop(ACACIA_SINGLE_DOOR_CABINET);

        addDrop(DARK_OAK_DRAWER);
        addDrop(DARK_OAK_DRAWER_WITH_DOOR);
        addDrop(DARK_OAK_DRAWER_WITH_BOOKS);
        addDrop(SMALL_DARK_OAK_DRAWERS);
        addDrop(DARK_OAK_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_DARK_OAK_CABINET);
        addDrop(DARK_OAK_CABINET_WITH_GLASS_DOORS);
        addDrop(DARK_OAK_SINGLE_DOOR_CABINET);

        addDrop(MANGROVE_DRAWER);
        addDrop(MANGROVE_DRAWER_WITH_DOOR);
        addDrop(MANGROVE_DRAWER_WITH_BOOKS);
        addDrop(SMALL_MANGROVE_DRAWERS);
        addDrop(MANGROVE_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_MANGROVE_CABINET);
        addDrop(MANGROVE_CABINET_WITH_GLASS_DOORS);
        addDrop(MANGROVE_SINGLE_DOOR_CABINET);

        addDrop(CHERRY_DRAWER);
        addDrop(CHERRY_DRAWER_WITH_DOOR);
        addDrop(CHERRY_DRAWER_WITH_BOOKS);
        addDrop(SMALL_CHERRY_DRAWERS);
        addDrop(CHERRY_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_CHERRY_CABINET);
        addDrop(CHERRY_CABINET_WITH_GLASS_DOORS);
        addDrop(CHERRY_SINGLE_DOOR_CABINET);

        addDrop(PALE_OAK_DRAWER);
        addDrop(PALE_OAK_DRAWER_WITH_DOOR);
        addDrop(PALE_OAK_DRAWER_WITH_BOOKS);
        addDrop(SMALL_PALE_OAK_DRAWERS);
        addDrop(PALE_OAK_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_PALE_OAK_CABINET);
        addDrop(PALE_OAK_CABINET_WITH_GLASS_DOORS);
        addDrop(PALE_OAK_SINGLE_DOOR_CABINET);

        addDrop(BAMBOO_DRAWER);
        addDrop(BAMBOO_DRAWER_WITH_DOOR);
        addDrop(BAMBOO_DRAWER_WITH_BOOKS);
        addDrop(SMALL_BAMBOO_DRAWERS);
        addDrop(BAMBOO_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_BAMBOO_CABINET);
        addDrop(BAMBOO_CABINET_WITH_GLASS_DOORS);
        addDrop(BAMBOO_SINGLE_DOOR_CABINET);

        addDrop(CRIMSON_DRAWER);
        addDrop(CRIMSON_DRAWER_WITH_DOOR);
        addDrop(CRIMSON_DRAWER_WITH_BOOKS);
        addDrop(SMALL_CRIMSON_DRAWERS);
        addDrop(CRIMSON_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_CRIMSON_CABINET);
        addDrop(CRIMSON_CABINET_WITH_GLASS_DOORS);
        addDrop(CRIMSON_SINGLE_DOOR_CABINET);

        addDrop(WARPED_DRAWER);
        addDrop(WARPED_DRAWER_WITH_DOOR);
        addDrop(WARPED_DRAWER_WITH_BOOKS);
        addDrop(SMALL_WARPED_DRAWERS);
        addDrop(WARPED_BOOKSHELF_WITH_DOOR);
        addDrop(GLASS_WARPED_CABINET);
        addDrop(WARPED_CABINET_WITH_GLASS_DOORS);
        addDrop(WARPED_SINGLE_DOOR_CABINET);
    }
}