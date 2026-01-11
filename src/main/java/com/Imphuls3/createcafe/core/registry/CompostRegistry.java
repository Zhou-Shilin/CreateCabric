package com.Imphuls3.createcafe.core.registry;

import net.minecraft.world.level.block.ComposterBlock;

public class CompostRegistry {
    public static void register() {
        ComposterBlock.COMPOSTABLES.put(ItemRegistry.CASSAVA_SEEDS, 0.65F);
        ComposterBlock.COMPOSTABLES.put(ItemRegistry.CASSAVA_SEEDS, 0.3F);

        ComposterBlock.COMPOSTABLES.put(ItemRegistry.COFFEE_FRUIT, 0.65F);
        ComposterBlock.COMPOSTABLES.put(ItemRegistry.COFFEE_BEANS, 0.3F);
    }
}
