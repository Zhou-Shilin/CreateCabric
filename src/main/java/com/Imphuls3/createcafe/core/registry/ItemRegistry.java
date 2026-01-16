package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.item.foods.*;
import com.Imphuls3.createcafe.compat.Compat;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    /**
     * Settings for items that should not appear in creative tabs.
     * Used for drink items that require optional mod dependencies.
     * Items with these settings have max stack size of 1 and no item group.
     */
    public static Item.Settings HIDDEN_SETTINGS() {
        return new Item.Settings().maxCount(1);
    }

    public static Item.Settings STANDARD_SETTINGS() {
        return new Item.Settings().group(ModItemGroup.CREATE_CAFE);
    }

    //Food Items:
    public static final Item MANA_BERRIES = new Item(STANDARD_SETTINGS().food(ModFoods.MANA_BERRIES));
    public static final Item OREO = new Item(STANDARD_SETTINGS().food(ModFoods.OREO));
    public static final Item OREO_INCOMPLETE = new Item(STANDARD_SETTINGS());
    public static final Item OREO_HALF_RAW = new Item(STANDARD_SETTINGS().food(ModFoods.OREO_HALF_RAW));
    public static final Item OREO_HALF = new Item(STANDARD_SETTINGS().food(ModFoods.OREO_HALF));
    public static final Item OREO_DOUGH = new Item(STANDARD_SETTINGS());
    public static final Item CRUSHED_OREO = new Item(STANDARD_SETTINGS().food(ModFoods.CRUSHED_OREO));
    public static final Item BLOOD_ORANGE = new Item(STANDARD_SETTINGS().food(ModFoods.BLOOD_ORANGE));

    //Drink Items:
    public static final CafeDrink MANGO_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink LIME_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink STRAWBERRY_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink PEACH_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink PLUM_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink JACKFRUIT_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink APRICOT_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink DURIAN_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink FIG_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink GRAPE_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink GRAPEFRUIT_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink STARFRUIT_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink MANDARIN_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SPEED_DRINK), "speed");

    public static final CafeDrink BLOOD_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink LYCHEE_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink BLUEBERRY_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink PINEAPPLE_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink APPLE_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink PUMPKIN_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink AVOCADO_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink SWEETBERRY_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink TAMARIND_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink PAPAYA_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink REDLOVE_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.REGEN_DRINK), "regen");

    public static final CafeDrink MANA_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink KIWI_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink ORANGE_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink YUCCA_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink ALOE_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink COCONUT_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink PERSIMMON_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink POMEGRANATE_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink RASPBERRY_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.STRENGTH_DRINK), "strength");
    public static final CafeDrink POMELO_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.STRENGTH_DRINK), "strength");

    public static final CafeDrink LEMON_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink WATERMELON_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink VANILLA_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink BANANA_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink CHERRY_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink BLACKBERRY_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink DRAGONFRUIT_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink GOOSEBERRY_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink GUAVA_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink PASSIONFRUIT_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink LAVENDER_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink CITRON_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.RES_DRINK), "res");

    public static final CafeDrink BARBERRY_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.FIRE_RES), "fire_res");
    public static final CafeDrink OREO_TEA = new CafeDrink(STANDARD_SETTINGS().food(ModFoods.SUPER_DRINK), "super");

    //Non Food Items:
    public static final Item BOBA_CUP = new Item(STANDARD_SETTINGS());
    public static final Item EMPTY_BOBA_CUP = new Item(STANDARD_SETTINGS());

    //Boba:
    public static final Item BOBA = new Item(STANDARD_SETTINGS().food(ModFoods.BOBA));
    public static final Item RAW_BOBA = new Item(STANDARD_SETTINGS().food(ModFoods.RAW_BOBA));
    public static final Item TAPIOCA_FLOUR = new Item(STANDARD_SETTINGS());

    //Crop Items:
    public static final Item COFFEE_FRUIT = new Item(STANDARD_SETTINGS().food(ModFoods.COFFEE_FRUIT));
    public static final Item COFFEE_BEANS = new AliasedBlockItem(BlockRegistry.COFFEE, STANDARD_SETTINGS().food(ModFoods.COFFEE));
    public static final Item ROASTED_COFFEE = new Item(STANDARD_SETTINGS().food(ModFoods.ROASTED_COFFEE));
    public static final Item CASSAVA_SEEDS = new AliasedBlockItem(BlockRegistry.CASSAVA, STANDARD_SETTINGS());
    public static final Item CASSAVA_ROOT = new Item(STANDARD_SETTINGS().food(ModFoods.CASSAVA_ROOT));

    public static void register() {
        // Food items
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "mana_berries"), MANA_BERRIES);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "oreo"), OREO);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "oreo_incomplete"), OREO_INCOMPLETE);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "oreo_half_raw"), OREO_HALF_RAW);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "oreo_half"), OREO_HALF);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "oreo_dough"), OREO_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "oreo_crushed"), CRUSHED_OREO);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "blood_orange"), BLOOD_ORANGE);

        // Drink items
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "mango_milk_tea"), MANGO_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "lime_milk_tea"), LIME_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "strawberry_milk_tea"), STRAWBERRY_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "peach_milk_tea"), PEACH_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "plum_milk_tea"), PLUM_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "jackfruit_milk_tea"), JACKFRUIT_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "apricot_milk_tea"), APRICOT_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "durian_milk_tea"), DURIAN_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "fig_milk_tea"), FIG_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "grape_milk_tea"), GRAPE_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "grapefruit_milk_tea"), GRAPEFRUIT_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "starfruit_milk_tea"), STARFRUIT_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "mandarin_milk_tea"), MANDARIN_TEA);

        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "blood_orange_milk_tea"), BLOOD_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "lychee_milk_tea"), LYCHEE_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "blueberry_milk_tea"), BLUEBERRY_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "pineapple_milk_tea"), PINEAPPLE_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "apple_milk_tea"), APPLE_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "pumpkin_milk_tea"), PUMPKIN_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "avocado_milk_tea"), AVOCADO_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "sweetberry_milk_tea"), SWEETBERRY_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "tamarind_milk_tea"), TAMARIND_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "papaya_milk_tea"), PAPAYA_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "redlove_milk_tea"), REDLOVE_TEA);

        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "mana_berry_milk_tea"), MANA_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "kiwi_milk_tea"), KIWI_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "orange_milk_tea"), ORANGE_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "yucca_milk_tea"), YUCCA_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "aloe_milk_tea"), ALOE_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "coconut_milk_tea"), COCONUT_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "persimmon_milk_tea"), PERSIMMON_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "pomegranate_milk_tea"), POMEGRANATE_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "raspberry_milk_tea"), RASPBERRY_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "pomelo_milk_tea"), POMELO_TEA);

        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "lemon_milk_tea"), LEMON_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "watermelon_milk_tea"), WATERMELON_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "vanilla_milk_tea"), VANILLA_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "banana_milk_tea"), BANANA_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "cherry_milk_tea"), CHERRY_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "blackberry_milk_tea"), BLACKBERRY_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "dragonfruit_milk_tea"), DRAGONFRUIT_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "gooseberry_milk_tea"), GOOSEBERRY_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "guava_milk_tea"), GUAVA_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "passionfruit_milk_tea"), PASSIONFRUIT_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "lavender_milk_tea"), LAVENDER_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "citron_milk_tea"), CITRON_TEA);

        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "barberry_milk_tea"), BARBERRY_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "oreo_milk_tea"), OREO_TEA);

        // Non food items
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "boba_cup"), BOBA_CUP);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "empty_boba_cup"), EMPTY_BOBA_CUP);

        // Boba items
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "boba"), BOBA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "raw_boba"), RAW_BOBA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "tapioca_flour"), TAPIOCA_FLOUR);

        // Crop items
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "coffee_fruit"), COFFEE_FRUIT);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "coffee_beans"), COFFEE_BEANS);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "roasted_coffee"), ROASTED_COFFEE);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "cassava_seeds"), CASSAVA_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.MOD_ID, "cassava_root"), CASSAVA_ROOT);
    }
}
