package net.dakji.purpurexpansion.datagen;

import net.dakji.purpurexpansion.PurpurExpansion;
import net.dakji.purpurexpansion.block.PEBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class PEBlockStateProvider extends BlockStateProvider {
    public PEBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PurpurExpansion.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(PEBlocks.PURPUR_STONE);
        stairsBlock(PEBlocks.PURPUR_STONE_STAIRS.get(), blockTexture(PEBlocks.PURPUR_STONE.get()));
        slabBlock(PEBlocks.PURPUR_STONE_SLAB.get(), blockTexture(PEBlocks.PURPUR_STONE.get()), blockTexture(PEBlocks.PURPUR_STONE.get()));
        wallBlock(PEBlocks.PURPUR_STONE_WALL.get(), blockTexture(PEBlocks.PURPUR_STONE.get()));

        blockWithItem(PEBlocks.POLISHED_PURPUR_STONE);
        stairsBlock(PEBlocks.POLISHED_PURPUR_STONE_STAIRS.get(), blockTexture(PEBlocks.POLISHED_PURPUR_STONE.get()));
        slabBlock(PEBlocks.POLISHED_PURPUR_STONE_SLAB.get(), blockTexture(PEBlocks.POLISHED_PURPUR_STONE.get()), blockTexture(PEBlocks.POLISHED_PURPUR_STONE.get()));
        wallBlock(PEBlocks.POLISHED_PURPUR_STONE_WALL.get(), blockTexture(PEBlocks.POLISHED_PURPUR_STONE.get()));

        blockWithItem(PEBlocks.PURPUR_STONE_BRICKS);
        stairsBlock(PEBlocks.PURPUR_STONE_BRICK_STAIRS.get(), blockTexture(PEBlocks.PURPUR_STONE_BRICKS.get()));
        slabBlock(PEBlocks.PURPUR_STONE_BRICK_SLAB.get(), blockTexture(PEBlocks.PURPUR_STONE_BRICKS.get()), blockTexture(PEBlocks.PURPUR_STONE_BRICKS.get()));
        wallBlock(PEBlocks.PURPUR_STONE_BRICK_WALL.get(), blockTexture(PEBlocks.PURPUR_STONE_BRICKS.get()));

        blockWithItem(PEBlocks.PURPUR_STONE_TILES);
        stairsBlock(PEBlocks.PURPUR_STONE_TILE_STAIRS.get(), blockTexture(PEBlocks.PURPUR_STONE_TILES.get()));
        slabBlock(PEBlocks.PURPUR_STONE_TILE_SLAB.get(), blockTexture(PEBlocks.PURPUR_STONE_TILES.get()), blockTexture(PEBlocks.PURPUR_STONE_TILES.get()));
        wallBlock(PEBlocks.PURPUR_STONE_TILE_WALL.get(), blockTexture(PEBlocks.PURPUR_STONE_TILES.get()));

        blockItem(PEBlocks.PURPUR_STONE_STAIRS);
        blockItem(PEBlocks.PURPUR_STONE_SLAB);
        blockItem(PEBlocks.POLISHED_PURPUR_STONE_STAIRS);
        blockItem(PEBlocks.POLISHED_PURPUR_STONE_SLAB);
        blockItem(PEBlocks.PURPUR_STONE_BRICK_STAIRS);
        blockItem(PEBlocks.PURPUR_STONE_BRICK_SLAB);
        blockItem(PEBlocks.PURPUR_STONE_TILE_STAIRS);
        blockItem(PEBlocks.PURPUR_STONE_TILE_SLAB);

        blockWithItem(PEBlocks.DARK_PURPUR_STONE);
        stairsBlock(PEBlocks.DARK_PURPUR_STONE_STAIRS.get(), blockTexture(PEBlocks.DARK_PURPUR_STONE.get()));
        slabBlock(PEBlocks.DARK_PURPUR_STONE_SLAB.get(), blockTexture(PEBlocks.DARK_PURPUR_STONE.get()), blockTexture(PEBlocks.DARK_PURPUR_STONE.get()));
        wallBlock(PEBlocks.DARK_PURPUR_STONE_WALL.get(), blockTexture(PEBlocks.DARK_PURPUR_STONE.get()));

        blockWithItem(PEBlocks.POLISHED_DARK_PURPUR_STONE);
        stairsBlock(PEBlocks.POLISHED_DARK_PURPUR_STONE_STAIRS.get(), blockTexture(PEBlocks.POLISHED_DARK_PURPUR_STONE.get()));
        slabBlock(PEBlocks.POLISHED_DARK_PURPUR_STONE_SLAB.get(), blockTexture(PEBlocks.POLISHED_DARK_PURPUR_STONE.get()), blockTexture(PEBlocks.POLISHED_DARK_PURPUR_STONE.get()));
        wallBlock(PEBlocks.POLISHED_DARK_PURPUR_STONE_WALL.get(), blockTexture(PEBlocks.POLISHED_DARK_PURPUR_STONE.get()));

        blockWithItem(PEBlocks.DARK_PURPUR_STONE_BRICKS);
        stairsBlock(PEBlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get(), blockTexture(PEBlocks.DARK_PURPUR_STONE_BRICKS.get()));
        slabBlock(PEBlocks.DARK_PURPUR_STONE_BRICK_SLAB.get(), blockTexture(PEBlocks.DARK_PURPUR_STONE_BRICKS.get()), blockTexture(PEBlocks.DARK_PURPUR_STONE_BRICKS.get()));
        wallBlock(PEBlocks.DARK_PURPUR_STONE_BRICK_WALL.get(), blockTexture(PEBlocks.DARK_PURPUR_STONE_BRICKS.get()));

        blockWithItem(PEBlocks.DARK_PURPUR_STONE_TILES);
        stairsBlock(PEBlocks.DARK_PURPUR_STONE_TILE_STAIRS.get(), blockTexture(PEBlocks.DARK_PURPUR_STONE_TILES.get()));
        slabBlock(PEBlocks.DARK_PURPUR_STONE_TILE_SLAB.get(), blockTexture(PEBlocks.DARK_PURPUR_STONE_TILES.get()), blockTexture(PEBlocks.DARK_PURPUR_STONE_TILES.get()));
        wallBlock(PEBlocks.DARK_PURPUR_STONE_TILE_WALL.get(), blockTexture(PEBlocks.DARK_PURPUR_STONE_TILES.get()));

        blockItem(PEBlocks.DARK_PURPUR_STONE_STAIRS);
        blockItem(PEBlocks.DARK_PURPUR_STONE_SLAB);
        blockItem(PEBlocks.POLISHED_DARK_PURPUR_STONE_STAIRS);
        blockItem(PEBlocks.POLISHED_DARK_PURPUR_STONE_SLAB);
        blockItem(PEBlocks.DARK_PURPUR_STONE_BRICK_STAIRS);
        blockItem(PEBlocks.DARK_PURPUR_STONE_BRICK_SLAB);
        blockItem(PEBlocks.DARK_PURPUR_STONE_TILE_STAIRS);
        blockItem(PEBlocks.DARK_PURPUR_STONE_TILE_SLAB);

        blockWithItem(PEBlocks.PURPUR_SHROOMLIGHT);

        blockWithItem(PEBlocks.PURPUR_GLOWSTONE);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("purpurexpansion:block/" + deferredBlock.getId().getPath()));
    }
}
