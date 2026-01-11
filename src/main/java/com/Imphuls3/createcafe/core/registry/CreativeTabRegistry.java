package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabRegistry {
    public static final CreativeModeTab CREATE_CAFE = FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.create_cafe_items"))
            .icon(() -> new ItemStack(ItemRegistry.STRAWBERRY_TEA))
            .displayItems((displayContext, entries) -> {
                // Food Items
                entries.accept(ItemRegistry.OREO);
                entries.accept(ItemRegistry.OREO_INCOMPLETE);
                entries.accept(ItemRegistry.OREO_HALF_RAW);
                entries.accept(ItemRegistry.OREO_HALF);
                entries.accept(ItemRegistry.OREO_DOUGH);
                entries.accept(ItemRegistry.CRUSHED_OREO);
                entries.accept(ItemRegistry.MANA_BERRIES);
                entries.accept(ItemRegistry.BLOOD_ORANGE);

                // Drink Items - Speed
                entries.accept(ItemRegistry.MANGO_TEA);
                entries.accept(ItemRegistry.LIME_TEA);
                entries.accept(ItemRegistry.STRAWBERRY_TEA);
                entries.accept(ItemRegistry.PEACH_TEA);
                entries.accept(ItemRegistry.PLUM_TEA);
                entries.accept(ItemRegistry.JACKFRUIT_TEA);
                entries.accept(ItemRegistry.APRICOT_TEA);
                entries.accept(ItemRegistry.DURIAN_TEA);
                entries.accept(ItemRegistry.FIG_TEA);
                entries.accept(ItemRegistry.GRAPE_TEA);
                entries.accept(ItemRegistry.GRAPEFRUIT_TEA);
                entries.accept(ItemRegistry.STARFRUIT_TEA);
                entries.accept(ItemRegistry.MANDARIN_TEA);

                // Drink Items - Regen
                entries.accept(ItemRegistry.BLOOD_TEA);
                entries.accept(ItemRegistry.LYCHEE_TEA);
                entries.accept(ItemRegistry.BLUEBERRY_TEA);
                entries.accept(ItemRegistry.PINEAPPLE_TEA);
                entries.accept(ItemRegistry.APPLE_TEA);
                entries.accept(ItemRegistry.PUMPKIN_TEA);
                entries.accept(ItemRegistry.AVOCADO_TEA);
                entries.accept(ItemRegistry.SWEETBERRY_TEA);
                entries.accept(ItemRegistry.TAMARIND_TEA);
                entries.accept(ItemRegistry.PAPAYA_TEA);
                entries.accept(ItemRegistry.REDLOVE_TEA);

                // Drink Items - Strength
                entries.accept(ItemRegistry.MANA_TEA);
                entries.accept(ItemRegistry.KIWI_TEA);
                entries.accept(ItemRegistry.ORANGE_TEA);
                entries.accept(ItemRegistry.YUCCA_TEA);
                entries.accept(ItemRegistry.ALOE_TEA);
                entries.accept(ItemRegistry.COCONUT_TEA);
                entries.accept(ItemRegistry.PERSIMMON_TEA);
                entries.accept(ItemRegistry.POMEGRANATE_TEA);
                entries.accept(ItemRegistry.RASPBERRY_TEA);
                entries.accept(ItemRegistry.POMELO_TEA);

                // Drink Items - Resistance
                entries.accept(ItemRegistry.LEMON_TEA);
                entries.accept(ItemRegistry.WATERMELON_TEA);
                entries.accept(ItemRegistry.VANILLA_TEA);
                entries.accept(ItemRegistry.BANANA_TEA);
                entries.accept(ItemRegistry.CHERRY_TEA);
                entries.accept(ItemRegistry.BLACKBERRY_TEA);
                entries.accept(ItemRegistry.DRAGONFRUIT_TEA);
                entries.accept(ItemRegistry.GOOSEBERRY_TEA);
                entries.accept(ItemRegistry.GUAVA_TEA);
                entries.accept(ItemRegistry.PASSIONFRUIT_TEA);
                entries.accept(ItemRegistry.LAVENDER_TEA);
                entries.accept(ItemRegistry.CITRON_TEA);

                // Special Drinks
                entries.accept(ItemRegistry.BARBERRY_TEA);
                entries.accept(ItemRegistry.OREO_TEA);

                // Iced Coffee
                entries.accept(ItemRegistry.ICED_COFFEE);
                entries.accept(ItemRegistry.ICED_COFFEE_MILK);
                entries.accept(ItemRegistry.STRAWBERRY_ICED_COFFEE);
                entries.accept(ItemRegistry.VANILLA_ICED_COFFEE);
                entries.accept(ItemRegistry.RASPBERRY_ICED_COFFEE);
                entries.accept(ItemRegistry.MINT_ICED_COFFEE);
                entries.accept(ItemRegistry.CARAMEL_ICED_COFFEE);
                entries.accept(ItemRegistry.COCONUT_ICED_COFFEE);
                entries.accept(ItemRegistry.BANANA_ICED_COFFEE);

                // Non Food Items
                entries.accept(ItemRegistry.BOBA_CUP);
                entries.accept(ItemRegistry.EMPTY_BOBA_CUP);
                entries.accept(ItemRegistry.ICED_COFFEE_CUP);
                entries.accept(ItemRegistry.ICED_COFFEE_CUP_ICE);

                // Boba
                entries.accept(ItemRegistry.BOBA);
                entries.accept(ItemRegistry.RAW_BOBA);
                entries.accept(ItemRegistry.TAPIOCA_FLOUR);

                // Crop Items
                entries.accept(ItemRegistry.COFFEE_FRUIT);
                entries.accept(ItemRegistry.COFFEE_BEANS);
                entries.accept(ItemRegistry.ROASTED_COFFEE);
                entries.accept(ItemRegistry.COFFEE_GROUNDS);
                entries.accept(ItemRegistry.CASSAVA_SEEDS);
                entries.accept(ItemRegistry.CASSAVA_ROOT);
            }).build();

    public static final CreativeModeTab CREATE_CAFE_FLUIDS = FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.create_cafe_fluids"))
            .icon(() -> new ItemStack(FluidRegistry.STRAWBERRY_TEA_BUCKET))
            .displayItems((displayContext, entries) -> {
                // Add fluid buckets here
                entries.accept(FluidRegistry.MELTED_SUGAR_BUCKET);
                entries.accept(FluidRegistry.FILLING_BUCKET);
                entries.accept(FluidRegistry.COFFEE_BUCKET);
                entries.accept(FluidRegistry.OREO_TEA_BUCKET);
                entries.accept(FluidRegistry.MANGO_TEA_BUCKET);
                entries.accept(FluidRegistry.LIME_TEA_BUCKET);
                entries.accept(FluidRegistry.LYCHEE_TEA_BUCKET);
                entries.accept(FluidRegistry.KIWI_TEA_BUCKET);
                entries.accept(FluidRegistry.MANA_TEA_BUCKET);
                entries.accept(FluidRegistry.BLOOD_TEA_BUCKET);
                entries.accept(FluidRegistry.LEMON_TEA_BUCKET);
                entries.accept(FluidRegistry.WATERMELON_TEA_BUCKET);
                entries.accept(FluidRegistry.STRAWBERRY_TEA_BUCKET);
                entries.accept(FluidRegistry.BLUEBERRY_TEA_BUCKET);
                entries.accept(FluidRegistry.VANILLA_TEA_BUCKET);
                entries.accept(FluidRegistry.ORANGE_TEA_BUCKET);
                entries.accept(FluidRegistry.PEACH_TEA_BUCKET);
                entries.accept(FluidRegistry.PINEAPPLE_TEA_BUCKET);
                entries.accept(FluidRegistry.BANANA_TEA_BUCKET);
                entries.accept(FluidRegistry.YUCCA_TEA_BUCKET);
                entries.accept(FluidRegistry.CHERRY_TEA_BUCKET);
                entries.accept(FluidRegistry.PLUM_TEA_BUCKET);
                entries.accept(FluidRegistry.ALOE_TEA_BUCKET);
                entries.accept(FluidRegistry.APPLE_TEA_BUCKET);
                entries.accept(FluidRegistry.BLACKBERRY_TEA_BUCKET);
                entries.accept(FluidRegistry.PUMPKIN_TEA_BUCKET);
                entries.accept(FluidRegistry.JACKFRUIT_TEA_BUCKET);
                entries.accept(FluidRegistry.COCONUT_TEA_BUCKET);
                entries.accept(FluidRegistry.DRAGONFRUIT_TEA_BUCKET);
                entries.accept(FluidRegistry.APRICOT_TEA_BUCKET);
                entries.accept(FluidRegistry.AVOCADO_TEA_BUCKET);
                entries.accept(FluidRegistry.SWEETBERRY_TEA_BUCKET);
                entries.accept(FluidRegistry.DURIAN_TEA_BUCKET);
                entries.accept(FluidRegistry.FIG_TEA_BUCKET);
                entries.accept(FluidRegistry.TAMARIND_TEA_BUCKET);
                entries.accept(FluidRegistry.GOOSEBERRY_TEA_BUCKET);
                entries.accept(FluidRegistry.GRAPE_TEA_BUCKET);
                entries.accept(FluidRegistry.GRAPEFRUIT_TEA_BUCKET);
                entries.accept(FluidRegistry.PAPAYA_TEA_BUCKET);
                entries.accept(FluidRegistry.GUAVA_TEA_BUCKET);
                entries.accept(FluidRegistry.PASSIONFRUIT_TEA_BUCKET);
                entries.accept(FluidRegistry.POMEGRANATE_TEA_BUCKET);
                entries.accept(FluidRegistry.PERSIMMON_TEA_BUCKET);
                entries.accept(FluidRegistry.RASPBERRY_TEA_BUCKET);
                entries.accept(FluidRegistry.STARFRUIT_TEA_BUCKET);
                entries.accept(FluidRegistry.LAVENDER_TEA_BUCKET);
                entries.accept(FluidRegistry.POMELO_TEA_BUCKET);
                entries.accept(FluidRegistry.MANDARIN_TEA_BUCKET);
                entries.accept(FluidRegistry.CITRON_TEA_BUCKET);
                entries.accept(FluidRegistry.REDLOVE_TEA_BUCKET);
                entries.accept(FluidRegistry.BARBERRY_TEA_BUCKET);
                // Syrups
                entries.accept(FluidRegistry.STRAWBERRY_SYRUP_BUCKET);
                entries.accept(FluidRegistry.VANILLA_SYRUP_BUCKET);
                entries.accept(FluidRegistry.RASPBERRY_SYRUP_BUCKET);
                entries.accept(FluidRegistry.MINT_SYRUP_BUCKET);
                entries.accept(FluidRegistry.CARAMEL_SYRUP_BUCKET);
                entries.accept(FluidRegistry.COCONUT_SYRUP_BUCKET);
                entries.accept(FluidRegistry.BANANA_SYRUP_BUCKET);
            }).build();

    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CreateCafe.modPath("create_cafe_items"), CREATE_CAFE);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CreateCafe.modPath("create_cafe_fluids"), CREATE_CAFE_FLUIDS);
    }
}
