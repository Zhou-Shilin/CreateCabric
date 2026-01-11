package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.block.CassavaBlock;
import com.Imphuls3.createcafe.common.block.CoffeeBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockRegistry {
    //Crops:
    public static final Block COFFEE = new CoffeeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion());
    public static final Block CASSAVA = new CassavaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion());

    public static void register() {
        Registry.register(BuiltInRegistries.BLOCK, CreateCafe.modPath("coffee_crop"), COFFEE);
        Registry.register(BuiltInRegistries.BLOCK, CreateCafe.modPath("cassava_crop"), CASSAVA);
    }
}
