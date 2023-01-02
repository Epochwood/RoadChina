package heliecp.roadchina.Block;

import heliecp.roadchina.Item.ItemRegistry;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class RoadSlab extends SlabBlock
{

    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public RoadSlab() {
        super(Block.Properties.of(Material.STONE).harvestLevel(10));
    }

    @Override
    public VoxelShape getShape(BlockState blockState_1, IBlockReader blockView_1, BlockPos blockPos_1, ISelectionContext entityContext_1) {
        return Block.box(0, 0, 0, 16, 8, 16);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        BlockPos blockpos = p_196258_1_.getClickedPos();
        BlockState blockstate = p_196258_1_.getLevel().getBlockState(blockpos);
        if (blockstate.is(this)) {
            return BlockRegistry.asphaltRoad.get().defaultBlockState();
        }
        else
        {
            FluidState fluidState = p_196258_1_.getLevel().getFluidState(blockpos);
            BlockState blockState2 = this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
            return blockState2;
        }
    }

    @Override
    public ActionResultType use(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult blockRayTraceResult) {
        if (worldIn.isClientSide)
        {
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
