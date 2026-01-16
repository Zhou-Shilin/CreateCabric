package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TagRegistry {
    public static class Fluids {
        public static final TagKey<Fluid> TEA = createCafeTag("tea");

        private static TagKey<Fluid> createCafeTag(String name) {
            return TagKey.of(Registry.FLUID_KEY, new Identifier(CreateCafe.ID, name));
        }

        public static TagKey<Fluid> commonTag(String name) {
            return TagKey.of(Registry.FLUID_KEY, new Identifier("c", name));
        }
    }

    public static class Blocks {
        private static TagKey<Block> createCafeTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(CreateCafe.ID, name));
        }

        public static TagKey<Block> commonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items {
        private static TagKey<Item> createCafeTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(CreateCafe.ID, name));
        }

        private static TagKey<Item> commonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
