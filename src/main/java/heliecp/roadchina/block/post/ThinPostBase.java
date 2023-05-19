package heliecp.roadchina.block.post;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ThinPostBase extends Block
{
    protected static final VoxelShape POST = Block.box(7,0,7,9,16,9);
    protected static final VoxelShape BASE = Block.box(6,0,6,10,0.5,10);

    public ThinPostBase() {
        super(Properties.of(Material.STONE).strength(1.5F));
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockView, BlockPos blockPos, CollisionContext entityContext) {
        return Shapes.or(POST,BASE);
    }

}
