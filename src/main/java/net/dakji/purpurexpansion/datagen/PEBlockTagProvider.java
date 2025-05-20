package net.dakji.purpurexpansion.datagen;

import net.dakji.purpurexpansion.PurpurExpansion;
import net.dakji.purpurexpansion.block.PEBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class PEBlockTagProvider extends BlockTagsProvider {
    public PEBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PurpurExpansion.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(PEBlocks.PURPUR_STONE.get())
                .add(PEBlocks.PURPUR_STONE_SLAB.get())
                .add(PEBlocks.PURPUR_STONE_STAIRS.get())
                .add(PEBlocks.PURPUR_STONE_WALL.get())
                .add(PEBlocks.POLISHED_PURPUR_STONE.get())
                .add(PEBlocks.POLISHED_PURPUR_STONE_SLAB.get())
                .add(PEBlocks.POLISHED_PURPUR_STONE_STAIRS.get())
                .add(PEBlocks.POLISHED_PURPUR_STONE_WALL.get())
                .add(PEBlocks.PURPUR_STONE_BRICKS.get())
                .add(PEBlocks.PURPUR_STONE_BRICK_SLAB.get())
                .add(PEBlocks.PURPUR_STONE_BRICK_STAIRS.get())
                .add(PEBlocks.PURPUR_STONE_BRICK_WALL.get())
                .add(PEBlocks.PURPUR_STONE_TILES.get())
                .add(PEBlocks.PURPUR_STONE_TILE_SLAB.get())
                .add(PEBlocks.PURPUR_STONE_TILE_STAIRS.get())
                .add(PEBlocks.PURPUR_STONE_TILE_WALL.get())
                .add(PEBlocks.DARK_PURPUR_STONE.get())
                .add(PEBlocks.DARK_PURPUR_STONE_SLAB.get())
                .add(PEBlocks.DARK_PURPUR_STONE_STAIRS.get())
                .add(PEBlocks.DARK_PURPUR_STONE_WALL.get())
                .add(PEBlocks.POLISHED_DARK_PURPUR_STONE.get())
                .add(PEBlocks.POLISHED_DARK_PURPUR_STONE_SLAB.get())
                .add(PEBlocks.POLISHED_DARK_PURPUR_STONE_STAIRS.get())
                .add(PEBlocks.POLISHED_DARK_PURPUR_STONE_WALL.get())
                .add(PEBlocks.DARK_PURPUR_STONE_BRICKS.get())
                .add(PEBlocks.DARK_PURPUR_STONE_BRICK_SLAB.get())
                .add(PEBlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get())
                .add(PEBlocks.DARK_PURPUR_STONE_BRICK_WALL.get())
                .add(PEBlocks.DARK_PURPUR_STONE_TILES.get())
                .add(PEBlocks.DARK_PURPUR_STONE_TILE_SLAB.get())
                .add(PEBlocks.DARK_PURPUR_STONE_TILE_STAIRS.get())
                .add(PEBlocks.DARK_PURPUR_STONE_TILE_WALL.get())
                .add(PEBlocks.PURPUR_GLOWSTONE.get());

        tag(BlockTags.STAIRS)
                .add(PEBlocks.PURPUR_STONE_STAIRS.get())
                .add(PEBlocks.POLISHED_PURPUR_STONE_STAIRS.get())
                .add(PEBlocks.PURPUR_STONE_BRICK_STAIRS.get())
                .add(PEBlocks.PURPUR_STONE_TILE_STAIRS.get())
                .add(PEBlocks.DARK_PURPUR_STONE_STAIRS.get())
                .add(PEBlocks.POLISHED_DARK_PURPUR_STONE_STAIRS.get())
                .add(PEBlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get())
                .add(PEBlocks.DARK_PURPUR_STONE_TILE_STAIRS.get());

        tag(BlockTags.SLABS)
                .add(PEBlocks.PURPUR_STONE_SLAB.get())
                .add(PEBlocks.POLISHED_PURPUR_STONE_SLAB.get())
                .add(PEBlocks.PURPUR_STONE_BRICK_SLAB.get())
                .add(PEBlocks.PURPUR_STONE_TILE_SLAB.get())
                .add(PEBlocks.DARK_PURPUR_STONE_SLAB.get())
                .add(PEBlocks.POLISHED_DARK_PURPUR_STONE_SLAB.get())
                .add(PEBlocks.DARK_PURPUR_STONE_BRICK_SLAB.get())
                .add(PEBlocks.DARK_PURPUR_STONE_TILE_SLAB.get());

        tag(BlockTags.WALLS)
                .add(PEBlocks.PURPUR_STONE_WALL.get())
                .add(PEBlocks.POLISHED_PURPUR_STONE_WALL.get())
                .add(PEBlocks.PURPUR_STONE_BRICK_WALL.get())
                .add(PEBlocks.PURPUR_STONE_TILE_WALL.get())
                .add(PEBlocks.DARK_PURPUR_STONE_WALL.get())
                .add(PEBlocks.POLISHED_DARK_PURPUR_STONE_WALL.get())
                .add(PEBlocks.DARK_PURPUR_STONE_BRICK_WALL.get())
                .add(PEBlocks.DARK_PURPUR_STONE_TILE_WALL.get());

        tag(BlockTags.MINEABLE_WITH_HOE).add(PEBlocks.PURPUR_SHROOMLIGHT.get());
    }
}
