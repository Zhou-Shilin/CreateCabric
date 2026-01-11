package com.Imphuls3.createcafe.common.effect;

import com.Imphuls3.createcafe.CreateCafe;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

import java.awt.*;

import static com.Imphuls3.createcafe.CreateCafe.modPath;

public class EffectRegistry {
    public static final MobEffect CAFFINATED_EFFECT = new CaffinatedEffect(MobEffectCategory.BENEFICIAL, new Color(255, 200, 0).getRGB())
            .addAttributeModifier(Attributes.MOVEMENT_SPEED, modPath("effect/caffeinated"), 0.2F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);

    public static final MobEffect CAFFEINE_CRASH_EFFECT = new CrashEffect(MobEffectCategory.HARMFUL, new Color(20, 50, 110).getRGB())
            .addAttributeModifier(Attributes.MOVEMENT_SPEED, modPath("effect/caffeine_crash"), -0.15F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);

    public static Holder<MobEffect> CAFFINATED;
    public static Holder<MobEffect> CAFFEINE_CRASH;

    public static void register() {
        CAFFINATED = Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, modPath("caffeinated"), CAFFINATED_EFFECT);
        CAFFEINE_CRASH = Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, modPath("caffeine_crash"), CAFFEINE_CRASH_EFFECT);
    }
}
