package com.imphuls3.createcafe;

import com.imphuls3.createcafe.registry.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class CreateCafeClient implements ClientModInitializer {
    
    // Use vanilla water textures with custom tint for milk tea fluids
    private static final Identifier WATER_STILL = new Identifier("minecraft", "block/water_still");
    private static final Identifier WATER_FLOW = new Identifier("minecraft", "block/water_flow");
    
    // Milk tea tint color (creamy beige/tan color)
    private static final int MILK_TEA_TINT = 0xD4A574;
    
    @Override
    public void onInitializeClient() {
        CreateCafe.LOGGER.info("Create Cafe client initializing...");
        
        registerFluidRenderers();
        
        CreateCafe.LOGGER.info("Create Cafe client initialized!");
    }
    
    private void registerFluidRenderers() {
        // Register render handlers for all fluids using water texture with milk tea tint
        for (var fluid : ModFluids.getAllFluids()) {
            FluidRenderHandlerRegistry.INSTANCE.register(fluid, 
                new SimpleFluidRenderHandler(WATER_STILL, WATER_FLOW, MILK_TEA_TINT));
            
            // Make fluids render as translucent
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), fluid);
        }
        
        CreateCafe.LOGGER.info("Registered fluid render handlers");
    }
}
