package com.Imphuls3.createcafe.common.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class CrashEffect extends StatusEffect {
    public CrashEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    public CrashEffect addAttributeModifier(net.minecraft.entity.attribute.EntityAttribute attribute, String uuid, double amount, EntityAttributeModifier.Operation operation) {
        super.addAttributeModifier(attribute, uuid, amount, operation);
        return this;
    }
}
