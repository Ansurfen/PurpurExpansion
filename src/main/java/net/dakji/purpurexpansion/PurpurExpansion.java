package net.dakji.purpurexpansion;

import net.dakji.purpurexpansion.block.PEBlocks;
import net.dakji.purpurexpansion.item.PECreativeModeTabs;
import net.dakji.purpurexpansion.item.PEItems;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(PurpurExpansion.MODID)
public class PurpurExpansion {
    public static final String MODID = "purpurexpansion";

    public PurpurExpansion(IEventBus modEventBus, ModContainer modContainer) {

        NeoForge.EVENT_BUS.register(this);
        NeoForge.EVENT_BUS.register(this);

        PECreativeModeTabs.register(modEventBus);

        PEItems.register(modEventBus);
        PEBlocks.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
