package com.imphuls3.createcafe.registry;

import com.imphuls3.createcafe.CreateCafe;
import com.imphuls3.createcafe.common.effect.CaffeinatedEffect;
import com.imphuls3.createcafe.common.effect.CrashEffect;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.awt.Color;

public class ModEffects {
    public static final StatusEffect CAFFEINATED = new CaffeinatedEffect(
            StatusEffectCategory.BENEFICIAL, 
            new Color(255, 200, 0).getRGB())
            .addAttributeModifier(
                EntityAttributes.GENERIC_MOVEMENT_SPEED, 
                "91AEAA56-376B-4498-935B-2F7F68070635", 
                0.2, 
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL);

    public static final StatusEffect CAFFEINE_CRASH = new CrashEffect(
            StatusEffectCategory.HARMFUL, 
            new Color(20, 50, 110).getRGB())
            .addAttributeModifier(
                EntityAttributes.GENERIC_MOVEMENT_SPEED, 
                "7107DE5E-7CE8-4030-940E-514C1F160890", 
                -0.15, 
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL);

    public static void register() {
        Registry.register(Registries.STATUS_EFFECT, CreateCafe.id("caffeinated"), CAFFEINATED);
        Registry.register(Registries.STATUS_EFFECT, CreateCafe.id("caffeine_crash"), CAFFEINE_CRASH);
    }
}
