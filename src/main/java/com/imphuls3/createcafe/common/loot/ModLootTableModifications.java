package com.imphuls3.createcafe.common.loot;

import com.imphuls3.createcafe.registry.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.InvertedLootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.Identifier;

public class ModLootTableModifications {
    // Grass block loot table identifier - short grass is minecraft:short_grass in 1.20+
    private static final Identifier SHORT_GRASS_LOOT_TABLE = new Identifier("minecraft", "blocks/short_grass");
    private static final Identifier TALL_GRASS_LOOT_TABLE = new Identifier("minecraft", "blocks/tall_grass");

    public static void register() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            // Only modify the grass loot tables
            if (SHORT_GRASS_LOOT_TABLE.equals(id) || TALL_GRASS_LOOT_TABLE.equals(id)) {
                // Add cassava seeds with 10% chance when not using shears
                LootPool.Builder cassavaPool = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.1f))
                    .conditionally(InvertedLootCondition.builder(
                        MatchToolLootCondition.builder(
                            ItemPredicate.Builder.create().items(Items.SHEARS)
                        )
                    ))
                    .with(ItemEntry.builder(ModItems.CASSAVA_SEEDS));

                // Add coffee beans with 10% chance when not using shears
                LootPool.Builder coffeePool = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.1f))
                    .conditionally(InvertedLootCondition.builder(
                        MatchToolLootCondition.builder(
                            ItemPredicate.Builder.create().items(Items.SHEARS)
                        )
                    ))
                    .with(ItemEntry.builder(ModItems.COFFEE_BEANS));

                tableBuilder.pool(cassavaPool);
                tableBuilder.pool(coffeePool);
            }
        });
    }
}
