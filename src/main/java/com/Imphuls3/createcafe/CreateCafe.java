package com.Imphuls3.createcafe;

import com.Imphuls3.createcafe.common.effect.EffectRegistry;
import com.Imphuls3.createcafe.config.CafeConfig;
import com.Imphuls3.createcafe.core.registry.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateCafe implements ModInitializer {
    public static final String ID = "createcafe";
    public static final Logger LOGGER = LoggerFactory.getLogger(ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Create Cafe");

        // Initialize config
        CafeConfig.init();

        // Register all content
        CreativeTabRegistry.register();
        ItemRegistry.register();
        BlockRegistry.register();
        EffectRegistry.register();
        FluidRegistry.register();
        CompostRegistry.register();

        // Register event handlers
        registerEvents();
    }

    private void registerEvents() {
        // TODO: Implement caffeine crash effect when caffeinated effect expires
        // This requires a mixin to hook into LivingEntity effect expiration
        // Original NeoForge behavior:
        // - When CAFFINATED effect expires, apply CAFFEINE_CRASH for 10 seconds
        // - Amplifier of crash effect matches the original caffeinated amplifier
    }

    public static ResourceLocation modPath(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }
}
