package com.phoen1x.registry;

import com.phoen1x.StorageDelightPort;
import com.phoen1x.block.*;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block OAK_DRAWER = registerBlock("oak_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem OAK_DRAWER_ITEM = registerBlockItem("oak_drawer", settings -> new TexturedPolyBlockItem(OAK_DRAWER, settings), new Item.Settings());
    public static final Block OAK_DRAWER_WITH_DOOR = registerBlock("oak_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem OAK_DRAWER_WITH_DOOR_ITEM = registerBlockItem("oak_drawer_with_door", settings -> new TexturedPolyBlockItem(OAK_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block OAK_DRAWER_WITH_BOOKS = registerBlock("oak_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem OAK_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("oak_drawer_with_books", settings -> new TexturedPolyBlockItem(OAK_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_OAK_DRAWERS = registerBlock("small_oak_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_OAK_DRAWERS_ITEM = registerBlockItem("small_oak_drawers", settings -> new TexturedPolyBlockItem(SMALL_OAK_DRAWERS, settings), new Item.Settings());
    public static final Block OAK_BOOKSHELF_WITH_DOOR = registerBlock("oak_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem OAK_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("oak_bookshelf_with_door", settings -> new TexturedPolyBlockItem(OAK_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_OAK_CABINET = registerBlock("glass_oak_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_OAK_CABINET_ITEM = registerBlockItem("glass_oak_cabinet", settings -> new TexturedPolyBlockItem(GLASS_OAK_CABINET, settings), new Item.Settings());
    public static final Block OAK_CABINET_WITH_GLASS_DOORS = registerBlock("oak_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem OAK_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("oak_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(OAK_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block OAK_SINGLE_DOOR_CABINET = registerBlock("oak_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem OAK_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("oak_single_door_cabinet", settings -> new TexturedPolyBlockItem(OAK_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static final Block BIRCH_DRAWER = registerBlock("birch_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BIRCH_DRAWER_ITEM = registerBlockItem("birch_drawer", settings -> new TexturedPolyBlockItem(BIRCH_DRAWER, settings), new Item.Settings());
    public static final Block BIRCH_DRAWER_WITH_DOOR = registerBlock("birch_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BIRCH_DRAWER_WITH_DOOR_ITEM = registerBlockItem("birch_drawer_with_door", settings -> new TexturedPolyBlockItem(BIRCH_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block BIRCH_DRAWER_WITH_BOOKS = registerBlock("birch_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BIRCH_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("birch_drawer_with_books", settings -> new TexturedPolyBlockItem(BIRCH_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_BIRCH_DRAWERS = registerBlock("small_birch_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_BIRCH_DRAWERS_ITEM = registerBlockItem("small_birch_drawers", settings -> new TexturedPolyBlockItem(SMALL_BIRCH_DRAWERS, settings), new Item.Settings());
    public static final Block BIRCH_BOOKSHELF_WITH_DOOR = registerBlock("birch_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BIRCH_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("birch_bookshelf_with_door", settings -> new TexturedPolyBlockItem(BIRCH_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_BIRCH_CABINET = registerBlock("glass_birch_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_BIRCH_CABINET_ITEM = registerBlockItem("glass_birch_cabinet", settings -> new TexturedPolyBlockItem(GLASS_BIRCH_CABINET, settings), new Item.Settings());
    public static final Block BIRCH_CABINET_WITH_GLASS_DOORS = registerBlock("birch_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BIRCH_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("birch_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(BIRCH_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block BIRCH_SINGLE_DOOR_CABINET = registerBlock("birch_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BIRCH_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("birch_single_door_cabinet", settings -> new TexturedPolyBlockItem(BIRCH_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static final Block SPRUCE_DRAWER = registerBlock("spruce_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SPRUCE_DRAWER_ITEM = registerBlockItem("spruce_drawer", settings -> new TexturedPolyBlockItem(SPRUCE_DRAWER, settings), new Item.Settings());
    public static final Block SPRUCE_DRAWER_WITH_DOOR = registerBlock("spruce_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SPRUCE_DRAWER_WITH_DOOR_ITEM = registerBlockItem("spruce_drawer_with_door", settings -> new TexturedPolyBlockItem(SPRUCE_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block SPRUCE_DRAWER_WITH_BOOKS = registerBlock("spruce_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SPRUCE_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("spruce_drawer_with_books", settings -> new TexturedPolyBlockItem(SPRUCE_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_SPRUCE_DRAWERS = registerBlock("small_spruce_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_SPRUCE_DRAWERS_ITEM = registerBlockItem("small_spruce_drawers", settings -> new TexturedPolyBlockItem(SMALL_SPRUCE_DRAWERS, settings), new Item.Settings());
    public static final Block SPRUCE_BOOKSHELF_WITH_DOOR = registerBlock("spruce_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SPRUCE_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("spruce_bookshelf_with_door", settings -> new TexturedPolyBlockItem(SPRUCE_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_SPRUCE_CABINET = registerBlock("glass_spruce_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_SPRUCE_CABINET_ITEM = registerBlockItem("glass_spruce_cabinet", settings -> new TexturedPolyBlockItem(GLASS_SPRUCE_CABINET, settings), new Item.Settings());
    public static final Block SPRUCE_CABINET_WITH_GLASS_DOORS = registerBlock("spruce_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SPRUCE_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("spruce_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(SPRUCE_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block SPRUCE_SINGLE_DOOR_CABINET = registerBlock("spruce_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SPRUCE_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("spruce_single_door_cabinet", settings -> new TexturedPolyBlockItem(SPRUCE_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static final Block JUNGLE_DRAWER = registerBlock("jungle_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem JUNGLE_DRAWER_ITEM = registerBlockItem("jungle_drawer", settings -> new TexturedPolyBlockItem(JUNGLE_DRAWER, settings), new Item.Settings());
    public static final Block JUNGLE_DRAWER_WITH_DOOR = registerBlock("jungle_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem JUNGLE_DRAWER_WITH_DOOR_ITEM = registerBlockItem("jungle_drawer_with_door", settings -> new TexturedPolyBlockItem(JUNGLE_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block JUNGLE_DRAWER_WITH_BOOKS = registerBlock("jungle_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem JUNGLE_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("jungle_drawer_with_books", settings -> new TexturedPolyBlockItem(JUNGLE_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_JUNGLE_DRAWERS = registerBlock("small_jungle_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_JUNGLE_DRAWERS_ITEM = registerBlockItem("small_jungle_drawers", settings -> new TexturedPolyBlockItem(SMALL_JUNGLE_DRAWERS, settings), new Item.Settings());
    public static final Block JUNGLE_BOOKSHELF_WITH_DOOR = registerBlock("jungle_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem JUNGLE_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("jungle_bookshelf_with_door", settings -> new TexturedPolyBlockItem(JUNGLE_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_JUNGLE_CABINET = registerBlock("glass_jungle_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_JUNGLE_CABINET_ITEM = registerBlockItem("glass_jungle_cabinet", settings -> new TexturedPolyBlockItem(GLASS_JUNGLE_CABINET, settings), new Item.Settings());
    public static final Block JUNGLE_CABINET_WITH_GLASS_DOORS = registerBlock("jungle_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem JUNGLE_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("jungle_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(JUNGLE_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block JUNGLE_SINGLE_DOOR_CABINET = registerBlock("jungle_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem JUNGLE_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("jungle_single_door_cabinet", settings -> new TexturedPolyBlockItem(JUNGLE_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static final Block ACACIA_DRAWER = registerBlock("acacia_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem ACACIA_DRAWER_ITEM = registerBlockItem("acacia_drawer", settings -> new TexturedPolyBlockItem(ACACIA_DRAWER, settings), new Item.Settings());
    public static final Block ACACIA_DRAWER_WITH_DOOR = registerBlock("acacia_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem ACACIA_DRAWER_WITH_DOOR_ITEM = registerBlockItem("acacia_drawer_with_door", settings -> new TexturedPolyBlockItem(ACACIA_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block ACACIA_DRAWER_WITH_BOOKS = registerBlock("acacia_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem ACACIA_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("acacia_drawer_with_books", settings -> new TexturedPolyBlockItem(ACACIA_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_ACACIA_DRAWERS = registerBlock("small_acacia_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_ACACIA_DRAWERS_ITEM = registerBlockItem("small_acacia_drawers", settings -> new TexturedPolyBlockItem(SMALL_ACACIA_DRAWERS, settings), new Item.Settings());
    public static final Block ACACIA_BOOKSHELF_WITH_DOOR = registerBlock("acacia_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem ACACIA_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("acacia_bookshelf_with_door", settings -> new TexturedPolyBlockItem(ACACIA_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_ACACIA_CABINET = registerBlock("glass_acacia_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_ACACIA_CABINET_ITEM = registerBlockItem("glass_acacia_cabinet", settings -> new TexturedPolyBlockItem(GLASS_ACACIA_CABINET, settings), new Item.Settings());
    public static final Block ACACIA_CABINET_WITH_GLASS_DOORS = registerBlock("acacia_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem ACACIA_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("acacia_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(ACACIA_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block ACACIA_SINGLE_DOOR_CABINET = registerBlock("acacia_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem ACACIA_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("acacia_single_door_cabinet", settings -> new TexturedPolyBlockItem(ACACIA_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static final Block DARK_OAK_DRAWER = registerBlock("dark_oak_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem DARK_OAK_DRAWER_ITEM = registerBlockItem("dark_oak_drawer", settings -> new TexturedPolyBlockItem(DARK_OAK_DRAWER, settings), new Item.Settings());
    public static final Block DARK_OAK_DRAWER_WITH_DOOR = registerBlock("dark_oak_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem DARK_OAK_DRAWER_WITH_DOOR_ITEM = registerBlockItem("dark_oak_drawer_with_door", settings -> new TexturedPolyBlockItem(DARK_OAK_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block DARK_OAK_DRAWER_WITH_BOOKS = registerBlock("dark_oak_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem DARK_OAK_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("dark_oak_drawer_with_books", settings -> new TexturedPolyBlockItem(DARK_OAK_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_DARK_OAK_DRAWERS = registerBlock("small_dark_oak_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_DARK_OAK_DRAWERS_ITEM = registerBlockItem("small_dark_oak_drawers", settings -> new TexturedPolyBlockItem(SMALL_DARK_OAK_DRAWERS, settings), new Item.Settings());
    public static final Block DARK_OAK_BOOKSHELF_WITH_DOOR = registerBlock("dark_oak_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem DARK_OAK_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("dark_oak_bookshelf_with_door", settings -> new TexturedPolyBlockItem(DARK_OAK_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_DARK_OAK_CABINET = registerBlock("glass_dark_oak_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_DARK_OAK_CABINET_ITEM = registerBlockItem("glass_dark_oak_cabinet", settings -> new TexturedPolyBlockItem(GLASS_DARK_OAK_CABINET, settings), new Item.Settings());
    public static final Block DARK_OAK_CABINET_WITH_GLASS_DOORS = registerBlock("dark_oak_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem DARK_OAK_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("dark_oak_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(DARK_OAK_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block DARK_OAK_SINGLE_DOOR_CABINET = registerBlock("dark_oak_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem DARK_OAK_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("dark_oak_single_door_cabinet", settings -> new TexturedPolyBlockItem(DARK_OAK_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static final Block MANGROVE_DRAWER = registerBlock("mangrove_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem MANGROVE_DRAWER_ITEM = registerBlockItem("mangrove_drawer", settings -> new TexturedPolyBlockItem(MANGROVE_DRAWER, settings), new Item.Settings());
    public static final Block MANGROVE_DRAWER_WITH_DOOR = registerBlock("mangrove_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem MANGROVE_DRAWER_WITH_DOOR_ITEM = registerBlockItem("mangrove_drawer_with_door", settings -> new TexturedPolyBlockItem(MANGROVE_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block MANGROVE_DRAWER_WITH_BOOKS = registerBlock("mangrove_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem MANGROVE_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("mangrove_drawer_with_books", settings -> new TexturedPolyBlockItem(MANGROVE_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_MANGROVE_DRAWERS = registerBlock("small_mangrove_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_MANGROVE_DRAWERS_ITEM = registerBlockItem("small_mangrove_drawers", settings -> new TexturedPolyBlockItem(SMALL_MANGROVE_DRAWERS, settings), new Item.Settings());
    public static final Block MANGROVE_BOOKSHELF_WITH_DOOR = registerBlock("mangrove_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem MANGROVE_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("mangrove_bookshelf_with_door", settings -> new TexturedPolyBlockItem(MANGROVE_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_MANGROVE_CABINET = registerBlock("glass_mangrove_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_MANGROVE_CABINET_ITEM = registerBlockItem("glass_mangrove_cabinet", settings -> new TexturedPolyBlockItem(GLASS_MANGROVE_CABINET, settings), new Item.Settings());
    public static final Block MANGROVE_CABINET_WITH_GLASS_DOORS = registerBlock("mangrove_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem MANGROVE_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("mangrove_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(MANGROVE_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block MANGROVE_SINGLE_DOOR_CABINET = registerBlock("mangrove_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem MANGROVE_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("mangrove_single_door_cabinet", settings -> new TexturedPolyBlockItem(MANGROVE_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static final Block CHERRY_DRAWER = registerBlock("cherry_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CHERRY_DRAWER_ITEM = registerBlockItem("cherry_drawer", settings -> new TexturedPolyBlockItem(CHERRY_DRAWER, settings), new Item.Settings());
    public static final Block CHERRY_DRAWER_WITH_DOOR = registerBlock("cherry_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CHERRY_DRAWER_WITH_DOOR_ITEM = registerBlockItem("cherry_drawer_with_door", settings -> new TexturedPolyBlockItem(CHERRY_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block CHERRY_DRAWER_WITH_BOOKS = registerBlock("cherry_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CHERRY_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("cherry_drawer_with_books", settings -> new TexturedPolyBlockItem(CHERRY_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_CHERRY_DRAWERS = registerBlock("small_cherry_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_CHERRY_DRAWERS_ITEM = registerBlockItem("small_cherry_drawers", settings -> new TexturedPolyBlockItem(SMALL_CHERRY_DRAWERS, settings), new Item.Settings());
    public static final Block CHERRY_BOOKSHELF_WITH_DOOR = registerBlock("cherry_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CHERRY_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("cherry_bookshelf_with_door", settings -> new TexturedPolyBlockItem(CHERRY_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_CHERRY_CABINET = registerBlock("glass_cherry_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_CHERRY_CABINET_ITEM = registerBlockItem("glass_cherry_cabinet", settings -> new TexturedPolyBlockItem(GLASS_CHERRY_CABINET, settings), new Item.Settings());
    public static final Block CHERRY_CABINET_WITH_GLASS_DOORS = registerBlock("cherry_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CHERRY_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("cherry_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(CHERRY_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block CHERRY_SINGLE_DOOR_CABINET = registerBlock("cherry_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CHERRY_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("cherry_single_door_cabinet", settings -> new TexturedPolyBlockItem(CHERRY_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static final Block PALE_OAK_DRAWER = registerBlock("pale_oak_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem PALE_OAK_DRAWER_ITEM = registerBlockItem("pale_oak_drawer", settings -> new TexturedPolyBlockItem(PALE_OAK_DRAWER, settings), new Item.Settings());
    public static final Block PALE_OAK_DRAWER_WITH_DOOR = registerBlock("pale_oak_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem PALE_OAK_DRAWER_WITH_DOOR_ITEM = registerBlockItem("pale_oak_drawer_with_door", settings -> new TexturedPolyBlockItem(PALE_OAK_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block PALE_OAK_DRAWER_WITH_BOOKS = registerBlock("pale_oak_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem PALE_OAK_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("pale_oak_drawer_with_books", settings -> new TexturedPolyBlockItem(PALE_OAK_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_PALE_OAK_DRAWERS = registerBlock("small_pale_oak_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_PALE_OAK_DRAWERS_ITEM = registerBlockItem("small_pale_oak_drawers", settings -> new TexturedPolyBlockItem(SMALL_PALE_OAK_DRAWERS, settings), new Item.Settings());
    public static final Block PALE_OAK_BOOKSHELF_WITH_DOOR = registerBlock("pale_oak_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem PALE_OAK_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("pale_oak_bookshelf_with_door", settings -> new TexturedPolyBlockItem(PALE_OAK_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_PALE_OAK_CABINET = registerBlock("glass_pale_oak_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_PALE_OAK_CABINET_ITEM = registerBlockItem("glass_pale_oak_cabinet", settings -> new TexturedPolyBlockItem(GLASS_PALE_OAK_CABINET, settings), new Item.Settings());
    public static final Block PALE_OAK_CABINET_WITH_GLASS_DOORS = registerBlock("pale_oak_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem PALE_OAK_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("pale_oak_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(PALE_OAK_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block PALE_OAK_SINGLE_DOOR_CABINET = registerBlock("pale_oak_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem PALE_OAK_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("pale_oak_single_door_cabinet", settings -> new TexturedPolyBlockItem(PALE_OAK_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static final Block BAMBOO_DRAWER = registerBlock("bamboo_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BAMBOO_DRAWER_ITEM = registerBlockItem("bamboo_drawer", settings -> new TexturedPolyBlockItem(BAMBOO_DRAWER, settings), new Item.Settings());
    public static final Block BAMBOO_DRAWER_WITH_DOOR = registerBlock("bamboo_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BAMBOO_DRAWER_WITH_DOOR_ITEM = registerBlockItem("bamboo_drawer_with_door", settings -> new TexturedPolyBlockItem(BAMBOO_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block BAMBOO_DRAWER_WITH_BOOKS = registerBlock("bamboo_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BAMBOO_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("bamboo_drawer_with_books", settings -> new TexturedPolyBlockItem(BAMBOO_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_BAMBOO_DRAWERS = registerBlock("small_bamboo_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_BAMBOO_DRAWERS_ITEM = registerBlockItem("small_bamboo_drawers", settings -> new TexturedPolyBlockItem(SMALL_BAMBOO_DRAWERS, settings), new Item.Settings());
    public static final Block BAMBOO_BOOKSHELF_WITH_DOOR = registerBlock("bamboo_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BAMBOO_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("bamboo_bookshelf_with_door", settings -> new TexturedPolyBlockItem(BAMBOO_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_BAMBOO_CABINET = registerBlock("glass_bamboo_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_BAMBOO_CABINET_ITEM = registerBlockItem("glass_bamboo_cabinet", settings -> new TexturedPolyBlockItem(GLASS_BAMBOO_CABINET, settings), new Item.Settings());
    public static final Block BAMBOO_CABINET_WITH_GLASS_DOORS = registerBlock("bamboo_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BAMBOO_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("bamboo_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(BAMBOO_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block BAMBOO_SINGLE_DOOR_CABINET = registerBlock("bamboo_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem BAMBOO_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("bamboo_single_door_cabinet", settings -> new TexturedPolyBlockItem(BAMBOO_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static final Block CRIMSON_DRAWER = registerBlock("crimson_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CRIMSON_DRAWER_ITEM = registerBlockItem("crimson_drawer", settings -> new TexturedPolyBlockItem(CRIMSON_DRAWER, settings), new Item.Settings());
    public static final Block CRIMSON_DRAWER_WITH_DOOR = registerBlock("crimson_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CRIMSON_DRAWER_WITH_DOOR_ITEM = registerBlockItem("crimson_drawer_with_door", settings -> new TexturedPolyBlockItem(CRIMSON_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block CRIMSON_DRAWER_WITH_BOOKS = registerBlock("crimson_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CRIMSON_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("crimson_drawer_with_books", settings -> new TexturedPolyBlockItem(CRIMSON_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_CRIMSON_DRAWERS = registerBlock("small_crimson_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_CRIMSON_DRAWERS_ITEM = registerBlockItem("small_crimson_drawers", settings -> new TexturedPolyBlockItem(SMALL_CRIMSON_DRAWERS, settings), new Item.Settings());
    public static final Block CRIMSON_BOOKSHELF_WITH_DOOR = registerBlock("crimson_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CRIMSON_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("crimson_bookshelf_with_door", settings -> new TexturedPolyBlockItem(CRIMSON_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_CRIMSON_CABINET = registerBlock("glass_crimson_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_CRIMSON_CABINET_ITEM = registerBlockItem("glass_crimson_cabinet", settings -> new TexturedPolyBlockItem(GLASS_CRIMSON_CABINET, settings), new Item.Settings());
    public static final Block CRIMSON_CABINET_WITH_GLASS_DOORS = registerBlock("crimson_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CRIMSON_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("crimson_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(CRIMSON_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block CRIMSON_SINGLE_DOOR_CABINET = registerBlock("crimson_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem CRIMSON_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("crimson_single_door_cabinet", settings -> new TexturedPolyBlockItem(CRIMSON_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static final Block WARPED_DRAWER = registerBlock("warped_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem WARPED_DRAWER_ITEM = registerBlockItem("warped_drawer", settings -> new TexturedPolyBlockItem(WARPED_DRAWER, settings), new Item.Settings());
    public static final Block WARPED_DRAWER_WITH_DOOR = registerBlock("warped_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem WARPED_DRAWER_WITH_DOOR_ITEM = registerBlockItem("warped_drawer_with_door", settings -> new TexturedPolyBlockItem(WARPED_DRAWER_WITH_DOOR, settings), new Item.Settings());
    public static final Block WARPED_DRAWER_WITH_BOOKS = registerBlock("warped_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem WARPED_DRAWER_WITH_BOOKS_ITEM = registerBlockItem("warped_drawer_with_books", settings -> new TexturedPolyBlockItem(WARPED_DRAWER_WITH_BOOKS, settings), new Item.Settings());
    public static final Block SMALL_WARPED_DRAWERS = registerBlock("small_warped_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem SMALL_WARPED_DRAWERS_ITEM = registerBlockItem("small_warped_drawers", settings -> new TexturedPolyBlockItem(SMALL_WARPED_DRAWERS, settings), new Item.Settings());
    public static final Block WARPED_BOOKSHELF_WITH_DOOR = registerBlock("warped_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem WARPED_BOOKSHELF_WITH_DOOR_ITEM = registerBlockItem("warped_bookshelf_with_door", settings -> new TexturedPolyBlockItem(WARPED_BOOKSHELF_WITH_DOOR, settings), new Item.Settings());
    public static final Block GLASS_WARPED_CABINET = registerBlock("glass_warped_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem GLASS_WARPED_CABINET_ITEM = registerBlockItem("glass_warped_cabinet", settings -> new TexturedPolyBlockItem(GLASS_WARPED_CABINET, settings), new Item.Settings());
    public static final Block WARPED_CABINET_WITH_GLASS_DOORS = registerBlock("warped_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem WARPED_CABINET_WITH_GLASS_DOORS_ITEM = registerBlockItem("warped_cabinet_with_glass_doors", settings -> new TexturedPolyBlockItem(WARPED_CABINET_WITH_GLASS_DOORS, settings), new Item.Settings());
    public static final Block WARPED_SINGLE_DOOR_CABINET = registerBlock("warped_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final BlockItem WARPED_SINGLE_DOOR_CABINET_ITEM = registerBlockItem("warped_single_door_cabinet", settings -> new TexturedPolyBlockItem(WARPED_SINGLE_DOOR_CABINET, settings), new Item.Settings());

    public static void registerModBlocks() {
        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(ModBlocks.OAK_DRAWER_ITEM, 1));
        builder.displayName(Text.translatable("itemGroup.storagedelight"));
        builder.entries((displayContext, entries) -> {
            entries.add(ModBlocks.OAK_DRAWER_ITEM);
            entries.add(ModBlocks.OAK_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.OAK_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_OAK_DRAWERS_ITEM);
            entries.add(ModBlocks.OAK_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_OAK_CABINET_ITEM);
            entries.add(ModBlocks.OAK_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.OAK_SINGLE_DOOR_CABINET_ITEM);

            entries.add(ModBlocks.BIRCH_DRAWER_ITEM);
            entries.add(ModBlocks.BIRCH_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.BIRCH_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_BIRCH_DRAWERS_ITEM);
            entries.add(ModBlocks.BIRCH_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_BIRCH_CABINET_ITEM);
            entries.add(ModBlocks.BIRCH_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.BIRCH_SINGLE_DOOR_CABINET_ITEM);

            entries.add(ModBlocks.SPRUCE_DRAWER_ITEM);
            entries.add(ModBlocks.SPRUCE_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.SPRUCE_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_SPRUCE_DRAWERS_ITEM);
            entries.add(ModBlocks.SPRUCE_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_SPRUCE_CABINET_ITEM);
            entries.add(ModBlocks.SPRUCE_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.SPRUCE_SINGLE_DOOR_CABINET_ITEM);

            entries.add(ModBlocks.JUNGLE_DRAWER_ITEM);
            entries.add(ModBlocks.JUNGLE_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.JUNGLE_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_JUNGLE_DRAWERS_ITEM);
            entries.add(ModBlocks.JUNGLE_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_JUNGLE_CABINET_ITEM);
            entries.add(ModBlocks.JUNGLE_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.JUNGLE_SINGLE_DOOR_CABINET_ITEM);

            entries.add(ModBlocks.ACACIA_DRAWER_ITEM);
            entries.add(ModBlocks.ACACIA_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.ACACIA_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_ACACIA_DRAWERS_ITEM);
            entries.add(ModBlocks.ACACIA_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_ACACIA_CABINET_ITEM);
            entries.add(ModBlocks.ACACIA_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.ACACIA_SINGLE_DOOR_CABINET_ITEM);

            entries.add(ModBlocks.DARK_OAK_DRAWER_ITEM);
            entries.add(ModBlocks.DARK_OAK_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.DARK_OAK_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_DARK_OAK_DRAWERS_ITEM);
            entries.add(ModBlocks.DARK_OAK_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_DARK_OAK_CABINET_ITEM);
            entries.add(ModBlocks.DARK_OAK_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.DARK_OAK_SINGLE_DOOR_CABINET_ITEM);

            entries.add(ModBlocks.MANGROVE_DRAWER_ITEM);
            entries.add(ModBlocks.MANGROVE_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.MANGROVE_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_MANGROVE_DRAWERS_ITEM);
            entries.add(ModBlocks.MANGROVE_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_MANGROVE_CABINET_ITEM);
            entries.add(ModBlocks.MANGROVE_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.MANGROVE_SINGLE_DOOR_CABINET_ITEM);

            entries.add(ModBlocks.CHERRY_DRAWER_ITEM);
            entries.add(ModBlocks.CHERRY_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.CHERRY_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_CHERRY_DRAWERS_ITEM);
            entries.add(ModBlocks.CHERRY_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_CHERRY_CABINET_ITEM);
            entries.add(ModBlocks.CHERRY_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.CHERRY_SINGLE_DOOR_CABINET_ITEM);

            entries.add(ModBlocks.PALE_OAK_DRAWER_ITEM);
            entries.add(ModBlocks.PALE_OAK_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.PALE_OAK_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_PALE_OAK_DRAWERS_ITEM);
            entries.add(ModBlocks.PALE_OAK_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_PALE_OAK_CABINET_ITEM);
            entries.add(ModBlocks.PALE_OAK_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.PALE_OAK_SINGLE_DOOR_CABINET_ITEM);

            entries.add(ModBlocks.BAMBOO_DRAWER_ITEM);
            entries.add(ModBlocks.BAMBOO_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.BAMBOO_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_BAMBOO_DRAWERS_ITEM);
            entries.add(ModBlocks.BAMBOO_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_BAMBOO_CABINET_ITEM);
            entries.add(ModBlocks.BAMBOO_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.BAMBOO_SINGLE_DOOR_CABINET_ITEM);

            entries.add(ModBlocks.CRIMSON_DRAWER_ITEM);
            entries.add(ModBlocks.CRIMSON_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.CRIMSON_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_CRIMSON_DRAWERS_ITEM);
            entries.add(ModBlocks.CRIMSON_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_CRIMSON_CABINET_ITEM);
            entries.add(ModBlocks.CRIMSON_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.CRIMSON_SINGLE_DOOR_CABINET_ITEM);

            entries.add(ModBlocks.WARPED_DRAWER_ITEM);
            entries.add(ModBlocks.WARPED_DRAWER_WITH_DOOR_ITEM);
            entries.add(ModBlocks.WARPED_DRAWER_WITH_BOOKS_ITEM);
            entries.add(ModBlocks.SMALL_WARPED_DRAWERS_ITEM);
            entries.add(ModBlocks.WARPED_BOOKSHELF_WITH_DOOR_ITEM);
            entries.add(ModBlocks.GLASS_WARPED_CABINET_ITEM);
            entries.add(ModBlocks.WARPED_CABINET_WITH_GLASS_DOORS_ITEM);
            entries.add(ModBlocks.WARPED_SINGLE_DOOR_CABINET_ITEM);
        });
        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(StorageDelightPort.MOD_ID, "blocks"), polymerGroup);
        StorageDelightPort.LOGGER.info("Registering creative mode tab for " + StorageDelightPort.MOD_ID);
    }

    public static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        var key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(StorageDelightPort.MOD_ID, name));
        Block block = factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
    }

    public static BlockItem registerBlockItem(String name, Function<Item.Settings, BlockItem> factory, Item.Settings settings) {
        var key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(StorageDelightPort.MOD_ID, name));
        BlockItem item = factory.apply(settings.registryKey(key).useBlockPrefixedTranslationKey());
        return Registry.register(Registries.ITEM, key, item);
    }
}