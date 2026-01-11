package com.Imphuls3.createcafe;

import com.Imphuls3.createcafe.common.effect.EffectRegistry;
import com.Imphuls3.createcafe.config.CafeConfig;
import com.Imphuls3.createcafe.core.registry.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreateCafe implements ModInitializer {
    public static final String ID = "createcafe";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        BlockRegistry.register();
        ItemRegistry.register();
        FluidRegistry.register();
        EffectRegistry.register();
        CreativeTabRegistry.register();
        CafeConfig.load();
        CompostRegistry.register();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(ID, path);
    }
}
