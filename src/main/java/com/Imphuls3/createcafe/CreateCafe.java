package com.Imphuls3.createcafe;

import com.Imphuls3.createcafe.common.effect.EffectRegistry;
import com.Imphuls3.createcafe.config.CafeConfig;
import com.Imphuls3.createcafe.core.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
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
        // Handle caffeine crash effect when caffeinated effect expires
        // Note: Fabric doesn't have a direct equivalent to MobEffectEvent.Expired
        // This would need a mixin or alternative approach for full functionality
    }

    public static ResourceLocation modPath(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }
}
