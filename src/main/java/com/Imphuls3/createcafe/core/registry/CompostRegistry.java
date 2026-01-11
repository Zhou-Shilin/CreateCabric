package com.Imphuls3.createcafe.core.registry;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;

public class CompostRegistry {
    public static void register() {
        CompostingChanceRegistry.INSTANCE.add(ItemRegistry.CASSAVA_SEEDS, 0.3F);
        CompostingChanceRegistry.INSTANCE.add(ItemRegistry.CASSAVA_ROOT, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(ItemRegistry.COFFEE_FRUIT, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(ItemRegistry.COFFEE_BEANS, 0.3F);
    }
}
