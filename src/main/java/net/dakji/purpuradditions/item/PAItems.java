package net.dakji.purpuradditions.item;

import net.dakji.purpuradditions.PurpurAdditions;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PAItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PurpurAdditions.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
