package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.block.custom.CassavaBlock;
import com.Imphuls3.createcafe.common.block.custom.CoffeeBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    //Crops:
    public static final Block COFFEE = new CoffeeBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque());
    public static final Block CASSAVA = new CassavaBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque());

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(CreateCafe.MOD_ID, "coffee_crop"), COFFEE);
        Registry.register(Registry.BLOCK, new Identifier(CreateCafe.MOD_ID, "cassava_crop"), CASSAVA);
    }
}
