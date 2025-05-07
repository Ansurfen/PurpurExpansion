package net.dakji.purpuradditions.datagen;

import net.dakji.purpuradditions.block.PABlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class PABlockLootTableProvider extends BlockLootSubProvider {
    protected PABlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return PABlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
