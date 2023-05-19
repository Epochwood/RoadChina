package heliecp.roadchina.block;

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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class RoadSlab extends Block
{
    public RoadSlab()
    {
        super(Properties.of(Material.STONE).strength(1.5F));
    }

    @Override
    public VoxelShape getShape(BlockState p_56390_, BlockGetter p_56391_, BlockPos p_56392_, CollisionContext p_56393_) {
        return Block.box(0, 0, 0, 16, 8, 16);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_196258_1_) {
        BlockPos blockpos = p_196258_1_.getClickedPos();
        BlockState blockstate = p_196258_1_.getLevel().getBlockState(blockpos);
        GetBlock getBlock = new GetBlock();
        if (blockstate.is(this)) {
            return getBlock.getSlabToBlockForRoad(blockstate);
        }
        else
        {
            return this.defaultBlockState();
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

    @Override
    public InteractionResult use(BlockState blockState, Level worldIn, BlockPos pos, Player playerIn, InteractionHand handIn, BlockHitResult blockHitResult)
    {
        if(worldIn.isClientSide())
        {
            return InteractionResult.SUCCESS;
        }

        GetBlock getBlock = new GetBlock();

        return getBlock.getItemToBlock(worldIn, pos, playerIn);
    }

}
