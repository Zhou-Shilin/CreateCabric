package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class CreativeTabRegistry {
    public static final CreativeModeTab CREATE_CAFE = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CreateCafe.id("create_cafe_items"),
            FabricItemGroup.builder()
                    .title(Component.translatable("itemGroup.create_cafe_items"))
                    .icon(() -> ItemRegistry.STRAWBERRY_TEA.getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        for (Item item : ItemRegistry.getAllItems()) {
                            output.accept(item);
                        }
                    })
                    .build());

    public static final CreativeModeTab CREATE_CAFE_FLUIDS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CreateCafe.id("create_cafe_fluids"),
            FabricItemGroup.builder()
                    .title(Component.translatable("itemGroup.create_cafe_fluids"))
                    .icon(() -> FluidRegistry.STRAWBERRY_TEA.bucket().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        for (Item item : FluidRegistry.getBucketItems()) {
                            output.accept(item);
                        }
                    })
                    .build());

    public static void register() {
        // Intentionally empty; static init handles registration.
    }
}
