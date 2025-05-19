package net.dakji.purpuradditions.datagen;

import net.dakji.purpuradditions.PurpurAdditions;
import net.dakji.purpuradditions.block.PABlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class PABlockStateProvider extends BlockStateProvider {
    public PABlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PurpurAdditions.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(PABlocks.PURPUR_STONE);
        stairsBlock(PABlocks.PURPUR_STONE_STAIRS.get(), blockTexture(PABlocks.PURPUR_STONE.get()));
        slabBlock(PABlocks.PURPUR_STONE_SLAB.get(), blockTexture(PABlocks.PURPUR_STONE.get()), blockTexture(PABlocks.PURPUR_STONE.get()));
        wallBlock(PABlocks.PURPUR_STONE_WALL.get(), blockTexture(PABlocks.PURPUR_STONE.get()));

        blockWithItem(PABlocks.POLISHED_PURPUR_STONE);
        stairsBlock(PABlocks.POLISHED_PURPUR_STONE_STAIRS.get(), blockTexture(PABlocks.POLISHED_PURPUR_STONE.get()));
        slabBlock(PABlocks.POLISHED_PURPUR_STONE_SLAB.get(), blockTexture(PABlocks.POLISHED_PURPUR_STONE.get()), blockTexture(PABlocks.POLISHED_PURPUR_STONE.get()));
        wallBlock(PABlocks.POLISHED_PURPUR_STONE_WALL.get(), blockTexture(PABlocks.POLISHED_PURPUR_STONE.get()));

        blockWithItem(PABlocks.PURPUR_STONE_BRICKS);
        stairsBlock(PABlocks.PURPUR_STONE_BRICK_STAIRS.get(), blockTexture(PABlocks.PURPUR_STONE_BRICKS.get()));
        slabBlock(PABlocks.PURPUR_STONE_BRICK_SLAB.get(), blockTexture(PABlocks.PURPUR_STONE_BRICKS.get()), blockTexture(PABlocks.PURPUR_STONE_BRICKS.get()));
        wallBlock(PABlocks.PURPUR_STONE_BRICK_WALL.get(), blockTexture(PABlocks.PURPUR_STONE_BRICKS.get()));

        blockWithItem(PABlocks.PURPUR_STONE_TILES);
        stairsBlock(PABlocks.PURPUR_STONE_TILE_STAIRS.get(), blockTexture(PABlocks.PURPUR_STONE_TILES.get()));
        slabBlock(PABlocks.PURPUR_STONE_TILE_SLAB.get(), blockTexture(PABlocks.PURPUR_STONE_TILES.get()), blockTexture(PABlocks.PURPUR_STONE_TILES.get()));
        wallBlock(PABlocks.PURPUR_STONE_TILE_WALL.get(), blockTexture(PABlocks.PURPUR_STONE_TILES.get()));

        blockItem(PABlocks.PURPUR_STONE_STAIRS);
        blockItem(PABlocks.PURPUR_STONE_SLAB);
        blockItem(PABlocks.POLISHED_PURPUR_STONE_STAIRS);
        blockItem(PABlocks.POLISHED_PURPUR_STONE_SLAB);
        blockItem(PABlocks.PURPUR_STONE_BRICK_STAIRS);
        blockItem(PABlocks.PURPUR_STONE_BRICK_SLAB);
        blockItem(PABlocks.PURPUR_STONE_TILE_STAIRS);
        blockItem(PABlocks.PURPUR_STONE_TILE_SLAB);

        blockWithItem(PABlocks.DARK_PURPUR_STONE);
        stairsBlock(PABlocks.DARK_PURPUR_STONE_STAIRS.get(), blockTexture(PABlocks.DARK_PURPUR_STONE.get()));
        slabBlock(PABlocks.DARK_PURPUR_STONE_SLAB.get(), blockTexture(PABlocks.DARK_PURPUR_STONE.get()), blockTexture(PABlocks.DARK_PURPUR_STONE.get()));
        wallBlock(PABlocks.DARK_PURPUR_STONE_WALL.get(), blockTexture(PABlocks.DARK_PURPUR_STONE.get()));

        blockWithItem(PABlocks.POLISHED_DARK_PURPUR_STONE);
        stairsBlock(PABlocks.POLISHED_DARK_PURPUR_STONE_STAIRS.get(), blockTexture(PABlocks.POLISHED_DARK_PURPUR_STONE.get()));
        slabBlock(PABlocks.POLISHED_DARK_PURPUR_STONE_SLAB.get(), blockTexture(PABlocks.POLISHED_DARK_PURPUR_STONE.get()), blockTexture(PABlocks.POLISHED_DARK_PURPUR_STONE.get()));
        wallBlock(PABlocks.POLISHED_DARK_PURPUR_STONE_WALL.get(), blockTexture(PABlocks.POLISHED_DARK_PURPUR_STONE.get()));

        blockWithItem(PABlocks.DARK_PURPUR_STONE_BRICKS);
        stairsBlock(PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get(), blockTexture(PABlocks.DARK_PURPUR_STONE_BRICKS.get()));
        slabBlock(PABlocks.DARK_PURPUR_STONE_BRICK_SLAB.get(), blockTexture(PABlocks.DARK_PURPUR_STONE_BRICKS.get()), blockTexture(PABlocks.DARK_PURPUR_STONE_BRICKS.get()));
        wallBlock(PABlocks.DARK_PURPUR_STONE_BRICK_WALL.get(), blockTexture(PABlocks.DARK_PURPUR_STONE_BRICKS.get()));

        blockWithItem(PABlocks.DARK_PURPUR_STONE_TILES);
        stairsBlock(PABlocks.DARK_PURPUR_STONE_TILE_STAIRS.get(), blockTexture(PABlocks.DARK_PURPUR_STONE_TILES.get()));
        slabBlock(PABlocks.DARK_PURPUR_STONE_TILE_SLAB.get(), blockTexture(PABlocks.DARK_PURPUR_STONE_TILES.get()), blockTexture(PABlocks.DARK_PURPUR_STONE_TILES.get()));
        wallBlock(PABlocks.DARK_PURPUR_STONE_TILE_WALL.get(), blockTexture(PABlocks.DARK_PURPUR_STONE_TILES.get()));

        blockItem(PABlocks.DARK_PURPUR_STONE_STAIRS);
        blockItem(PABlocks.DARK_PURPUR_STONE_SLAB);
        blockItem(PABlocks.POLISHED_DARK_PURPUR_STONE_STAIRS);
        blockItem(PABlocks.POLISHED_DARK_PURPUR_STONE_SLAB);
        blockItem(PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS);
        blockItem(PABlocks.DARK_PURPUR_STONE_BRICK_SLAB);
        blockItem(PABlocks.DARK_PURPUR_STONE_TILE_STAIRS);
        blockItem(PABlocks.DARK_PURPUR_STONE_TILE_SLAB);

        blockWithItem(PABlocks.PURPUR_SHROOMLIGHT);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("purpuradditions:block/" + deferredBlock.getId().getPath()));
    }
}
