package heliecp.roadchina.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
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

public class RoadSlab extends Block
{
    public RoadSlab() {
        super(Block.Properties.of(Material.STONE).strength(1.5F));
    }

    @Override
    public VoxelShape getShape(BlockState blockState_1, IBlockReader blockView_1, BlockPos blockPos_1, ISelectionContext entityContext_1) {
        return Block.box(0, 0, 0, 16, 8, 16);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        BlockPos blockpos = p_196258_1_.getClickedPos();
        BlockState blockstate = p_196258_1_.getLevel().getBlockState(blockpos);
        GetBlock getBlock = new GetBlock();
        if (blockstate.is(this))
        {
            return getBlock.getSlabToBlockForRoad(blockstate);
        }
        else
        {
            return this.defaultBlockState();
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

    @Override
    public ActionResultType use(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult blockRayTraceResult) {

        if (worldIn.isClientSide)
        {
            return ActionResultType.SUCCESS;
        }

        GetBlock getBlock = new GetBlock();

        return getBlock.getItemToBlock(worldIn, pos, playerIn);

    }
}
