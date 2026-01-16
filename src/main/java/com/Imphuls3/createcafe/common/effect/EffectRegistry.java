package com.Imphuls3.createcafe.common.effect;

import com.Imphuls3.createcafe.CreateCafe;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.awt.*;

public class EffectRegistry {
    public static StatusEffect CAFFEINATED;
    public static StatusEffect CAFFEINE_CRASH;

    public static void register() {
        CAFFEINATED = Registry.register(Registry.STATUS_EFFECT, new Identifier(CreateCafe.ID, "caffeinated"),
                new CaffinatedEffect(StatusEffectCategory.BENEFICIAL, new Color(255, 200, 0).getRGB())
                        .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2F, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

        CAFFEINE_CRASH = Registry.register(Registry.STATUS_EFFECT, new Identifier(CreateCafe.ID, "caffeine_crash"),
                new CrashEffect(StatusEffectCategory.HARMFUL, new Color(20, 50, 110).getRGB())
                        .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15F, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
    }
}
