package com.Imphuls3.createcafe.common.block.custom;

import com.Imphuls3.createcafe.core.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class CoffeeBlock extends CropBlock {
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public CoffeeBlock(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, net.minecraft.block.ShapeContext context) {
        if(this.getAge(state) < 3) {
            return SHAPE_BY_AGE[state.get(this.getAgeProperty())];
        }
        return SHAPE_BY_AGE[3];
    }

    @Override
    protected int getGrowthAmount(World world) {
        return super.getGrowthAmount(world) / 3;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ItemRegistry.COFFEE_BEANS;
    }
}
