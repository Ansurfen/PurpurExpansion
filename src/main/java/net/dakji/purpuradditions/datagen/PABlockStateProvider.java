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
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("purpuradditions:block/" + deferredBlock.getId().getPath()));
    }
}
