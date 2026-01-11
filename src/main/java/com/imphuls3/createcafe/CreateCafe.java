package com.imphuls3.createcafe;

import com.imphuls3.createcafe.registry.ModBlocks;
import com.imphuls3.createcafe.registry.ModEffects;
import com.imphuls3.createcafe.registry.ModFluids;
import com.imphuls3.createcafe.registry.ModItemGroups;
import com.imphuls3.createcafe.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateCafe implements ModInitializer {
    public static final String MOD_ID = "createcafe";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Create Cafe");
        
        ModItemGroups.register();
        ModItems.register();
        ModBlocks.register();
        ModEffects.register();
        ModFluids.register();
        
        // Register compostables
        registerCompostables();
        
        LOGGER.info("Create Cafe initialized!");
    }

    private void registerCompostables() {
        net.minecraft.block.ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(
            ModItems.CASSAVA_SEEDS, 0.3f);
        net.minecraft.block.ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(
            ModItems.COFFEE_FRUIT, 0.65f);
        net.minecraft.block.ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(
            ModItems.COFFEE_BEANS, 0.3f);
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
