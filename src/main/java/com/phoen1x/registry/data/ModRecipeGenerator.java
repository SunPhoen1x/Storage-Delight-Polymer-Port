package com.phoen1x.registry.data;

import com.phoen1x.StorageDelightPort;
import com.phoen1x.registry.BlockRegistry;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

public class ModRecipeGenerator extends RecipeGenerator {

    private final RegistryEntryLookup<Item> itemLookup;

    public ModRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
        this.itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
    }

    @Override
    public void generate() {
        generateStorageSet("oak",
                BlockRegistry.OAK_DRAWER_ITEM, BlockRegistry.OAK_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.OAK_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_OAK_DRAWERS_ITEM,
                BlockRegistry.OAK_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_OAK_CABINET_ITEM,
                BlockRegistry.OAK_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.OAK_SLAB, Items.OAK_TRAPDOOR, this.exporter);

        generateStorageSet("spruce",
                BlockRegistry.SPRUCE_DRAWER_ITEM, BlockRegistry.SPRUCE_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_SPRUCE_DRAWERS_ITEM,
                BlockRegistry.SPRUCE_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_SPRUCE_CABINET_ITEM,
                BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.SPRUCE_SLAB, Items.SPRUCE_TRAPDOOR, this.exporter);

        generateStorageSet("birch",
                BlockRegistry.BIRCH_DRAWER_ITEM, BlockRegistry.BIRCH_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.BIRCH_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_BIRCH_DRAWERS_ITEM,
                BlockRegistry.BIRCH_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_BIRCH_CABINET_ITEM,
                BlockRegistry.BIRCH_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.BIRCH_SLAB, Items.BIRCH_TRAPDOOR, this.exporter);

        generateStorageSet("jungle",
                BlockRegistry.JUNGLE_DRAWER_ITEM, BlockRegistry.JUNGLE_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_JUNGLE_DRAWERS_ITEM,
                BlockRegistry.JUNGLE_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_JUNGLE_CABINET_ITEM,
                BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.JUNGLE_SLAB, Items.JUNGLE_TRAPDOOR, this.exporter);

        generateStorageSet("acacia",
                BlockRegistry.ACACIA_DRAWER_ITEM, BlockRegistry.ACACIA_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.ACACIA_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_ACACIA_DRAWERS_ITEM,
                BlockRegistry.ACACIA_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_ACACIA_CABINET_ITEM,
                BlockRegistry.ACACIA_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.ACACIA_SLAB, Items.ACACIA_TRAPDOOR, this.exporter);

        generateStorageSet("dark_oak",
                BlockRegistry.DARK_OAK_DRAWER_ITEM, BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_DARK_OAK_DRAWERS_ITEM,
                BlockRegistry.DARK_OAK_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_DARK_OAK_CABINET_ITEM,
                BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.DARK_OAK_SLAB, Items.DARK_OAK_TRAPDOOR, this.exporter);

        generateStorageSet("mangrove",
                BlockRegistry.MANGROVE_DRAWER_ITEM, BlockRegistry.MANGROVE_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_MANGROVE_DRAWERS_ITEM,
                BlockRegistry.MANGROVE_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_MANGROVE_CABINET_ITEM,
                BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.MANGROVE_SLAB, Items.MANGROVE_TRAPDOOR, this.exporter);

        generateStorageSet("cherry",
                BlockRegistry.CHERRY_DRAWER_ITEM, BlockRegistry.CHERRY_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.CHERRY_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_CHERRY_DRAWERS_ITEM,
                BlockRegistry.CHERRY_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_CHERRY_CABINET_ITEM,
                BlockRegistry.CHERRY_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.CHERRY_SLAB, Items.CHERRY_TRAPDOOR, this.exporter);

        generateStorageSet("bamboo",
                BlockRegistry.BAMBOO_DRAWER_ITEM, BlockRegistry.BAMBOO_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_BAMBOO_DRAWERS_ITEM,
                BlockRegistry.BAMBOO_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_BAMBOO_CABINET_ITEM,
                BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.BAMBOO_SLAB, Items.BAMBOO_TRAPDOOR, this.exporter);

        generateStorageSet("crimson",
                BlockRegistry.CRIMSON_DRAWER_ITEM, BlockRegistry.CRIMSON_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_CRIMSON_DRAWERS_ITEM,
                BlockRegistry.CRIMSON_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_CRIMSON_CABINET_ITEM,
                BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.CRIMSON_SLAB, Items.CRIMSON_TRAPDOOR, this.exporter);

        generateStorageSet("warped",
                BlockRegistry.WARPED_DRAWER_ITEM, BlockRegistry.WARPED_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.WARPED_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_WARPED_DRAWERS_ITEM,
                BlockRegistry.WARPED_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_WARPED_CABINET_ITEM,
                BlockRegistry.WARPED_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.WARPED_SLAB, Items.WARPED_TRAPDOOR, this.exporter);

        generateStorageSet("pale_oak",
                BlockRegistry.PALE_OAK_DRAWER_ITEM, BlockRegistry.PALE_OAK_DRAWER_WITH_DOOR_ITEM,
                BlockRegistry.PALE_OAK_DRAWER_WITH_BOOKS_ITEM, BlockRegistry.SMALL_PALE_OAK_DRAWERS_ITEM,
                BlockRegistry.PALE_OAK_BOOKSHELF_WITH_DOOR_ITEM, BlockRegistry.GLASS_PALE_OAK_CABINET_ITEM,
                BlockRegistry.PALE_OAK_SINGLE_DOOR_CABINET_ITEM, BlockRegistry.PALE_OAK_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.PALE_OAK_SLAB, Items.PALE_OAK_TRAPDOOR, this.exporter);
    }

    private void generateStorageSet(String woodType, Item drawer, Item drawerWithDoor,
                                    Item drawerWithBooks, Item smallDrawers, Item bookshelfWithDoor,
                                    Item glassCabinet, Item singleDoorCabinet, Item cabinetWithGlassDoors,
                                    Item slab, Item trapdoor, RecipeExporter exporter) {

        createShaped(RecipeCategory.DECORATIONS, drawer)
                .pattern("AAA")
                .pattern("BBB")
                .pattern("AAA")
                .input('A', slab)
                .input('B', trapdoor)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .offerTo(exporter);

        createShaped(RecipeCategory.DECORATIONS, drawerWithDoor)
                .pattern("AAA")
                .pattern("BBB")
                .pattern("ABA")
                .input('A', slab)
                .input('B', trapdoor)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .offerTo(exporter);

        createShaped(RecipeCategory.DECORATIONS, drawerWithBooks)
                .pattern("AAA")
                .pattern("BBB")
                .pattern("ACA")
                .input('A', slab)
                .input('B', trapdoor)
                .input('C', Items.BOOKSHELF)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .criterion(hasItem(Items.BOOKSHELF), conditionsFromItem(Items.BOOKSHELF))
                .offerTo(exporter);

        createShaped(RecipeCategory.DECORATIONS, smallDrawers)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .input('A', slab)
                .input('B', trapdoor)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .offerTo(exporter);

        createShaped(RecipeCategory.DECORATIONS, bookshelfWithDoor)
                .pattern("AAA")
                .pattern("BAC")
                .pattern("AAA")
                .input('A', slab)
                .input('B', trapdoor)
                .input('C', Items.BOOKSHELF)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .criterion(hasItem(Items.BOOKSHELF), conditionsFromItem(Items.BOOKSHELF))
                .offerTo(exporter);

        createShaped(RecipeCategory.DECORATIONS, glassCabinet)
                .pattern("SSS")
                .pattern("TGT")
                .pattern("SSS")
                .input('S', slab)
                .input('T', trapdoor)
                .input('G', ConventionalItemTags.GLASS_PANES)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .offerTo(exporter);

        createShaped(RecipeCategory.DECORATIONS, singleDoorCabinet)
                .pattern("SSS")
                .pattern(" T ")
                .pattern("SSS")
                .input('S', slab)
                .input('T', trapdoor)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .offerTo(exporter);

        createShaped(RecipeCategory.DECORATIONS, cabinetWithGlassDoors)
                .pattern("SSS")
                .pattern("GTG")
                .pattern("SSS")
                .input('S', slab)
                .input('T', trapdoor)
                .input('G', ConventionalItemTags.GLASS_PANES)
                .criterion(hasItem(slab), conditionsFromItem(slab))
                .offerTo(exporter);
    }
}