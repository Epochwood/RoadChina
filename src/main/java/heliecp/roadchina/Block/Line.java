package heliecp.roadchina.Block;

import heliecp.roadchina.Item.Wrench;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class Line extends Block
{

    public Line()
    {
        super(Block.Properties.of(Material.STONE).harvestLevel(10));
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext ctx) {
        return this.defaultBlockState().setValue(BlockStateProperties.FACING, ctx.getHorizontalDirection().getOpposite());
    }

    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        return p_185499_1_.setValue(BlockStateProperties.FACING, p_185499_2_.rotate(p_185499_1_.getValue(BlockStateProperties.FACING)));
    }

    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.rotate(p_185471_2_.getRotation(p_185471_1_.getValue(BlockStateProperties.FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING);
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
            worldIn.setBlockAndUpdate(pos, blockState.setValue(BlockStateProperties.FACING, direction.getOpposite()));
            return ActionResultType.SUCCESS;
        }

        return ActionResultType.FAIL;
    }
}
