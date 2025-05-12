package net.dakji.purpuradditions.datagen;

import net.dakji.purpuradditions.PurpurAdditions;
import net.dakji.purpuradditions.block.PABlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class PABlockTagProvider extends BlockTagsProvider {
    public PABlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PurpurAdditions.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(PABlocks.PURPUR_STONE.get())
                .add(PABlocks.PURPUR_STONE_SLAB.get())
                .add(PABlocks.PURPUR_STONE_STAIRS.get())
                .add(PABlocks.PURPUR_STONE_WALL.get())
                .add(PABlocks.DARK_PURPUR_STONE.get())
                .add(PABlocks.DARK_PURPUR_STONE_SLAB.get())
                .add(PABlocks.DARK_PURPUR_STONE_STAIRS.get())
                .add(PABlocks.DARK_PURPUR_STONE_WALL.get())
                .add(PABlocks.POLISHED_DARK_PURPUR_STONE.get())
                .add(PABlocks.POLISHED_DARK_PURPUR_STONE_SLAB.get())
                .add(PABlocks.POLISHED_DARK_PURPUR_STONE_STAIRS.get())
                .add(PABlocks.POLISHED_DARK_PURPUR_STONE_WALL.get())
                .add(PABlocks.DARK_PURPUR_STONE_BRICKS.get())
                .add(PABlocks.DARK_PURPUR_STONE_BRICK_SLAB.get())
                .add(PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get())
                .add(PABlocks.DARK_PURPUR_STONE_BRICK_WALL.get())
                .add(PABlocks.DARK_PURPUR_STONE_TILES.get())
                .add(PABlocks.DARK_PURPUR_STONE_TILE_SLAB.get())
                .add(PABlocks.DARK_PURPUR_STONE_TILE_STAIRS.get())
                .add(PABlocks.DARK_PURPUR_STONE_TILE_WALL.get());

        tag(BlockTags.STAIRS)
                .add(PABlocks.PURPUR_STONE_STAIRS.get())
                .add(PABlocks.DARK_PURPUR_STONE_STAIRS.get())
                .add(PABlocks.POLISHED_DARK_PURPUR_STONE_STAIRS.get())
                .add(PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get())
                .add(PABlocks.DARK_PURPUR_STONE_TILE_STAIRS.get());

        tag(BlockTags.SLABS)
                .add(PABlocks.PURPUR_STONE_SLAB.get())
                .add(PABlocks.DARK_PURPUR_STONE_SLAB.get())
                .add(PABlocks.POLISHED_DARK_PURPUR_STONE_SLAB.get())
                .add(PABlocks.DARK_PURPUR_STONE_BRICK_SLAB.get())
                .add(PABlocks.DARK_PURPUR_STONE_TILE_SLAB.get());

        tag(BlockTags.WALLS)
                .add(PABlocks.PURPUR_STONE_WALL.get())
                .add(PABlocks.DARK_PURPUR_STONE_WALL.get())
                .add(PABlocks.POLISHED_DARK_PURPUR_STONE_WALL.get())
                .add(PABlocks.DARK_PURPUR_STONE_BRICK_WALL.get())
                .add(PABlocks.DARK_PURPUR_STONE_TILE_WALL.get());

        tag(BlockTags.MINEABLE_WITH_HOE).add(PABlocks.PURPUR_SHROOMLIGHT.get());
    }
}
