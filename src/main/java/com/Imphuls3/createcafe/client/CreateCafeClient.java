package com.Imphuls3.createcafe.client;

import com.Imphuls3.createcafe.core.registry.FluidRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class CreateCafeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        for (FluidRegistry.FluidEntry entry : FluidRegistry.getEntries()) {
            FluidRenderHandlerRegistry.INSTANCE.register(entry.still(), entry.flowing(),
                    new SimpleFluidRenderHandler(FluidRegistry.STILL_TEXTURE, FluidRegistry.FLOWING_TEXTURE, entry.tintColor()));
            BlockRenderLayerMap.INSTANCE.putFluids(RenderType.translucent(), entry.still(), entry.flowing());
        }
    }
}
