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
    // Store fluid tint colors for rendering (ARGB format)
    private static final Map<FlowableFluid, Integer> FLUID_COLORS = new HashMap<>();
    
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
     * Registers both a fluid and its corresponding bucket item together with a tint color.
     * This ensures proper initialization order and avoids the chicken-and-egg problem.
     * @param name The fluid name
     * @param color The ARGB tint color for rendering (e.g., 0xc8fcc03d for mango yellow)
     */
    private static FluidBucketPair registerFluidWithBucket(String name, int color) {
        // Create a holder for the bucket item to resolve circular reference
        Item[] bucketHolder = new Item[1];
        
        // Register the fluid with a lazy bucket supplier
        CafeFluid fluid = new CafeFluid(() -> bucketHolder[0]) {};
        Registry.register(Registries.FLUID, CreateCafe.id(name), fluid);
        FLUIDS.put(name, fluid);
        FLUID_COLORS.put(fluid, color);
        
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
        
        // Register tea fluids with their bucket items and tint colors
        // Colors are in ARGB format (0xAARRGGBB) matching the original Forge mod
        pair = registerFluidWithBucket("aloe_tea", 0xc8a8e4a0);  // Light green
        ALOE_TEA = pair.fluid; ALOE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("apple_tea", 0xc8c8e090);  // Light yellow-green
        APPLE_TEA = pair.fluid; APPLE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("apricot_tea", 0xc8f4a460);  // Orange
        APRICOT_TEA = pair.fluid; APRICOT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("avocado_tea", 0xc8a0c878);  // Green
        AVOCADO_TEA = pair.fluid; AVOCADO_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("banana_tea", 0xc8f4e878);  // Yellow
        BANANA_TEA = pair.fluid; BANANA_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("barberry_tea", 0xc8e85050);  // Red
        BARBERRY_TEA = pair.fluid; BARBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("blackberry_tea", 0xc8604878);  // Dark purple
        BLACKBERRY_TEA = pair.fluid; BLACKBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("blood_tea", 0xc8fc3003);  // Blood red
        BLOOD_TEA = pair.fluid; BLOOD_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("blueberry_tea", 0xc8607890);  // Blue
        BLUEBERRY_TEA = pair.fluid; BLUEBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("cherry_tea", 0xc8d04050);  // Cherry red
        CHERRY_TEA = pair.fluid; CHERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("citron_tea", 0xc8e8e070);  // Citrus yellow
        CITRON_TEA = pair.fluid; CITRON_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("coconut_tea", 0xc8f0f0e8);  // White/cream
        COCONUT_TEA = pair.fluid; COCONUT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("dragonfruit_tea", 0xc8e060a0);  // Pink
        DRAGONFRUIT_TEA = pair.fluid; DRAGONFRUIT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("durian_tea", 0xc8d8d088);  // Pale yellow
        DURIAN_TEA = pair.fluid; DURIAN_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("fig_tea", 0xc8786050);  // Brown
        FIG_TEA = pair.fluid; FIG_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("gooseberry_tea", 0xc890b050);  // Yellow-green
        GOOSEBERRY_TEA = pair.fluid; GOOSEBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("grape_tea", 0xc88858a8);  // Purple
        GRAPE_TEA = pair.fluid; GRAPE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("grapefruit_tea", 0xc8f8a880);  // Pink-orange
        GRAPEFRUIT_TEA = pair.fluid; GRAPEFRUIT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("guava_tea", 0xc8f0a8a0);  // Light pink
        GUAVA_TEA = pair.fluid; GUAVA_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("jackfruit_tea", 0xc8e8c860);  // Golden yellow
        JACKFRUIT_TEA = pair.fluid; JACKFRUIT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("kiwi_tea", 0xc8a8c868);  // Kiwi green
        KIWI_TEA = pair.fluid; KIWI_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("lavender_tea", 0xc8b098d0);  // Lavender purple
        LAVENDER_TEA = pair.fluid; LAVENDER_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("lemon_tea", 0xc8f8f060);  // Lemon yellow
        LEMON_TEA = pair.fluid; LEMON_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("lime_tea", 0xc8b0e858);  // Lime green
        LIME_TEA = pair.fluid; LIME_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("lychee_tea", 0xc8f0d8d8);  // Pale pink
        LYCHEE_TEA = pair.fluid; LYCHEE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("mana_tea", 0xc870a0e8);  // Blue magical
        MANA_TEA = pair.fluid; MANA_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("mandarin_tea", 0xc8f8a040);  // Orange
        MANDARIN_TEA = pair.fluid; MANDARIN_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("mango_tea", 0xc8fcc03d);  // Mango yellow
        MANGO_TEA = pair.fluid; MANGO_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("orange_tea", 0xc8f89030);  // Orange
        ORANGE_TEA = pair.fluid; ORANGE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("oreo_tea", 0xc8dedad3);  // Gray-white
        OREO_TEA = pair.fluid; OREO_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("papaya_tea", 0xc8f8b060);  // Orange-yellow
        PAPAYA_TEA = pair.fluid; PAPAYA_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("passionfruit_tea", 0xc8e89040);  // Orange
        PASSIONFRUIT_TEA = pair.fluid; PASSIONFRUIT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("peach_tea", 0xc8f8c8a0);  // Peach
        PEACH_TEA = pair.fluid; PEACH_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("persimmon_tea", 0xc8f09048);  // Orange-red
        PERSIMMON_TEA = pair.fluid; PERSIMMON_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("pineapple_tea", 0xc8f8e050);  // Yellow
        PINEAPPLE_TEA = pair.fluid; PINEAPPLE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("plum_tea", 0xc8885078);  // Plum purple
        PLUM_TEA = pair.fluid; PLUM_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("pomegranate_tea", 0xc8c83040);  // Deep red
        POMEGRANATE_TEA = pair.fluid; POMEGRANATE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("pomelo_tea", 0xc8e0e888);  // Pale green-yellow
        POMELO_TEA = pair.fluid; POMELO_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("pumpkin_tea", 0xc8e88830);  // Pumpkin orange
        PUMPKIN_TEA = pair.fluid; PUMPKIN_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("raspberry_tea", 0xc8d04868);  // Raspberry pink
        RASPBERRY_TEA = pair.fluid; RASPBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("redlove_tea", 0xc8d85050);  // Red
        REDLOVE_TEA = pair.fluid; REDLOVE_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("starfruit_tea", 0xc8e8e068);  // Yellow
        STARFRUIT_TEA = pair.fluid; STARFRUIT_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("strawberry_tea", 0xc8e86070);  // Strawberry pink
        STRAWBERRY_TEA = pair.fluid; STRAWBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("sweetberry_tea", 0xc8c85060);  // Berry red
        SWEETBERRY_TEA = pair.fluid; SWEETBERRY_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("tamarind_tea", 0xc8906048);  // Brown
        TAMARIND_TEA = pair.fluid; TAMARIND_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("vanilla_tea", 0xc8f0e8d8);  // Cream
        VANILLA_TEA = pair.fluid; VANILLA_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("watermelon_tea", 0xc8e87080);  // Watermelon pink
        WATERMELON_TEA = pair.fluid; WATERMELON_TEA_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("yucca_tea", 0xc8d0c8a0);  // Pale tan
        YUCCA_TEA = pair.fluid; YUCCA_TEA_BUCKET = pair.bucket;
        
        // Register syrup fluids with their bucket items
        pair = registerFluidWithBucket("banana_syrup", 0xc8f8e060);  // Yellow
        BANANA_SYRUP = pair.fluid; BANANA_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("caramel_syrup", 0xc8c08030);  // Caramel brown
        CARAMEL_SYRUP = pair.fluid; CARAMEL_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("coconut_syrup", 0xc8f8f8f0);  // White
        COCONUT_SYRUP = pair.fluid; COCONUT_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("mint_syrup", 0xc870d890);  // Mint green
        MINT_SYRUP = pair.fluid; MINT_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("raspberry_syrup", 0xc8d04868);  // Raspberry pink
        RASPBERRY_SYRUP = pair.fluid; RASPBERRY_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("strawberry_syrup", 0xc8e06070);  // Strawberry pink
        STRAWBERRY_SYRUP = pair.fluid; STRAWBERRY_SYRUP_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("vanilla_syrup", 0xc8f8f0d0);  // Vanilla cream
        VANILLA_SYRUP = pair.fluid; VANILLA_SYRUP_BUCKET = pair.bucket;
        
        // Register other fluids with their bucket items
        pair = registerFluidWithBucket("coffee", 0xc8503820);  // Coffee brown
        COFFEE = pair.fluid; COFFEE_BUCKET = pair.bucket;
        
        pair = registerFluidWithBucket("melted_sugar", 0xc8f8e8c0);  // Sugar white
        MELTED_SUGAR = pair.fluid; MELTED_SUGAR_BUCKET = pair.bucket;
        
        CreateCafe.LOGGER.info("Registered {} fluids and {} bucket items", FLUIDS.size(), BUCKET_ITEMS.size());
    }
    
    public static FlowableFluid getFluid(String name) {
        return FLUIDS.get(name);
    }
    
    /**
     * Returns all registered fluids for client-side render handler registration.
     */
    public static Iterable<FlowableFluid> getAllFluids() {
        return FLUIDS.values();
    }
    
    /**
     * Returns the tint color for a fluid (ARGB format).
     * Used for client-side fluid rendering.
     * Default is translucent white (0xc8ffffff) to match the alpha used in registered colors.
     */
    public static int getFluidColor(FlowableFluid fluid) {
        return FLUID_COLORS.getOrDefault(fluid, 0xc8ffffff);
    }
    
    /**
     * Returns all fluid-color mappings for client-side registration.
     */
    public static Map<FlowableFluid, Integer> getFluidColors() {
        return FLUID_COLORS;
    }
}
