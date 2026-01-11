package com.imphuls3.createcafe.common.item.foods;

import com.imphuls3.createcafe.config.CafeConfig;
import com.imphuls3.createcafe.registry.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

import java.util.function.Function;

public class ModFoods {
    public static final FoodComponent BOBA = new FoodComponent.Builder()
            .hunger(2).saturationModifier(0.2F).snack().build();

    public static final FoodComponent RAW_BOBA = new FoodComponent.Builder()
            .hunger(1).saturationModifier(0.1F).snack().build();

    public static final FoodComponent COFFEE_FRUIT = new FoodComponent.Builder()
            .hunger(2).saturationModifier(0.2F).snack().build();

    public static final FoodComponent COFFEE = new FoodComponent.Builder()
            .hunger(1).saturationModifier(0.1F).snack().build();

    public static final FoodComponent ROASTED_COFFEE = new FoodComponent.Builder()
            .hunger(1).saturationModifier(0.1F).snack().build();

    public static final FoodComponent CASSAVA_ROOT = new FoodComponent.Builder()
            .hunger(2).saturationModifier(0.2F).snack().build();

    public static final FoodComponent MANA_BERRIES = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.2F).snack().build();

    public static final FoodComponent BLOOD_ORANGE = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.2F).snack().build();

    public static final FoodComponent OREO = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.2F).build();

    public static final FoodComponent OREO_HALF_RAW = new FoodComponent.Builder()
            .hunger(1).saturationModifier(0.1F).snack().build();

    public static final FoodComponent OREO_HALF = new FoodComponent.Builder()
            .hunger(2).saturationModifier(0.2F).snack().build();

    public static final FoodComponent CRUSHED_OREO = new FoodComponent.Builder()
            .hunger(2).saturationModifier(0.1F).snack().build();

    public static final FoodComponent REGEN_DRINK = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 
                CafeConfig.getEffectDurationTicks(), 1), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodComponent FIRE_RES = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 
                CafeConfig.getEffectDurationTicks(), 1), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodComponent RES_DRINK = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 
                CafeConfig.getEffectDurationTicks(), 0), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodComponent SPEED_DRINK = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 
                CafeConfig.getEffectDurationTicks(), 1), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodComponent STRENGTH_DRINK = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 
                CafeConfig.getEffectDurationTicks(), 1), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodComponent SUPER_DRINK = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 
                CafeConfig.getEffectDurationTicks(), 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 
                CafeConfig.getEffectDurationTicks(), 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 
                CafeConfig.getEffectDurationTicks(), 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 
                CafeConfig.getEffectDurationTicks(), 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 
                CafeConfig.getEffectDurationTicks(), 1), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static FoodComponent icedCoffeeDrink() {
        return new FoodComponent.Builder()
                .statusEffect(new StatusEffectInstance(ModEffects.CAFFEINATED, 
                    CafeConfig.getEffectDurationTicks(), 3), 1.0F)
                .alwaysEdible().build();
    }

    public static FoodComponent icedCoffeeDrinkFlavor(net.minecraft.entity.effect.StatusEffect effect) {
        return new FoodComponent.Builder()
                .statusEffect(new StatusEffectInstance(ModEffects.CAFFEINATED, 
                    CafeConfig.getEffectDurationTicks(), 1), 1.0F)
                .statusEffect(new StatusEffectInstance(effect, 
                    CafeConfig.getEffectDurationTicks(), 1), 1.0F)
                .hunger(8).saturationModifier(0.2F).alwaysEdible().build();
    }
}
