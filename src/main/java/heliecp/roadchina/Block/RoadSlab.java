package heliecp.roadchina.Block;

import heliecp.roadchina.Item.ItemRegistry;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class RoadSlab extends SlabBlock
{
    public RoadSlab() {
        super(Block.Properties.of(Material.STONE).harvestLevel(10));
    }

    @Override
    public VoxelShape getShape(BlockState blockState_1, IBlockReader blockView_1, BlockPos blockPos_1, ISelectionContext entityContext_1) {
        return Block.box(0, 0, 0, 16, 8, 16);
    }

    @Override
    public ActionResultType use(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult blockRayTraceResult) {
        if (worldIn.isClientSide)
        {
            return ActionResultType.SUCCESS;
        }

        if(playerIn.getMainHandItem().getItem() == ItemRegistry.asphaltRoadSlab.get())
        {
            worldIn.setBlockAndUpdate(pos, BlockRegistry.asphaltRoad.get().defaultBlockState());
            return ActionResultType.SUCCESS;
        }

        return ActionResultType.CONSUME;
    }
}
