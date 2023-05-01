package heliecp.roadchina.block.post;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class PostBase extends Block
{
    protected static final VoxelShape POST = Block.box(6,0,6,10,16,10);
    protected static final VoxelShape BASE = Block.box(3,0,3,13,1,13);

    public PostBase() {
        super(Properties.of(Material.STONE).strength(1.5F));
    }

    @Override
    public VoxelShape getShape(BlockState blockState_1, IBlockReader blockView_1, BlockPos blockPos_1, ISelectionContext entityContext_1) {
        return VoxelShapes.or(POST,BASE);
    }

}
