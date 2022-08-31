package heliecp.roadchina.Block;

import heliecp.roadchina.Item.Wrench;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.block.GrassPathBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
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
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.gen.blockplacer.BlockPlacerType;


public class LineSlab extends Block
{
    public static final EnumProperty<SlabType> TYPE = SlabBlock.TYPE;
    protected static final VoxelShape BOTTOM_SHAPE;
    protected static final VoxelShape TOP_SHAPE;


    static {
        BOTTOM_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
        TOP_SHAPE = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    }

    public LineSlab()
    {
        super(Block.Properties.of(Material.STONE).harvestLevel(10));
        this.registerDefaultState(this.stateDefinition.any().setValue(BlockStateProperties.FACING, Direction.NORTH).setValue(TYPE, SlabType.BOTTOM).setValue(BlockStateProperties.WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext ctx) {
        assert ctx != null;
        BlockPos blockPos = ctx.getClickedPos();
        BlockState blockState = ctx.getLevel().getBlockState(blockPos);
        if (blockState.getBlock() == this) {
            return null;
        } else {
            FluidState fluidState = ctx.getLevel().getFluidState(blockPos);
            BlockState blockState2 = this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(BlockStateProperties.FACING, ctx.getHorizontalDirection().getOpposite()).setValue(BlockStateProperties.WATERLOGGED, fluidState.getType() == Fluids.WATER);
            Direction direction = ctx.getClickedFace();
            return direction != Direction.DOWN && (direction == Direction.UP || ctx.getClickLocation().y - (double) blockPos.getY() <= 0.5D) ? blockState2 : blockState2.setValue(TYPE, SlabType.TOP);
        }
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        assert state != null;
        return state.getValue(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        assert builder != null;
        builder.add(BlockStateProperties.FACING, BlockStateProperties.WATERLOGGED, TYPE);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(BlockStateProperties.WATERLOGGED)) {
            world.getLiquidTicks().scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return super.updateShape(state, facing, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean isPathfindable(BlockState world, IBlockReader view, BlockPos pos, PathType env) {
        if (env == PathType.WATER) {
            return view.getFluidState(pos).is(FluidTags.WATER);
        }
        return false;
    }

    @Override
    public VoxelShape getShape(BlockState blockState_1, IBlockReader blockView_1, BlockPos blockPos_1, ISelectionContext entityContext_1) {
        SlabType slabType = blockState_1.getValue(TYPE);
        switch (slabType) {
            case DOUBLE:
                return VoxelShapes.block();
            case TOP:
                return TOP_SHAPE;
            default:
                return BOTTOM_SHAPE;
        }
    }

    @Override
    public ActionResultType use(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult blockRayTraceResult)
    {
        if(worldIn.isClientSide)
        {
            return ActionResultType.SUCCESS;
        }

        if(playerIn.getMainHandItem().getItem() instanceof Wrench)
        {
            Direction direction = blockState.getValue(BlockStateProperties.FACING);
            worldIn.setBlockAndUpdate(pos, blockState.setValue(BlockStateProperties.FACING, direction.getClockWise()));
            return ActionResultType.SUCCESS;
        }

        return ActionResultType.CONSUME;
    }
}
