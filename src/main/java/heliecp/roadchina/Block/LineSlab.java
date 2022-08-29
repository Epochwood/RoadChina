package heliecp.roadchina.Block;

import heliecp.roadchina.Item.ItemRegistry;
import heliecp.roadchina.Item.Wrench;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;

public class LineSlab extends Block
{
    public LineSlab()
    {
        super(Block.Properties.of(Material.STONE).harvestLevel(10));
    }

    protected static final VoxelShape SLAB_BOTTOM = Block.box(0.0D,0.0D,0.0D,16.0D,8.0D,16.0D);
    protected static final VoxelShape SLAB_TOP = Block.box(0.0D,8.0D,0.0D,16.0D,16.0D,16.0D);

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext ctx) {
        return (BlockState) this.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, ctx.getHorizontalDirection().getOpposite());
    }

    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        return (BlockState)p_185499_1_.setValue(BlockStateProperties.HORIZONTAL_FACING, p_185499_2_.rotate((Direction)p_185499_1_.getValue(BlockStateProperties.HORIZONTAL_FACING)));
    }

    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.rotate(p_185471_2_.getRotation((Direction)p_185471_1_.getValue(BlockStateProperties.HORIZONTAL_FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.HORIZONTAL_FACING);
    }

    @Override
    public ActionResultType use(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult blockRayTraceResult)
    {
        if(worldIn.isClientSide)
        {
            return ActionResultType.SUCCESS;
        }

        /**if(playerIn.getMainHandItem().getItem() == BlockItem.BY_BLOCK.get(BlockRegistry.whiteLine1Slab))
        *{
        *    worldIn.setBlockAndUpdate(pos, blockState.setValue(BlockRegistry.whiteLine1,);
        *    return ActionResultType.SUCCESS;
        *}
        **/

        if(playerIn.getMainHandItem().getItem() instanceof Wrench)
        {
            Direction direction = blockState.getValue(BlockStateProperties.HORIZONTAL_FACING);
            worldIn.setBlockAndUpdate(pos, blockState.setValue(BlockStateProperties.HORIZONTAL_FACING, direction.getClockWise()));
            return ActionResultType.SUCCESS;
        }

        return ActionResultType.CONSUME;
    }
}
