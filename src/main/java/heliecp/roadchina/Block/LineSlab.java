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

        Block whiteLine1Slab = BlockRegistry.whiteLine1Slab.get();
        Block whiteLine2Slab = BlockRegistry.whiteLine2Slab.get();
        Block whiteLine3Slab = BlockRegistry.whiteLine3Slab.get();
        Block whiteLine4Slab = BlockRegistry.whiteLine4Slab.get();
        Block whiteLine5Slab = BlockRegistry.whiteLine5Slab.get();
        Block whiteLine6Slab = BlockRegistry.whiteLine6Slab.get();
        Block whiteLine7Slab = BlockRegistry.whiteLine7Slab.get();

        World worldIn = ctx.getLevel();

        if (blockstate.is(whiteLine1Slab))
        {
            if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.NORTH) {
                return BlockRegistry.whiteLine1.get().defaultBlockState().setValue(FACING, Direction.NORTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.SOUTH) {
                return BlockRegistry.whiteLine1.get().defaultBlockState().setValue(FACING, Direction.SOUTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.EAST) {
                return BlockRegistry.whiteLine1.get().defaultBlockState().setValue(FACING, Direction.EAST);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.WEST) {
                return BlockRegistry.whiteLine1.get().defaultBlockState().setValue(FACING, Direction.WEST);
            }
        }
        else if (blockstate.is(whiteLine2Slab))
        {
            if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.NORTH) {
                return BlockRegistry.whiteLine2.get().defaultBlockState().setValue(FACING, Direction.NORTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.SOUTH) {
                return BlockRegistry.whiteLine2.get().defaultBlockState().setValue(FACING, Direction.SOUTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.EAST) {
                return BlockRegistry.whiteLine2.get().defaultBlockState().setValue(FACING, Direction.EAST);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.WEST) {
                return BlockRegistry.whiteLine2.get().defaultBlockState().setValue(FACING, Direction.WEST);
            }
        }
        else if (blockstate.is(whiteLine3Slab))
        {
            if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.NORTH) {
                return BlockRegistry.whiteLine3.get().defaultBlockState().setValue(FACING, Direction.NORTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.SOUTH) {
                return BlockRegistry.whiteLine3.get().defaultBlockState().setValue(FACING, Direction.SOUTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.EAST) {
                return BlockRegistry.whiteLine3.get().defaultBlockState().setValue(FACING, Direction.EAST);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.WEST) {
                return BlockRegistry.whiteLine3.get().defaultBlockState().setValue(FACING, Direction.WEST);
            }
        }
        else if (blockstate.is(whiteLine4Slab))
        {
            if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.NORTH) {
                return BlockRegistry.whiteLine4.get().defaultBlockState().setValue(FACING, Direction.NORTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.SOUTH) {
                return BlockRegistry.whiteLine4.get().defaultBlockState().setValue(FACING, Direction.SOUTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.EAST) {
                return BlockRegistry.whiteLine4.get().defaultBlockState().setValue(FACING, Direction.EAST);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.WEST) {
                return BlockRegistry.whiteLine4.get().defaultBlockState().setValue(FACING, Direction.WEST);
            }
        }
        else if (blockstate.is(whiteLine5Slab))
        {
            if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.NORTH) {
                return BlockRegistry.whiteLine5.get().defaultBlockState().setValue(FACING, Direction.NORTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.SOUTH) {
                return BlockRegistry.whiteLine5.get().defaultBlockState().setValue(FACING, Direction.SOUTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.EAST) {
                return BlockRegistry.whiteLine5.get().defaultBlockState().setValue(FACING, Direction.EAST);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.WEST) {
                return BlockRegistry.whiteLine5.get().defaultBlockState().setValue(FACING, Direction.WEST);
            }
        }
        else if (blockstate.is(whiteLine6Slab))
        {
            if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.NORTH) {
                return BlockRegistry.whiteLine6.get().defaultBlockState().setValue(FACING, Direction.NORTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.SOUTH) {
                return BlockRegistry.whiteLine6.get().defaultBlockState().setValue(FACING, Direction.SOUTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.EAST) {
                return BlockRegistry.whiteLine6.get().defaultBlockState().setValue(FACING, Direction.EAST);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.WEST) {
                return BlockRegistry.whiteLine6.get().defaultBlockState().setValue(FACING, Direction.WEST);
            }
        }
        else if (blockstate.is(whiteLine7Slab))
        {
            if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.NORTH) {
                return BlockRegistry.whiteLine7.get().defaultBlockState().setValue(FACING, Direction.NORTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.SOUTH) {
                return BlockRegistry.whiteLine7.get().defaultBlockState().setValue(FACING, Direction.SOUTH);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.EAST) {
                return BlockRegistry.whiteLine7.get().defaultBlockState().setValue(FACING, Direction.EAST);
            }
            else if (worldIn.getBlockState(blockpos).getValue(FACING) == Direction.WEST) {
                return BlockRegistry.whiteLine7.get().defaultBlockState().setValue(FACING, Direction.WEST);
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
            worldIn.setBlockAndUpdate(pos, blockState.setValue(FACING, direction.getOpposite()));
            return ActionResultType.SUCCESS;
        }

        Item whiteArrow1 = ItemRegistry.whiteArrow1.get();
        Block whiteArrow1Slab = BlockRegistry.whiteArrow1Slab.get();

        if (playerIn.getMainHandItem().getItem() == whiteArrow1)
        {
            Direction direction = playerIn.getDirection();
            worldIn.setBlockAndUpdate(pos.above(), whiteArrow1Slab.defaultBlockState().setValue(FACING, direction.getOpposite()));
            return ActionResultType.SUCCESS;
        }

        return ActionResultType.FAIL;
    }

}

