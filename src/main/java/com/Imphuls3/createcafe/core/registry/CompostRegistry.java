package com.Imphuls3.createcafe.core.registry;

import net.minecraft.block.ComposterBlock;

public class CompostRegistry {
    public static void register() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ItemRegistry.CASSAVA_SEEDS, 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ItemRegistry.COFFEE_FRUIT, 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ItemRegistry.COFFEE_BEANS, 0.3F);
    }
}
