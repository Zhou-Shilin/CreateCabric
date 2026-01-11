package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.block.CassavaBlock;
import com.Imphuls3.createcafe.common.block.CoffeeBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockRegistry {
    public static final Block COFFEE = register("coffee_crop",
            new CoffeeBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final Block CASSAVA = register("cassava_crop",
            new CassavaBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    private static Block register(String name, Block block) {
        return net.minecraft.core.Registry.register(BuiltInRegistries.BLOCK, CreateCafe.id(name), block);
    }

    public static void register() {
        // Intentionally empty; static init handles registration.
    }
}
