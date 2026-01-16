package com.Imphuls3.createcafe;

import com.Imphuls3.createcafe.common.effect.EffectRegistry;
import com.Imphuls3.createcafe.core.registry.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateCafe implements ModInitializer {
    public static final String ID = "createcafe";
    public static final Logger LOGGER = LoggerFactory.getLogger(ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Create Cafe for Fabric");

        // Register all content
        EffectRegistry.register();
        BlockRegistry.register();
        ItemRegistry.register();
        FluidRegistry.register();
        CompostRegistry.register();

        LOGGER.info("Create Cafe initialized successfully");
    }

    public static Identifier modPath(String path) {
        return new Identifier(ID, path);
    }
}
