package heliecp.roadchina.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SixWayBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import java.util.Collections;
import java.util.Map;

public class RoadLight extends SixWayBlock {
    protected static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    protected static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    protected static final BooleanProperty WEST = BlockStateProperties.WEST;
    protected static final BooleanProperty EAST = BlockStateProperties.EAST;

    public static final Map<Direction, BooleanProperty> PROPERTY_MAP;

    static {
        Map<Direction, BooleanProperty> map = Maps.newEnumMap(Direction.class);
        map.put(Direction.NORTH, BlockStateProperties.NORTH);
        map.put(Direction.SOUTH, BlockStateProperties.SOUTH);
        map.put(Direction.WEST, BlockStateProperties.WEST);
        map.put(Direction.EAST, BlockStateProperties.EAST);
        PROPERTY_MAP = Collections.unmodifiableMap(map);
    }

    public RoadLight() {
        super(0.125f, Properties.of(Material.STONE).strength(1.5F));
        this.defaultBlockState().setValue(NORTH, false).setValue(SOUTH, false)
                .setValue(WEST, false).setValue(EAST, false);
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(PROPERTY_MAP.values().toArray(new Property<?>[0]));
        super.createBlockStateDefinition(builder);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return getStateForPlacement(context.getLevel(),context.getClickedPos());
    }

    public BlockState getStateForPlacement(IBlockReader world, BlockPos pos) {
        Block block = world.getBlockState(pos.north()).getBlock();
        Block block1 = world.getBlockState(pos.east()).getBlock();
        Block block2 = world.getBlockState(pos.south()).getBlock();
        Block block3 = world.getBlockState(pos.west()).getBlock();
        GetBlock getBlock = new GetBlock();
        return this.defaultBlockState().setValue(NORTH, getBlock.getPost(block))
                .setValue(EAST, getBlock.getPost(block1))
                .setValue(SOUTH, getBlock.getPost(block2))
                .setValue(WEST, getBlock.getPost(block3));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, IWorld world, BlockPos pos, BlockPos facingPos) {
        return getStateForPlacement(world,pos);
    }

}