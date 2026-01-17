package com.imphuls3.createcafe.registry;

import com.imphuls3.createcafe.CreateCafe;
import com.imphuls3.createcafe.common.fluid.CafeFluid;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributeHandler;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Fluid registry for Create Cafe.
 * Registers all fluids used in tea, syrup, and coffee recipes.
 */
public class ModFluids {
    
    // Store all registered fluids
    private static final Map<String, FlowableFluid> FLUIDS = new HashMap<>();
    // Store all registered bucket items
    private static final Map<String, Item> BUCKET_ITEMS = new HashMap<>();
    
    // Tea fluids
    public static FlowableFluid ALOE_TEA;
    public static FlowableFluid APPLE_TEA;
    public static FlowableFluid APRICOT_TEA;
    public static FlowableFluid AVOCADO_TEA;
    public static FlowableFluid BANANA_TEA;
    public static FlowableFluid BARBERRY_TEA;
    public static FlowableFluid BLACKBERRY_TEA;
    public static FlowableFluid BLOOD_TEA;
    public static FlowableFluid BLUEBERRY_TEA;
    public static FlowableFluid CHERRY_TEA;
    public static FlowableFluid CITRON_TEA;
    public static FlowableFluid COCONUT_TEA;
    public static FlowableFluid DRAGONFRUIT_TEA;
    public static FlowableFluid DURIAN_TEA;
    public static FlowableFluid FIG_TEA;
    public static FlowableFluid GOOSEBERRY_TEA;
    public static FlowableFluid GRAPE_TEA;
    public static FlowableFluid GRAPEFRUIT_TEA;
    public static FlowableFluid GUAVA_TEA;
    public static FlowableFluid JACKFRUIT_TEA;
    public static FlowableFluid KIWI_TEA;
    public static FlowableFluid LAVENDER_TEA;
    public static FlowableFluid LEMON_TEA;
    public static FlowableFluid LIME_TEA;
    public static FlowableFluid LYCHEE_TEA;
    public static FlowableFluid MANA_TEA;
    public static FlowableFluid MANDARIN_TEA;
    public static FlowableFluid MANGO_TEA;
    public static FlowableFluid ORANGE_TEA;
    public static FlowableFluid OREO_TEA;
    public static FlowableFluid PAPAYA_TEA;
    public static FlowableFluid PASSIONFRUIT_TEA;
    public static FlowableFluid PEACH_TEA;
    public static FlowableFluid PERSIMMON_TEA;
    public static FlowableFluid PINEAPPLE_TEA;
    public static FlowableFluid PLUM_TEA;
    public static FlowableFluid POMEGRANATE_TEA;
    public static FlowableFluid POMELO_TEA;
    public static FlowableFluid PUMPKIN_TEA;
    public static FlowableFluid RASPBERRY_TEA;
    public static FlowableFluid REDLOVE_TEA;
    public static FlowableFluid STARFRUIT_TEA;
    public static FlowableFluid STRAWBERRY_TEA;
    public static FlowableFluid SWEETBERRY_TEA;
    public static FlowableFluid TAMARIND_TEA;
    public static FlowableFluid VANILLA_TEA;
    public static FlowableFluid WATERMELON_TEA;
    public static FlowableFluid YUCCA_TEA;
    
    // Syrup fluids
    public static FlowableFluid BANANA_SYRUP;
    public static FlowableFluid CARAMEL_SYRUP;
    public static FlowableFluid COCONUT_SYRUP;
    public static FlowableFluid MINT_SYRUP;
    public static FlowableFluid RASPBERRY_SYRUP;
    public static FlowableFluid STRAWBERRY_SYRUP;
    public static FlowableFluid VANILLA_SYRUP;
    
    // Other fluids
    public static FlowableFluid COFFEE;
    public static FlowableFluid MELTED_SUGAR;

    // Tea bucket items
    public static Item ALOE_TEA_BUCKET;
    public static Item APPLE_TEA_BUCKET;
    public static Item APRICOT_TEA_BUCKET;
    public static Item AVOCADO_TEA_BUCKET;
    public static Item BANANA_TEA_BUCKET;
    public static Item BARBERRY_TEA_BUCKET;
    public static Item BLACKBERRY_TEA_BUCKET;
    public static Item BLOOD_TEA_BUCKET;
    public static Item BLUEBERRY_TEA_BUCKET;
    public static Item CHERRY_TEA_BUCKET;
    public static Item CITRON_TEA_BUCKET;
    public static Item COCONUT_TEA_BUCKET;
    public static Item DRAGONFRUIT_TEA_BUCKET;
    public static Item DURIAN_TEA_BUCKET;
    public static Item FIG_TEA_BUCKET;
    public static Item GOOSEBERRY_TEA_BUCKET;
    public static Item GRAPE_TEA_BUCKET;
    public static Item GRAPEFRUIT_TEA_BUCKET;
    public static Item GUAVA_TEA_BUCKET;
    public static Item JACKFRUIT_TEA_BUCKET;
    public static Item KIWI_TEA_BUCKET;
    public static Item LAVENDER_TEA_BUCKET;
    public static Item LEMON_TEA_BUCKET;
    public static Item LIME_TEA_BUCKET;
    public static Item LYCHEE_TEA_BUCKET;
    public static Item MANA_TEA_BUCKET;
    public static Item MANDARIN_TEA_BUCKET;
    public static Item MANGO_TEA_BUCKET;
    public static Item ORANGE_TEA_BUCKET;
    public static Item OREO_TEA_BUCKET;
    public static Item PAPAYA_TEA_BUCKET;
    public static Item PASSIONFRUIT_TEA_BUCKET;
    public static Item PEACH_TEA_BUCKET;
    public static Item PERSIMMON_TEA_BUCKET;
    public static Item PINEAPPLE_TEA_BUCKET;
    public static Item PLUM_TEA_BUCKET;
    public static Item POMEGRANATE_TEA_BUCKET;
    public static Item POMELO_TEA_BUCKET;
    public static Item PUMPKIN_TEA_BUCKET;
    public static Item RASPBERRY_TEA_BUCKET;
    public static Item REDLOVE_TEA_BUCKET;
    public static Item STARFRUIT_TEA_BUCKET;
    public static Item STRAWBERRY_TEA_BUCKET;
    public static Item SWEETBERRY_TEA_BUCKET;
    public static Item TAMARIND_TEA_BUCKET;
    public static Item VANILLA_TEA_BUCKET;
    public static Item WATERMELON_TEA_BUCKET;
    public static Item YUCCA_TEA_BUCKET;

    // Syrup bucket items
    public static Item BANANA_SYRUP_BUCKET;
    public static Item CARAMEL_SYRUP_BUCKET;
    public static Item COCONUT_SYRUP_BUCKET;
    public static Item MINT_SYRUP_BUCKET;
    public static Item RASPBERRY_SYRUP_BUCKET;
    public static Item STRAWBERRY_SYRUP_BUCKET;
    public static Item VANILLA_SYRUP_BUCKET;

    // Other bucket items
    public static Item COFFEE_BUCKET;
    public static Item MELTED_SUGAR_BUCKET;
    
    private static FlowableFluid registerFluid(String name, Supplier<Item> bucketItem) {
        CafeFluid fluid = new CafeFluid(bucketItem) {};
        Registry.register(Registries.FLUID, CreateCafe.id(name), fluid);
        FLUIDS.put(name, fluid);
        
        // Register Transfer API attributes for this fluid (enables Create tank interaction)
        FluidVariantAttributes.register(fluid, new FluidVariantAttributeHandler() {
            @Override
            public Text getName(net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant fluidVariant) {
                return Text.translatable("fluid.createcafe." + name);
            }
        });
        
        return fluid;
    }
    
    private static Item registerBucketItem(String fluidName, Supplier<FlowableFluid> fluidSupplier) {
        String bucketName = fluidName + "_bucket";
        Item bucket = new BucketItem(fluidSupplier.get(), new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));
        Registry.register(Registries.ITEM, CreateCafe.id(bucketName), bucket);
        BUCKET_ITEMS.put(bucketName, bucket);
        return bucket;
    }
    
    public static void register() {
        CreateCafe.LOGGER.info("Registering Create Cafe fluids...");
        
        // Register tea fluids with their bucket items
        ALOE_TEA = registerFluid("aloe_tea", () -> ALOE_TEA_BUCKET);
        ALOE_TEA_BUCKET = registerBucketItem("aloe_tea", () -> ALOE_TEA);
        
        APPLE_TEA = registerFluid("apple_tea", () -> APPLE_TEA_BUCKET);
        APPLE_TEA_BUCKET = registerBucketItem("apple_tea", () -> APPLE_TEA);
        
        APRICOT_TEA = registerFluid("apricot_tea", () -> APRICOT_TEA_BUCKET);
        APRICOT_TEA_BUCKET = registerBucketItem("apricot_tea", () -> APRICOT_TEA);
        
        AVOCADO_TEA = registerFluid("avocado_tea", () -> AVOCADO_TEA_BUCKET);
        AVOCADO_TEA_BUCKET = registerBucketItem("avocado_tea", () -> AVOCADO_TEA);
        
        BANANA_TEA = registerFluid("banana_tea", () -> BANANA_TEA_BUCKET);
        BANANA_TEA_BUCKET = registerBucketItem("banana_tea", () -> BANANA_TEA);
        
        BARBERRY_TEA = registerFluid("barberry_tea", () -> BARBERRY_TEA_BUCKET);
        BARBERRY_TEA_BUCKET = registerBucketItem("barberry_tea", () -> BARBERRY_TEA);
        
        BLACKBERRY_TEA = registerFluid("blackberry_tea", () -> BLACKBERRY_TEA_BUCKET);
        BLACKBERRY_TEA_BUCKET = registerBucketItem("blackberry_tea", () -> BLACKBERRY_TEA);
        
        BLOOD_TEA = registerFluid("blood_tea", () -> BLOOD_TEA_BUCKET);
        BLOOD_TEA_BUCKET = registerBucketItem("blood_tea", () -> BLOOD_TEA);
        
        BLUEBERRY_TEA = registerFluid("blueberry_tea", () -> BLUEBERRY_TEA_BUCKET);
        BLUEBERRY_TEA_BUCKET = registerBucketItem("blueberry_tea", () -> BLUEBERRY_TEA);
        
        CHERRY_TEA = registerFluid("cherry_tea", () -> CHERRY_TEA_BUCKET);
        CHERRY_TEA_BUCKET = registerBucketItem("cherry_tea", () -> CHERRY_TEA);
        
        CITRON_TEA = registerFluid("citron_tea", () -> CITRON_TEA_BUCKET);
        CITRON_TEA_BUCKET = registerBucketItem("citron_tea", () -> CITRON_TEA);
        
        COCONUT_TEA = registerFluid("coconut_tea", () -> COCONUT_TEA_BUCKET);
        COCONUT_TEA_BUCKET = registerBucketItem("coconut_tea", () -> COCONUT_TEA);
        
        DRAGONFRUIT_TEA = registerFluid("dragonfruit_tea", () -> DRAGONFRUIT_TEA_BUCKET);
        DRAGONFRUIT_TEA_BUCKET = registerBucketItem("dragonfruit_tea", () -> DRAGONFRUIT_TEA);
        
        DURIAN_TEA = registerFluid("durian_tea", () -> DURIAN_TEA_BUCKET);
        DURIAN_TEA_BUCKET = registerBucketItem("durian_tea", () -> DURIAN_TEA);
        
        FIG_TEA = registerFluid("fig_tea", () -> FIG_TEA_BUCKET);
        FIG_TEA_BUCKET = registerBucketItem("fig_tea", () -> FIG_TEA);
        
        GOOSEBERRY_TEA = registerFluid("gooseberry_tea", () -> GOOSEBERRY_TEA_BUCKET);
        GOOSEBERRY_TEA_BUCKET = registerBucketItem("gooseberry_tea", () -> GOOSEBERRY_TEA);
        
        GRAPE_TEA = registerFluid("grape_tea", () -> GRAPE_TEA_BUCKET);
        GRAPE_TEA_BUCKET = registerBucketItem("grape_tea", () -> GRAPE_TEA);
        
        GRAPEFRUIT_TEA = registerFluid("grapefruit_tea", () -> GRAPEFRUIT_TEA_BUCKET);
        GRAPEFRUIT_TEA_BUCKET = registerBucketItem("grapefruit_tea", () -> GRAPEFRUIT_TEA);
        
        GUAVA_TEA = registerFluid("guava_tea", () -> GUAVA_TEA_BUCKET);
        GUAVA_TEA_BUCKET = registerBucketItem("guava_tea", () -> GUAVA_TEA);
        
        JACKFRUIT_TEA = registerFluid("jackfruit_tea", () -> JACKFRUIT_TEA_BUCKET);
        JACKFRUIT_TEA_BUCKET = registerBucketItem("jackfruit_tea", () -> JACKFRUIT_TEA);
        
        KIWI_TEA = registerFluid("kiwi_tea", () -> KIWI_TEA_BUCKET);
        KIWI_TEA_BUCKET = registerBucketItem("kiwi_tea", () -> KIWI_TEA);
        
        LAVENDER_TEA = registerFluid("lavender_tea", () -> LAVENDER_TEA_BUCKET);
        LAVENDER_TEA_BUCKET = registerBucketItem("lavender_tea", () -> LAVENDER_TEA);
        
        LEMON_TEA = registerFluid("lemon_tea", () -> LEMON_TEA_BUCKET);
        LEMON_TEA_BUCKET = registerBucketItem("lemon_tea", () -> LEMON_TEA);
        
        LIME_TEA = registerFluid("lime_tea", () -> LIME_TEA_BUCKET);
        LIME_TEA_BUCKET = registerBucketItem("lime_tea", () -> LIME_TEA);
        
        LYCHEE_TEA = registerFluid("lychee_tea", () -> LYCHEE_TEA_BUCKET);
        LYCHEE_TEA_BUCKET = registerBucketItem("lychee_tea", () -> LYCHEE_TEA);
        
        MANA_TEA = registerFluid("mana_tea", () -> MANA_TEA_BUCKET);
        MANA_TEA_BUCKET = registerBucketItem("mana_tea", () -> MANA_TEA);
        
        MANDARIN_TEA = registerFluid("mandarin_tea", () -> MANDARIN_TEA_BUCKET);
        MANDARIN_TEA_BUCKET = registerBucketItem("mandarin_tea", () -> MANDARIN_TEA);
        
        MANGO_TEA = registerFluid("mango_tea", () -> MANGO_TEA_BUCKET);
        MANGO_TEA_BUCKET = registerBucketItem("mango_tea", () -> MANGO_TEA);
        
        ORANGE_TEA = registerFluid("orange_tea", () -> ORANGE_TEA_BUCKET);
        ORANGE_TEA_BUCKET = registerBucketItem("orange_tea", () -> ORANGE_TEA);
        
        OREO_TEA = registerFluid("oreo_tea", () -> OREO_TEA_BUCKET);
        OREO_TEA_BUCKET = registerBucketItem("oreo_tea", () -> OREO_TEA);
        
        PAPAYA_TEA = registerFluid("papaya_tea", () -> PAPAYA_TEA_BUCKET);
        PAPAYA_TEA_BUCKET = registerBucketItem("papaya_tea", () -> PAPAYA_TEA);
        
        PASSIONFRUIT_TEA = registerFluid("passionfruit_tea", () -> PASSIONFRUIT_TEA_BUCKET);
        PASSIONFRUIT_TEA_BUCKET = registerBucketItem("passionfruit_tea", () -> PASSIONFRUIT_TEA);
        
        PEACH_TEA = registerFluid("peach_tea", () -> PEACH_TEA_BUCKET);
        PEACH_TEA_BUCKET = registerBucketItem("peach_tea", () -> PEACH_TEA);
        
        PERSIMMON_TEA = registerFluid("persimmon_tea", () -> PERSIMMON_TEA_BUCKET);
        PERSIMMON_TEA_BUCKET = registerBucketItem("persimmon_tea", () -> PERSIMMON_TEA);
        
        PINEAPPLE_TEA = registerFluid("pineapple_tea", () -> PINEAPPLE_TEA_BUCKET);
        PINEAPPLE_TEA_BUCKET = registerBucketItem("pineapple_tea", () -> PINEAPPLE_TEA);
        
        PLUM_TEA = registerFluid("plum_tea", () -> PLUM_TEA_BUCKET);
        PLUM_TEA_BUCKET = registerBucketItem("plum_tea", () -> PLUM_TEA);
        
        POMEGRANATE_TEA = registerFluid("pomegranate_tea", () -> POMEGRANATE_TEA_BUCKET);
        POMEGRANATE_TEA_BUCKET = registerBucketItem("pomegranate_tea", () -> POMEGRANATE_TEA);
        
        POMELO_TEA = registerFluid("pomelo_tea", () -> POMELO_TEA_BUCKET);
        POMELO_TEA_BUCKET = registerBucketItem("pomelo_tea", () -> POMELO_TEA);
        
        PUMPKIN_TEA = registerFluid("pumpkin_tea", () -> PUMPKIN_TEA_BUCKET);
        PUMPKIN_TEA_BUCKET = registerBucketItem("pumpkin_tea", () -> PUMPKIN_TEA);
        
        RASPBERRY_TEA = registerFluid("raspberry_tea", () -> RASPBERRY_TEA_BUCKET);
        RASPBERRY_TEA_BUCKET = registerBucketItem("raspberry_tea", () -> RASPBERRY_TEA);
        
        REDLOVE_TEA = registerFluid("redlove_tea", () -> REDLOVE_TEA_BUCKET);
        REDLOVE_TEA_BUCKET = registerBucketItem("redlove_tea", () -> REDLOVE_TEA);
        
        STARFRUIT_TEA = registerFluid("starfruit_tea", () -> STARFRUIT_TEA_BUCKET);
        STARFRUIT_TEA_BUCKET = registerBucketItem("starfruit_tea", () -> STARFRUIT_TEA);
        
        STRAWBERRY_TEA = registerFluid("strawberry_tea", () -> STRAWBERRY_TEA_BUCKET);
        STRAWBERRY_TEA_BUCKET = registerBucketItem("strawberry_tea", () -> STRAWBERRY_TEA);
        
        SWEETBERRY_TEA = registerFluid("sweetberry_tea", () -> SWEETBERRY_TEA_BUCKET);
        SWEETBERRY_TEA_BUCKET = registerBucketItem("sweetberry_tea", () -> SWEETBERRY_TEA);
        
        TAMARIND_TEA = registerFluid("tamarind_tea", () -> TAMARIND_TEA_BUCKET);
        TAMARIND_TEA_BUCKET = registerBucketItem("tamarind_tea", () -> TAMARIND_TEA);
        
        VANILLA_TEA = registerFluid("vanilla_tea", () -> VANILLA_TEA_BUCKET);
        VANILLA_TEA_BUCKET = registerBucketItem("vanilla_tea", () -> VANILLA_TEA);
        
        WATERMELON_TEA = registerFluid("watermelon_tea", () -> WATERMELON_TEA_BUCKET);
        WATERMELON_TEA_BUCKET = registerBucketItem("watermelon_tea", () -> WATERMELON_TEA);
        
        YUCCA_TEA = registerFluid("yucca_tea", () -> YUCCA_TEA_BUCKET);
        YUCCA_TEA_BUCKET = registerBucketItem("yucca_tea", () -> YUCCA_TEA);
        
        // Register syrup fluids with their bucket items
        BANANA_SYRUP = registerFluid("banana_syrup", () -> BANANA_SYRUP_BUCKET);
        BANANA_SYRUP_BUCKET = registerBucketItem("banana_syrup", () -> BANANA_SYRUP);
        
        CARAMEL_SYRUP = registerFluid("caramel_syrup", () -> CARAMEL_SYRUP_BUCKET);
        CARAMEL_SYRUP_BUCKET = registerBucketItem("caramel_syrup", () -> CARAMEL_SYRUP);
        
        COCONUT_SYRUP = registerFluid("coconut_syrup", () -> COCONUT_SYRUP_BUCKET);
        COCONUT_SYRUP_BUCKET = registerBucketItem("coconut_syrup", () -> COCONUT_SYRUP);
        
        MINT_SYRUP = registerFluid("mint_syrup", () -> MINT_SYRUP_BUCKET);
        MINT_SYRUP_BUCKET = registerBucketItem("mint_syrup", () -> MINT_SYRUP);
        
        RASPBERRY_SYRUP = registerFluid("raspberry_syrup", () -> RASPBERRY_SYRUP_BUCKET);
        RASPBERRY_SYRUP_BUCKET = registerBucketItem("raspberry_syrup", () -> RASPBERRY_SYRUP);
        
        STRAWBERRY_SYRUP = registerFluid("strawberry_syrup", () -> STRAWBERRY_SYRUP_BUCKET);
        STRAWBERRY_SYRUP_BUCKET = registerBucketItem("strawberry_syrup", () -> STRAWBERRY_SYRUP);
        
        VANILLA_SYRUP = registerFluid("vanilla_syrup", () -> VANILLA_SYRUP_BUCKET);
        VANILLA_SYRUP_BUCKET = registerBucketItem("vanilla_syrup", () -> VANILLA_SYRUP);
        
        // Register other fluids with their bucket items
        COFFEE = registerFluid("coffee", () -> COFFEE_BUCKET);
        COFFEE_BUCKET = registerBucketItem("coffee", () -> COFFEE);
        
        MELTED_SUGAR = registerFluid("melted_sugar", () -> MELTED_SUGAR_BUCKET);
        MELTED_SUGAR_BUCKET = registerBucketItem("melted_sugar", () -> MELTED_SUGAR);
        
        CreateCafe.LOGGER.info("Registered {} fluids and {} bucket items", FLUIDS.size(), BUCKET_ITEMS.size());
    }
    
    public static FlowableFluid getFluid(String name) {
        return FLUIDS.get(name);
    }
}
