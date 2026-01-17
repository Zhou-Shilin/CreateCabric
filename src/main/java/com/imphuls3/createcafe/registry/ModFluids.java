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
    
    /**
     * Helper class to hold both fluid and bucket item references during registration.
     */
    private static class FluidBucketPair {
        final FlowableFluid fluid;
        final Item bucket;
        
        FluidBucketPair(FlowableFluid fluid, Item bucket) {
            this.fluid = fluid;
            this.bucket = bucket;
        }
    }
    
    /**
     * Registers both a fluid and its corresponding bucket item together.
     * This ensures proper initialization order and avoids the chicken-and-egg problem.
     */
    private static FluidBucketPair registerFluidWithBucket(String name) {
        // Create a holder for the bucket item to resolve circular reference
        Item[] bucketHolder = new Item[1];
        
        // Register the fluid with a lazy bucket supplier
        CafeFluid fluid = new CafeFluid(() -> bucketHolder[0]) {};
        Registry.register(Registries.FLUID, CreateCafe.id(name), fluid);
        FLUIDS.put(name, fluid);
        
        // Register Transfer API attributes for this fluid (enables Create tank interaction)
        FluidVariantAttributes.register(fluid, new FluidVariantAttributeHandler() {
            @Override
            public Text getName(net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant fluidVariant) {
                return Text.translatable("fluid.createcafe." + name);
            }
        });
        
        // Register the bucket item
        String bucketName = name + "_bucket";
        Item bucket = new BucketItem(fluid, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));
        Registry.register(Registries.ITEM, CreateCafe.id(bucketName), bucket);
        BUCKET_ITEMS.put(bucketName, bucket);
        
        // Update the holder so the fluid's getBucketItem() returns the correct item
        bucketHolder[0] = bucket;
        
        return new FluidBucketPair(fluid, bucket);
    }
    
    public static void register() {
        CreateCafe.LOGGER.info("Registering Create Cafe fluids...");
        
        FluidBucketPair pair;
        
        // Register tea fluids with their bucket items
        pair = registerFluidWithBucket("aloe_tea");
        ALOE_TEA = pair.fluid; ALOE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("apple_tea");
        APPLE_TEA = pair.fluid; APPLE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("apricot_tea");
        APRICOT_TEA = pair.fluid; APRICOT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("avocado_tea");
        AVOCADO_TEA = pair.fluid; AVOCADO_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("banana_tea");
        BANANA_TEA = pair.fluid; BANANA_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("barberry_tea");
        BARBERRY_TEA = pair.fluid; BARBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("blackberry_tea");
        BLACKBERRY_TEA = pair.fluid; BLACKBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("blood_tea");
        BLOOD_TEA = pair.fluid; BLOOD_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("blueberry_tea");
        BLUEBERRY_TEA = pair.fluid; BLUEBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("cherry_tea");
        CHERRY_TEA = pair.fluid; CHERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("citron_tea");
        CITRON_TEA = pair.fluid; CITRON_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("coconut_tea");
        COCONUT_TEA = pair.fluid; COCONUT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("dragonfruit_tea");
        DRAGONFRUIT_TEA = pair.fluid; DRAGONFRUIT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("durian_tea");
        DURIAN_TEA = pair.fluid; DURIAN_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("fig_tea");
        FIG_TEA = pair.fluid; FIG_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("gooseberry_tea");
        GOOSEBERRY_TEA = pair.fluid; GOOSEBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("grape_tea");
        GRAPE_TEA = pair.fluid; GRAPE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("grapefruit_tea");
        GRAPEFRUIT_TEA = pair.fluid; GRAPEFRUIT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("guava_tea");
        GUAVA_TEA = pair.fluid; GUAVA_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("jackfruit_tea");
        JACKFRUIT_TEA = pair.fluid; JACKFRUIT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("kiwi_tea");
        KIWI_TEA = pair.fluid; KIWI_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("lavender_tea");
        LAVENDER_TEA = pair.fluid; LAVENDER_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("lemon_tea");
        LEMON_TEA = pair.fluid; LEMON_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("lime_tea");
        LIME_TEA = pair.fluid; LIME_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("lychee_tea");
        LYCHEE_TEA = pair.fluid; LYCHEE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("mana_tea");
        MANA_TEA = pair.fluid; MANA_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("mandarin_tea");
        MANDARIN_TEA = pair.fluid; MANDARIN_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("mango_tea");
        MANGO_TEA = pair.fluid; MANGO_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("orange_tea");
        ORANGE_TEA = pair.fluid; ORANGE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("oreo_tea");
        OREO_TEA = pair.fluid; OREO_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("papaya_tea");
        PAPAYA_TEA = pair.fluid; PAPAYA_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("passionfruit_tea");
        PASSIONFRUIT_TEA = pair.fluid; PASSIONFRUIT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("peach_tea");
        PEACH_TEA = pair.fluid; PEACH_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("persimmon_tea");
        PERSIMMON_TEA = pair.fluid; PERSIMMON_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("pineapple_tea");
        PINEAPPLE_TEA = pair.fluid; PINEAPPLE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("plum_tea");
        PLUM_TEA = pair.fluid; PLUM_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("pomegranate_tea");
        POMEGRANATE_TEA = pair.fluid; POMEGRANATE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("pomelo_tea");
        POMELO_TEA = pair.fluid; POMELO_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("pumpkin_tea");
        PUMPKIN_TEA = pair.fluid; PUMPKIN_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("raspberry_tea");
        RASPBERRY_TEA = pair.fluid; RASPBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("redlove_tea");
        REDLOVE_TEA = pair.fluid; REDLOVE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("starfruit_tea");
        STARFRUIT_TEA = pair.fluid; STARFRUIT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("strawberry_tea");
        STRAWBERRY_TEA = pair.fluid; STRAWBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("sweetberry_tea");
        SWEETBERRY_TEA = pair.fluid; SWEETBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("tamarind_tea");
        TAMARIND_TEA = pair.fluid; TAMARIND_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("vanilla_tea");
        VANILLA_TEA = pair.fluid; VANILLA_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("watermelon_tea");
        WATERMELON_TEA = pair.fluid; WATERMELON_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("yucca_tea");
        YUCCA_TEA = pair.fluid; YUCCA_TEA_BUCKET = pair.bucket;
        
        // Register syrup fluids with their bucket items
        pair = registerFluidWithBucket("banana_syrup");
        BANANA_SYRUP = pair.fluid; BANANA_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("caramel_syrup");
        CARAMEL_SYRUP = pair.fluid; CARAMEL_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("coconut_syrup");
        COCONUT_SYRUP = pair.fluid; COCONUT_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("mint_syrup");
        MINT_SYRUP = pair.fluid; MINT_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("raspberry_syrup");
        RASPBERRY_SYRUP = pair.fluid; RASPBERRY_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("strawberry_syrup");
        STRAWBERRY_SYRUP = pair.fluid; STRAWBERRY_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("vanilla_syrup");
        VANILLA_SYRUP = pair.fluid; VANILLA_SYRUP_BUCKET = pair.bucket;
        
        // Register other fluids with their bucket items
        pair = registerFluidWithBucket("coffee");
        COFFEE = pair.fluid; COFFEE_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("melted_sugar");
        MELTED_SUGAR = pair.fluid; MELTED_SUGAR_BUCKET = pair.bucket;
        
        CreateCafe.LOGGER.info("Registered {} fluids and {} bucket items", FLUIDS.size(), BUCKET_ITEMS.size());
    }
    
    public static FlowableFluid getFluid(String name) {
        return FLUIDS.get(name);
    }
}
