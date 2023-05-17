package heliecp.roadchina.block.marking;

import heliecp.roadchina.item.Wrench;
import heliecp.roadchina.properties.BlockProperties;
import heliecp.roadchina.properties.BlockType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class MarkingG extends Block
{
    public static final EnumProperty<BlockType> BLOCK_TYPE = BlockProperties.BLOCK_TYPE;
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public MarkingG()
    {
        super(Properties.of(Material.STONE).strength(1.5F).noOcclusion());
        this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(BLOCK_TYPE, BlockType.FULL_BLOCK);
    }


    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context)
    {
        return VoxelShapes.empty();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader source, BlockPos pos, ISelectionContext iSelectionContext) {
            switch (state.getValue(BLOCK_TYPE)) {
                case FULL_BLOCK:
                    return Block.box(0.0D, 0.0D, 0.0D, 16.0D, 0.1D, 16.0D);
                case SLAB_BLOCK:
                    return Block.box(0.0D, -8.0D, 0.0D, 16.0D, -7.9D, 16.0D);
            }
        return null;
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext ctx) {
        BlockPos pos = ctx.getClickedPos();
        BlockState blockState = ctx.getLevel().getBlockState(pos);
        if (!(blockState.getBlock() == this))
            return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite()).setValue(BLOCK_TYPE, BlockType.FULL_BLOCK);
        return null;
    }

    @Override
    public boolean canBeReplaced(BlockState blockState, BlockItemUseContext context) {
        ItemStack itemstack = context.getItemInHand();
        if (itemstack.getItem() == this.asItem()) {
            if (context.replacingClickedOnBlock()) {
                boolean flag = context.getClickLocation().y - (double) context.getClickedPos().getY() > 0.5D;
                Direction direction = context.getClickedFace();
                return direction == Direction.UP || flag && direction.getAxis().isHorizontal();
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        if (p_185499_1_.getValue(BLOCK_TYPE) == BlockType.SLAB_BLOCK)
        {
            return p_185499_1_.setValue(FACING, p_185499_2_.rotate(p_185499_1_.getValue(FACING))).setValue(BLOCK_TYPE, BlockType.SLAB_BLOCK);
        }
        return p_185499_1_.setValue(FACING, p_185499_2_.rotate(p_185499_1_.getValue(FACING))).setValue(BLOCK_TYPE, BlockType.FULL_BLOCK);
    }

    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        if (p_185471_1_.getValue(BLOCK_TYPE) == BlockType.SLAB_BLOCK)
        {
            return p_185471_1_.rotate(p_185471_2_.getRotation(p_185471_1_.getValue(FACING))).setValue(BLOCK_TYPE, BlockType.SLAB_BLOCK);
        }
        return p_185471_1_.rotate(p_185471_2_.getRotation(p_185471_1_.getValue(FACING))).setValue(BLOCK_TYPE, BlockType.FULL_BLOCK);
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING, BLOCK_TYPE);
    }


    @Override
    public ActionResultType use(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult blockRayTraceResult)
    {
        if(worldIn.isClientSide)
        {
            return ActionResultType.SUCCESS;
        }


        if (playerIn.getMainHandItem().getItem() instanceof Wrench) {
            Direction direction = blockState.getValue(FACING);
            worldIn.setBlockAndUpdate(pos, blockState.setValue(FACING, direction.getClockWise()).setValue(BLOCK_TYPE, blockState.getValue(BLOCK_TYPE) == BlockType.FULL_BLOCK ? BlockType.FULL_BLOCK : BlockType.SLAB_BLOCK));
            return ActionResultType.SUCCESS;
        }

        return ActionResultType.FAIL;
    }
}
