package com.phoen1x.registry.data;

import com.phoen1x.StorageDelightPort;
import com.phoen1x.registry.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateStorageBlock(blockStateModelGenerator, ModBlocks.OAK_DRAWER, "oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.OAK_DRAWER_WITH_DOOR, "oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.OAK_DRAWER_WITH_BOOKS, "oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_OAK_DRAWERS, "oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.OAK_BOOKSHELF_WITH_DOOR, "oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_OAK_CABINET, "oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.OAK_CABINET_WITH_GLASS_DOORS, "oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.OAK_SINGLE_DOOR_CABINET, "oak");

        generateStorageBlock(blockStateModelGenerator, ModBlocks.BIRCH_DRAWER, "birch");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.BIRCH_DRAWER_WITH_DOOR, "birch");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.BIRCH_DRAWER_WITH_BOOKS, "birch");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_BIRCH_DRAWERS, "birch");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.BIRCH_BOOKSHELF_WITH_DOOR, "birch");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_BIRCH_CABINET, "birch");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.BIRCH_CABINET_WITH_GLASS_DOORS, "birch");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.BIRCH_SINGLE_DOOR_CABINET, "birch");

        generateStorageBlock(blockStateModelGenerator, ModBlocks.SPRUCE_DRAWER, "spruce");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SPRUCE_DRAWER_WITH_DOOR, "spruce");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SPRUCE_DRAWER_WITH_BOOKS, "spruce");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_SPRUCE_DRAWERS, "spruce");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SPRUCE_BOOKSHELF_WITH_DOOR, "spruce");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_SPRUCE_CABINET, "spruce");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SPRUCE_CABINET_WITH_GLASS_DOORS, "spruce");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SPRUCE_SINGLE_DOOR_CABINET, "spruce");

        generateStorageBlock(blockStateModelGenerator, ModBlocks.JUNGLE_DRAWER, "jungle");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.JUNGLE_DRAWER_WITH_DOOR, "jungle");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.JUNGLE_DRAWER_WITH_BOOKS, "jungle");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_JUNGLE_DRAWERS, "jungle");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.JUNGLE_BOOKSHELF_WITH_DOOR, "jungle");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_JUNGLE_CABINET, "jungle");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.JUNGLE_CABINET_WITH_GLASS_DOORS, "jungle");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.JUNGLE_SINGLE_DOOR_CABINET, "jungle");

        generateStorageBlock(blockStateModelGenerator, ModBlocks.ACACIA_DRAWER, "acacia");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.ACACIA_DRAWER_WITH_DOOR, "acacia");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.ACACIA_DRAWER_WITH_BOOKS, "acacia");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_ACACIA_DRAWERS, "acacia");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.ACACIA_BOOKSHELF_WITH_DOOR, "acacia");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_ACACIA_CABINET, "acacia");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.ACACIA_CABINET_WITH_GLASS_DOORS, "acacia");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.ACACIA_SINGLE_DOOR_CABINET, "acacia");

        generateStorageBlock(blockStateModelGenerator, ModBlocks.DARK_OAK_DRAWER, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.DARK_OAK_DRAWER_WITH_DOOR, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.DARK_OAK_DRAWER_WITH_BOOKS, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_DARK_OAK_DRAWERS, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.DARK_OAK_BOOKSHELF_WITH_DOOR, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_DARK_OAK_CABINET, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.DARK_OAK_CABINET_WITH_GLASS_DOORS, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.DARK_OAK_SINGLE_DOOR_CABINET, "dark_oak");

        generateStorageBlock(blockStateModelGenerator, ModBlocks.MANGROVE_DRAWER, "mangrove");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.MANGROVE_DRAWER_WITH_DOOR, "mangrove");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.MANGROVE_DRAWER_WITH_BOOKS, "mangrove");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_MANGROVE_DRAWERS, "mangrove");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.MANGROVE_BOOKSHELF_WITH_DOOR, "mangrove");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_MANGROVE_CABINET, "mangrove");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.MANGROVE_CABINET_WITH_GLASS_DOORS, "mangrove");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.MANGROVE_SINGLE_DOOR_CABINET, "mangrove");

        generateStorageBlock(blockStateModelGenerator, ModBlocks.CHERRY_DRAWER, "cherry");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.CHERRY_DRAWER_WITH_DOOR, "cherry");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.CHERRY_DRAWER_WITH_BOOKS, "cherry");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_CHERRY_DRAWERS, "cherry");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.CHERRY_BOOKSHELF_WITH_DOOR, "cherry");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_CHERRY_CABINET, "cherry");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.CHERRY_CABINET_WITH_GLASS_DOORS, "cherry");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.CHERRY_SINGLE_DOOR_CABINET, "cherry");

        generateStorageBlock(blockStateModelGenerator, ModBlocks.BAMBOO_DRAWER, "bamboo");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.BAMBOO_DRAWER_WITH_DOOR, "bamboo");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.BAMBOO_DRAWER_WITH_BOOKS, "bamboo");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_BAMBOO_DRAWERS, "bamboo");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.BAMBOO_BOOKSHELF_WITH_DOOR, "bamboo");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_BAMBOO_CABINET, "bamboo");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.BAMBOO_CABINET_WITH_GLASS_DOORS, "bamboo");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.BAMBOO_SINGLE_DOOR_CABINET, "bamboo");

        generateStorageBlock(blockStateModelGenerator, ModBlocks.CRIMSON_DRAWER, "crimson");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.CRIMSON_DRAWER_WITH_DOOR, "crimson");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.CRIMSON_DRAWER_WITH_BOOKS, "crimson");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_CRIMSON_DRAWERS, "crimson");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.CRIMSON_BOOKSHELF_WITH_DOOR, "crimson");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_CRIMSON_CABINET, "crimson");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.CRIMSON_CABINET_WITH_GLASS_DOORS, "crimson");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.CRIMSON_SINGLE_DOOR_CABINET, "crimson");

        generateStorageBlock(blockStateModelGenerator, ModBlocks.WARPED_DRAWER, "warped");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.WARPED_DRAWER_WITH_DOOR, "warped");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.WARPED_DRAWER_WITH_BOOKS, "warped");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_WARPED_DRAWERS, "warped");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.WARPED_BOOKSHELF_WITH_DOOR, "warped");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_WARPED_CABINET, "warped");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.WARPED_CABINET_WITH_GLASS_DOORS, "warped");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.WARPED_SINGLE_DOOR_CABINET, "warped");

        generateStorageBlock(blockStateModelGenerator, ModBlocks.PALE_OAK_DRAWER, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.PALE_OAK_DRAWER_WITH_DOOR, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.PALE_OAK_DRAWER_WITH_BOOKS, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.SMALL_PALE_OAK_DRAWERS, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.PALE_OAK_BOOKSHELF_WITH_DOOR, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.GLASS_PALE_OAK_CABINET, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.PALE_OAK_CABINET_WITH_GLASS_DOORS, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, ModBlocks.PALE_OAK_SINGLE_DOOR_CABINET, "pale_oak");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    public void generateStorageBlock(BlockStateModelGenerator generator, Block generatedBlock, String woodType) {
        Identifier sideTexture = Identifier.of(StorageDelightPort.MOD_ID, "block/" + woodType + "_cabinet_side");
        Identifier topTexture = Identifier.of(StorageDelightPort.MOD_ID, "block/" + woodType + "_cabinet_top");

        String blockIdPath = generatedBlock.asItem().getRegistryEntry().registryKey().getValue().getPath();
        Identifier frontTexture = Identifier.of(StorageDelightPort.MOD_ID, "block/" + blockIdPath + "_front");
        Identifier openFrontTexture = Identifier.of(StorageDelightPort.MOD_ID, "block/" + blockIdPath + "_front_open");

        Identifier closedModelId = Models.ORIENTABLE.upload(generatedBlock, "", new TextureMap()
                        .put(TextureKey.SIDE, sideTexture)
                        .put(TextureKey.TOP, topTexture)
                        .put(TextureKey.FRONT, frontTexture),
                generator.modelCollector
        );

        Identifier openModelId = Models.ORIENTABLE.upload(generatedBlock, "_open", new TextureMap()
                        .put(TextureKey.SIDE, sideTexture)
                        .put(TextureKey.TOP, topTexture)
                        .put(TextureKey.FRONT, openFrontTexture),
                generator.modelCollector
        );

        generator.blockStateCollector.accept(
                VariantsBlockModelDefinitionCreator.of(generatedBlock)
                        .with(BlockStateVariantMap.models(Properties.HORIZONTAL_FACING, Properties.OPEN)
                                .register(Direction.NORTH, false, BlockStateModelGenerator.createWeightedVariant(closedModelId))
                                .register(Direction.EAST,  false, BlockStateModelGenerator.createWeightedVariant(closedModelId).apply(BlockStateModelGenerator.ROTATE_Y_90))
                                .register(Direction.SOUTH, false, BlockStateModelGenerator.createWeightedVariant(closedModelId).apply(BlockStateModelGenerator.ROTATE_Y_180))
                                .register(Direction.WEST,  false, BlockStateModelGenerator.createWeightedVariant(closedModelId).apply(BlockStateModelGenerator.ROTATE_Y_270))
                                .register(Direction.NORTH, true, BlockStateModelGenerator.createWeightedVariant(openModelId))
                                .register(Direction.EAST,  true, BlockStateModelGenerator.createWeightedVariant(openModelId).apply(BlockStateModelGenerator.ROTATE_Y_90))
                                .register(Direction.SOUTH, true, BlockStateModelGenerator.createWeightedVariant(openModelId).apply(BlockStateModelGenerator.ROTATE_Y_180))
                                .register(Direction.WEST,  true, BlockStateModelGenerator.createWeightedVariant(openModelId).apply(BlockStateModelGenerator.ROTATE_Y_270))
                        )
        );
    }
}