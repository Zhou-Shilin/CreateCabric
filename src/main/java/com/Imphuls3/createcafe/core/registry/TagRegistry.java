package com.Imphuls3.createcafe.core.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

import static com.Imphuls3.createcafe.CreateCafe.modPath;

public class TagRegistry {
    public static class Fluids {
        public static final TagKey<Fluid> TEA = createCafeTag("tea");
        
        private static TagKey<Fluid> createCafeTag(String name) {
            return TagKey.create(Registries.FLUID, modPath(name));
        }

        public static TagKey<Fluid> forgeTag(String name) {
            return TagKey.create(Registries.FLUID, modPath(name));
        }
    }

    public static class Blocks {
        private static TagKey<Block> createCafeTag(String name) {
            return TagKey.create(Registries.BLOCK, modPath(name));
        }

        public static TagKey<Block> forgeTag(String name) {
            return TagKey.create(Registries.BLOCK, modPath(name));
        }
    }

    public static class Items {
        private static TagKey<Item> createCafeTag(String name) {
            return TagKey.create(Registries.ITEM, modPath(name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return TagKey.create(Registries.ITEM, modPath(name));
        }
    }
}
