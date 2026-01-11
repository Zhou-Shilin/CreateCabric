package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.item.foods.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;

public class ItemRegistry {

    public static Item.Properties HIDDEN_PROPERTIES() {
        return new Item.Properties().stacksTo(1);
    }

    //Food Items
    public static final Item OREO = new Item(makeItem().food(ModFoods.OREO));
    public static final Item OREO_INCOMPLETE = new Item(new Item.Properties());
    public static final Item OREO_HALF_RAW = new Item(makeItem().food(ModFoods.OREO_HALF_RAW));
    public static final Item OREO_HALF = new Item(makeItem().food(ModFoods.OREO_HALF));
    public static final Item OREO_DOUGH = new Item(makeItem());
    public static final Item CRUSHED_OREO = new Item(makeItem().food(ModFoods.CRUSHED_OREO));
    public static final Item MANA_BERRIES = new Item(new Item.Properties().food(ModFoods.MANA_BERRIES));
    public static final Item BLOOD_ORANGE = new Item(new Item.Properties().food(ModFoods.BLOOD_ORANGE));

    //Drink Items
    public static final CafeDrink MANGO_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink LIME_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink STRAWBERRY_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink PEACH_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink PLUM_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink JACKFRUIT_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink APRICOT_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink DURIAN_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink FIG_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink GRAPE_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink GRAPEFRUIT_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink STARFRUIT_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");
    public static final CafeDrink MANDARIN_TEA = new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed");

    public static final CafeDrink BLOOD_TEA = new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen");
    public static final CafeDrink LYCHEE_TEA = new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen");
    public static final CafeDrink BLUEBERRY_TEA = new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen");
    public static final CafeDrink PINEAPPLE_TEA = new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen");
    public static final CafeDrink APPLE_TEA = new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink PUMPKIN_TEA = new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink AVOCADO_TEA = new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen");
    public static final CafeDrink SWEETBERRY_TEA = new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink TAMARIND_TEA = new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen");
    public static final CafeDrink PAPAYA_TEA = new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen");
    public static final CafeDrink REDLOVE_TEA = new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen");

    public static final CafeDrink MANA_TEA = new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength");
    public static final CafeDrink KIWI_TEA = new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength");
    public static final CafeDrink ORANGE_TEA = new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength");
    public static final CafeDrink YUCCA_TEA = new CafeDrink(makeItem().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink ALOE_TEA = new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength");
    public static final CafeDrink COCONUT_TEA = new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength");
    public static final CafeDrink PERSIMMON_TEA = new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength");
    public static final CafeDrink POMEGRANATE_TEA = new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength");
    public static final CafeDrink RASPBERRY_TEA = new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength");
    public static final CafeDrink POMELO_TEA = new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength");

    public static final CafeDrink LEMON_TEA = new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res");
    public static final CafeDrink WATERMELON_TEA = new CafeDrink(makeItem().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink VANILLA_TEA = new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res");
    public static final CafeDrink BANANA_TEA = new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res");
    public static final CafeDrink CHERRY_TEA = new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res");
    public static final CafeDrink BLACKBERRY_TEA = new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res");
    public static final CafeDrink DRAGONFRUIT_TEA = new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res");
    public static final CafeDrink GOOSEBERRY_TEA = new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res");
    public static final CafeDrink GUAVA_TEA = new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res");
    public static final CafeDrink PASSIONFRUIT_TEA = new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res");
    public static final CafeDrink LAVENDER_TEA = new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res");
    public static final CafeDrink CITRON_TEA = new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res");

    public static final CafeDrink BARBERRY_TEA = new CafeDrink((makeItem().food(ModFoods.FIRE_RES)), "fire_res");
    public static final CafeDrink OREO_TEA = new CafeDrink(makeItem().food(ModFoods.SUPER_DRINK), "super");

    public static final IcedCoffeeDrink ICED_COFFEE = new IcedCoffeeDrink(makeItem().food(ModFoods.ICED_COFFEE_DRINK), "none");
    public static final IcedCoffeeDrinkMilk ICED_COFFEE_MILK = new IcedCoffeeDrinkMilk(makeItem().food(ModFoods.ICED_COFFEE_DRINK), "none");
    public static final IcedCoffeeDrinkFlavor STRAWBERRY_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.REGENERATION)), "regen");
    public static final IcedCoffeeDrinkFlavor VANILLA_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.ABSORPTION)), "absorption");
    public static final IcedCoffeeDrinkFlavor RASPBERRY_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.DAMAGE_BOOST)), "strength");
    public static final IcedCoffeeDrinkFlavor MINT_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.FIRE_RESISTANCE)), "fire_res");
    public static final IcedCoffeeDrinkFlavor CARAMEL_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.SATURATION)), "saturation");
    public static final IcedCoffeeDrinkFlavor COCONUT_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.WATER_BREATHING)), "water_breathing");
    public static final IcedCoffeeDrinkFlavor BANANA_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.SATURATION)), "saturation");

    //Non Food Items
    public static final Item BOBA_CUP = new Item(makeItem());
    public static final Item EMPTY_BOBA_CUP = new Item(makeItem());
    public static final Item ICED_COFFEE_CUP = new Item(makeItem());
    public static final Item ICED_COFFEE_CUP_ICE = new Item(makeItem());

    //Boba
    public static final Item BOBA = new Item(makeItem().food(ModFoods.BOBA));
    public static final Item RAW_BOBA = new Item(makeItem().food(ModFoods.RAW_BOBA));
    public static final Item TAPIOCA_FLOUR = new Item(makeItem());

    //Crop Items
    public static final Item COFFEE_FRUIT = new Item(makeItem().food(ModFoods.COFFEE_FRUIT));
    public static final Item COFFEE_BEANS = new ItemNameBlockItem(BlockRegistry.COFFEE, makeItem().food(ModFoods.COFFEE));
    public static final Item ROASTED_COFFEE = new Item(makeItem().food(ModFoods.ROASTED_COFFEE));
    public static final Item COFFEE_GROUNDS = new Item(makeItem().food(ModFoods.ROASTED_COFFEE));
    public static final Item CASSAVA_SEEDS = new ItemNameBlockItem(BlockRegistry.CASSAVA, makeItem());
    public static final Item CASSAVA_ROOT = new Item(makeItem().food(ModFoods.CASSAVA_ROOT));

    public static Item.Properties makeItem() {
        return new Item.Properties();
    }

    public static void register() {
        // Food Items
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("oreo"), OREO);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("oreo_incomplete"), OREO_INCOMPLETE);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("oreo_half_raw"), OREO_HALF_RAW);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("oreo_half"), OREO_HALF);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("oreo_dough"), OREO_DOUGH);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("oreo_crushed"), CRUSHED_OREO);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("mana_berries"), MANA_BERRIES);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("blood_orange"), BLOOD_ORANGE);

        // Drink Items - Speed
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("mango_milk_tea"), MANGO_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("lime_milk_tea"), LIME_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("strawberry_milk_tea"), STRAWBERRY_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("peach_milk_tea"), PEACH_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("plum_milk_tea"), PLUM_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("jackfruit_milk_tea"), JACKFRUIT_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("apricot_milk_tea"), APRICOT_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("durian_milk_tea"), DURIAN_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("fig_milk_tea"), FIG_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("grape_milk_tea"), GRAPE_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("grapefruit_milk_tea"), GRAPEFRUIT_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("starfruit_milk_tea"), STARFRUIT_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("mandarin_milk_tea"), MANDARIN_TEA);

        // Drink Items - Regen
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("blood_orange_milk_tea"), BLOOD_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("lychee_milk_tea"), LYCHEE_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("blueberry_milk_tea"), BLUEBERRY_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("pineapple_milk_tea"), PINEAPPLE_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("apple_milk_tea"), APPLE_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("pumpkin_milk_tea"), PUMPKIN_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("avocado_milk_tea"), AVOCADO_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("sweetberry_milk_tea"), SWEETBERRY_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("tamarind_milk_tea"), TAMARIND_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("papaya_milk_tea"), PAPAYA_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("redlove_milk_tea"), REDLOVE_TEA);

        // Drink Items - Strength
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("mana_berry_milk_tea"), MANA_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("kiwi_milk_tea"), KIWI_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("orange_milk_tea"), ORANGE_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("yucca_milk_tea"), YUCCA_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("aloe_milk_tea"), ALOE_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("coconut_milk_tea"), COCONUT_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("persimmon_milk_tea"), PERSIMMON_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("pomegranate_milk_tea"), POMEGRANATE_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("raspberry_milk_tea"), RASPBERRY_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("pomelo_milk_tea"), POMELO_TEA);

        // Drink Items - Resistance
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("lemon_milk_tea"), LEMON_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("watermelon_milk_tea"), WATERMELON_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("vanilla_milk_tea"), VANILLA_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("banana_milk_tea"), BANANA_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("cherry_milk_tea"), CHERRY_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("blackberry_milk_tea"), BLACKBERRY_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("dragonfruit_milk_tea"), DRAGONFRUIT_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("gooseberry_milk_tea"), GOOSEBERRY_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("guava_milk_tea"), GUAVA_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("passionfruit_milk_tea"), PASSIONFRUIT_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("lavender_milk_tea"), LAVENDER_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("citron_milk_tea"), CITRON_TEA);

        // Special Drinks
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("barberry_milk_tea"), BARBERRY_TEA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("oreo_milk_tea"), OREO_TEA);

        // Iced Coffee
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("iced_coffee"), ICED_COFFEE);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("iced_coffee_milk"), ICED_COFFEE_MILK);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("strawberry_iced_coffee"), STRAWBERRY_ICED_COFFEE);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("vanilla_iced_coffee"), VANILLA_ICED_COFFEE);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("raspberry_iced_coffee"), RASPBERRY_ICED_COFFEE);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("mint_iced_coffee"), MINT_ICED_COFFEE);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("caramel_iced_coffee"), CARAMEL_ICED_COFFEE);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("coconut_iced_coffee"), COCONUT_ICED_COFFEE);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("banana_iced_coffee"), BANANA_ICED_COFFEE);

        // Non Food Items
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("boba_cup"), BOBA_CUP);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("empty_boba_cup"), EMPTY_BOBA_CUP);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("iced_coffee_cup"), ICED_COFFEE_CUP);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("iced_coffee_cup_ice"), ICED_COFFEE_CUP_ICE);

        // Boba
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("boba"), BOBA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("raw_boba"), RAW_BOBA);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("tapioca_flour"), TAPIOCA_FLOUR);

        // Crop Items
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("coffee_fruit"), COFFEE_FRUIT);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("coffee_beans"), COFFEE_BEANS);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("roasted_coffee_beans"), ROASTED_COFFEE);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("coffee_grounds"), COFFEE_GROUNDS);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("cassava_seeds"), CASSAVA_SEEDS);
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.modPath("cassava_root"), CASSAVA_ROOT);
    }
}
