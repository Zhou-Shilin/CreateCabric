package com.imphuls3.createcafe.registry;

import com.imphuls3.createcafe.CreateCafe;
import com.imphuls3.createcafe.common.item.foods.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {
    // Food Items
    public static final Item OREO = new Item(settings().food(ModFoods.OREO));
    public static final Item OREO_INCOMPLETE = new Item(new Item.Settings().maxCount(1));
    public static final Item OREO_HALF_RAW = new Item(settings().food(ModFoods.OREO_HALF_RAW));
    public static final Item OREO_HALF = new Item(settings().food(ModFoods.OREO_HALF));
    public static final Item OREO_DOUGH = new Item(settings());
    public static final Item CRUSHED_OREO = new Item(settings().food(ModFoods.CRUSHED_OREO));
    public static final Item MANA_BERRIES = new Item(settings().food(ModFoods.MANA_BERRIES));
    public static final Item BLOOD_ORANGE = new Item(settings().food(ModFoods.BLOOD_ORANGE));

    // Drink Items - Speed drinks
    public static final CafeDrink MANGO_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink LIME_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink STRAWBERRY_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink PEACH_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink PLUM_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink JACKFRUIT_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink APRICOT_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink DURIAN_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink FIG_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink GRAPE_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink GRAPEFRUIT_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink STARFRUIT_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink MANDARIN_TEA = new CafeDrink(settings().food(ModFoods.SPEED_DRINK), "speed");

    // Drink Items - Regen drinks
    public static final CafeDrink BLOOD_TEA = new CafeDrink(settings().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink LYCHEE_TEA = new CafeDrink(settings().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink BLUEBERRY_TEA = new CafeDrink(settings().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink PINEAPPLE_TEA = new CafeDrink(settings().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink APPLE_TEA = new CafeDrink(settings().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink PUMPKIN_TEA = new CafeDrink(settings().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink AVOCADO_TEA = new CafeDrink(settings().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink SWEETBERRY_TEA = new CafeDrink(settings().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink TAMARIND_TEA = new CafeDrink(settings().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink PAPAYA_TEA = new CafeDrink(settings().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink REDLOVE_TEA = new CafeDrink(settings().food(ModFoods.REGEN_DRINK), "regen");

    // Drink Items - Strength drinks
    public static final CafeDrink MANA_TEA = new CafeDrink(settings().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink KIWI_TEA = new CafeDrink(settings().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink ORANGE_TEA = new CafeDrink(settings().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink YUCCA_TEA = new CafeDrink(settings().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink ALOE_TEA = new CafeDrink(settings().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink COCONUT_TEA = new CafeDrink(settings().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink PERSIMMON_TEA = new CafeDrink(settings().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink POMEGRANATE_TEA = new CafeDrink(settings().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink RASPBERRY_TEA = new CafeDrink(settings().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink POMELO_TEA = new CafeDrink(settings().food(ModFoods.STRENGTH_DRINK), "strength");

    // Drink Items - Resistance drinks
    public static final CafeDrink LEMON_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink WATERMELON_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink VANILLA_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink BANANA_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink CHERRY_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink BLACKBERRY_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink DRAGONFRUIT_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink GOOSEBERRY_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink GUAVA_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink PASSIONFRUIT_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink LAVENDER_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink CITRON_TEA = new CafeDrink(settings().food(ModFoods.RES_DRINK), "res");

    // Special drinks
    public static final CafeDrink BARBERRY_TEA = new CafeDrink(settings().food(ModFoods.FIRE_RES), "fire_res");
    public static final CafeDrink OREO_TEA = new CafeDrink(settings().food(ModFoods.SUPER_DRINK), "super");

    // Iced Coffee
    public static final IcedCoffeeDrink ICED_COFFEE = new IcedCoffeeDrink(settings().food(ModFoods.icedCoffeeDrink()), "none");
    public static final IcedCoffeeDrinkMilk ICED_COFFEE_MILK = new IcedCoffeeDrinkMilk(settings().food(ModFoods.icedCoffeeDrink()), "none");
    public static final IcedCoffeeDrinkFlavor STRAWBERRY_ICED_COFFEE = new IcedCoffeeDrinkFlavor(settings().food(ModFoods.icedCoffeeDrinkFlavor(StatusEffects.REGENERATION)), "regen");
    public static final IcedCoffeeDrinkFlavor VANILLA_ICED_COFFEE = new IcedCoffeeDrinkFlavor(settings().food(ModFoods.icedCoffeeDrinkFlavor(StatusEffects.ABSORPTION)), "absorption");
    public static final IcedCoffeeDrinkFlavor RASPBERRY_ICED_COFFEE = new IcedCoffeeDrinkFlavor(settings().food(ModFoods.icedCoffeeDrinkFlavor(StatusEffects.STRENGTH)), "strength");
    public static final IcedCoffeeDrinkFlavor MINT_ICED_COFFEE = new IcedCoffeeDrinkFlavor(settings().food(ModFoods.icedCoffeeDrinkFlavor(StatusEffects.FIRE_RESISTANCE)), "fire_res");
    public static final IcedCoffeeDrinkFlavor CARAMEL_ICED_COFFEE = new IcedCoffeeDrinkFlavor(settings().food(ModFoods.icedCoffeeDrinkFlavor(StatusEffects.SATURATION)), "saturation");
    public static final IcedCoffeeDrinkFlavor COCONUT_ICED_COFFEE = new IcedCoffeeDrinkFlavor(settings().food(ModFoods.icedCoffeeDrinkFlavor(StatusEffects.WATER_BREATHING)), "water_breathing");
    public static final IcedCoffeeDrinkFlavor BANANA_ICED_COFFEE = new IcedCoffeeDrinkFlavor(settings().food(ModFoods.icedCoffeeDrinkFlavor(StatusEffects.SATURATION)), "saturation");

    // Non-Food Items
    public static final Item BOBA_CUP = new Item(settings());
    public static final Item EMPTY_BOBA_CUP = new Item(settings());
    public static final Item ICED_COFFEE_CUP = new Item(settings());
    public static final Item ICED_COFFEE_CUP_ICE = new Item(settings());

    // Boba
    public static final Item BOBA = new Item(settings().food(ModFoods.BOBA));
    public static final Item RAW_BOBA = new Item(settings().food(ModFoods.RAW_BOBA));
    public static final Item TAPIOCA_FLOUR = new Item(settings());

    // Crop Items
    public static final Item COFFEE_FRUIT = new Item(settings().food(ModFoods.COFFEE_FRUIT));
    public static final Item COFFEE_BEANS = new AliasedBlockItem(ModBlocks.COFFEE_CROP, settings().food(ModFoods.COFFEE));
    public static final Item ROASTED_COFFEE = new Item(settings().food(ModFoods.ROASTED_COFFEE));
    public static final Item COFFEE_GROUNDS = new Item(settings().food(ModFoods.ROASTED_COFFEE));
    public static final Item CASSAVA_SEEDS = new AliasedBlockItem(ModBlocks.CASSAVA_CROP, settings());
    public static final Item CASSAVA_ROOT = new Item(settings().food(ModFoods.CASSAVA_ROOT));

    private static Item.Settings settings() {
        return new Item.Settings();
    }

    public static void register() {
        // Food Items
        Registry.register(Registries.ITEM, CreateCafe.id("oreo"), OREO);
        Registry.register(Registries.ITEM, CreateCafe.id("oreo_incomplete"), OREO_INCOMPLETE);
        Registry.register(Registries.ITEM, CreateCafe.id("oreo_half_raw"), OREO_HALF_RAW);
        Registry.register(Registries.ITEM, CreateCafe.id("oreo_half"), OREO_HALF);
        Registry.register(Registries.ITEM, CreateCafe.id("oreo_dough"), OREO_DOUGH);
        Registry.register(Registries.ITEM, CreateCafe.id("oreo_crushed"), CRUSHED_OREO);
        Registry.register(Registries.ITEM, CreateCafe.id("mana_berries"), MANA_BERRIES);
        Registry.register(Registries.ITEM, CreateCafe.id("blood_orange"), BLOOD_ORANGE);

        // Speed drinks
        Registry.register(Registries.ITEM, CreateCafe.id("mango_milk_tea"), MANGO_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("lime_milk_tea"), LIME_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("strawberry_milk_tea"), STRAWBERRY_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("peach_milk_tea"), PEACH_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("plum_milk_tea"), PLUM_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("jackfruit_milk_tea"), JACKFRUIT_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("apricot_milk_tea"), APRICOT_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("durian_milk_tea"), DURIAN_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("fig_milk_tea"), FIG_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("grape_milk_tea"), GRAPE_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("grapefruit_milk_tea"), GRAPEFRUIT_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("starfruit_milk_tea"), STARFRUIT_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("mandarin_milk_tea"), MANDARIN_TEA);

        // Regen drinks
        Registry.register(Registries.ITEM, CreateCafe.id("blood_orange_milk_tea"), BLOOD_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("lychee_milk_tea"), LYCHEE_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("blueberry_milk_tea"), BLUEBERRY_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("pineapple_milk_tea"), PINEAPPLE_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("apple_milk_tea"), APPLE_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("pumpkin_milk_tea"), PUMPKIN_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("avocado_milk_tea"), AVOCADO_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("sweetberry_milk_tea"), SWEETBERRY_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("tamarind_milk_tea"), TAMARIND_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("papaya_milk_tea"), PAPAYA_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("redlove_milk_tea"), REDLOVE_TEA);

        // Strength drinks
        Registry.register(Registries.ITEM, CreateCafe.id("mana_berry_milk_tea"), MANA_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("kiwi_milk_tea"), KIWI_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("orange_milk_tea"), ORANGE_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("yucca_milk_tea"), YUCCA_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("aloe_milk_tea"), ALOE_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("coconut_milk_tea"), COCONUT_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("persimmon_milk_tea"), PERSIMMON_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("pomegranate_milk_tea"), POMEGRANATE_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("raspberry_milk_tea"), RASPBERRY_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("pomelo_milk_tea"), POMELO_TEA);

        // Resistance drinks
        Registry.register(Registries.ITEM, CreateCafe.id("lemon_milk_tea"), LEMON_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("watermelon_milk_tea"), WATERMELON_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("vanilla_milk_tea"), VANILLA_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("banana_milk_tea"), BANANA_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("cherry_milk_tea"), CHERRY_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("blackberry_milk_tea"), BLACKBERRY_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("dragonfruit_milk_tea"), DRAGONFRUIT_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("gooseberry_milk_tea"), GOOSEBERRY_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("guava_milk_tea"), GUAVA_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("passionfruit_milk_tea"), PASSIONFRUIT_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("lavender_milk_tea"), LAVENDER_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("citron_milk_tea"), CITRON_TEA);

        // Special drinks
        Registry.register(Registries.ITEM, CreateCafe.id("barberry_milk_tea"), BARBERRY_TEA);
        Registry.register(Registries.ITEM, CreateCafe.id("oreo_milk_tea"), OREO_TEA);

        // Iced Coffee
        Registry.register(Registries.ITEM, CreateCafe.id("iced_coffee"), ICED_COFFEE);
        Registry.register(Registries.ITEM, CreateCafe.id("iced_coffee_milk"), ICED_COFFEE_MILK);
        Registry.register(Registries.ITEM, CreateCafe.id("strawberry_iced_coffee"), STRAWBERRY_ICED_COFFEE);
        Registry.register(Registries.ITEM, CreateCafe.id("vanilla_iced_coffee"), VANILLA_ICED_COFFEE);
        Registry.register(Registries.ITEM, CreateCafe.id("raspberry_iced_coffee"), RASPBERRY_ICED_COFFEE);
        Registry.register(Registries.ITEM, CreateCafe.id("mint_iced_coffee"), MINT_ICED_COFFEE);
        Registry.register(Registries.ITEM, CreateCafe.id("caramel_iced_coffee"), CARAMEL_ICED_COFFEE);
        Registry.register(Registries.ITEM, CreateCafe.id("coconut_iced_coffee"), COCONUT_ICED_COFFEE);
        Registry.register(Registries.ITEM, CreateCafe.id("banana_iced_coffee"), BANANA_ICED_COFFEE);

        // Non-Food Items
        Registry.register(Registries.ITEM, CreateCafe.id("boba_cup"), BOBA_CUP);
        Registry.register(Registries.ITEM, CreateCafe.id("empty_boba_cup"), EMPTY_BOBA_CUP);
        Registry.register(Registries.ITEM, CreateCafe.id("iced_coffee_cup"), ICED_COFFEE_CUP);
        Registry.register(Registries.ITEM, CreateCafe.id("iced_coffee_cup_ice"), ICED_COFFEE_CUP_ICE);

        // Boba
        Registry.register(Registries.ITEM, CreateCafe.id("boba"), BOBA);
        Registry.register(Registries.ITEM, CreateCafe.id("raw_boba"), RAW_BOBA);
        Registry.register(Registries.ITEM, CreateCafe.id("tapioca_flour"), TAPIOCA_FLOUR);

        // Crop Items
        Registry.register(Registries.ITEM, CreateCafe.id("coffee_fruit"), COFFEE_FRUIT);
        Registry.register(Registries.ITEM, CreateCafe.id("coffee_beans"), COFFEE_BEANS);
        Registry.register(Registries.ITEM, CreateCafe.id("roasted_coffee_beans"), ROASTED_COFFEE);
        Registry.register(Registries.ITEM, CreateCafe.id("coffee_grounds"), COFFEE_GROUNDS);
        Registry.register(Registries.ITEM, CreateCafe.id("cassava_seeds"), CASSAVA_SEEDS);
        Registry.register(Registries.ITEM, CreateCafe.id("cassava_root"), CASSAVA_ROOT);
    }
}
