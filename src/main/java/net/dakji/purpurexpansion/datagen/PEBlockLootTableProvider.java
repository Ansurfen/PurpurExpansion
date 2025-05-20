package net.dakji.purpurexpansion.datagen;

import net.dakji.purpurexpansion.block.PEBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class PEBlockLootTableProvider extends BlockLootSubProvider {
    protected PEBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(PEBlocks.PURPUR_STONE.get());
        dropSelf(PEBlocks.PURPUR_STONE_STAIRS.get());
        add(PEBlocks.PURPUR_STONE_SLAB.get(), block -> createSlabItemTable(PEBlocks.PURPUR_STONE_SLAB.get()));
        dropSelf(PEBlocks.PURPUR_STONE_WALL.get());

        dropSelf(PEBlocks.POLISHED_PURPUR_STONE.get());
        dropSelf(PEBlocks.POLISHED_PURPUR_STONE_STAIRS.get());
        add(PEBlocks.POLISHED_PURPUR_STONE_SLAB.get(), block -> createSlabItemTable(PEBlocks.POLISHED_PURPUR_STONE_SLAB.get()));
        dropSelf(PEBlocks.POLISHED_PURPUR_STONE_WALL.get());

        dropSelf(PEBlocks.PURPUR_STONE_BRICKS.get());
        dropSelf(PEBlocks.PURPUR_STONE_BRICK_STAIRS.get());
        add(PEBlocks.PURPUR_STONE_BRICK_SLAB.get(), block -> createSlabItemTable(PEBlocks.PURPUR_STONE_BRICK_SLAB.get()));
        dropSelf(PEBlocks.PURPUR_STONE_BRICK_WALL.get());

        dropSelf(PEBlocks.PURPUR_STONE_TILES.get());
        dropSelf(PEBlocks.PURPUR_STONE_TILE_STAIRS.get());
        add(PEBlocks.PURPUR_STONE_TILE_SLAB.get(), block -> createSlabItemTable(PEBlocks.PURPUR_STONE_TILE_SLAB.get()));
        dropSelf(PEBlocks.PURPUR_STONE_TILE_WALL.get());

        dropSelf(PEBlocks.DARK_PURPUR_STONE.get());
        dropSelf(PEBlocks.DARK_PURPUR_STONE_STAIRS.get());
        add(PEBlocks.DARK_PURPUR_STONE_SLAB.get(), block -> createSlabItemTable(PEBlocks.DARK_PURPUR_STONE_SLAB.get()));
        dropSelf(PEBlocks.DARK_PURPUR_STONE_WALL.get());

        dropSelf(PEBlocks.POLISHED_DARK_PURPUR_STONE.get());
        dropSelf(PEBlocks.POLISHED_DARK_PURPUR_STONE_STAIRS.get());
        add(PEBlocks.POLISHED_DARK_PURPUR_STONE_SLAB.get(), block -> createSlabItemTable(PEBlocks.POLISHED_DARK_PURPUR_STONE_SLAB.get()));
        dropSelf(PEBlocks.POLISHED_DARK_PURPUR_STONE_WALL.get());

        dropSelf(PEBlocks.DARK_PURPUR_STONE_BRICKS.get());
        dropSelf(PEBlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get());
        add(PEBlocks.DARK_PURPUR_STONE_BRICK_SLAB.get(), block -> createSlabItemTable(PEBlocks.DARK_PURPUR_STONE_BRICK_SLAB.get()));
        dropSelf(PEBlocks.DARK_PURPUR_STONE_BRICK_WALL.get());

        dropSelf(PEBlocks.DARK_PURPUR_STONE_TILES.get());
        dropSelf(PEBlocks.DARK_PURPUR_STONE_TILE_STAIRS.get());
        add(PEBlocks.DARK_PURPUR_STONE_TILE_SLAB.get(), block -> createSlabItemTable(PEBlocks.DARK_PURPUR_STONE_TILE_SLAB.get()));
        dropSelf(PEBlocks.DARK_PURPUR_STONE_TILE_WALL.get());

        dropSelf(PEBlocks.PURPUR_SHROOMLIGHT.get());

        dropSelf(PEBlocks.PURPUR_GLOWSTONE.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return PEBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
