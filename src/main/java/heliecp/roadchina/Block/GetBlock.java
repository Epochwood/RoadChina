package heliecp.roadchina.Block;

import heliecp.roadchina.Item.ItemRegistry;
import heliecp.roadchina.Properties.BlockProperties;
import heliecp.roadchina.Properties.BlockType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GetBlock
{
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final EnumProperty<BlockType> BLOCK_TYPE = BlockProperties.BLOCK_TYPE;

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
    Block whiteLine27aSlab = BlockRegistry.whiteLine27aSlab.get();
    Block whiteLine27bSlab = BlockRegistry.whiteLine27bSlab.get();
    Block whiteLine27cSlab = BlockRegistry.whiteLine27cSlab.get();
    Block whiteLine28Slab = BlockRegistry.whiteLine28Slab.get();
    Block whiteLine29aSlab = BlockRegistry.whiteLine29aSlab.get();
    Block whiteLine29bSlab = BlockRegistry.whiteLine29bSlab.get();
    Block whiteLine29cSlab = BlockRegistry.whiteLine29cSlab.get();
    Block whiteLine30aSlab = BlockRegistry.whiteLine30aSlab.get();
    Block whiteLine30bSlab = BlockRegistry.whiteLine30bSlab.get();
    Block whiteLine30cSlab = BlockRegistry.whiteLine30cSlab.get();
    Block whiteLine31aSlab = BlockRegistry.whiteLine31aSlab.get();
    Block whiteLine31bSlab = BlockRegistry.whiteLine31bSlab.get();
    Block whiteLine31cSlab = BlockRegistry.whiteLine31cSlab.get();
    Block whiteLine32Slab = BlockRegistry.whiteLine32Slab.get();
    Block whiteLine33aSlab = BlockRegistry.whiteLine33aSlab.get();
    Block whiteLine33bSlab = BlockRegistry.whiteLine33bSlab.get();
    Block whiteLine34Slab = BlockRegistry.whiteLine34Slab.get();
    Block whiteLine35Slab = BlockRegistry.whiteLine35Slab.get();
    Block whiteLine36Slab = BlockRegistry.whiteLine36Slab.get();
    Block whiteLine37aSlab = BlockRegistry.whiteLine37aSlab.get();
    Block whiteLine37bSlab = BlockRegistry.whiteLine37bSlab.get();
    Block whiteLine37cSlab = BlockRegistry.whiteLine37cSlab.get();
    Block whiteLine37dSlab = BlockRegistry.whiteLine37dSlab.get();
    Block whiteLine38aSlab = BlockRegistry.whiteLine38aSlab.get();
    Block whiteLine38bSlab = BlockRegistry.whiteLine38bSlab.get();
    Block whiteLine38cSlab = BlockRegistry.whiteLine38cSlab.get();
    Block whiteLine38dSlab = BlockRegistry.whiteLine38dSlab.get();

    Block yellowLine1Slab = BlockRegistry.yellowLine1Slab.get();
    Block yellowLine2Slab = BlockRegistry.yellowLine2Slab.get();
    Block yellowLine3Slab = BlockRegistry.yellowLine3Slab.get();
    Block yellowLine4Slab = BlockRegistry.yellowLine4Slab.get();

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
    BlockState whiteLine27a = BlockRegistry.whiteLine27a.get().defaultBlockState();
    BlockState whiteLine27b = BlockRegistry.whiteLine27b.get().defaultBlockState();
    BlockState whiteLine27c = BlockRegistry.whiteLine27c.get().defaultBlockState();
    BlockState whiteLine28 = BlockRegistry.whiteLine28.get().defaultBlockState();
    BlockState whiteLine29a = BlockRegistry.whiteLine29a.get().defaultBlockState();
    BlockState whiteLine29b = BlockRegistry.whiteLine29b.get().defaultBlockState();
    BlockState whiteLine29c = BlockRegistry.whiteLine29c.get().defaultBlockState();
    BlockState whiteLine30a = BlockRegistry.whiteLine30a.get().defaultBlockState();
    BlockState whiteLine30b = BlockRegistry.whiteLine30b.get().defaultBlockState();
    BlockState whiteLine30c = BlockRegistry.whiteLine30c.get().defaultBlockState();
    BlockState whiteLine31a = BlockRegistry.whiteLine31a.get().defaultBlockState();
    BlockState whiteLine31b = BlockRegistry.whiteLine31b.get().defaultBlockState();
    BlockState whiteLine31c = BlockRegistry.whiteLine31c.get().defaultBlockState();
    BlockState whiteLine32 = BlockRegistry.whiteLine32.get().defaultBlockState();
    BlockState whiteLine33a = BlockRegistry.whiteLine33a.get().defaultBlockState();
    BlockState whiteLine33b = BlockRegistry.whiteLine33b.get().defaultBlockState();
    BlockState whiteLine34 = BlockRegistry.whiteLine34.get().defaultBlockState();
    BlockState whiteLine35 = BlockRegistry.whiteLine35.get().defaultBlockState();
    BlockState whiteLine36 = BlockRegistry.whiteLine36.get().defaultBlockState();
    BlockState whiteLine37a = BlockRegistry.whiteLine37a.get().defaultBlockState();
    BlockState whiteLine37b = BlockRegistry.whiteLine37b.get().defaultBlockState();
    BlockState whiteLine37c = BlockRegistry.whiteLine37c.get().defaultBlockState();
    BlockState whiteLine37d = BlockRegistry.whiteLine37d.get().defaultBlockState();
    BlockState whiteLine38a = BlockRegistry.whiteLine38a.get().defaultBlockState();
    BlockState whiteLine38b = BlockRegistry.whiteLine38b.get().defaultBlockState();
    BlockState whiteLine38c = BlockRegistry.whiteLine38c.get().defaultBlockState();
    BlockState whiteLine38d = BlockRegistry.whiteLine38d.get().defaultBlockState();

    BlockState yellowLine1 = BlockRegistry.yellowLine1.get().defaultBlockState();
    BlockState yellowLine2 = BlockRegistry.yellowLine2.get().defaultBlockState();
    BlockState yellowLine3 = BlockRegistry.yellowLine3.get().defaultBlockState();
    BlockState yellowLine4 = BlockRegistry.yellowLine4.get().defaultBlockState();

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
        if (blockState.is(whiteLine27aSlab))
            return whiteLine27aSlab;
        if (blockState.is(whiteLine27bSlab))
            return whiteLine27bSlab;
        if (blockState.is(whiteLine27cSlab))
            return whiteLine27cSlab;
        if (blockState.is(whiteLine28Slab))
            return whiteLine28Slab;
        if (blockState.is(whiteLine29aSlab))
            return whiteLine29aSlab;
        if (blockState.is(whiteLine29bSlab))
            return whiteLine29bSlab;
        if (blockState.is(whiteLine29cSlab))
            return whiteLine29cSlab;
        if (blockState.is(whiteLine30aSlab))
            return whiteLine30aSlab;
        if (blockState.is(whiteLine30bSlab))
            return whiteLine30bSlab;
        if (blockState.is(whiteLine30cSlab))
            return whiteLine30cSlab;
        if (blockState.is(whiteLine31aSlab))
            return whiteLine31aSlab;
        if (blockState.is(whiteLine31bSlab))
            return whiteLine31bSlab;
        if (blockState.is(whiteLine31cSlab))
            return whiteLine31cSlab;
        if (blockState.is(whiteLine32Slab))
            return whiteLine32Slab;
        if (blockState.is(whiteLine33aSlab))
            return whiteLine33aSlab;
        if (blockState.is(whiteLine33bSlab))
            return whiteLine33bSlab;
        if (blockState.is(whiteLine34Slab))
            return whiteLine34Slab;
        if (blockState.is(whiteLine35Slab))
            return whiteLine35Slab;
        if (blockState.is(whiteLine36Slab))
            return whiteLine36Slab;
        if (blockState.is(whiteLine37aSlab))
            return whiteLine37aSlab;
        if (blockState.is(whiteLine37bSlab))
            return whiteLine37bSlab;
        if (blockState.is(whiteLine37cSlab))
            return whiteLine37cSlab;
        if (blockState.is(whiteLine37dSlab))
            return whiteLine37dSlab;
        if (blockState.is(whiteLine38aSlab))
            return whiteLine38aSlab;
        if (blockState.is(whiteLine38bSlab))
            return whiteLine38bSlab;
        if (blockState.is(whiteLine38cSlab))
            return whiteLine38cSlab;
        if (blockState.is(whiteLine38dSlab))
            return whiteLine38dSlab;

        if (blockState.is(yellowLine1Slab))
            return yellowLine1Slab;
        if (blockState.is(yellowLine2Slab))
            return yellowLine2Slab;
        if (blockState.is(whiteLine3Slab))
            return yellowLine3Slab;
        if (blockState.is(yellowLine4Slab))
            return yellowLine4Slab;
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
        if (blockState.is(whiteLine27aSlab))
            return whiteLine27a;
        if (blockState.is(whiteLine27bSlab))
            return whiteLine27b;
        if (blockState.is(whiteLine27cSlab))
            return whiteLine27c;
        if (blockState.is(whiteLine28Slab))
            return whiteLine28;
        if (blockState.is(whiteLine29aSlab))
            return whiteLine29a;
        if (blockState.is(whiteLine29bSlab))
            return whiteLine29b;
        if (blockState.is(whiteLine29cSlab))
            return whiteLine29c;
        if (blockState.is(whiteLine30aSlab))
            return whiteLine30a;
        if (blockState.is(whiteLine30bSlab))
            return whiteLine30b;
        if (blockState.is(whiteLine30cSlab))
            return whiteLine30c;
        if (blockState.is(whiteLine31aSlab))
            return whiteLine31a;
        if (blockState.is(whiteLine31bSlab))
            return whiteLine31b;
        if (blockState.is(whiteLine31cSlab))
            return whiteLine31c;
        if (blockState.is(whiteLine32Slab))
            return whiteLine32;
        if (blockState.is(whiteLine33aSlab))
            return whiteLine33a;
        if (blockState.is(whiteLine33bSlab))
            return whiteLine33b;
        if (blockState.is(whiteLine34Slab))
            return whiteLine34;
        if (blockState.is(whiteLine35Slab))
            return whiteLine35;
        if (blockState.is(whiteLine36Slab))
            return whiteLine36;
        if (blockState.is(whiteLine37aSlab))
            return whiteLine37a;
        if (blockState.is(whiteLine37bSlab))
            return whiteLine37b;
        if (blockState.is(whiteLine37cSlab))
            return whiteLine37c;
        if (blockState.is(whiteLine37dSlab))
            return whiteLine37d;
        if (blockState.is(whiteLine38aSlab))
            return whiteLine38a;
        if (blockState.is(whiteLine38bSlab))
            return whiteLine38b;
        if (blockState.is(whiteLine38cSlab))
            return whiteLine38c;
        if (blockState.is(whiteLine38dSlab))
            return whiteLine38d;

        if (blockState.is(yellowLine1Slab))
            return yellowLine1;
        if (blockState.is(yellowLine2Slab))
            return yellowLine2;
        if (blockState.is(yellowLine3Slab))
            return yellowLine3;
        if (blockState.is(yellowLine4Slab))
            return yellowLine4;
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

    Item whiteArrow1Item = ItemRegistry.whiteArrow1.get();
    Item whiteArrow2aItem = ItemRegistry.whiteArrow2a.get();
    Item whiteArrow2bItem = ItemRegistry.whiteArrow2b.get();

    BlockState whiteArrow1Block = BlockRegistry.whiteArrow1.get().defaultBlockState();
    BlockState whiteArrow2aBlock = BlockRegistry.whiteArrow2a.get().defaultBlockState();
    BlockState whiteArrow2bBlock = BlockRegistry.whiteArrow2b.get().defaultBlockState();

    public Item getArrowItem(PlayerEntity playerIn)
    {
        if (playerIn.getMainHandItem().getItem() == whiteArrow1Item)
            return whiteArrow1Item;
        if (playerIn.getMainHandItem().getItem() == whiteArrow2aItem)
            return whiteArrow2aItem;
        if (playerIn.getMainHandItem().getItem() == whiteArrow2bItem)
            return whiteArrow2bItem;
        return null;
    }

    public BlockState getArrowBlock(PlayerEntity playerIn)
    {
        if (playerIn.getMainHandItem().getItem() == whiteArrow1Item)
            return whiteArrow1Block;
        if (playerIn.getMainHandItem().getItem() == whiteArrow2aItem)
            return whiteArrow2aBlock;
        if (playerIn.getMainHandItem().getItem() == whiteArrow2bItem)
            return whiteArrow2bBlock;
        return null;
    }

    public ActionResultType getItemToBlock(World worldIn, BlockPos pos, PlayerEntity playerIn)
    {
    if (playerIn.getMainHandItem().getItem() == getArrowItem(playerIn) && worldIn.getBlockState(pos.above()) == Blocks.AIR.defaultBlockState()) {
            Direction direction = playerIn.getDirection();
            worldIn.setBlockAndUpdate(pos.above(), getArrowBlock(playerIn).setValue(FACING, direction.getOpposite()).setValue(BLOCK_TYPE, BlockType.SLAB_BLOCK));
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.FAIL;
    }
}