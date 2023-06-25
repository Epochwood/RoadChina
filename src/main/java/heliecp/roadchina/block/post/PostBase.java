package heliecp.roadchina.block.post;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PostBase extends Block
{
    protected static final VoxelShape POST = Block.box(6,0,6,10,16,10);
    protected static final VoxelShape BASE = Block.box(3,0,3,13,1,13);

    public PostBase() {
        super(Properties.of().mapColor(MapColor.STONE).strength(1.5F));
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockView, BlockPos blockPos, CollisionContext entityContext) {
        return Shapes.or(POST,BASE);
    }

}
