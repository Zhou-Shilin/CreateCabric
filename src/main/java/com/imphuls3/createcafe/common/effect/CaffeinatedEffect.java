package com.imphuls3.createcafe.common.effect;

import com.imphuls3.createcafe.registry.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;

public class CaffeinatedEffect extends StatusEffect {
    public CaffeinatedEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity.canHaveStatusEffect(new StatusEffectInstance(ModEffects.CAFFEINE_CRASH, 5 * 20))) {
            entity.addStatusEffect(new StatusEffectInstance(ModEffects.CAFFEINE_CRASH, 10 * 20, amplifier));
        }
        super.onRemoved(entity, attributes, amplifier);
    }
}
