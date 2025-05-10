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
        dropSelf(PABlocks.PURPUR_STONE.get());
        dropSelf(PABlocks.PURPUR_STONE_STAIRS.get());
        add(PABlocks.PURPUR_STONE_SLAB.get(), block -> createSlabItemTable(PABlocks.PURPUR_STONE_SLAB.get()));
        dropSelf(PABlocks.PURPUR_STONE_WALL.get());

        dropSelf(PABlocks.DARK_PURPUR_STONE.get());
        dropSelf(PABlocks.DARK_PURPUR_STONE_STAIRS.get());
        add(PABlocks.DARK_PURPUR_STONE_SLAB.get(), block -> createSlabItemTable(PABlocks.DARK_PURPUR_STONE_SLAB.get()));
        dropSelf(PABlocks.DARK_PURPUR_STONE_WALL.get());

        dropSelf(PABlocks.DARK_PURPUR_STONE_BRICKS.get());
        dropSelf(PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get());
        add(PABlocks.DARK_PURPUR_STONE_BRICK_SLAB.get(), block -> createSlabItemTable(PABlocks.DARK_PURPUR_STONE_BRICK_SLAB.get()));
        dropSelf(PABlocks.DARK_PURPUR_STONE_BRICK_WALL.get());

        dropSelf(PABlocks.PURPUR_SHROOMLIGHT.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return PABlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
