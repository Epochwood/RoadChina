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
        Block whiteLine8Slab = BlockRegistry.whiteLine8Slab.get();
        Block whiteLine9aSlab = BlockRegistry.whiteLine9aSlab.get();
        Block whiteLine9bSlab = BlockRegistry.whiteLine9bSlab.get();
        Block whiteLine10aSlab = BlockRegistry.whiteLine10aSlab.get();
        Block whiteLine10bSlab = BlockRegistry.whiteLine10bSlab.get();
        Block whiteLine11aSlab = BlockRegistry.whiteLine11aSlab.get();
        Block whiteLine11bSlab = BlockRegistry.whiteLine11bSlab.get();
        Block whiteLine12aSlab = BlockRegistry.whiteLine12aSlab.get();
        Block whiteLine12bSlab = BlockRegistry.whiteLine12bSlab.get();

        BlockState whiteLine1 = BlockRegistry.whiteLine1.get().defaultBlockState();
        BlockState whiteLine2 = BlockRegistry.whiteLine2.get().defaultBlockState();
        BlockState whiteLine3 = BlockRegistry.whiteLine3.get().defaultBlockState();
        BlockState whiteLine4 = BlockRegistry.whiteLine4.get().defaultBlockState();
        BlockState whiteLine5 = BlockRegistry.whiteLine5.get().defaultBlockState();
        BlockState whiteLine6 = BlockRegistry.whiteLine6.get().defaultBlockState();
        BlockState whiteLine7 = BlockRegistry.whiteLine7.get().defaultBlockState();
        BlockState whiteLine8 = BlockRegistry.whiteLine8.get().defaultBlockState();
        BlockState whiteLine9a = BlockRegistry.whiteLine9a.get().defaultBlockState();
        BlockState whiteLine9b = BlockRegistry.whiteLine9b.get().defaultBlockState();
        BlockState whiteLine10a = BlockRegistry.whiteLine10a.get().defaultBlockState();
        BlockState whiteLine10b = BlockRegistry.whiteLine10b.get().defaultBlockState();
        BlockState whiteLine11a = BlockRegistry.whiteLine11a.get().defaultBlockState();
        BlockState whiteLine11b = BlockRegistry.whiteLine11b.get().defaultBlockState();
        BlockState whiteLine12a = BlockRegistry.whiteLine12a.get().defaultBlockState();
        BlockState whiteLine12b = BlockRegistry.whiteLine12b.get().defaultBlockState();

        if (blockstate.is(whiteLine1Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine1.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine1.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine1.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine1.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine2Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine2.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine2.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine2.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine2.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine3Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine3.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine3.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine3.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine3.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine4Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine4.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine4.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine4.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine4.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine5Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine5.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine5.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine5.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine5.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine6Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine6.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine6.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine6.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine6.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine7Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine7.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine7.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine7.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine7.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine8Slab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine8.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine8.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine8.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine8.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine9aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine9a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine9a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine9a.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine9a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine9bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine9b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine9b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine9b.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine9b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine10aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine10a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine10a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine10a.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine10a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine10bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine10b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine10b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine10b.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine10b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine11aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine11a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine11a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine11a.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine11a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine11bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine11b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine11b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine11b.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine11b.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine12aSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine12a.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine12a.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine12a.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine12a.setValue(FACING, Direction.EAST);
            }
        }
        if (blockstate.is(whiteLine12bSlab))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return whiteLine12b.setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return whiteLine12b.setValue(FACING, Direction.SOUTH);
                case WEST:
                    return whiteLine12b.setValue(FACING, Direction.WEST);
                case EAST:
                    return whiteLine12b.setValue(FACING, Direction.EAST);
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

