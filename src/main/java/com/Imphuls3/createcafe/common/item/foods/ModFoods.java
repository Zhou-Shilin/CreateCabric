package com.Imphuls3.createcafe.common.item.foods;

import com.Imphuls3.createcafe.common.effect.EffectRegistry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

import java.util.function.Function;

public class ModFoods {
    public static final FoodComponent BOBA = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).snack().build();
    public static final FoodComponent RAW_BOBA = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).snack().build();
    public static final FoodComponent COFFEE_FRUIT = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).snack().build();
    public static final FoodComponent COFFEE = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).snack().build();
    public static final FoodComponent ROASTED_COFFEE = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).snack().build();
    public static final FoodComponent CASSAVA_ROOT = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).snack().build();

    public static final FoodComponent MANA_BERRIES = new FoodComponent.Builder().hunger(4).saturationModifier(0.2F).snack().build();
    public static final FoodComponent BLOOD_ORANGE = new FoodComponent.Builder().hunger(4).saturationModifier(0.2F).snack().build();

    public static final FoodComponent OREO = new FoodComponent.Builder().hunger(4).saturationModifier(0.2F).build();
    public static final FoodComponent OREO_HALF_RAW = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).snack().build();
    public static final FoodComponent OREO_HALF = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).snack().build();
    public static final FoodComponent CRUSHED_OREO = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).snack().build();

    public static final FoodComponent REGEN_DRINK = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10 * 20, 1), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodComponent FIRE_RES = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 10 * 20, 1), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodComponent RES_DRINK = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 10 * 20, 0), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodComponent SPEED_DRINK = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 10 * 20, 1), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodComponent STRENGTH_DRINK = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 10 * 20, 1), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodComponent SUPER_DRINK = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 10 * 20, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 10 * 20, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 10 * 20, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10 * 20, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 10 * 20, 1), 1.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final Function<StatusEffect, FoodComponent> ICED_COFFEE_DRINK = (effect -> new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(EffectRegistry.CAFFEINATED, 10 * 20, 3), 1.0F)
            .statusEffect(effect != null ? new StatusEffectInstance(effect, 10 * 20, 1) :
                    new StatusEffectInstance(StatusEffects.WATER_BREATHING, 0, 0), effect != null ? 1.0F : 0.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build());

    public static final Function<StatusEffect, FoodComponent> ICED_COFFEE_DRINK_FLAVOR = (effect -> new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(EffectRegistry.CAFFEINATED, 10 * 20, 1), 1.0F)
            .statusEffect(effect != null ? new StatusEffectInstance(effect, 10 * 20, 1) :
                    new StatusEffectInstance(StatusEffects.WATER_BREATHING, 0, 0), effect != null ? 1.0F : 0.0F)
            .hunger(8).saturationModifier(0.2F).alwaysEdible().build());
}
