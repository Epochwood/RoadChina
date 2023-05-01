package heliecp.roadchina.block.post;

import com.google.common.collect.Maps;
import heliecp.roadchina.block.BlockRegistry;
import heliecp.roadchina.block.GetBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Material;

import java.util.Collections;
import java.util.Map;

public class Post extends PipeBlock
{
    protected static final BooleanProperty UP = BlockStateProperties.UP;
    protected static final BooleanProperty DOWN = BlockStateProperties.DOWN;
    protected static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    protected static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    protected static final BooleanProperty WEST = BlockStateProperties.WEST;
    protected static final BooleanProperty EAST = BlockStateProperties.EAST;

    public static final Map<Direction, BooleanProperty> PROPERTY_MAP;

    static {
        Map<Direction, BooleanProperty> map = Maps.newEnumMap(Direction.class);
        map.put(Direction.UP, BlockStateProperties.UP);
        map.put(Direction.DOWN, BlockStateProperties.DOWN);
        map.put(Direction.NORTH, BlockStateProperties.NORTH);
        map.put(Direction.SOUTH, BlockStateProperties.SOUTH);
        map.put(Direction.WEST, BlockStateProperties.WEST);
        map.put(Direction.EAST, BlockStateProperties.EAST);
        PROPERTY_MAP = Collections.unmodifiableMap(map);
    }

    public Post()
    {
        super(0.125f,Properties.of(Material.STONE).strength(1.5F));
        this.defaultBlockState().setValue(UP, false).setValue(DOWN, false)
                .setValue(NORTH, false).setValue(SOUTH, false)
                .setValue(WEST, false).setValue(EAST, false);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(PROPERTY_MAP.values().toArray(new Property<?>[0]));
        super.createBlockStateDefinition(builder);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return getStateForPlacement(context.getLevel(),context.getClickedPos());
    }

    public BlockState getStateForPlacement(BlockGetter world, BlockPos pos) {
        Block block = world.getBlockState(pos.below()).getBlock();
        Block block1 = world.getBlockState(pos.above()).getBlock();
        Block block2 = world.getBlockState(pos.north()).getBlock();
        Block block3 = world.getBlockState(pos.east()).getBlock();
        Block block4 = world.getBlockState(pos.south()).getBlock();
        Block block5 = world.getBlockState(pos.west()).getBlock();
        GetBlock getBlock = new GetBlock();
        return this.defaultBlockState().setValue(DOWN, getBlock.getPostForDown(block))
                .setValue(UP, getBlock.getPostForUp(block1))
                .setValue(NORTH, getBlock.getPost(block2))
                .setValue(EAST, getBlock.getPost(block3))
                .setValue(SOUTH, getBlock.getPost(block4))
                .setValue(WEST, getBlock.getPost(block5));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos pos, BlockPos facingPos) {
        return getStateForPlacement(world, pos);
    }

}
