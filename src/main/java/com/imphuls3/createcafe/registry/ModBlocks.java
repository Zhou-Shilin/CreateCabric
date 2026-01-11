package com.imphuls3.createcafe.registry;

import com.imphuls3.createcafe.CreateCafe;
import com.imphuls3.createcafe.common.block.CassavaBlock;
import com.imphuls3.createcafe.common.block.CoffeeBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks {
    // Crops
    public static final Block COFFEE_CROP = new CoffeeBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT).nonOpaque());

    public static final Block CASSAVA_CROP = new CassavaBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT).nonOpaque());

    public static void register() {
        Registry.register(Registries.BLOCK, CreateCafe.id("coffee_crop"), COFFEE_CROP);
        Registry.register(Registries.BLOCK, CreateCafe.id("cassava_crop"), CASSAVA_CROP);
        // Note: Block items for crops are registered through ModItems
    }
}
