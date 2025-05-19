package net.dakji.purpuradditions.block;

import net.dakji.purpuradditions.PurpurAdditions;
import net.dakji.purpuradditions.item.PAItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class PABlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PurpurAdditions.MODID);

    // ---- PURPUR STONE ---- //
    public static final DeferredBlock<Block> PURPUR_STONE = registerBlock("purpur_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> PURPUR_STONE_SLAB = registerBlock("purpur_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> PURPUR_STONE_STAIRS = registerBlock("purpur_stone_stairs", () -> new StairBlock(PABlocks.PURPUR_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> PURPUR_STONE_WALL = registerBlock("purpur_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    // ---- POLISHED PURPUR STONE ---- //
    public static final DeferredBlock<Block> POLISHED_PURPUR_STONE = registerBlock("polished_purpur_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> POLISHED_PURPUR_STONE_SLAB = registerBlock("polished_purpur_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> POLISHED_PURPUR_STONE_STAIRS = registerBlock("polished_purpur_stone_stairs", () -> new StairBlock(PABlocks.POLISHED_PURPUR_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> POLISHED_PURPUR_STONE_WALL = registerBlock("polished_purpur_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    // ---- DARK PURPUR STONE ---- //
    public static final DeferredBlock<Block> DARK_PURPUR_STONE = registerBlock("dark_purpur_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> DARK_PURPUR_STONE_SLAB = registerBlock("dark_purpur_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> DARK_PURPUR_STONE_STAIRS = registerBlock("dark_purpur_stone_stairs", () -> new StairBlock(PABlocks.DARK_PURPUR_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> DARK_PURPUR_STONE_WALL = registerBlock("dark_purpur_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    // ---- DARK PURPUR STONE BRICKS ---- //
    public static final DeferredBlock<Block> DARK_PURPUR_STONE_BRICKS = registerBlock("dark_purpur_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> DARK_PURPUR_STONE_BRICK_SLAB = registerBlock("dark_purpur_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> DARK_PURPUR_STONE_BRICK_STAIRS = registerBlock("dark_purpur_stone_brick_stairs", () -> new StairBlock(PABlocks.DARK_PURPUR_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> DARK_PURPUR_STONE_BRICK_WALL = registerBlock("dark_purpur_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    // ---- DARK PURPUR STONE TILES ---- //
    public static final DeferredBlock<Block> DARK_PURPUR_STONE_TILES = registerBlock("dark_purpur_stone_tiles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> DARK_PURPUR_STONE_TILE_SLAB = registerBlock("dark_purpur_stone_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> DARK_PURPUR_STONE_TILE_STAIRS = registerBlock("dark_purpur_stone_tile_stairs", () -> new StairBlock(PABlocks.DARK_PURPUR_STONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> DARK_PURPUR_STONE_TILE_WALL = registerBlock("dark_purpur_stone_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    // ---- POLISHED DARK PURPUR STONE ---- //
    public static final DeferredBlock<Block> POLISHED_DARK_PURPUR_STONE = registerBlock("polished_dark_purpur_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> POLISHED_DARK_PURPUR_STONE_SLAB = registerBlock("polished_dark_purpur_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> POLISHED_DARK_PURPUR_STONE_STAIRS = registerBlock("polished_dark_purpur_stone_stairs", () -> new StairBlock(PABlocks.POLISHED_DARK_PURPUR_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> POLISHED_DARK_PURPUR_STONE_WALL = registerBlock("polished_dark_purpur_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    // ---- PURPUR SHROOMLIGHT ---- //
    public static final DeferredBlock<Block> PURPUR_SHROOMLIGHT = registerBlock("purpur_shroomlight", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SHROOMLIGHT).mapColor(MapColor.COLOR_PURPLE)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends  Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        PAItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
