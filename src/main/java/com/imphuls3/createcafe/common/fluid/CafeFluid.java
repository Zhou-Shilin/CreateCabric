package com.imphuls3.createcafe.common.fluid;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.function.Supplier;

/**
 * Base class for Create Cafe fluids (teas, syrups, etc.)
 * These are simple, non-placeable fluids used in Create's fluid processing.
 */
public abstract class CafeFluid extends FlowableFluid {
    
    private final Supplier<Item> bucketItem;
    
    public CafeFluid(Supplier<Item> bucketItem) {
        this.bucketItem = bucketItem;
    }
    
    @Override
    public Fluid getFlowing() {
        return this;
    }

    @Override
    public Fluid getStill() {
        return this;
    }

    @Override
    protected boolean isInfinite(World world) {
        return false;
    }

    @Override
    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
        // No special behavior needed
    }

    @Override
    protected int getFlowSpeed(WorldView world) {
        return 4;
    }

    @Override
    protected int getLevelDecreasePerBlock(WorldView world) {
        return 1;
    }

    @Override
    public Item getBucketItem() {
        Item item = bucketItem.get();
        return item != null ? item : Items.AIR;
    }

    @Override
    protected boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
        return false;
    }

    @Override
    public int getTickRate(WorldView world) {
        return 5;
    }

    @Override
    protected float getBlastResistance() {
        return 100.0F;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        // These fluids are not placeable in the world, return air
        return Blocks.AIR.getDefaultState();
    }

    @Override
    public boolean isStill(FluidState state) {
        return true;
    }

    @Override
    public int getLevel(FluidState state) {
        return 8;
    }

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == getStill() || fluid == getFlowing();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
        // No additional properties needed for these simple fluids
    }
}
