package heliecp.roadchina.Block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.block.FenceBlock;

import java.util.Collections;
import java.util.Map;

public class ThinPost extends Block
{
    public static final BooleanProperty UP = BlockStateProperties.UP;
    public static final BooleanProperty DOWN = BlockStateProperties.DOWN;
    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    public static final BooleanProperty WEST = BlockStateProperties.WEST;
    public static final BooleanProperty EAST = BlockStateProperties.EAST;

    public static final Map<Direction, BooleanProperty> PROPERTY_MAP;

    static
    {
        Map<Direction, BooleanProperty> map = Maps.newEnumMap(Direction.class);
        map.put(Direction.UP, BlockStateProperties.UP);
        map.put(Direction.DOWN, BlockStateProperties.DOWN);
        map.put(Direction.NORTH, BlockStateProperties.NORTH);
        map.put(Direction.SOUTH, BlockStateProperties.SOUTH);
        map.put(Direction.WEST, BlockStateProperties.WEST);
        map.put(Direction.EAST, BlockStateProperties.EAST);
        PROPERTY_MAP = Collections.unmodifiableMap(map);
    }

    public ThinPost()
    {
        super(Block.Properties.of(Material.STONE).strength(1.5F));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(PROPERTY_MAP.values().toArray(new Property<?>[0]));
        super.createBlockStateDefinition(builder);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        BlockState state = this.defaultBlockState();
        for (Direction facing : Direction.values())
        {
            World world = context.getLevel();
            BlockPos facingPos = context.getClickedPos();
            BlockState facingState = world.getBlockState(facingPos);
            state = state.setValue(PROPERTY_MAP.get(facing), this.canConnect(world, facing.getOpposite(), facingPos, facingState));
        }
        return state;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, IWorld world, BlockPos pos, BlockPos facingPos)
    {
        return state.setValue(PROPERTY_MAP.get(facing), this.canConnect(world, facing.getOpposite(), facingPos, facingState));
    }

    private boolean canConnect(IWorld worldIn, Direction facing, BlockPos pos, BlockState state)
    {
        BlockState blockState = worldIn.getBlockState(pos);
        Block block = blockState.getBlock();
        return block == this;
    }

    @Override
    public VoxelShape getShape(BlockState blockState, IBlockReader blockReader, BlockPos pos, ISelectionContext context) {
        /**
        for (BooleanProperty facing : PROPERTY_MAP.values()) {
            switch (blockState.getValue())
            {
                case UP:
                    return Block.box(6, 6, 6, 10, 16, 10);
                case DOWN:
                    return Block.box(6, 10, 6, 10, 0, 10);
                case NORTH:
                    return Block.box(6, 6, 0, 10, 10, 10);
                case SOUTH:
                    return Block.box(6, 6, 6, 10, 10, 16);
                case WEST:
                    return Block.box(0, 6, 6, 10, 10, 10);
                case EAST:
                    return Block.box(6, 6, 6, 16, 10, 10);
                default:
                    return Block.box(6, 6, 6, 10, 10, 10);
            }
        }
        **/
        if (blockState.getValue(UP))
        {
            if (blockState.getValue(DOWN))
            {
                if (blockState.getValue(NORTH))
                {
                    if (blockState.getValue(SOUTH))
                    {
                        if (blockState.getValue(WEST))
                        {
                            if (blockState.getValue(EAST))
                            {
                                return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(6, 6, 6, 16, 10, 10), Block.box(0, 6, 6, 10, 10, 10));
                            }
                            return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(0, 6, 6, 10, 10, 10));
                        }
                        if (blockState.getValue(EAST))
                        {
                            return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(6, 6, 6, 16, 10, 10));
                        }
                        return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 10, 10, 16));
                    }
                    if (blockState.getValue(WEST))
                    {
                        if (blockState.getValue(EAST))
                        {
                            return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(0, 6, 6, 10, 10, 10));
                        }
                        return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 10, 6, 10, 0, 10), Block.box(0, 6, 6, 10, 10, 10));
                    }
                    if (blockState.getValue(EAST))
                    {
                        return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 16, 10, 10));
                    }
                    return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 10, 6, 10, 0, 10));
                }
                if (blockState.getValue(SOUTH))
                {
                    if (blockState.getValue(WEST))
                    {
                        if (blockState.getValue(EAST))
                        {
                            return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(0, 6, 6, 10, 10, 10));
                        }
                        return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(0, 6, 6, 10, 10, 10), Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 10, 10, 16));
                    }
                    if (blockState.getValue(EAST))
                    {
                        return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 10, 10, 16));
                    }
                    return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(6, 10, 6, 10, 0, 10));
                }
                if (blockState.getValue(WEST))
                {
                    if (blockState.getValue(EAST))
                    {
                        return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 10, 6, 10, 0, 10), Block.box(0, 6, 6, 10, 10, 10));
                    }
                    return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(0, 6, 6, 10, 10, 10), Block.box(6, 10, 6, 10, 0, 10));
                }
                if (blockState.getValue(EAST))
                {
                    return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 10, 6, 10, 0, 10));
                }
                return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 10, 6, 10, 0, 10));
            }
            if (blockState.getValue(NORTH))
            {
                if (blockState.getValue(SOUTH))
                {
                    if (blockState.getValue(WEST))
                    {
                        if (blockState.getValue(EAST))
                            return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(0, 6, 6, 10, 10, 10));
                        return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(0, 6, 6, 10, 10, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
                    }
                    if (blockState.getValue(EAST))
                        return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
                    return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(6, 6, 0, 10, 10, 10));
                }
                if (blockState.getValue(WEST))
                {
                    if (blockState.getValue(EAST))
                        return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(0, 6, 6, 10, 10, 10));
                    return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(0, 6, 6, 10, 10, 10), Block.box(6, 6, 0, 10, 10, 10));
                }
                if (blockState.getValue(EAST))
                    return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 0, 10, 10, 10));
                return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 0, 10, 10, 10));
            }
            if (blockState.getValue(SOUTH))
            {
                if (blockState.getValue(WEST))
                {
                    if (blockState.getValue(EAST))
                        return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(0, 6, 6, 10, 10, 10));
                    return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(0, 6, 6, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
                }
                if (blockState.getValue(EAST))
                    return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
                return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 10, 10, 16));
            }
            if (blockState.getValue(WEST))
            {
                if (blockState.getValue(EAST))
                    return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(0, 6, 6, 10, 10, 10));
                return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(0, 6, 6, 10, 10, 10));
            }
            if (blockState.getValue(EAST))
                return VoxelShapes.or(Block.box(6, 6, 6, 10, 16, 10), Block.box(6, 6, 6, 16, 10, 10));
            return Block.box(6, 6, 6, 10, 16, 10);
        }
        else if (blockState.getValue(DOWN))
        {
            if (blockState.getValue(NORTH))
            {
                if (blockState.getValue(SOUTH))
                {
                    if (blockState.getValue(WEST))
                    {
                        if (blockState.getValue(EAST))
                        {
                            return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(0, 6, 6, 10, 10, 10));
                        }
                        return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(0, 6, 6, 10, 10, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
                    }
                    if (blockState.getValue(EAST))
                    {
                        return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
                    }
                    return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(6, 6, 0, 10, 10, 10));
                }
                if (blockState.getValue(WEST))
                {
                    return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(0, 6, 6, 10, 10, 10), Block.box(6, 6, 0, 10, 10, 10));
                }
                if (blockState.getValue(EAST))
                {
                    return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 0, 10, 10, 10));
                }
                return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 0, 10, 10, 10));
            }
            if (blockState.getValue(SOUTH))
            {
                if (blockState.getValue(WEST))
                {
                    if (blockState.getValue(EAST))
                    {
                        return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(0, 6, 6, 10, 10, 10));
                    }
                    return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(0, 6, 6, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
                }
                if (blockState.getValue(EAST))
                {
                    return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
                }
                return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 10, 10, 16));
            }
            if (blockState.getValue(WEST))
            {
                if (blockState.getValue(EAST))
                {
                    return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 16, 10, 10), Block.box(0, 6, 6, 10, 10, 10));
                }
                return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(0, 6, 6, 10, 10, 10));
            }
            if (blockState.getValue(EAST))
            {
                return VoxelShapes.or(Block.box(6, 10, 6, 10, 0, 10), Block.box(6, 6, 6, 16, 10, 10));
            }
            return Block.box(6, 10, 6, 10, 0, 10);
        }
        if (blockState.getValue(NORTH))
        {
            if (blockState.getValue(SOUTH))
            {
                if (blockState.getValue(WEST))
                {
                    if (blockState.getValue(EAST))
                    {
                        return VoxelShapes.or(Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(0, 6, 6, 10, 10, 10));
                    }
                    return VoxelShapes.or(Block.box(0, 6, 6, 10, 10, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
                }
                if (blockState.getValue(EAST))
                {
                    return VoxelShapes.or(Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
                }
                return VoxelShapes.or(Block.box(6, 6, 6, 10, 10, 16), Block.box(6, 6, 0, 10, 10, 10));
            }
            if (blockState.getValue(WEST))
            {
                if (blockState.getValue(EAST))
                {
                    return VoxelShapes.or(Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 0, 10, 10, 10), Block.box(0, 6, 6, 10, 10, 10));
                }
                return VoxelShapes.or(Block.box(0, 6, 6, 10, 10, 10), Block.box(6, 6, 0, 10, 10, 10));
            }
            if (blockState.getValue(EAST))
            {
                return VoxelShapes.or(Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 0, 10, 10, 10));
            }
            return Block.box(6, 6, 0, 10, 10, 10);
        }
        if (blockState.getValue(SOUTH))
        {
            if (blockState.getValue(WEST))
            {
                if (blockState.getValue(EAST))
                {
                    return VoxelShapes.or(Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 6, 10, 10, 16), Block.box(0, 6, 6, 10, 10, 10));
                }
                return VoxelShapes.or(Block.box(0, 6, 6, 10, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
            }
            if (blockState.getValue(EAST))
            {
                return VoxelShapes.or(Block.box(6, 6, 6, 16, 10, 10), Block.box(6, 6, 6, 10, 10, 16));
            }
            return Block.box(6, 6, 6, 10, 10, 16);
        }
        if (blockState.getValue(WEST))
        {
            if (blockState.getValue(EAST))
            {
                return VoxelShapes.or(Block.box(6, 6, 6, 16, 10, 10), Block.box(0, 6, 6, 10, 10, 10));
            }
            return Block.box(0, 6, 6, 10, 10, 10);
        }
        if (blockState.getValue(EAST))
        {
            return Block.box(6, 6, 6, 16, 10, 10);
        }
        return Block.box(6,6,6,10,10,10);

    }

}