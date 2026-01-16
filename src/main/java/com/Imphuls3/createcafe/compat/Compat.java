package com.Imphuls3.createcafe.compat;

import com.Imphuls3.createcafe.core.registry.ModItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;

public class Compat {
    public static boolean FRUITTREESLOADED;
    public static boolean CROPTOPIALOADED;
    public static boolean PH2TREESLOADED;
    public static boolean PH2CROPSSLOADED;
    public static boolean POWDERRELOADED;
    public static boolean BLOODMAGICLOADED;
    public static boolean BOTANIALOADED;
    public static boolean BYGLOADED;
    public static boolean BOPLOADED;
    public static boolean NEAPOLITANLOADED;
    public static boolean CULTURALDELIGHTSLOADED;

    public static void init() {
        FRUITTREESLOADED = FabricLoader.getInstance().isModLoaded("fruittrees");
        CROPTOPIALOADED = FabricLoader.getInstance().isModLoaded("croptopia");
        PH2TREESLOADED = FabricLoader.getInstance().isModLoaded("pamhc2trees");
        PH2CROPSSLOADED = FabricLoader.getInstance().isModLoaded("pamhc2crops");
        POWDERRELOADED = FabricLoader.getInstance().isModLoaded("powder_and_more_remastered");
        BLOODMAGICLOADED = FabricLoader.getInstance().isModLoaded("bloodmagic");
        BOTANIALOADED = FabricLoader.getInstance().isModLoaded("botania");
        BYGLOADED = FabricLoader.getInstance().isModLoaded("byg");
        BOPLOADED = FabricLoader.getInstance().isModLoaded("biomesoplenty");
        NEAPOLITANLOADED = FabricLoader.getInstance().isModLoaded("neapolitan");
        CULTURALDELIGHTSLOADED = FabricLoader.getInstance().isModLoaded("culturaldelights");
    }

    public static class Loaded {
        public static Item.Settings makeDrink() {
            return new Item.Settings().group(ModItemGroup.CREATE_CAFE);
        }
    }
}
