package heliecp.roadchina.Block;

import heliecp.roadchina.Item.Wrench;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;

public class Line extends Block
{

    public Line()
    {
        super(Block.Properties.of(Material.STONE).strength(1.5F));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx)
    {
        return this.defaultBlockState().setValue(BlockStateProperties.FACING, ctx.getHorizontalDirection().getOpposite());
    }

    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        return p_185499_1_.setValue(BlockStateProperties.FACING, p_185499_2_.rotate(p_185499_1_.getValue(BlockStateProperties.FACING)));
    }

    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.rotate(p_185471_2_.getRotation(p_185471_1_.getValue(BlockStateProperties.FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING);
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
        }

        return InteractionResult.FAIL;
    }

}
