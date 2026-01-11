package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.core.Direction;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FluidRegistry {
    public static final ResourceLocation STILL_TEXTURE = new ResourceLocation(CreateCafe.ID, "block/milk_tea_still");
    public static final ResourceLocation FLOWING_TEXTURE = new ResourceLocation(CreateCafe.ID, "block/milk_tea_flow");

    private static final List<FluidEntry> ENTRIES = new ArrayList<>();

    public static final FluidEntry MELTED_SUGAR = register("melted_sugar", 0xc8fff7e0);
    public static final FluidEntry FILLING = register("filling", 0xc8ededed);
    public static final FluidEntry OREO_TEA = register("oreo_tea", 0xc8dedad3);
    public static final FluidEntry MANGO_TEA = register("mango_tea", 0xc8fcc03d);
    public static final FluidEntry LIME_TEA = register("lime_tea", 0xc8b3ff26);
    public static final FluidEntry LYCHEE_TEA = register("lychee_tea", 0xc8ff9a96);
    public static final FluidEntry KIWI_TEA = register("kiwi_tea", 0xc894fc90);
    public static final FluidEntry MANA_TEA = register("mana_tea", 0xc817e4ff);
    public static final FluidEntry BLOOD_TEA = register("blood_tea", 0xc8fc3003);
    public static final FluidEntry LEMON_TEA = register("lemon_tea", 0xc8ffe645);
    public static final FluidEntry WATERMELON_TEA = register("watermelon_tea", 0xc8b83b56);
    public static final FluidEntry STRAWBERRY_TEA = register("strawberry_tea", 0xc8ffa6b8);
    public static final FluidEntry BLUEBERRY_TEA = register("blueberry_tea", 0xc89f8cff);
    public static final FluidEntry VANILLA_TEA = register("vanilla_tea", 0xc8ede6d8);
    public static final FluidEntry ORANGE_TEA = register("orange_tea", 0xc8de9c33);
    public static final FluidEntry PEACH_TEA = register("peach_tea", 0xc8edc29f);
    public static final FluidEntry PINEAPPLE_TEA = register("pineapple_tea", 0xc8ffd752);
    public static final FluidEntry BANANA_TEA = register("banana_tea", 0xc8ffe79e);
    public static final FluidEntry YUCCA_TEA = register("yucca_tea", 0xc8c8f25e);
    public static final FluidEntry CHERRY_TEA = register("cherry_tea", 0xc8c7445e);
    public static final FluidEntry PLUM_TEA = register("plum_tea", 0xc8ffb8f5);
    public static final FluidEntry ALOE_TEA = register("aloe_tea", 0xc898de52);
    public static final FluidEntry APPLE_TEA = register("apple_tea", 0xc8fceb77);
    public static final FluidEntry BLACKBERRY_TEA = register("blackberry_tea", 0xc8875284);
    public static final FluidEntry PUMPKIN_TEA = register("pumpkin_tea", 0xc8f7e0ad);
    public static final FluidEntry JACKFRUIT_TEA = register("jackfruit_tea", 0xc8f5cc71);
    public static final FluidEntry COCONUT_TEA = register("coconut_tea", 0xc8fcf9e3);
    public static final FluidEntry DRAGONFRUIT_TEA = register("dragonfruit_tea", 0xc8ff1f8f);
    public static final FluidEntry APRICOT_TEA = register("apricot_tea", 0xc8ffcb94);
    public static final FluidEntry AVOCADO_TEA = register("avocado_tea", 0xc896b366);
    public static final FluidEntry SWEETBERRY_TEA = register("sweetberry_tea", 0xc8db2e48);
    public static final FluidEntry DURIAN_TEA = register("durian_tea", 0xc8F4C672);
    public static final FluidEntry FIG_TEA = register("fig_tea", 0xc8773C65);
    public static final FluidEntry TAMARIND_TEA = register("tamarind_tea", 0xc8FFBD7F);
    public static final FluidEntry GOOSEBERRY_TEA = register("gooseberry_tea", 0xc8FCD946);
    public static final FluidEntry GRAPE_TEA = register("grape_tea", 0xc8EA77C8);
    public static final FluidEntry GRAPEFRUIT_TEA = register("grapefruit_tea", 0xc8FF8060);
    public static final FluidEntry PAPAYA_TEA = register("papaya_tea", 0xc8FFB163);
    public static final FluidEntry GUAVA_TEA = register("guava_tea", 0xc8FF835B);
    public static final FluidEntry PASSIONFRUIT_TEA = register("passionfruit_tea", 0xc8FECC35);
    public static final FluidEntry POMEGRANATE_TEA = register("pomegranate_tea", 0xc8BA485B);
    public static final FluidEntry PERSIMMON_TEA = register("persimmon_tea", 0xc8E89166);
    public static final FluidEntry RASPBERRY_TEA = register("raspberry_tea", 0xc8FF7D7D);
    public static final FluidEntry STARFRUIT_TEA = register("starfruit_tea", 0xc8FFDA65);
    public static final FluidEntry LAVENDER_TEA = register("lavender_tea", 0xc8deaef2);
    public static final FluidEntry POMELO_TEA = register("pomelo_tea", 0xc8FF6F4C);
    public static final FluidEntry MANDARIN_TEA = register("mandarin_tea", 0xc8FFC216);
    public static final FluidEntry CITRON_TEA = register("citron_tea", 0xc8FFC300);
    public static final FluidEntry REDLOVE_TEA = register("redlove_tea", 0xc8E24F63);
    public static final FluidEntry BARBERRY_TEA = register("barberry_tea", 0xc8a1153c);
    public static final FluidEntry COFFEE = register("coffee", 0xc8482713);
    public static final FluidEntry STRAWBERRY_SYRUP = register("strawberry_syrup", new Color(196, 59, 98, 199).getRGB());
    public static final FluidEntry VANILLA_SYRUP = register("vanilla_syrup", new Color(255, 235, 220, 199).getRGB());
    public static final FluidEntry RASPBERRY_SYRUP = register("raspberry_syrup", new Color(255, 25, 200, 199).getRGB());
    public static final FluidEntry MINT_SYRUP = register("mint_syrup", new Color(129, 255, 192, 199).getRGB());
    public static final FluidEntry CARAMEL_SYRUP = register("caramel_syrup", new Color(217, 144, 0, 199).getRGB());
    public static final FluidEntry COCONUT_SYRUP = register("coconut_syrup", new Color(255, 235, 192, 199).getRGB());
    public static final FluidEntry BANANA_SYRUP = register("banana_syrup", new Color(255, 217, 0, 199).getRGB());

    private static FluidEntry register(String name, int tintColor) {
        FluidEntry entry = new FluidEntry(name, tintColor);
        ENTRIES.add(entry);
        return entry;
    }

    public static List<Item> getBucketItems() {
        List<Item> buckets = new ArrayList<>();
        for (FluidEntry entry : ENTRIES) {
            buckets.add(entry.bucket());
        }
        return Collections.unmodifiableList(buckets);
    }

    public static void register() {
        // Intentionally empty; static init handles registration.
    }

    public static List<FluidEntry> getEntries() {
        return Collections.unmodifiableList(ENTRIES);
    }

    public record FluidEntry(String name, FlowingFluid still, FlowingFluid flowing, Block block, Item bucket, int tintColor) {
        private FluidEntry(String name, int tintColor) {
            this(
                    name,
                    registerStill(name),
                    registerFlowing(name),
                    registerBlock(name),
                    registerBucket(name),
                    tintColor
            );
        }
    }

    private static final class FluidRefs {
        private static final java.util.Map<String, FlowingFluid> STILL = new java.util.HashMap<>();
        private static final java.util.Map<String, FlowingFluid> FLOWING = new java.util.HashMap<>();
        private static final java.util.Map<String, Block> BLOCKS = new java.util.HashMap<>();
        private static final java.util.Map<String, Item> BUCKETS = new java.util.HashMap<>();
    }

    private static FlowingFluid registerStill(String name) {
        FlowingFluid fluid = new CafeFluid.Source(name);
        FlowingFluid registered = Registry.register(BuiltInRegistries.FLUID, CreateCafe.id(name), fluid);
        FluidRefs.STILL.put(name, registered);
        return registered;
    }

    private static FlowingFluid registerFlowing(String name) {
        FlowingFluid fluid = new CafeFluid.Flowing(name);
        FlowingFluid registered = Registry.register(BuiltInRegistries.FLUID, CreateCafe.id(name + "_flowing"), fluid);
        FluidRefs.FLOWING.put(name, registered);
        return registered;
    }

    private static Block registerBlock(String name) {
        Block block = new LiquidBlock(FluidRefs.STILL.get(name), BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable());
        Block registered = Registry.register(BuiltInRegistries.BLOCK, CreateCafe.id(name + "_block"), block);
        FluidRefs.BLOCKS.put(name, registered);
        return registered;
    }

    private static Item registerBucket(String name) {
        Item bucket = new BucketItem(FluidRefs.STILL.get(name), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1));
        Item registered = Registry.register(BuiltInRegistries.ITEM, CreateCafe.id(name + "_bucket"), bucket);
        FluidRefs.BUCKETS.put(name, registered);
        return registered;
    }

    public abstract static class CafeFluid extends FlowingFluid {
        private final String name;

        protected CafeFluid(String name) {
            this.name = name;
        }

        @Override
        public Fluid getFlowing() {
            return FluidRefs.FLOWING.get(name);
        }

        @Override
        public Fluid getSource() {
            return FluidRefs.STILL.get(name);
        }

        @Override
        public Item getBucket() {
            return FluidRefs.BUCKETS.get(name);
        }

        @Override
        protected BlockState createLegacyBlock(FluidState state) {
            return FluidRefs.BLOCKS.get(name).defaultBlockState().setValue(LiquidBlock.LEVEL, getLegacyLevel(state));
        }

        @Override
        public boolean isSame(Fluid fluid) {
            return fluid == FluidRefs.STILL.get(name) || fluid == FluidRefs.FLOWING.get(name);
        }

        @Override
        public int getDropOff(LevelReader level) {
            return 1;
        }

        @Override
        public int getTickDelay(LevelReader level) {
            return 15;
        }

        @Override
        public int getSlopeFindDistance(LevelReader level) {
            return 6;
        }

        @Override
        public float getExplosionResistance() {
            return 100F;
        }

        @Override
        protected boolean canConvertToSource(Level level) {
            return false;
        }

        @Override
        protected boolean canBeReplacedWith(FluidState state, BlockGetter level, BlockPos pos, Fluid fluid, Direction direction) {
            return direction == Direction.DOWN && !fluid.isSame(this);
        }

        @Override
        protected void beforeDestroyingBlock(LevelAccessor level, BlockPos pos, BlockState state) {
            BlockEntity blockEntity = state.hasBlockEntity() ? level.getBlockEntity(pos) : null;
            Block.dropResources(state, level, pos, blockEntity);
        }

        public static class Flowing extends CafeFluid {
            public Flowing(String name) {
                super(name);
            }

            @Override
            protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
                super.createFluidStateDefinition(builder);
                builder.add(LEVEL);
            }

            @Override
            public int getAmount(FluidState state) {
                return state.getValue(LEVEL);
            }

            @Override
            public boolean isSource(FluidState state) {
                return false;
            }
        }

        public static class Source extends CafeFluid {
            public Source(String name) {
                super(name);
            }

            @Override
            public int getAmount(FluidState state) {
                return 8;
            }

            @Override
            public boolean isSource(FluidState state) {
                return true;
            }
        }
    }
}
