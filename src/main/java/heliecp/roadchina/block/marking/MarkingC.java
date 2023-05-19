package heliecp.roadchina.block.marking;

import heliecp.roadchina.item.Wrench;
import heliecp.roadchina.properties.BlockProperties;
import heliecp.roadchina.properties.BlockType;
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
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MarkingC extends Block
{
    public static final EnumProperty<BlockType> BLOCK_TYPE = BlockProperties.BLOCK_TYPE;
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public MarkingC()
    {
        super(Properties.of(Material.STONE).strength(1.5F).noOcclusion());
        this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(BLOCK_TYPE, BlockType.FULL_BLOCK);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState p_56390_, BlockGetter p_56391_, BlockPos p_56392_, CollisionContext p_56393_) {
        return Shapes.empty();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_56391_, BlockPos p_56392_, CollisionContext p_56393_) {
        switch (state.getValue(BLOCK_TYPE)) {
            case FULL_BLOCK:
                switch (state.getValue(FACING)) {
                    case SOUTH:
                    case NORTH:
                    default:
                        return Block.box(0.0D, 0.0D, -16.0D, 16.0D, 0.1D, 32.0D);
                    case EAST:
                    case WEST:
                        return Block.box(-16.0D, 0.0D, 0.0D, 32.0D, 0.1D, 16.0D);
                }
            case SLAB_BLOCK:
                switch (state.getValue(FACING)) {
                     case SOUTH:
                     case NORTH:
                     default:
                         return Block.box(0.0D, -8.0D, -16.0D, 16.0D, -7.9D, 32.0D);
                     case EAST:
                     case WEST:
                         return Block.box(-16.0D, -8.0D, 0.0D, 32.0D, -7.9D, 16.0D);
                }
            }
        return null;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx)
    {
        BlockPos pos = ctx.getClickedPos();
        BlockState blockState = ctx.getLevel().getBlockState(pos);
        if (!(blockState.getBlock() == this))
            return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite()).setValue(BLOCK_TYPE, BlockType.FULL_BLOCK);
        return null;
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

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, BLOCK_TYPE);
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
            worldIn.setBlockAndUpdate(pos, blockState.setValue(BlockStateProperties.FACING, direction.getClockWise()));
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.FAIL;
    }

}
