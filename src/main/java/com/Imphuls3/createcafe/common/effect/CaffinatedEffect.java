package com.Imphuls3.createcafe.common.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;

public class CaffinatedEffect extends StatusEffect {
    public CaffinatedEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity.canHaveStatusEffect(new StatusEffectInstance(EffectRegistry.CAFFEINE_CRASH, 5 * 20))) {
            entity.addStatusEffect(new StatusEffectInstance(EffectRegistry.CAFFEINE_CRASH, 10 * 20, amplifier));
        }
        super.onRemoved(entity, attributes, amplifier);
    }

    public CaffinatedEffect addAttributeModifier(net.minecraft.entity.attribute.EntityAttribute attribute, String uuid, double amount, EntityAttributeModifier.Operation operation) {
        super.addAttributeModifier(attribute, uuid, amount, operation);
        return this;
    }
}
