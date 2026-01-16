package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.item.foods.*;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    // Creative Tab - MUST be defined FIRST before items that reference it
    public static final ItemGroup CREATE_CAFE_GROUP = FabricItemGroupBuilder.build(
            new Identifier(CreateCafe.ID, "main"),
            () -> new ItemStack(Registry.ITEM.get(new Identifier(CreateCafe.ID, "strawberry_milk_tea"))));

    private static Item.Settings HIDDEN_PROPERTIES() {
        return new FabricItemSettings().maxCount(1);
    }

    private static Item.Settings makeDrink() {
        return new FabricItemSettings().group(CREATE_CAFE_GROUP);
    }

    private static Item.Settings itemSettings() {
        return new FabricItemSettings().group(CREATE_CAFE_GROUP);
    }

    // Food Items:
    public static final Item MANA_BERRIES = new Item(itemSettings().food(ModFoods.MANA_BERRIES));
    public static final Item OREO = new Item(itemSettings().food(ModFoods.OREO));
    public static final Item OREO_INCOMPLETE = new Item(HIDDEN_PROPERTIES());
    public static final Item OREO_HALF_RAW = new Item(itemSettings().food(ModFoods.OREO_HALF_RAW));
    public static final Item OREO_HALF = new Item(itemSettings().food(ModFoods.OREO_HALF));
    public static final Item OREO_DOUGH = new Item(itemSettings());
    public static final Item CRUSHED_OREO = new Item(itemSettings().food(ModFoods.CRUSHED_OREO));
    public static final Item BLOOD_ORANGE = new Item(itemSettings().food(ModFoods.BLOOD_ORANGE));

    // Drink Items - simplified for core functionality
    public static final CafeDrink MANGO_TEA = new CafeDrink(makeDrink().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink LIME_TEA = new CafeDrink(makeDrink().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink STRAWBERRY_TEA = new CafeDrink(makeDrink().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink PEACH_TEA = new CafeDrink(makeDrink().food(ModFoods.SPEED_DRINK), "speed");
    public static final CafeDrink APPLE_TEA = new CafeDrink(makeDrink().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink PUMPKIN_TEA = new CafeDrink(makeDrink().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink SWEETBERRY_TEA = new CafeDrink(makeDrink().food(ModFoods.REGEN_DRINK), "regen");
    public static final CafeDrink WATERMELON_TEA = new CafeDrink(makeDrink().food(ModFoods.RES_DRINK), "res");
    public static final CafeDrink OREO_TEA = new CafeDrink(makeDrink().food(ModFoods.SUPER_DRINK), "super");

    // Iced Coffee Drinks
    public static final IcedCoffeeDrink ICED_COFFEE = new IcedCoffeeDrink(makeDrink().food(ModFoods.ICED_COFFEE_DRINK.apply(null)), "none");
    public static final IcedCoffeeDrinkMilk ICED_COFFEE_MILK = new IcedCoffeeDrinkMilk(makeDrink().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(null)), "none");
    public static final IcedCoffeeDrinkFlavor STRAWBERRY_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeDrink().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(StatusEffects.REGENERATION)), "regen");
    public static final IcedCoffeeDrinkFlavor VANILLA_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeDrink().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(StatusEffects.ABSORPTION)), "absorption");
    public static final IcedCoffeeDrinkFlavor RASPBERRY_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeDrink().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(StatusEffects.STRENGTH)), "strength");
    public static final IcedCoffeeDrinkFlavor MINT_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeDrink().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(StatusEffects.FIRE_RESISTANCE)), "fire_res");
    public static final IcedCoffeeDrinkFlavor CARAMEL_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeDrink().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(StatusEffects.SATURATION)), "saturation");
    public static final IcedCoffeeDrinkFlavor COCONUT_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeDrink().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(StatusEffects.WATER_BREATHING)), "water_breathing");
    public static final IcedCoffeeDrinkFlavor BANANA_ICED_COFFEE = new IcedCoffeeDrinkFlavor(makeDrink().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(StatusEffects.SATURATION)), "saturation");

    // Non Food Items:
    public static final Item BOBA_CUP = new Item(itemSettings());
    public static final Item EMPTY_BOBA_CUP = new Item(itemSettings());
    public static final Item ICED_COFFEE_CUP = new Item(itemSettings());
    public static final Item ICED_COFFEE_CUP_ICE = new Item(itemSettings());

    // Boba:
    public static final Item BOBA = new Item(itemSettings().food(ModFoods.BOBA));
    public static final Item RAW_BOBA = new Item(itemSettings().food(ModFoods.RAW_BOBA));
    public static final Item TAPIOCA_FLOUR = new Item(itemSettings());

    // Crop Items:
    public static final Item COFFEE_FRUIT = new Item(itemSettings().food(ModFoods.COFFEE_FRUIT));
    public static final Item COFFEE_BEANS = new AliasedBlockItem(BlockRegistry.COFFEE, itemSettings().food(ModFoods.COFFEE));
    public static final Item ROASTED_COFFEE = new Item(itemSettings().food(ModFoods.ROASTED_COFFEE));
    public static final Item COFFEE_GROUNDS = new Item(itemSettings().food(ModFoods.ROASTED_COFFEE));
    public static final Item CASSAVA_SEEDS = new AliasedBlockItem(BlockRegistry.CASSAVA, itemSettings());
    public static final Item CASSAVA_ROOT = new Item(itemSettings().food(ModFoods.CASSAVA_ROOT));

    public static void register() {
        // Food Items
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "mana_berries"), MANA_BERRIES);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "oreo"), OREO);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "oreo_incomplete"), OREO_INCOMPLETE);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "oreo_half_raw"), OREO_HALF_RAW);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "oreo_half"), OREO_HALF);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "oreo_dough"), OREO_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "oreo_crushed"), CRUSHED_OREO);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "blood_orange"), BLOOD_ORANGE);

        // Drink Items
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "mango_milk_tea"), MANGO_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "lime_milk_tea"), LIME_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "strawberry_milk_tea"), STRAWBERRY_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "peach_milk_tea"), PEACH_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "apple_milk_tea"), APPLE_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "pumpkin_milk_tea"), PUMPKIN_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "sweetberry_milk_tea"), SWEETBERRY_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "watermelon_milk_tea"), WATERMELON_TEA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "oreo_milk_tea"), OREO_TEA);

        // Iced Coffee
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "iced_coffee"), ICED_COFFEE);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "iced_coffee_milk"), ICED_COFFEE_MILK);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "strawberry_iced_coffee"), STRAWBERRY_ICED_COFFEE);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "vanilla_iced_coffee"), VANILLA_ICED_COFFEE);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "raspberry_iced_coffee"), RASPBERRY_ICED_COFFEE);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "mint_iced_coffee"), MINT_ICED_COFFEE);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "caramel_iced_coffee"), CARAMEL_ICED_COFFEE);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "coconut_iced_coffee"), COCONUT_ICED_COFFEE);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "banana_iced_coffee"), BANANA_ICED_COFFEE);

        // Non-food items
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "boba_cup"), BOBA_CUP);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "empty_boba_cup"), EMPTY_BOBA_CUP);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "iced_coffee_cup"), ICED_COFFEE_CUP);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "iced_coffee_cup_ice"), ICED_COFFEE_CUP_ICE);

        // Boba
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "boba"), BOBA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "raw_boba"), RAW_BOBA);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "tapioca_flour"), TAPIOCA_FLOUR);

        // Crop Items
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "coffee_fruit"), COFFEE_FRUIT);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "coffee_beans"), COFFEE_BEANS);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "roasted_coffee_beans"), ROASTED_COFFEE);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "coffee_grounds"), COFFEE_GROUNDS);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "cassava_seeds"), CASSAVA_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(CreateCafe.ID, "cassava_root"), CASSAVA_ROOT);
    }
}
