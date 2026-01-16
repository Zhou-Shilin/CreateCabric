package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CREATE_CAFE = FabricItemGroupBuilder.build(
            new Identifier(CreateCafe.MOD_ID, "createcafe_tab"),
            () -> new ItemStack(ItemRegistry.STRAWBERRY_TEA)
    );
}
