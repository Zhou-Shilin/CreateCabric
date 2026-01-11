package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import static com.Imphuls3.createcafe.CreateCafe.modPath;

/**
 * Fluid registry for Create Cafe.
 * 
 * NOTE: This is a simplified implementation that registers bucket items only.
 * Full fluid registration with FlowingFluid, LiquidBlock, and proper Create
 * integration will be added when Create Fabric for 1.21.1 is available.
 * 
 * For now, these bucket items serve as placeholders and can be used in recipes.
 * The fluid tanks and piping integration with Create will require the actual
 * fluid types to be registered with Fabric's fluid API.
 */
public class FluidRegistry {
    // Fluid bucket items (placeholder items until full fluid system is implemented)
    public static Item MELTED_SUGAR_BUCKET;
    public static Item FILLING_BUCKET;
    public static Item COFFEE_BUCKET;
    public static Item OREO_TEA_BUCKET;
    public static Item MANGO_TEA_BUCKET;
    public static Item LIME_TEA_BUCKET;
    public static Item LYCHEE_TEA_BUCKET;
    public static Item KIWI_TEA_BUCKET;
    public static Item MANA_TEA_BUCKET;
    public static Item BLOOD_TEA_BUCKET;
    public static Item LEMON_TEA_BUCKET;
    public static Item WATERMELON_TEA_BUCKET;
    public static Item STRAWBERRY_TEA_BUCKET;
    public static Item BLUEBERRY_TEA_BUCKET;
    public static Item VANILLA_TEA_BUCKET;
    public static Item ORANGE_TEA_BUCKET;
    public static Item PEACH_TEA_BUCKET;
    public static Item PINEAPPLE_TEA_BUCKET;
    public static Item BANANA_TEA_BUCKET;
    public static Item YUCCA_TEA_BUCKET;
    public static Item CHERRY_TEA_BUCKET;
    public static Item PLUM_TEA_BUCKET;
    public static Item ALOE_TEA_BUCKET;
    public static Item APPLE_TEA_BUCKET;
    public static Item BLACKBERRY_TEA_BUCKET;
    public static Item PUMPKIN_TEA_BUCKET;
    public static Item JACKFRUIT_TEA_BUCKET;
    public static Item COCONUT_TEA_BUCKET;
    public static Item DRAGONFRUIT_TEA_BUCKET;
    public static Item APRICOT_TEA_BUCKET;
    public static Item AVOCADO_TEA_BUCKET;
    public static Item SWEETBERRY_TEA_BUCKET;
    public static Item DURIAN_TEA_BUCKET;
    public static Item FIG_TEA_BUCKET;
    public static Item TAMARIND_TEA_BUCKET;
    public static Item GOOSEBERRY_TEA_BUCKET;
    public static Item GRAPE_TEA_BUCKET;
    public static Item GRAPEFRUIT_TEA_BUCKET;
    public static Item PAPAYA_TEA_BUCKET;
    public static Item GUAVA_TEA_BUCKET;
    public static Item PASSIONFRUIT_TEA_BUCKET;
    public static Item POMEGRANATE_TEA_BUCKET;
    public static Item PERSIMMON_TEA_BUCKET;
    public static Item RASPBERRY_TEA_BUCKET;
    public static Item STARFRUIT_TEA_BUCKET;
    public static Item LAVENDER_TEA_BUCKET;
    public static Item POMELO_TEA_BUCKET;
    public static Item MANDARIN_TEA_BUCKET;
    public static Item CITRON_TEA_BUCKET;
    public static Item REDLOVE_TEA_BUCKET;
    public static Item BARBERRY_TEA_BUCKET;
    // Syrups
    public static Item STRAWBERRY_SYRUP_BUCKET;
    public static Item VANILLA_SYRUP_BUCKET;
    public static Item RASPBERRY_SYRUP_BUCKET;
    public static Item MINT_SYRUP_BUCKET;
    public static Item CARAMEL_SYRUP_BUCKET;
    public static Item COCONUT_SYRUP_BUCKET;
    public static Item BANANA_SYRUP_BUCKET;

    private static Item registerBucket(String name) {
        Item bucket = new Item(new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1));
        return Registry.register(BuiltInRegistries.ITEM, modPath(name + "_bucket"), bucket);
    }

    public static void register() {
        // Register fluid bucket items
        // Since Fabric fluid system requires more complex setup with FlowingFluid,
        // we'll register placeholder buckets that can be filled in recipes
        MELTED_SUGAR_BUCKET = registerBucket("melted_sugar");
        FILLING_BUCKET = registerBucket("filling");
        COFFEE_BUCKET = registerBucket("coffee");
        OREO_TEA_BUCKET = registerBucket("oreo_tea");
        MANGO_TEA_BUCKET = registerBucket("mango_tea");
        LIME_TEA_BUCKET = registerBucket("lime_tea");
        LYCHEE_TEA_BUCKET = registerBucket("lychee_tea");
        KIWI_TEA_BUCKET = registerBucket("kiwi_tea");
        MANA_TEA_BUCKET = registerBucket("mana_tea");
        BLOOD_TEA_BUCKET = registerBucket("blood_tea");
        LEMON_TEA_BUCKET = registerBucket("lemon_tea");
        WATERMELON_TEA_BUCKET = registerBucket("watermelon_tea");
        STRAWBERRY_TEA_BUCKET = registerBucket("strawberry_tea");
        BLUEBERRY_TEA_BUCKET = registerBucket("blueberry_tea");
        VANILLA_TEA_BUCKET = registerBucket("vanilla_tea");
        ORANGE_TEA_BUCKET = registerBucket("orange_tea");
        PEACH_TEA_BUCKET = registerBucket("peach_tea");
        PINEAPPLE_TEA_BUCKET = registerBucket("pineapple_tea");
        BANANA_TEA_BUCKET = registerBucket("banana_tea");
        YUCCA_TEA_BUCKET = registerBucket("yucca_tea");
        CHERRY_TEA_BUCKET = registerBucket("cherry_tea");
        PLUM_TEA_BUCKET = registerBucket("plum_tea");
        ALOE_TEA_BUCKET = registerBucket("aloe_tea");
        APPLE_TEA_BUCKET = registerBucket("apple_tea");
        BLACKBERRY_TEA_BUCKET = registerBucket("blackberry_tea");
        PUMPKIN_TEA_BUCKET = registerBucket("pumpkin_tea");
        JACKFRUIT_TEA_BUCKET = registerBucket("jackfruit_tea");
        COCONUT_TEA_BUCKET = registerBucket("coconut_tea");
        DRAGONFRUIT_TEA_BUCKET = registerBucket("dragonfruit_tea");
        APRICOT_TEA_BUCKET = registerBucket("apricot_tea");
        AVOCADO_TEA_BUCKET = registerBucket("avocado_tea");
        SWEETBERRY_TEA_BUCKET = registerBucket("sweetberry_tea");
        DURIAN_TEA_BUCKET = registerBucket("durian_tea");
        FIG_TEA_BUCKET = registerBucket("fig_tea");
        TAMARIND_TEA_BUCKET = registerBucket("tamarind_tea");
        GOOSEBERRY_TEA_BUCKET = registerBucket("gooseberry_tea");
        GRAPE_TEA_BUCKET = registerBucket("grape_tea");
        GRAPEFRUIT_TEA_BUCKET = registerBucket("grapefruit_tea");
        PAPAYA_TEA_BUCKET = registerBucket("papaya_tea");
        GUAVA_TEA_BUCKET = registerBucket("guava_tea");
        PASSIONFRUIT_TEA_BUCKET = registerBucket("passionfruit_tea");
        POMEGRANATE_TEA_BUCKET = registerBucket("pomegranate_tea");
        PERSIMMON_TEA_BUCKET = registerBucket("persimmon_tea");
        RASPBERRY_TEA_BUCKET = registerBucket("raspberry_tea");
        STARFRUIT_TEA_BUCKET = registerBucket("starfruit_tea");
        LAVENDER_TEA_BUCKET = registerBucket("lavender_tea");
        POMELO_TEA_BUCKET = registerBucket("pomelo_tea");
        MANDARIN_TEA_BUCKET = registerBucket("mandarin_tea");
        CITRON_TEA_BUCKET = registerBucket("citron_tea");
        REDLOVE_TEA_BUCKET = registerBucket("redlove_tea");
        BARBERRY_TEA_BUCKET = registerBucket("barberry_tea");
        // Syrups
        STRAWBERRY_SYRUP_BUCKET = registerBucket("strawberry_syrup");
        VANILLA_SYRUP_BUCKET = registerBucket("vanilla_syrup");
        RASPBERRY_SYRUP_BUCKET = registerBucket("raspberry_syrup");
        MINT_SYRUP_BUCKET = registerBucket("mint_syrup");
        CARAMEL_SYRUP_BUCKET = registerBucket("caramel_syrup");
        COCONUT_SYRUP_BUCKET = registerBucket("coconut_syrup");
        BANANA_SYRUP_BUCKET = registerBucket("banana_syrup");
    }
}
