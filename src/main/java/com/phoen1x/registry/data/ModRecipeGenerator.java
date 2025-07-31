package com.phoen1x.registry.data;

import com.phoen1x.registry.ModBlocks;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

public class ModRecipeGenerator extends RecipeGenerator {

    private final RegistryEntryLookup<Item> itemLookup;

    public ModRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
        this.itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
    }

    @Override
    public void generate() {
        generateStorageSet("oak",
                ModBlocks.OAK_DRAWER_ITEM, ModBlocks.OAK_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.OAK_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_OAK_DRAWERS_ITEM,
                ModBlocks.OAK_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_OAK_CABINET_ITEM,
                ModBlocks.OAK_SINGLE_DOOR_CABINET_ITEM, ModBlocks.OAK_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.OAK_SLAB, Items.OAK_TRAPDOOR, this.exporter);

        generateStorageSet("spruce",
                ModBlocks.SPRUCE_DRAWER_ITEM, ModBlocks.SPRUCE_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.SPRUCE_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_SPRUCE_DRAWERS_ITEM,
                ModBlocks.SPRUCE_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_SPRUCE_CABINET_ITEM,
                ModBlocks.SPRUCE_SINGLE_DOOR_CABINET_ITEM, ModBlocks.SPRUCE_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.SPRUCE_SLAB, Items.SPRUCE_TRAPDOOR, this.exporter);

        generateStorageSet("birch",
                ModBlocks.BIRCH_DRAWER_ITEM, ModBlocks.BIRCH_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.BIRCH_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_BIRCH_DRAWERS_ITEM,
                ModBlocks.BIRCH_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_BIRCH_CABINET_ITEM,
                ModBlocks.BIRCH_SINGLE_DOOR_CABINET_ITEM, ModBlocks.BIRCH_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.BIRCH_SLAB, Items.BIRCH_TRAPDOOR, this.exporter);

        generateStorageSet("jungle",
                ModBlocks.JUNGLE_DRAWER_ITEM, ModBlocks.JUNGLE_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.JUNGLE_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_JUNGLE_DRAWERS_ITEM,
                ModBlocks.JUNGLE_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_JUNGLE_CABINET_ITEM,
                ModBlocks.JUNGLE_SINGLE_DOOR_CABINET_ITEM, ModBlocks.JUNGLE_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.JUNGLE_SLAB, Items.JUNGLE_TRAPDOOR, this.exporter);

        generateStorageSet("acacia",
                ModBlocks.ACACIA_DRAWER_ITEM, ModBlocks.ACACIA_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.ACACIA_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_ACACIA_DRAWERS_ITEM,
                ModBlocks.ACACIA_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_ACACIA_CABINET_ITEM,
                ModBlocks.ACACIA_SINGLE_DOOR_CABINET_ITEM, ModBlocks.ACACIA_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.ACACIA_SLAB, Items.ACACIA_TRAPDOOR, this.exporter);

        generateStorageSet("dark_oak",
                ModBlocks.DARK_OAK_DRAWER_ITEM, ModBlocks.DARK_OAK_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.DARK_OAK_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_DARK_OAK_DRAWERS_ITEM,
                ModBlocks.DARK_OAK_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_DARK_OAK_CABINET_ITEM,
                ModBlocks.DARK_OAK_SINGLE_DOOR_CABINET_ITEM, ModBlocks.DARK_OAK_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.DARK_OAK_SLAB, Items.DARK_OAK_TRAPDOOR, this.exporter);

        generateStorageSet("mangrove",
                ModBlocks.MANGROVE_DRAWER_ITEM, ModBlocks.MANGROVE_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.MANGROVE_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_MANGROVE_DRAWERS_ITEM,
                ModBlocks.MANGROVE_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_MANGROVE_CABINET_ITEM,
                ModBlocks.MANGROVE_SINGLE_DOOR_CABINET_ITEM, ModBlocks.MANGROVE_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.MANGROVE_SLAB, Items.MANGROVE_TRAPDOOR, this.exporter);

        generateStorageSet("cherry",
                ModBlocks.CHERRY_DRAWER_ITEM, ModBlocks.CHERRY_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.CHERRY_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_CHERRY_DRAWERS_ITEM,
                ModBlocks.CHERRY_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_CHERRY_CABINET_ITEM,
                ModBlocks.CHERRY_SINGLE_DOOR_CABINET_ITEM, ModBlocks.CHERRY_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.CHERRY_SLAB, Items.CHERRY_TRAPDOOR, this.exporter);

        generateStorageSet("bamboo",
                ModBlocks.BAMBOO_DRAWER_ITEM, ModBlocks.BAMBOO_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.BAMBOO_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_BAMBOO_DRAWERS_ITEM,
                ModBlocks.BAMBOO_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_BAMBOO_CABINET_ITEM,
                ModBlocks.BAMBOO_SINGLE_DOOR_CABINET_ITEM, ModBlocks.BAMBOO_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.BAMBOO_SLAB, Items.BAMBOO_TRAPDOOR, this.exporter);

        generateStorageSet("crimson",
                ModBlocks.CRIMSON_DRAWER_ITEM, ModBlocks.CRIMSON_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.CRIMSON_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_CRIMSON_DRAWERS_ITEM,
                ModBlocks.CRIMSON_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_CRIMSON_CABINET_ITEM,
                ModBlocks.CRIMSON_SINGLE_DOOR_CABINET_ITEM, ModBlocks.CRIMSON_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.CRIMSON_SLAB, Items.CRIMSON_TRAPDOOR, this.exporter);

        generateStorageSet("warped",
                ModBlocks.WARPED_DRAWER_ITEM, ModBlocks.WARPED_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.WARPED_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_WARPED_DRAWERS_ITEM,
                ModBlocks.WARPED_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_WARPED_CABINET_ITEM,
                ModBlocks.WARPED_SINGLE_DOOR_CABINET_ITEM, ModBlocks.WARPED_CABINET_WITH_GLASS_DOORS_ITEM,
                Items.WARPED_SLAB, Items.WARPED_TRAPDOOR, this.exporter);

        generateStorageSet("pale_oak",
                ModBlocks.PALE_OAK_DRAWER_ITEM, ModBlocks.PALE_OAK_DRAWER_WITH_DOOR_ITEM,
                ModBlocks.PALE_OAK_DRAWER_WITH_BOOKS_ITEM, ModBlocks.SMALL_PALE_OAK_DRAWERS_ITEM,
                ModBlocks.PALE_OAK_BOOKSHELF_WITH_DOOR_ITEM, ModBlocks.GLASS_PALE_OAK_CABINET_ITEM,
                ModBlocks.PALE_OAK_SINGLE_DOOR_CABINET_ITEM, ModBlocks.PALE_OAK_CABINET_WITH_GLASS_DOORS_ITEM,
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