package heliecp.roadchina.block.post;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PostNC extends Block
{
    protected static final VoxelShape POST = Block.box(6,0,6,10,16,10);

    public PostNC() {
        super(Properties.of(Material.STONE).strength(1.5F));
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockView, BlockPos blockPos, CollisionContext entityContext) {
        return Shapes.or(POST);
    }

}
