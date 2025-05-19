package net.dakji.purpuradditions.item;

import net.dakji.purpuradditions.PurpurAdditions;
import net.dakji.purpuradditions.block.PABlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class PACreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PurpurAdditions.MODID);

    public static final Supplier<CreativeModeTab> PURPUR_ADDITIONS_TAB = CREATIVE_MODE_TAB.register("purpur_additions_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PABlocks.PURPUR_STONE.get()))
                    .title(Component.translatable("creativetab.purpuradditions.purpur_additions"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(PABlocks.PURPUR_STONE);
                        output.accept(PABlocks.PURPUR_STONE_SLAB);
                        output.accept(PABlocks.PURPUR_STONE_STAIRS);
                        output.accept(PABlocks.PURPUR_STONE_WALL);

                        output.accept(PABlocks.POLISHED_PURPUR_STONE);
                        output.accept(PABlocks.POLISHED_PURPUR_STONE_SLAB);
                        output.accept(PABlocks.POLISHED_PURPUR_STONE_STAIRS);
                        output.accept(PABlocks.POLISHED_PURPUR_STONE_WALL);

                        output.accept(PABlocks.DARK_PURPUR_STONE);
                        output.accept(PABlocks.DARK_PURPUR_STONE_SLAB);
                        output.accept(PABlocks.DARK_PURPUR_STONE_STAIRS);
                        output.accept(PABlocks.DARK_PURPUR_STONE_WALL);

                        output.accept(PABlocks.POLISHED_DARK_PURPUR_STONE);
                        output.accept(PABlocks.POLISHED_DARK_PURPUR_STONE_SLAB);
                        output.accept(PABlocks.POLISHED_DARK_PURPUR_STONE_STAIRS);
                        output.accept(PABlocks.POLISHED_DARK_PURPUR_STONE_WALL);

                        output.accept(PABlocks.DARK_PURPUR_STONE_BRICKS);
                        output.accept(PABlocks.DARK_PURPUR_STONE_BRICK_SLAB);
                        output.accept(PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS);
                        output.accept(PABlocks.DARK_PURPUR_STONE_BRICK_WALL);

                        output.accept(PABlocks.DARK_PURPUR_STONE_TILES);
                        output.accept(PABlocks.DARK_PURPUR_STONE_TILE_SLAB);
                        output.accept(PABlocks.DARK_PURPUR_STONE_TILE_STAIRS);
                        output.accept(PABlocks.DARK_PURPUR_STONE_TILE_WALL);

                        output.accept(PABlocks.PURPUR_SHROOMLIGHT);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
