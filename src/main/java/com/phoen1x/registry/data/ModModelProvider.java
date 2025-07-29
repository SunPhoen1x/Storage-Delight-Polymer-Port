package com.phoen1x.registry.data;

import com.phoen1x.StorageDelightPort;
import com.phoen1x.registry.BlockRegistry;
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
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.OAK_DRAWER, "oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.OAK_DRAWER_WITH_DOOR, "oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.OAK_DRAWER_WITH_BOOKS, "oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_OAK_DRAWERS, "oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.OAK_BOOKSHELF_WITH_DOOR, "oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_OAK_CABINET, "oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS, "oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.OAK_SINGLE_DOOR_CABINET, "oak");

        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BIRCH_DRAWER, "birch");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BIRCH_DRAWER_WITH_DOOR, "birch");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BIRCH_DRAWER_WITH_BOOKS, "birch");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_BIRCH_DRAWERS, "birch");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BIRCH_BOOKSHELF_WITH_DOOR, "birch");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_BIRCH_CABINET, "birch");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS, "birch");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BIRCH_SINGLE_DOOR_CABINET, "birch");

        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SPRUCE_DRAWER, "spruce");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SPRUCE_DRAWER_WITH_DOOR, "spruce");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS, "spruce");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_SPRUCE_DRAWERS, "spruce");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SPRUCE_BOOKSHELF_WITH_DOOR, "spruce");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_SPRUCE_CABINET, "spruce");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS, "spruce");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET, "spruce");

        generateStorageBlock(blockStateModelGenerator, BlockRegistry.JUNGLE_DRAWER, "jungle");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.JUNGLE_DRAWER_WITH_DOOR, "jungle");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS, "jungle");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_JUNGLE_DRAWERS, "jungle");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.JUNGLE_BOOKSHELF_WITH_DOOR, "jungle");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_JUNGLE_CABINET, "jungle");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS, "jungle");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET, "jungle");

        generateStorageBlock(blockStateModelGenerator, BlockRegistry.ACACIA_DRAWER, "acacia");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.ACACIA_DRAWER_WITH_DOOR, "acacia");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.ACACIA_DRAWER_WITH_BOOKS, "acacia");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_ACACIA_DRAWERS, "acacia");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.ACACIA_BOOKSHELF_WITH_DOOR, "acacia");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_ACACIA_CABINET, "acacia");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS, "acacia");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.ACACIA_SINGLE_DOOR_CABINET, "acacia");

        generateStorageBlock(blockStateModelGenerator, BlockRegistry.DARK_OAK_DRAWER, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_DARK_OAK_DRAWERS, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.DARK_OAK_BOOKSHELF_WITH_DOOR, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_DARK_OAK_CABINET, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS, "dark_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET, "dark_oak");

        generateStorageBlock(blockStateModelGenerator, BlockRegistry.MANGROVE_DRAWER, "mangrove");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.MANGROVE_DRAWER_WITH_DOOR, "mangrove");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS, "mangrove");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_MANGROVE_DRAWERS, "mangrove");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.MANGROVE_BOOKSHELF_WITH_DOOR, "mangrove");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_MANGROVE_CABINET, "mangrove");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS, "mangrove");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET, "mangrove");

        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CHERRY_DRAWER, "cherry");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CHERRY_DRAWER_WITH_DOOR, "cherry");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CHERRY_DRAWER_WITH_BOOKS, "cherry");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_CHERRY_DRAWERS, "cherry");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CHERRY_BOOKSHELF_WITH_DOOR, "cherry");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_CHERRY_CABINET, "cherry");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS, "cherry");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CHERRY_SINGLE_DOOR_CABINET, "cherry");

        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BAMBOO_DRAWER, "bamboo");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BAMBOO_DRAWER_WITH_DOOR, "bamboo");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS, "bamboo");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_BAMBOO_DRAWERS, "bamboo");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BAMBOO_BOOKSHELF_WITH_DOOR, "bamboo");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_BAMBOO_CABINET, "bamboo");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS, "bamboo");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET, "bamboo");

        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CRIMSON_DRAWER, "crimson");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CRIMSON_DRAWER_WITH_DOOR, "crimson");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS, "crimson");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_CRIMSON_DRAWERS, "crimson");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CRIMSON_BOOKSHELF_WITH_DOOR, "crimson");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_CRIMSON_CABINET, "crimson");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS, "crimson");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET, "crimson");

        generateStorageBlock(blockStateModelGenerator, BlockRegistry.WARPED_DRAWER, "warped");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.WARPED_DRAWER_WITH_DOOR, "warped");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.WARPED_DRAWER_WITH_BOOKS, "warped");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_WARPED_DRAWERS, "warped");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.WARPED_BOOKSHELF_WITH_DOOR, "warped");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_WARPED_CABINET, "warped");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS, "warped");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.WARPED_SINGLE_DOOR_CABINET, "warped");

        generateStorageBlock(blockStateModelGenerator, BlockRegistry.PALE_OAK_DRAWER, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.PALE_OAK_DRAWER_WITH_DOOR, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.PALE_OAK_DRAWER_WITH_BOOKS, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.SMALL_PALE_OAK_DRAWERS, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.PALE_OAK_BOOKSHELF_WITH_DOOR, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.GLASS_PALE_OAK_CABINET, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.PALE_OAK_CABINET_WITH_GLASS_DOORS, "pale_oak");
        generateStorageBlock(blockStateModelGenerator, BlockRegistry.PALE_OAK_SINGLE_DOOR_CABINET, "pale_oak");
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