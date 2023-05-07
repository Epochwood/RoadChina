package heliecp.roadchina.block.post;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class ThinPostBase extends Block
{
    protected static final VoxelShape POST = Block.box(7,0,7,9,16,9);
    protected static final VoxelShape BASE = Block.box(6,0,6,10,0.5,10);

    public ThinPostBase() {
        super(Properties.of(Material.STONE).strength(1.5F));
    }

    @Override
    public VoxelShape getShape(BlockState blockState_1, IBlockReader blockView_1, BlockPos blockPos_1, ISelectionContext entityContext_1) {
        return VoxelShapes.or(POST,BASE);
    }

}
