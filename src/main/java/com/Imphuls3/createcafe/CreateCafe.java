package com.Imphuls3.createcafe;

import com.Imphuls3.createcafe.core.registry.BlockRegistry;
import com.Imphuls3.createcafe.compat.Compat;
import com.Imphuls3.createcafe.core.registry.CompostRegistry;
import com.Imphuls3.createcafe.core.registry.FluidRegistry;
import com.Imphuls3.createcafe.core.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateCafe implements ModInitializer {
    public static final String MOD_ID = "createcafe";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Create Cafe");
        
        // Register items, blocks, fluids
        ItemRegistry.register();
        BlockRegistry.register();
        FluidRegistry.register();
        
        // Initialize mod compatibility checks
        Compat.init();
        
        // Register compostables
        CompostRegistry.register();
    }
}
