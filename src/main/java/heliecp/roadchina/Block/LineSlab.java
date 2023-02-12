package heliecp.roadchina.Block;

import heliecp.roadchina.Item.ItemRegistry;
import heliecp.roadchina.Item.Wrench;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;


public class LineSlab extends Block implements IWaterLoggable
{

    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    protected static final VoxelShape SLAB_BOTTOM = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    public LineSlab() {

        super(Block.Properties.of(Material.STONE).harvestLevel(10));
        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState blockState) {
        return blockState.getValue(TYPE) != SlabType.DOUBLE;
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, FACING);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, IBlockReader blockReader, BlockPos pos, ISelectionContext context) {
        SlabType slabtype = blockState.getValue(TYPE);
        switch(slabtype) {
            default:
                return SLAB_BOTTOM;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext ctx) {
        BlockPos blockpos = ctx.getClickedPos();
        BlockState blockstate = ctx.getLevel().getBlockState(blockpos);

        GetBlock getBlock = new GetBlock();

        if (blockstate.is(getBlock.whiteLine1Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine1.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine1.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine1.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine1.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine2Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine2.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine2.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine2.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine2.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine3Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine3.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine3.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine3.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine3.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine4Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine4.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine4.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine4.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine4.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine5Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine5.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine5.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine5.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine5.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine6Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine6.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine6.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine6.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine6.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine7Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine7.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine7.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine7.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine7.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine8Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine8.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine8.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine8.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine8.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine9aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine9a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine9a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine9a.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine9a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine9bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine9b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine9b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine9b.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine9b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine10aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine10a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine10a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine10a.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine10a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine10bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine10b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine10b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine10b.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine10b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine11aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine11a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine11a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine11a.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine11a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine11bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine11b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine11b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine11b.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine11b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine12aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine12a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine12a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine12a.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine12a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine12bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine12b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine12b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine12b.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine12b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine13Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine13.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine13.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine13.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine13.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine14Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine14.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine14.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine14.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine14.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine15Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine15.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine15.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine15.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine15.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine16aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine16a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine16a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine16a.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine16a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine16bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine16b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine16b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine16b.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine16b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine17aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine17a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine17a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine17a.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine17a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine17bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine17b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine17b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine17b.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine17b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine18aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine18a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine18a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine18a.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine18a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine18bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine18b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine18b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine18b.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine18b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine19aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine19a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine19a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine19a.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine19a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine19bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine19b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine19b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine19b.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine19b.setValue(FACING, Direction.EAST);
              }
        }
        if (blockstate.is(getBlock.whiteLine20aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine20a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine20a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine20a.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine20a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine20bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine20b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine20b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine20b.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine20b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine21aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine21a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine21a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine21a.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine21a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine21bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine21b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine21b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine21b.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine21b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine22aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine22a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine22a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine22a.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine22a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(getBlock.whiteLine22bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getBlock.whiteLine22b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getBlock.whiteLine22b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getBlock.whiteLine22b.setValue(FACING, Direction.WEST);
                case EAST:
                    return getBlock.whiteLine22b.setValue(FACING, Direction.EAST);
            }
        }
        else
        {
            FluidState fluidState = ctx.getLevel().getFluidState(blockpos);
            BlockState blockState2 = this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(FACING, ctx.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
            return blockState2;
        }
        return blockstate;
    }

    @Override
    public boolean canBeReplaced(BlockState blockState, BlockItemUseContext context) {
        ItemStack itemstack = context.getItemInHand();
        SlabType slabtype = blockState.getValue(TYPE);
        if (slabtype != SlabType.DOUBLE && itemstack.getItem() == this.asItem()) {
            if (context.replacingClickedOnBlock()) {
                boolean flag = context.getClickLocation().y - (double) context.getClickedPos().getY() > 0.5D;
                Direction direction = context.getClickedFace();
                if (slabtype == SlabType.BOTTOM) {
                    return direction == Direction.UP || flag && direction.getAxis().isHorizontal();
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
        return false;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            world.getLiquidTicks().scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }

        return super.updateShape(state, facing, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean isPathfindable(BlockState world, IBlockReader view, BlockPos pos, PathType env) {
        switch(env) {
            case WATER:
                return view.getFluidState(pos).is(FluidTags.WATER);
            case LAND:
            case AIR:
            default:
                return false;
        }
    }

    @Override
    public ActionResultType use(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult blockRayTraceResult) {
        if (worldIn.isClientSide)
        {
            return ActionResultType.SUCCESS;
        }

        if (playerIn.getMainHandItem().getItem() instanceof Wrench) {
            Direction direction = blockState.getValue(FACING);
            worldIn.setBlockAndUpdate(pos, blockState.setValue(FACING, direction.getClockWise()));
            return ActionResultType.SUCCESS;
        }

        Item whiteArrow1 = ItemRegistry.whiteArrow1.get();
        Block whiteArrow1Slab = BlockRegistry.whiteArrow1Slab.get();

       if (playerIn.getMainHandItem().getItem() == whiteArrow1)
       {
           Direction direction = playerIn.getDirection();
           worldIn.setBlockAndUpdate(pos.above(), whiteArrow1Slab.defaultBlockState().setValue(FACING, direction.getClockWise()));
           return ActionResultType.SUCCESS;
       }

        return ActionResultType.FAIL;
    }

}

