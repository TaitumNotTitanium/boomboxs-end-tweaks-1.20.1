package net.boombox.bbxendtweaks.Block.custom;

import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class BuddingEndziteBlock extends BuddingAmethystBlock {

    public static final int GROW_CHANCE = 20;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingEndziteBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(50) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);
            Block block = null;
            if (canGrowIn(blockState)) {
                block = ModBlocks.SMALL_ENDZITE_BUD;
            } else if (blockState.isOf(ModBlocks.SMALL_ENDZITE_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.MEDIUM_ENDZITE_BUD;
            } else if (blockState.isOf(ModBlocks.MEDIUM_ENDZITE_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.LARGE_ENDZITE_BUD;
            } else if (blockState.isOf(ModBlocks.LARGE_ENDZITE_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.ENDZITE_CLUSTER;
            }

            if (block != null) {
                BlockState blockState2 = block.getDefaultState()
                        .with(AmethystClusterBlock.FACING, direction)
                        .with(AmethystClusterBlock.WATERLOGGED, Boolean.valueOf(blockState.getFluidState().getFluid() == Fluids.WATER));
                world.setBlockState(blockPos, blockState2);
            }
        }
    }
}
