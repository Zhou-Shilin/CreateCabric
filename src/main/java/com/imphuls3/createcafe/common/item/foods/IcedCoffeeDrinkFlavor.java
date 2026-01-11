package com.imphuls3.createcafe.common.item.foods;

import com.imphuls3.createcafe.config.CafeConfig;
import com.imphuls3.createcafe.registry.ModItems;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class IcedCoffeeDrinkFlavor extends Item {
    private final String type;

    public IcedCoffeeDrinkFlavor(Settings settings, String type) {
        super(settings);
        this.type = type;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(Text.translatable("tooltip.createcafe.caffeinated.one").formatted(Formatting.BLUE));
        if (!"none".equals(type)) {
            tooltip.add(Text.translatable("tooltip.createcafe." + type).formatted(Formatting.BLUE));
        }
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (CafeConfig.shouldGiveEmptyCups()) {
            if (user instanceof ServerPlayerEntity serverPlayer) {
                Criteria.CONSUME_ITEM.trigger(serverPlayer, stack);
                serverPlayer.incrementStat(Stats.USED.getOrCreateStat(this));
            }

            if (stack.isEmpty()) {
                return new ItemStack(ModItems.ICED_COFFEE_CUP);
            } else {
                if (user instanceof PlayerEntity player && !player.getAbilities().creativeMode) {
                    ItemStack emptyStack = new ItemStack(ModItems.ICED_COFFEE_CUP);
                    if (!player.getInventory().insertStack(emptyStack)) {
                        player.dropItem(emptyStack, false);
                    }
                }
            }
        }
        return stack;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public SoundEvent getDrinkSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }
}
