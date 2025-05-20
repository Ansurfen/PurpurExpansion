package net.dakji.purpurexpansion.item;

import net.dakji.purpurexpansion.PurpurExpansion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PEItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PurpurExpansion.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
