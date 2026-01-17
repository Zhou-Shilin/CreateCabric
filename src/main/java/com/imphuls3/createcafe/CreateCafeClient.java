package com.imphuls3.createcafe;

import com.imphuls3.createcafe.registry.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.util.Identifier;

public class CreateCafeClient implements ClientModInitializer {
    
    // Shared texture identifiers for fluid rendering
    private static final Identifier MILK_TEA_STILL = CreateCafe.id("fluid/milk_tea_still");
    private static final Identifier MILK_TEA_FLOW = CreateCafe.id("fluid/milk_tea_flow");
    
    @Override
    public void onInitializeClient() {
        CreateCafe.LOGGER.info("Create Cafe client initializing...");
        
        registerFluidRenderers();
        
        CreateCafe.LOGGER.info("Create Cafe client initialized!");
    }
    
    private void registerFluidRenderers() {
        // Register render handlers for all fluids using the shared milk_tea texture
        for (var fluid : ModFluids.getAllFluids()) {
            FluidRenderHandlerRegistry.INSTANCE.register(fluid, 
                new SimpleFluidRenderHandler(MILK_TEA_STILL, MILK_TEA_FLOW));
        }
        
        CreateCafe.LOGGER.info("Registered fluid render handlers");
    }
}
