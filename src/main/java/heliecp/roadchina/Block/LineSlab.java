package heliecp.roadchina.Block;

import heliecp.roadchina.Item.ItemRegistry;
import heliecp.roadchina.Item.Wrench;
import heliecp.roadchina.Properties.BlockProperties;
import heliecp.roadchina.Properties.BlockType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LineSlab extends Block
{
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public LineSlab()
    {
        super(Properties.of(Material.STONE).strength(1.5F));
    }

    @Override
    public VoxelShape getShape(BlockState p_56390_, BlockGetter p_56391_, BlockPos p_56392_, CollisionContext p_56393_) {
        return Block.box(0, 0, 0, 16, 8, 16);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx)
    {
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
    public boolean canBeReplaced(BlockState blockState, BlockPlaceContext context) {
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

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public InteractionResult use(BlockState blockState, Level worldIn, BlockPos pos, Player playerIn, InteractionHand handIn, BlockHitResult blockHitResult)
    {
        if(worldIn.isClientSide())
        {
            return InteractionResult.SUCCESS;
        }

        if (playerIn.getMainHandItem().getItem() instanceof Wrench)
        {
            Direction direction = blockState.getValue(BlockStateProperties.FACING);
            worldIn.setBlockAndUpdate(pos, blockState.setValue(FACING, direction.getClockWise()));
        }

        GetBlock getBlock = new GetBlock();

        return getBlock.getItemToBlock(worldIn, pos, playerIn);
    }

}
