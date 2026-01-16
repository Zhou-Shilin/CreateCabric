package com.Imphuls3.createcafe;

import com.Imphuls3.createcafe.core.registry.BlockRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class CreateCafeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Set render layers for crops
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.CASSAVA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.COFFEE, RenderLayer.getCutout());
    }
}
