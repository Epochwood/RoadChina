package heliecp.roadchina.block;

import heliecp.roadchina.item.Wrench;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;


public class LineSlab extends Block
{
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public LineSlab() {

        super(Block.Properties.of(Material.STONE).strength(1.5F));
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, IBlockReader blockReader, BlockPos pos, ISelectionContext context) {
        return Block.box(0, 0, 0, 16, 8, 16);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext ctx) {
        BlockPos blockpos = ctx.getClickedPos();
        BlockState blockstate = ctx.getLevel().getBlockState(blockpos);

        GetBlock getBlock = new GetBlock();

        if (blockstate.is(this))
        {
            return getBlock.getSlabToBlock(blockstate);
        }
        else
        {
            return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
        }
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
        return p_185499_1_.setValue(FACING, p_185499_2_.rotate(p_185499_1_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.rotate(p_185471_2_.getRotation(p_185471_1_.getValue(FACING)));
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

        GetBlock getBlock = new GetBlock();

        return getBlock.getItemToBlock(worldIn, pos, playerIn);

    }

}
