package com.imphuls3.createcafe.registry;

import com.imphuls3.createcafe.CreateCafe;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ModItemGroups {
    public static final ItemGroup CREATECAFE_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.STRAWBERRY_TEA))
            .displayName(Text.translatable("itemGroup.createcafe.items"))
            .entries((context, entries) -> {
                // Add all items
                entries.add(ModItems.OREO);
                entries.add(ModItems.OREO_INCOMPLETE);
                entries.add(ModItems.OREO_HALF_RAW);
                entries.add(ModItems.OREO_HALF);
                entries.add(ModItems.OREO_DOUGH);
                entries.add(ModItems.CRUSHED_OREO);
                entries.add(ModItems.MANA_BERRIES);
                entries.add(ModItems.BLOOD_ORANGE);

                // Tea drinks
                entries.add(ModItems.MANGO_TEA);
                entries.add(ModItems.LIME_TEA);
                entries.add(ModItems.STRAWBERRY_TEA);
                entries.add(ModItems.PEACH_TEA);
                entries.add(ModItems.PLUM_TEA);
                entries.add(ModItems.JACKFRUIT_TEA);
                entries.add(ModItems.APRICOT_TEA);
                entries.add(ModItems.DURIAN_TEA);
                entries.add(ModItems.FIG_TEA);
                entries.add(ModItems.GRAPE_TEA);
                entries.add(ModItems.GRAPEFRUIT_TEA);
                entries.add(ModItems.STARFRUIT_TEA);
                entries.add(ModItems.MANDARIN_TEA);

                entries.add(ModItems.BLOOD_TEA);
                entries.add(ModItems.LYCHEE_TEA);
                entries.add(ModItems.BLUEBERRY_TEA);
                entries.add(ModItems.PINEAPPLE_TEA);
                entries.add(ModItems.APPLE_TEA);
                entries.add(ModItems.PUMPKIN_TEA);
                entries.add(ModItems.AVOCADO_TEA);
                entries.add(ModItems.SWEETBERRY_TEA);
                entries.add(ModItems.TAMARIND_TEA);
                entries.add(ModItems.PAPAYA_TEA);
                entries.add(ModItems.REDLOVE_TEA);

                entries.add(ModItems.MANA_TEA);
                entries.add(ModItems.KIWI_TEA);
                entries.add(ModItems.ORANGE_TEA);
                entries.add(ModItems.YUCCA_TEA);
                entries.add(ModItems.ALOE_TEA);
                entries.add(ModItems.COCONUT_TEA);
                entries.add(ModItems.PERSIMMON_TEA);
                entries.add(ModItems.POMEGRANATE_TEA);
                entries.add(ModItems.RASPBERRY_TEA);
                entries.add(ModItems.POMELO_TEA);

                entries.add(ModItems.LEMON_TEA);
                entries.add(ModItems.WATERMELON_TEA);
                entries.add(ModItems.VANILLA_TEA);
                entries.add(ModItems.BANANA_TEA);
                entries.add(ModItems.CHERRY_TEA);
                entries.add(ModItems.BLACKBERRY_TEA);
                entries.add(ModItems.DRAGONFRUIT_TEA);
                entries.add(ModItems.GOOSEBERRY_TEA);
                entries.add(ModItems.GUAVA_TEA);
                entries.add(ModItems.PASSIONFRUIT_TEA);
                entries.add(ModItems.LAVENDER_TEA);
                entries.add(ModItems.CITRON_TEA);

                entries.add(ModItems.BARBERRY_TEA);
                entries.add(ModItems.OREO_TEA);

                // Iced coffee
                entries.add(ModItems.ICED_COFFEE);
                entries.add(ModItems.ICED_COFFEE_MILK);
                entries.add(ModItems.STRAWBERRY_ICED_COFFEE);
                entries.add(ModItems.VANILLA_ICED_COFFEE);
                entries.add(ModItems.RASPBERRY_ICED_COFFEE);
                entries.add(ModItems.MINT_ICED_COFFEE);
                entries.add(ModItems.CARAMEL_ICED_COFFEE);
                entries.add(ModItems.COCONUT_ICED_COFFEE);
                entries.add(ModItems.BANANA_ICED_COFFEE);

                // Non-food items
                entries.add(ModItems.BOBA_CUP);
                entries.add(ModItems.EMPTY_BOBA_CUP);
                entries.add(ModItems.ICED_COFFEE_CUP);
                entries.add(ModItems.ICED_COFFEE_CUP_ICE);

                // Boba
                entries.add(ModItems.BOBA);
                entries.add(ModItems.RAW_BOBA);
                entries.add(ModItems.TAPIOCA_FLOUR);

                // Crop items
                entries.add(ModItems.COFFEE_FRUIT);
                entries.add(ModItems.COFFEE_BEANS);
                entries.add(ModItems.ROASTED_COFFEE);
                entries.add(ModItems.COFFEE_GROUNDS);
                entries.add(ModItems.CASSAVA_SEEDS);
                entries.add(ModItems.CASSAVA_ROOT);

                // Bucket items - Tea
                entries.add(ModFluids.ALOE_TEA_BUCKET);
                entries.add(ModFluids.APPLE_TEA_BUCKET);
                entries.add(ModFluids.APRICOT_TEA_BUCKET);
                entries.add(ModFluids.AVOCADO_TEA_BUCKET);
                entries.add(ModFluids.BANANA_TEA_BUCKET);
                entries.add(ModFluids.BARBERRY_TEA_BUCKET);
                entries.add(ModFluids.BLACKBERRY_TEA_BUCKET);
                entries.add(ModFluids.BLOOD_TEA_BUCKET);
                entries.add(ModFluids.BLUEBERRY_TEA_BUCKET);
                entries.add(ModFluids.CHERRY_TEA_BUCKET);
                entries.add(ModFluids.CITRON_TEA_BUCKET);
                entries.add(ModFluids.COCONUT_TEA_BUCKET);
                entries.add(ModFluids.DRAGONFRUIT_TEA_BUCKET);
                entries.add(ModFluids.DURIAN_TEA_BUCKET);
                entries.add(ModFluids.FIG_TEA_BUCKET);
                entries.add(ModFluids.GOOSEBERRY_TEA_BUCKET);
                entries.add(ModFluids.GRAPE_TEA_BUCKET);
                entries.add(ModFluids.GRAPEFRUIT_TEA_BUCKET);
                entries.add(ModFluids.GUAVA_TEA_BUCKET);
                entries.add(ModFluids.JACKFRUIT_TEA_BUCKET);
                entries.add(ModFluids.KIWI_TEA_BUCKET);
                entries.add(ModFluids.LAVENDER_TEA_BUCKET);
                entries.add(ModFluids.LEMON_TEA_BUCKET);
                entries.add(ModFluids.LIME_TEA_BUCKET);
                entries.add(ModFluids.LYCHEE_TEA_BUCKET);
                entries.add(ModFluids.MANA_TEA_BUCKET);
                entries.add(ModFluids.MANDARIN_TEA_BUCKET);
                entries.add(ModFluids.MANGO_TEA_BUCKET);
                entries.add(ModFluids.ORANGE_TEA_BUCKET);
                entries.add(ModFluids.OREO_TEA_BUCKET);
                entries.add(ModFluids.PAPAYA_TEA_BUCKET);
                entries.add(ModFluids.PASSIONFRUIT_TEA_BUCKET);
                entries.add(ModFluids.PEACH_TEA_BUCKET);
                entries.add(ModFluids.PERSIMMON_TEA_BUCKET);
                entries.add(ModFluids.PINEAPPLE_TEA_BUCKET);
                entries.add(ModFluids.PLUM_TEA_BUCKET);
                entries.add(ModFluids.POMEGRANATE_TEA_BUCKET);
                entries.add(ModFluids.POMELO_TEA_BUCKET);
                entries.add(ModFluids.PUMPKIN_TEA_BUCKET);
                entries.add(ModFluids.RASPBERRY_TEA_BUCKET);
                entries.add(ModFluids.REDLOVE_TEA_BUCKET);
                entries.add(ModFluids.STARFRUIT_TEA_BUCKET);
                entries.add(ModFluids.STRAWBERRY_TEA_BUCKET);
                entries.add(ModFluids.SWEETBERRY_TEA_BUCKET);
                entries.add(ModFluids.TAMARIND_TEA_BUCKET);
                entries.add(ModFluids.VANILLA_TEA_BUCKET);
                entries.add(ModFluids.WATERMELON_TEA_BUCKET);
                entries.add(ModFluids.YUCCA_TEA_BUCKET);

                // Bucket items - Syrup
                entries.add(ModFluids.BANANA_SYRUP_BUCKET);
                entries.add(ModFluids.CARAMEL_SYRUP_BUCKET);
                entries.add(ModFluids.COCONUT_SYRUP_BUCKET);
                entries.add(ModFluids.MINT_SYRUP_BUCKET);
                entries.add(ModFluids.RASPBERRY_SYRUP_BUCKET);
                entries.add(ModFluids.STRAWBERRY_SYRUP_BUCKET);
                entries.add(ModFluids.VANILLA_SYRUP_BUCKET);

                // Bucket items - Other
                entries.add(ModFluids.COFFEE_BUCKET);
                entries.add(ModFluids.MELTED_SUGAR_BUCKET);
            })
            .build();

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, CreateCafe.id("createcafe_items"), CREATECAFE_GROUP);
    }
}
