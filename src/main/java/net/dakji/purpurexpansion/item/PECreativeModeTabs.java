package net.dakji.purpurexpansion.item;

import net.dakji.purpurexpansion.PurpurExpansion;
import net.dakji.purpurexpansion.block.PEBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class PECreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PurpurExpansion.MODID);

    public static final Supplier<CreativeModeTab> PURPUR_EXPANSION_TAB = CREATIVE_MODE_TAB.register("purpur_expansion_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PEBlocks.PURPUR_STONE.get()))
                    .title(Component.translatable("creativetab.purpurexpansion.purpur_expansion"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(PEBlocks.PURPUR_STONE);
                        output.accept(PEBlocks.PURPUR_STONE_SLAB);
                        output.accept(PEBlocks.PURPUR_STONE_STAIRS);
                        output.accept(PEBlocks.PURPUR_STONE_WALL);

                        output.accept(PEBlocks.POLISHED_PURPUR_STONE);
                        output.accept(PEBlocks.POLISHED_PURPUR_STONE_SLAB);
                        output.accept(PEBlocks.POLISHED_PURPUR_STONE_STAIRS);
                        output.accept(PEBlocks.POLISHED_PURPUR_STONE_WALL);

                        output.accept(PEBlocks.PURPUR_STONE_BRICKS);
                        output.accept(PEBlocks.PURPUR_STONE_BRICK_SLAB);
                        output.accept(PEBlocks.PURPUR_STONE_BRICK_STAIRS);
                        output.accept(PEBlocks.PURPUR_STONE_BRICK_WALL);

                        output.accept(PEBlocks.PURPUR_STONE_TILES);
                        output.accept(PEBlocks.PURPUR_STONE_TILE_SLAB);
                        output.accept(PEBlocks.PURPUR_STONE_TILE_STAIRS);
                        output.accept(PEBlocks.PURPUR_STONE_TILE_WALL);

                        output.accept(PEBlocks.DARK_PURPUR_STONE);
                        output.accept(PEBlocks.DARK_PURPUR_STONE_SLAB);
                        output.accept(PEBlocks.DARK_PURPUR_STONE_STAIRS);
                        output.accept(PEBlocks.DARK_PURPUR_STONE_WALL);

                        output.accept(PEBlocks.POLISHED_DARK_PURPUR_STONE);
                        output.accept(PEBlocks.POLISHED_DARK_PURPUR_STONE_SLAB);
                        output.accept(PEBlocks.POLISHED_DARK_PURPUR_STONE_STAIRS);
                        output.accept(PEBlocks.POLISHED_DARK_PURPUR_STONE_WALL);

                        output.accept(PEBlocks.DARK_PURPUR_STONE_BRICKS);
                        output.accept(PEBlocks.DARK_PURPUR_STONE_BRICK_SLAB);
                        output.accept(PEBlocks.DARK_PURPUR_STONE_BRICK_STAIRS);
                        output.accept(PEBlocks.DARK_PURPUR_STONE_BRICK_WALL);

                        output.accept(PEBlocks.DARK_PURPUR_STONE_TILES);
                        output.accept(PEBlocks.DARK_PURPUR_STONE_TILE_SLAB);
                        output.accept(PEBlocks.DARK_PURPUR_STONE_TILE_STAIRS);
                        output.accept(PEBlocks.DARK_PURPUR_STONE_TILE_WALL);

                        output.accept(PEBlocks.PURPUR_SHROOMLIGHT);

                        output.accept(PEBlocks.PURPUR_GLOWSTONE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
