package com.imphuls3.createcafe.registry;

import com.imphuls3.createcafe.CreateCafe;
import com.imphuls3.createcafe.common.fluid.CafeFluid;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.HashMap;
import java.util.Map;

/**
 * Fluid registry for Create Cafe.
 * Registers all fluids used in tea, syrup, and coffee recipes.
 */
public class ModFluids {
    
    // Store all registered fluids
    private static final Map<String, FlowableFluid> FLUIDS = new HashMap<>();
    
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
    
    private static FlowableFluid registerFluid(String name) {
        FlowableFluid fluid = new CafeFluid() {};
        Registry.register(Registries.FLUID, CreateCafe.id(name), fluid);
        FLUIDS.put(name, fluid);
        return fluid;
    }
    
    public static void register() {
        CreateCafe.LOGGER.info("Registering Create Cafe fluids...");
        
        // Register tea fluids
        ALOE_TEA = registerFluid("aloe_tea");
        APPLE_TEA = registerFluid("apple_tea");
        APRICOT_TEA = registerFluid("apricot_tea");
        AVOCADO_TEA = registerFluid("avocado_tea");
        BANANA_TEA = registerFluid("banana_tea");
        BARBERRY_TEA = registerFluid("barberry_tea");
        BLACKBERRY_TEA = registerFluid("blackberry_tea");
        BLOOD_TEA = registerFluid("blood_tea");
        BLUEBERRY_TEA = registerFluid("blueberry_tea");
        CHERRY_TEA = registerFluid("cherry_tea");
        CITRON_TEA = registerFluid("citron_tea");
        COCONUT_TEA = registerFluid("coconut_tea");
        DRAGONFRUIT_TEA = registerFluid("dragonfruit_tea");
        DURIAN_TEA = registerFluid("durian_tea");
        FIG_TEA = registerFluid("fig_tea");
        GOOSEBERRY_TEA = registerFluid("gooseberry_tea");
        GRAPE_TEA = registerFluid("grape_tea");
        GRAPEFRUIT_TEA = registerFluid("grapefruit_tea");
        GUAVA_TEA = registerFluid("guava_tea");
        JACKFRUIT_TEA = registerFluid("jackfruit_tea");
        KIWI_TEA = registerFluid("kiwi_tea");
        LAVENDER_TEA = registerFluid("lavender_tea");
        LEMON_TEA = registerFluid("lemon_tea");
        LIME_TEA = registerFluid("lime_tea");
        LYCHEE_TEA = registerFluid("lychee_tea");
        MANA_TEA = registerFluid("mana_tea");
        MANDARIN_TEA = registerFluid("mandarin_tea");
        MANGO_TEA = registerFluid("mango_tea");
        ORANGE_TEA = registerFluid("orange_tea");
        OREO_TEA = registerFluid("oreo_tea");
        PAPAYA_TEA = registerFluid("papaya_tea");
        PASSIONFRUIT_TEA = registerFluid("passionfruit_tea");
        PEACH_TEA = registerFluid("peach_tea");
        PERSIMMON_TEA = registerFluid("persimmon_tea");
        PINEAPPLE_TEA = registerFluid("pineapple_tea");
        PLUM_TEA = registerFluid("plum_tea");
        POMEGRANATE_TEA = registerFluid("pomegranate_tea");
        POMELO_TEA = registerFluid("pomelo_tea");
        PUMPKIN_TEA = registerFluid("pumpkin_tea");
        RASPBERRY_TEA = registerFluid("raspberry_tea");
        REDLOVE_TEA = registerFluid("redlove_tea");
        STARFRUIT_TEA = registerFluid("starfruit_tea");
        STRAWBERRY_TEA = registerFluid("strawberry_tea");
        SWEETBERRY_TEA = registerFluid("sweetberry_tea");
        TAMARIND_TEA = registerFluid("tamarind_tea");
        VANILLA_TEA = registerFluid("vanilla_tea");
        WATERMELON_TEA = registerFluid("watermelon_tea");
        YUCCA_TEA = registerFluid("yucca_tea");
        
        // Register syrup fluids
        BANANA_SYRUP = registerFluid("banana_syrup");
        CARAMEL_SYRUP = registerFluid("caramel_syrup");
        COCONUT_SYRUP = registerFluid("coconut_syrup");
        MINT_SYRUP = registerFluid("mint_syrup");
        RASPBERRY_SYRUP = registerFluid("raspberry_syrup");
        STRAWBERRY_SYRUP = registerFluid("strawberry_syrup");
        VANILLA_SYRUP = registerFluid("vanilla_syrup");
        
        // Register other fluids
        COFFEE = registerFluid("coffee");
        MELTED_SUGAR = registerFluid("melted_sugar");
        
        CreateCafe.LOGGER.info("Registered {} fluids", FLUIDS.size());
    }
    
    public static FlowableFluid getFluid(String name) {
        return FLUIDS.get(name);
    }
}
