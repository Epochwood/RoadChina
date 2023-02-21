package heliecp.roadchina.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;

public class GetBlock
{
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    Block whiteLine1Slab = BlockRegistry.whiteLine1Slab.get();
    Block whiteLine2Slab = BlockRegistry.whiteLine2Slab.get();
    Block whiteLine3Slab = BlockRegistry.whiteLine3Slab.get();
    Block whiteLine4Slab = BlockRegistry.whiteLine4Slab.get();
    Block whiteLine5Slab = BlockRegistry.whiteLine5Slab.get();
    Block whiteLine6Slab = BlockRegistry.whiteLine6Slab.get();
    Block whiteLine7Slab = BlockRegistry.whiteLine7Slab.get();
    Block whiteLine8Slab = BlockRegistry.whiteLine8Slab.get();
    Block whiteLine9aSlab = BlockRegistry.whiteLine9aSlab.get();
    Block whiteLine9bSlab = BlockRegistry.whiteLine9bSlab.get();
    Block whiteLine10aSlab = BlockRegistry.whiteLine10aSlab.get();
    Block whiteLine10bSlab = BlockRegistry.whiteLine10bSlab.get();
    Block whiteLine11aSlab = BlockRegistry.whiteLine11aSlab.get();
    Block whiteLine11bSlab = BlockRegistry.whiteLine11bSlab.get();
    Block whiteLine12aSlab = BlockRegistry.whiteLine12aSlab.get();
    Block whiteLine12bSlab = BlockRegistry.whiteLine12bSlab.get();
    Block whiteLine13Slab = BlockRegistry.whiteLine13Slab.get();
    Block whiteLine14Slab = BlockRegistry.whiteLine14Slab.get();
    Block whiteLine15Slab = BlockRegistry.whiteLine15Slab.get();
    Block whiteLine16aSlab = BlockRegistry.whiteLine16aSlab.get();
    Block whiteLine16bSlab = BlockRegistry.whiteLine16bSlab.get();
    Block whiteLine17aSlab = BlockRegistry.whiteLine17aSlab.get();
    Block whiteLine17bSlab = BlockRegistry.whiteLine17bSlab.get();
    Block whiteLine18aSlab = BlockRegistry.whiteLine18aSlab.get();
    Block whiteLine18bSlab = BlockRegistry.whiteLine18bSlab.get();
    Block whiteLine19aSlab = BlockRegistry.whiteLine19aSlab.get();
    Block whiteLine19bSlab = BlockRegistry.whiteLine19bSlab.get();
    Block whiteLine20aSlab = BlockRegistry.whiteLine20aSlab.get();
    Block whiteLine20bSlab = BlockRegistry.whiteLine20bSlab.get();
    Block whiteLine21aSlab = BlockRegistry.whiteLine21aSlab.get();
    Block whiteLine21bSlab = BlockRegistry.whiteLine21bSlab.get();
    Block whiteLine22aSlab = BlockRegistry.whiteLine22aSlab.get();
    Block whiteLine22bSlab = BlockRegistry.whiteLine22bSlab.get();
    Block whiteLine23aSlab = BlockRegistry.whiteLine23aSlab.get();
    Block whiteLine23bSlab = BlockRegistry.whiteLine23bSlab.get();
    Block whiteLine24Slab = BlockRegistry.whiteLine24Slab.get();
    Block whiteLine25Slab = BlockRegistry.whiteLine25Slab.get();
    Block whiteLine26aSlab = BlockRegistry.whiteLine26aSlab.get();
    Block whiteLine26bSlab = BlockRegistry.whiteLine26bSlab.get();
    Block whiteLine26cSlab = BlockRegistry.whiteLine26cSlab.get();

    BlockState whiteLine1 = BlockRegistry.whiteLine1.get().defaultBlockState();
    BlockState whiteLine2 = BlockRegistry.whiteLine2.get().defaultBlockState();
    BlockState whiteLine3 = BlockRegistry.whiteLine3.get().defaultBlockState();
    BlockState whiteLine4 = BlockRegistry.whiteLine4.get().defaultBlockState();
    BlockState whiteLine5 = BlockRegistry.whiteLine5.get().defaultBlockState();
    BlockState whiteLine6 = BlockRegistry.whiteLine6.get().defaultBlockState();
    BlockState whiteLine7 = BlockRegistry.whiteLine7.get().defaultBlockState();
    BlockState whiteLine8 = BlockRegistry.whiteLine8.get().defaultBlockState();
    BlockState whiteLine9a = BlockRegistry.whiteLine9a.get().defaultBlockState();
    BlockState whiteLine9b = BlockRegistry.whiteLine9b.get().defaultBlockState();
    BlockState whiteLine10a = BlockRegistry.whiteLine10a.get().defaultBlockState();
    BlockState whiteLine10b = BlockRegistry.whiteLine10b.get().defaultBlockState();
    BlockState whiteLine11a = BlockRegistry.whiteLine11a.get().defaultBlockState();
    BlockState whiteLine11b = BlockRegistry.whiteLine11b.get().defaultBlockState();
    BlockState whiteLine12a = BlockRegistry.whiteLine12a.get().defaultBlockState();
    BlockState whiteLine12b = BlockRegistry.whiteLine12b.get().defaultBlockState();
    BlockState whiteLine13 = BlockRegistry.whiteLine13.get().defaultBlockState();
    BlockState whiteLine14 = BlockRegistry.whiteLine14.get().defaultBlockState();
    BlockState whiteLine15 = BlockRegistry.whiteLine15.get().defaultBlockState();
    BlockState whiteLine16a = BlockRegistry.whiteLine16a.get().defaultBlockState();
    BlockState whiteLine16b = BlockRegistry.whiteLine16b.get().defaultBlockState();
    BlockState whiteLine17a = BlockRegistry.whiteLine17a.get().defaultBlockState();
    BlockState whiteLine17b = BlockRegistry.whiteLine17b.get().defaultBlockState();
    BlockState whiteLine18a = BlockRegistry.whiteLine18a.get().defaultBlockState();
    BlockState whiteLine18b = BlockRegistry.whiteLine18b.get().defaultBlockState();
    BlockState whiteLine19a = BlockRegistry.whiteLine19a.get().defaultBlockState();
    BlockState whiteLine19b = BlockRegistry.whiteLine19b.get().defaultBlockState();
    BlockState whiteLine20a = BlockRegistry.whiteLine20a.get().defaultBlockState();
    BlockState whiteLine20b = BlockRegistry.whiteLine20b.get().defaultBlockState();
    BlockState whiteLine21a = BlockRegistry.whiteLine21a.get().defaultBlockState();
    BlockState whiteLine21b = BlockRegistry.whiteLine21b.get().defaultBlockState();
    BlockState whiteLine22a = BlockRegistry.whiteLine22a.get().defaultBlockState();
    BlockState whiteLine22b = BlockRegistry.whiteLine22b.get().defaultBlockState();
    BlockState whiteLine23a = BlockRegistry.whiteLine23a.get().defaultBlockState();
    BlockState whiteLine23b = BlockRegistry.whiteLine23b.get().defaultBlockState();
    BlockState whiteLine24 = BlockRegistry.whiteLine24.get().defaultBlockState();
    BlockState whiteLine25 = BlockRegistry.whiteLine25.get().defaultBlockState();
    BlockState whiteLine26a = BlockRegistry.whiteLine26a.get().defaultBlockState();
    BlockState whiteLine26b = BlockRegistry.whiteLine26b.get().defaultBlockState();
    BlockState whiteLine26c = BlockRegistry.whiteLine26c.get().defaultBlockState();

    public Block getLineSlab(BlockState blockState)
    {
        if (blockState.is(whiteLine1Slab))
            return whiteLine1Slab;
        if (blockState.is(whiteLine2Slab))
            return whiteLine2Slab;
        if (blockState.is(whiteLine3Slab))
            return whiteLine3Slab;
        if (blockState.is(whiteLine4Slab))
            return whiteLine4Slab;
        if (blockState.is(whiteLine5Slab))
            return whiteLine5Slab;
        if (blockState.is(whiteLine6Slab))
            return whiteLine6Slab;
        if (blockState.is(whiteLine7Slab))
            return whiteLine7Slab;
        if (blockState.is(whiteLine8Slab))
            return whiteLine8Slab;
        if (blockState.is(whiteLine9aSlab))
            return whiteLine9aSlab;
        if (blockState.is(whiteLine9bSlab))
            return whiteLine9bSlab;
        if (blockState.is(whiteLine10aSlab))
            return whiteLine10aSlab;
        if (blockState.is(whiteLine10bSlab))
            return whiteLine10bSlab;
        if (blockState.is(whiteLine11aSlab))
            return whiteLine11aSlab;
        if (blockState.is(whiteLine11bSlab))
            return whiteLine11bSlab;
        if (blockState.is(whiteLine12aSlab))
            return whiteLine12aSlab;
        if (blockState.is(whiteLine12bSlab))
            return whiteLine12bSlab;
        if (blockState.is(whiteLine13Slab))
            return whiteLine13Slab;
        if (blockState.is(whiteLine14Slab))
            return whiteLine14Slab;
        if (blockState.is(whiteLine15Slab))
            return whiteLine15Slab;
        if (blockState.is(whiteLine16aSlab))
            return whiteLine16aSlab;
        if (blockState.is(whiteLine16bSlab))
            return whiteLine16bSlab;
        if (blockState.is(whiteLine17aSlab))
            return whiteLine17aSlab;
        if (blockState.is(whiteLine17bSlab))
            return whiteLine17bSlab;
        if (blockState.is(whiteLine18aSlab))
            return whiteLine18aSlab;
        if (blockState.is(whiteLine18bSlab))
            return whiteLine18bSlab;
        if (blockState.is(whiteLine19aSlab))
            return whiteLine19aSlab;
        if (blockState.is(whiteLine19bSlab))
            return whiteLine19bSlab;
        if (blockState.is(whiteLine20aSlab))
            return whiteLine20aSlab;
        if (blockState.is(whiteLine20bSlab))
            return whiteLine20bSlab;
        if (blockState.is(whiteLine21aSlab))
            return whiteLine21aSlab;
        if (blockState.is(whiteLine21bSlab))
            return whiteLine21bSlab;
        if (blockState.is(whiteLine22aSlab))
            return whiteLine22aSlab;
        if (blockState.is(whiteLine22bSlab))
            return whiteLine22bSlab;
        if (blockState.is(whiteLine23aSlab))
            return whiteLine23aSlab;
        if (blockState.is(whiteLine23bSlab))
            return whiteLine23bSlab;
        if (blockState.is(whiteLine24Slab))
            return whiteLine24Slab;
        if (blockState.is(whiteLine25Slab))
            return whiteLine25Slab;
        if (blockState.is(whiteLine26aSlab))
            return whiteLine26aSlab;
        if (blockState.is(whiteLine26bSlab))
            return whiteLine26bSlab;
        if (blockState.is(whiteLine26cSlab))
            return whiteLine26cSlab;
        return null;
    }

    public BlockState getLine(BlockState blockState)
    {
        if (blockState.is(whiteLine1Slab))
            return whiteLine1;
        if (blockState.is(whiteLine2Slab))
            return whiteLine2;
        if (blockState.is(whiteLine3Slab))
            return whiteLine3;
        if (blockState.is(whiteLine4Slab))
            return whiteLine4;
        if (blockState.is(whiteLine5Slab))
            return whiteLine5;
        if (blockState.is(whiteLine6Slab))
            return whiteLine6;
        if (blockState.is(whiteLine7Slab))
            return whiteLine7;
        if (blockState.is(whiteLine8Slab))
            return whiteLine8;
        if (blockState.is(whiteLine9aSlab))
            return whiteLine9a;
        if (blockState.is(whiteLine9bSlab))
            return whiteLine9b;
        if (blockState.is(whiteLine10aSlab))
            return whiteLine10a;
        if (blockState.is(whiteLine10bSlab))
            return whiteLine10b;
        if (blockState.is(whiteLine11aSlab))
            return whiteLine11a;
        if (blockState.is(whiteLine11bSlab))
            return whiteLine11b;
        if (blockState.is(whiteLine12aSlab))
            return whiteLine12a;
        if (blockState.is(whiteLine12bSlab))
            return whiteLine12b;
        if (blockState.is(whiteLine13Slab))
            return whiteLine13;
        if (blockState.is(whiteLine14Slab))
            return whiteLine14;
        if (blockState.is(whiteLine15Slab))
            return whiteLine15;
        if (blockState.is(whiteLine16aSlab))
            return whiteLine16a;
        if (blockState.is(whiteLine16bSlab))
            return whiteLine16b;
        if (blockState.is(whiteLine17aSlab))
            return whiteLine17a;
        if (blockState.is(whiteLine17bSlab))
            return whiteLine17b;
        if (blockState.is(whiteLine18aSlab))
            return whiteLine18a;
        if (blockState.is(whiteLine18bSlab))
            return whiteLine18b;
        if (blockState.is(whiteLine19aSlab))
            return whiteLine19a;
        if (blockState.is(whiteLine19bSlab))
            return whiteLine19b;
        if (blockState.is(whiteLine20aSlab))
            return whiteLine20a;
        if (blockState.is(whiteLine20bSlab))
            return whiteLine20b;
        if (blockState.is(whiteLine21aSlab))
            return whiteLine21a;
        if (blockState.is(whiteLine21bSlab))
            return whiteLine21b;
        if (blockState.is(whiteLine22aSlab))
            return whiteLine22a;
        if (blockState.is(whiteLine22bSlab))
            return whiteLine22b;
        if (blockState.is(whiteLine23aSlab))
            return whiteLine23a;
        if (blockState.is(whiteLine23bSlab))
            return whiteLine23b;
        if (blockState.is(whiteLine24Slab))
            return whiteLine24;
        if (blockState.is(whiteLine25Slab))
            return whiteLine25;
        if (blockState.is(whiteLine26aSlab))
            return whiteLine26a;
        if (blockState.is(whiteLine26bSlab))
            return whiteLine26b;
        if (blockState.is(whiteLine26cSlab))
            return whiteLine26c;
        return null;
    }

    public BlockState getSlabToBlock(BlockState blockstate)
    {
        if (blockstate.is(getLineSlab(blockstate)))
        {
            switch (blockstate.getValue(FACING))
            {
                case NORTH:
                    return getLine(blockstate).setValue(FACING, Direction.NORTH);
                case SOUTH:
                    return getLine(blockstate).setValue(FACING, Direction.SOUTH);
                case WEST:
                    return getLine(blockstate).setValue(FACING, Direction.WEST);
                case EAST:
                    return getLine(blockstate).setValue(FACING, Direction.EAST);
            }
        }
        return null;
    }
}
