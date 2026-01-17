package com.imphuls3.createcafe;

import com.imphuls3.createcafe.registry.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class CreateCafeClient implements ClientModInitializer {
    
    // Custom milk tea textures from the mod's block texture folder
    // SimpleFluidRenderHandler automatically handles texture registration
    private static final Identifier MILK_TEA_STILL = CreateCafe.id("block/milk_tea_still");
    private static final Identifier MILK_TEA_FLOW = CreateCafe.id("block/milk_tea_flow");
    
    @Override
    public void onInitializeClient() {
        CreateCafe.LOGGER.info("Create Cafe client initializing...");
        
        registerFluidRenderers();
        
        CreateCafe.LOGGER.info("Create Cafe client initialized!");
    }
    
    private void registerFluidRenderers() {
        // Register render handlers for all fluids using milk_tea texture with per-fluid tint colors
        for (var entry : ModFluids.getFluidColors().entrySet()) {
            var fluid = entry.getKey();
            int color = entry.getValue();
            
            FluidRenderHandlerRegistry.INSTANCE.register(fluid, 
                new SimpleFluidRenderHandler(MILK_TEA_STILL, MILK_TEA_FLOW, color));
            
            // Make fluids render as translucent
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), fluid);
        }
        
        CreateCafe.LOGGER.info("Registered fluid render handlers with per-fluid tint colors");
    }
}
