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
    public static final DeferredBlock<Block> PURPUR_STONE = registerBlock("purpur_stone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<SlabBlock> PURPUR_STONE_SLAB = registerBlock("purpur_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<StairBlock> PURPUR_STONE_STAIRS = registerBlock("purpur_stone_stairs", () ->
            new StairBlock(PABlocks.PURPUR_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<WallBlock> PURPUR_STONE_WALL = registerBlock("purpur_stone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    // ---- DARK PURPUR STONE ---- //
    public static final DeferredBlock<Block> DARK_PURPUR_STONE = registerBlock("dark_purpur_stone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> DARK_PURPUR_STONE_SLAB = registerBlock("dark_purpur_stone_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<StairBlock> DARK_PURPUR_STONE_STAIRS = registerBlock("dark_purpur_stone_stairs", () ->
            new StairBlock(PABlocks.DARK_PURPUR_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<WallBlock> DARK_PURPUR_STONE_WALL = registerBlock("dark_purpur_stone_wall", () ->
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));


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
