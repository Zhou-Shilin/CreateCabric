package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.item.foods.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemRegistry {
    private static final List<Item> ALL_ITEMS = new ArrayList<>();

    public static List<Item> getAllItems() {
        return Collections.unmodifiableList(ALL_ITEMS);
    }

    private static <T extends Item> T register(String name, T item) {
        Registry.register(BuiltInRegistries.ITEM, CreateCafe.id(name), item);
        ALL_ITEMS.add(item);
        return item;
    }

    public static Item.Properties HIDDEN_PROPERTIES() {
        return new Item.Properties().stacksTo(1);
    }

    //Food Items

    public static final Item OREO = register("oreo",
            new Item(makeItem().food(ModFoods.OREO)));

    public static final Item OREO_INCOMPLETE = register("oreo_incomplete",
            new Item(new Item.Properties()));

    public static final Item OREO_HALF_RAW = register("oreo_half_raw",
            new Item(makeItem().food(ModFoods.OREO_HALF_RAW)));

    public static final Item OREO_HALF = register("oreo_half",
            new Item(makeItem().food(ModFoods.OREO_HALF)));

    public static final Item OREO_DOUGH = register("oreo_dough",
            new Item(makeItem()));

    public static final Item CRUSHED_OREO = register("oreo_crushed",
            new Item(makeItem().food(ModFoods.CRUSHED_OREO)));

    public static final Item MANA_BERRIES = register("mana_berries",
            new Item(new Item.Properties().food(ModFoods.MANA_BERRIES)));
    public static final Item BLOOD_ORANGE = register("blood_orange",
            new Item(new Item.Properties().food(ModFoods.BLOOD_ORANGE)));

    //Drink Items
    public static final CafeDrink MANGO_TEA = register("mango_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink LIME_TEA = register("lime_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink STRAWBERRY_TEA = register("strawberry_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink PEACH_TEA = register("peach_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink PLUM_TEA = register("plum_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink JACKFRUIT_TEA = register("jackfruit_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink APRICOT_TEA = register("apricot_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink DURIAN_TEA = register("durian_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink FIG_TEA = register("fig_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink GRAPE_TEA = register("grape_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink GRAPEFRUIT_TEA = register("grapefruit_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink STARFRUIT_TEA = register("starfruit_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final CafeDrink MANDARIN_TEA = register("mandarin_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));

    public static final CafeDrink BLOOD_TEA = register("blood_orange_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final CafeDrink LYCHEE_TEA = register("lychee_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final CafeDrink BLUEBERRY_TEA = register("blueberry_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final CafeDrink PINEAPPLE_TEA = register("pineapple_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final CafeDrink APPLE_TEA = register("apple_milk_tea",
            new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen"));
    public static final CafeDrink PUMPKIN_TEA = register("pumpkin_milk_tea",
            new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen"));
    public static final CafeDrink AVOCADO_TEA = register("avocado_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final CafeDrink SWEETBERRY_TEA = register("sweetberry_milk_tea",
            new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen"));
    public static final CafeDrink TAMARIND_TEA = register("tamarind_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final CafeDrink PAPAYA_TEA = register("papaya_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final CafeDrink REDLOVE_TEA = register("redlove_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));

    public static final CafeDrink MANA_TEA = register("mana_berry_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final CafeDrink KIWI_TEA = register("kiwi_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final CafeDrink ORANGE_TEA = register("orange_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final CafeDrink YUCCA_TEA = register("yucca_milk_tea",
            new CafeDrink(makeItem().food(ModFoods.STRENGTH_DRINK), "strength"));
    public static final CafeDrink ALOE_TEA = register("aloe_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final CafeDrink COCONUT_TEA = register("coconut_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final CafeDrink PERSIMMON_TEA = register("persimmon_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final CafeDrink POMEGRANATE_TEA = register("pomegranate_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final CafeDrink RASPBERRY_TEA = register("raspberry_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final CafeDrink POMELO_TEA = register("pomelo_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));

    public static final CafeDrink LEMON_TEA = register("lemon_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final CafeDrink WATERMELON_TEA = register("watermelon_milk_tea",
            new CafeDrink(makeItem().food(ModFoods.RES_DRINK), "res"));
    public static final CafeDrink VANILLA_TEA = register("vanilla_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final CafeDrink BANANA_TEA = register("banana_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final CafeDrink CHERRY_TEA = register("cherry_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final CafeDrink BLACKBERRY_TEA = register("blackberry_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final CafeDrink DRAGONFRUIT_TEA = register("dragonfruit_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final CafeDrink GOOSEBERRY_TEA = register("gooseberry_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final CafeDrink GUAVA_TEA = register("guava_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final CafeDrink PASSIONFRUIT_TEA = register("passionfruit_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final CafeDrink LAVENDER_TEA = register("lavender_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final CafeDrink CITRON_TEA = register("citron_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));

    public static final CafeDrink BARBERRY_TEA = register("barberry_milk_tea",
            new CafeDrink((makeItem().food(ModFoods.FIRE_RES)), "fire_res"));

    public static final CafeDrink OREO_TEA = register("oreo_milk_tea",
            new CafeDrink(makeItem().food(ModFoods.SUPER_DRINK), "super"));

    public static final IcedCoffeeDrink ICED_COFFEE = register("iced_coffee",
            new IcedCoffeeDrink(makeItem().food(ModFoods.ICED_COFFEE_DRINK), "none"));
    public static final IcedCoffeeDrinkMilk ICED_COFFEE_MILK = register("iced_coffee_milk",
            new IcedCoffeeDrinkMilk(makeItem().food(ModFoods.ICED_COFFEE_DRINK), "none"));
    public static final IcedCoffeeDrinkFlavor STRAWBERRY_ICED_COFFEE = register("strawberry_iced_coffee",
            new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.REGENERATION)), "regen"));
    public static final IcedCoffeeDrinkFlavor VANILLA_ICED_COFFEE = register("vanilla_iced_coffee",
            new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.ABSORPTION)), "absorption"));
    public static final IcedCoffeeDrinkFlavor RASPBERRY_ICED_COFFEE = register("raspberry_iced_coffee",
            new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.DAMAGE_BOOST)), "strength"));
    public static final IcedCoffeeDrinkFlavor MINT_ICED_COFFEE = register("mint_iced_coffee",
            new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.FIRE_RESISTANCE)), "fire_res"));
    public static final IcedCoffeeDrinkFlavor CARAMEL_ICED_COFFEE = register("caramel_iced_coffee",
            new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.SATURATION)), "saturation"));
    public static final IcedCoffeeDrinkFlavor COCONUT_ICED_COFFEE = register("coconut_iced_coffee",
            new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.WATER_BREATHING)), "water_breathing"));
    public static final IcedCoffeeDrinkFlavor BANANA_ICED_COFFEE = register("banana_iced_coffee",
            new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.SATURATION)), "saturation"));

    //Non Food Items
    public static final Item BOBA_CUP = register("boba_cup",
            new Item(makeItem()));

    public static final Item EMPTY_BOBA_CUP = register("empty_boba_cup",
            new Item(makeItem()));

    public static final Item ICED_COFFEE_CUP = register("iced_coffee_cup",
            new Item(makeItem()));

    public static final Item ICED_COFFEE_CUP_ICE = register("iced_coffee_cup_ice",
            new Item(makeItem()));

    //Boba
    public static final Item BOBA = register("boba",
            new Item(makeItem().food(ModFoods.BOBA)));

    public static final Item RAW_BOBA = register("raw_boba",
            new Item(makeItem().food(ModFoods.RAW_BOBA)));

    public static final Item TAPIOCA_FLOUR = register("tapioca_flour",
            new Item(makeItem()));

    //Crop Items
    public static final Item COFFEE_FRUIT = register("coffee_fruit",
            new Item(makeItem().food(ModFoods.COFFEE_FRUIT)));

    public static final Item COFFEE_BEANS = register("coffee_beans",
            new ItemNameBlockItem(BlockRegistry.COFFEE,
                    makeItem().food(ModFoods.COFFEE)));

    public static final Item ROASTED_COFFEE = register("roasted_coffee_beans",
            new Item(makeItem().food(ModFoods.ROASTED_COFFEE)));

    public static final Item COFFEE_GROUNDS = register("coffee_grounds",
            new Item(makeItem().food(ModFoods.ROASTED_COFFEE)));

    public static final Item CASSAVA_SEEDS = register("cassava_seeds",
            new ItemNameBlockItem(BlockRegistry.CASSAVA, makeItem()));

    public static final Item CASSAVA_ROOT = register("cassava_root",
            new Item(makeItem().food(ModFoods.CASSAVA_ROOT)));

    public static Item.Properties makeItem() {
        return new Item.Properties();
    }

    public static void register() {
        // Intentionally empty; static init handles registration.
    }
}
