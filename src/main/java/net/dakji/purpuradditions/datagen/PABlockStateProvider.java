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

        blockItem(PABlocks.PURPUR_STONE_STAIRS);
        blockItem(PABlocks.PURPUR_STONE_SLAB);

        blockWithItem(PABlocks.DARK_PURPUR_STONE);
        stairsBlock(PABlocks.DARK_PURPUR_STONE_STAIRS.get(), blockTexture(PABlocks.DARK_PURPUR_STONE.get()));
        slabBlock(PABlocks.DARK_PURPUR_STONE_SLAB.get(), blockTexture(PABlocks.DARK_PURPUR_STONE.get()), blockTexture(PABlocks.DARK_PURPUR_STONE.get()));
        wallBlock(PABlocks.DARK_PURPUR_STONE_WALL.get(), blockTexture(PABlocks.DARK_PURPUR_STONE.get()));

        blockItem(PABlocks.DARK_PURPUR_STONE_STAIRS);
        blockItem(PABlocks.DARK_PURPUR_STONE_SLAB);

        blockWithItem(PABlocks.PURPUR_SHROOMLIGHT);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("purpuradditions:block/" + deferredBlock.getId().getPath()));
    }
}
