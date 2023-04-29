package heliecp.roadchina.block;

import heliecp.roadchina.item.ItemRegistry;
import heliecp.roadchina.properties.BlockType;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GetBlock
{
    private static final IProperty<EnumFacing> FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    public static final PropertyEnum<BlockType> BLOCK_TYPE = PropertyEnum.<BlockType>create("block_type", BlockType.class);

    Block asphaltRoadSlab = BlockRegistry.asphaltRoadSlab;
    Block whiteAsphaltRoadSlab = BlockRegistry.whiteAsphaltRoadSlab;
    Block yellowAsphaltRoadSlab = BlockRegistry.yellowAsphaltRoadSlab;

    IBlockState asphaltRoad = BlockRegistry.asphaltRoad.getDefaultState();
    IBlockState whiteAsphaltRoad = BlockRegistry.whiteAsphaltRoad.getDefaultState();
    IBlockState yellowAsphaltRoad = BlockRegistry.yellowAsphaltRoad.getDefaultState();

    public Block getRoadSlab(IBlockState blockState)
    {
        if(blockState.getBlock().equals(asphaltRoadSlab))
        {
            return asphaltRoadSlab;
        }
        if(blockState.getBlock().equals(whiteAsphaltRoadSlab))
        {
            return whiteAsphaltRoadSlab;
        }
        if(blockState.getBlock().equals(yellowAsphaltRoadSlab))
        {
            return yellowAsphaltRoadSlab;
        }
        return null;
    }

    public IBlockState getRoad(IBlockState blockState)
    {
        if(blockState.getBlock().equals(asphaltRoadSlab))
        {
            return asphaltRoad;
        }
        if(blockState.getBlock().equals(whiteAsphaltRoadSlab))
        {
            return whiteAsphaltRoad;
        }
        if(blockState.getBlock().equals(yellowAsphaltRoadSlab))
        {
            return yellowAsphaltRoad;
        }
        return null;
    }

    public IBlockState getSlabToBlockForRoad(World worldIn, BlockPos pos, IBlockState blockState)
    {
        if (worldIn.getBlockState(pos.down()).getBlock().equals(getRoadSlab(blockState)))
        {
            worldIn.setBlockState(pos.down(), getRoad(blockState));
            return Blocks.AIR.getDefaultState();
        }
        return null;
    }

    Block whiteLine1Slab = BlockRegistry.whiteLine1Slab;
    Block whiteLine2Slab = BlockRegistry.whiteLine2Slab;
    Block whiteLine3Slab = BlockRegistry.whiteLine3Slab;
    Block whiteLine4Slab = BlockRegistry.whiteLine4Slab;
    Block whiteLine5Slab = BlockRegistry.whiteLine5Slab;
    Block whiteLine6Slab = BlockRegistry.whiteLine6Slab;
    Block whiteLine7Slab = BlockRegistry.whiteLine7Slab;
    Block whiteLine8Slab = BlockRegistry.whiteLine8Slab;
    Block whiteLine9aSlab = BlockRegistry.whiteLine9aSlab;
    Block whiteLine9bSlab = BlockRegistry.whiteLine9bSlab;
    Block whiteLine10aSlab = BlockRegistry.whiteLine10aSlab;
    Block whiteLine10bSlab = BlockRegistry.whiteLine10bSlab;
    Block whiteLine11aSlab = BlockRegistry.whiteLine11aSlab;
    Block whiteLine11bSlab = BlockRegistry.whiteLine11bSlab;
    Block whiteLine12aSlab = BlockRegistry.whiteLine12aSlab;
    Block whiteLine12bSlab = BlockRegistry.whiteLine12bSlab;
    Block whiteLine13Slab = BlockRegistry.whiteLine13Slab;
    Block whiteLine14Slab = BlockRegistry.whiteLine14Slab;
    Block whiteLine15Slab = BlockRegistry.whiteLine15Slab;
    Block whiteLine16aSlab = BlockRegistry.whiteLine16aSlab;
    Block whiteLine16bSlab = BlockRegistry.whiteLine16bSlab;
    Block whiteLine17aSlab = BlockRegistry.whiteLine17aSlab;
    Block whiteLine17bSlab = BlockRegistry.whiteLine17bSlab;
    Block whiteLine18aSlab = BlockRegistry.whiteLine18aSlab;
    Block whiteLine18bSlab = BlockRegistry.whiteLine18bSlab;
    Block whiteLine19aSlab = BlockRegistry.whiteLine19aSlab;
    Block whiteLine19bSlab = BlockRegistry.whiteLine19bSlab;
    Block whiteLine20aSlab = BlockRegistry.whiteLine20aSlab;
    Block whiteLine20bSlab = BlockRegistry.whiteLine20bSlab;
    Block whiteLine21aSlab = BlockRegistry.whiteLine21aSlab;
    Block whiteLine21bSlab = BlockRegistry.whiteLine21bSlab;
    Block whiteLine22aSlab = BlockRegistry.whiteLine22aSlab;
    Block whiteLine22bSlab = BlockRegistry.whiteLine22bSlab;
    Block whiteLine23aSlab = BlockRegistry.whiteLine23aSlab;
    Block whiteLine23bSlab = BlockRegistry.whiteLine23bSlab;
    Block whiteLine23cSlab = BlockRegistry.whiteLine23cSlab;
    Block whiteLine24Slab = BlockRegistry.whiteLine24Slab;
    Block whiteLine25Slab = BlockRegistry.whiteLine25Slab;
    Block whiteLine26aSlab = BlockRegistry.whiteLine26aSlab;
    Block whiteLine26bSlab = BlockRegistry.whiteLine26bSlab;
    Block whiteLine26cSlab = BlockRegistry.whiteLine26cSlab;
    Block whiteLine27aSlab = BlockRegistry.whiteLine27aSlab;
    Block whiteLine27bSlab = BlockRegistry.whiteLine27bSlab;
    Block whiteLine27cSlab = BlockRegistry.whiteLine27cSlab;
    Block whiteLine28Slab = BlockRegistry.whiteLine28Slab;
    Block whiteLine29aSlab = BlockRegistry.whiteLine29aSlab;
    Block whiteLine29bSlab = BlockRegistry.whiteLine29bSlab;
    Block whiteLine29cSlab = BlockRegistry.whiteLine29cSlab;
    Block whiteLine30aSlab = BlockRegistry.whiteLine30aSlab;
    Block whiteLine30bSlab = BlockRegistry.whiteLine30bSlab;
    Block whiteLine30cSlab = BlockRegistry.whiteLine30cSlab;
    Block whiteLine31aSlab = BlockRegistry.whiteLine31aSlab;
    Block whiteLine31bSlab = BlockRegistry.whiteLine31bSlab;
    Block whiteLine31cSlab = BlockRegistry.whiteLine31cSlab;
    Block whiteLine32Slab = BlockRegistry.whiteLine32Slab;
    Block whiteLine33aSlab = BlockRegistry.whiteLine33aSlab;
    Block whiteLine33bSlab = BlockRegistry.whiteLine33bSlab;
    Block whiteLine34Slab = BlockRegistry.whiteLine34Slab;
    Block whiteLine35Slab = BlockRegistry.whiteLine35Slab;
    Block whiteLine36Slab = BlockRegistry.whiteLine36Slab;
    Block whiteLine37aSlab = BlockRegistry.whiteLine37aSlab;
    Block whiteLine37bSlab = BlockRegistry.whiteLine37bSlab;
    Block whiteLine37cSlab = BlockRegistry.whiteLine37cSlab;
    Block whiteLine37dSlab = BlockRegistry.whiteLine37dSlab;
    Block whiteLine38aSlab = BlockRegistry.whiteLine38aSlab;
    Block whiteLine38bSlab = BlockRegistry.whiteLine38bSlab;
    Block whiteLine38cSlab = BlockRegistry.whiteLine38cSlab;
    Block whiteLine38dSlab = BlockRegistry.whiteLine38dSlab;
    Block whiteLine39aSlab = BlockRegistry.whiteLine39aSlab;
    Block whiteLine39bSlab = BlockRegistry.whiteLine39bSlab;
    Block whiteLine39cSlab = BlockRegistry.whiteLine39cSlab;
    Block whiteLine39dSlab = BlockRegistry.whiteLine39dSlab;
    Block whiteLine40aSlab = BlockRegistry.whiteLine40aSlab;
    Block whiteLine40bSlab = BlockRegistry.whiteLine40bSlab;
    Block whiteLine40cSlab = BlockRegistry.whiteLine40cSlab;
    Block whiteLine40dSlab = BlockRegistry.whiteLine40dSlab;
    Block whiteLine41aSlab = BlockRegistry.whiteLine41aSlab;
    Block whiteLine41bSlab = BlockRegistry.whiteLine41bSlab;
    Block whiteLine41cSlab = BlockRegistry.whiteLine41cSlab;
    Block whiteLine41dSlab = BlockRegistry.whiteLine41dSlab;
    Block whiteLine42aSlab = BlockRegistry.whiteLine42aSlab;
    Block whiteLine42bSlab = BlockRegistry.whiteLine42bSlab;
    Block whiteLine42cSlab = BlockRegistry.whiteLine42cSlab;
    Block whiteLine42dSlab = BlockRegistry.whiteLine42dSlab;
    Block whiteLine43aSlab = BlockRegistry.whiteLine43aSlab;
    Block whiteLine43bSlab = BlockRegistry.whiteLine43bSlab;
    Block whiteLine44Slab = BlockRegistry.whiteLine44Slab;
    Block whiteLine45Slab = BlockRegistry.whiteLine45Slab;
    Block whiteLine46Slab = BlockRegistry.whiteLine46Slab;
    Block whiteLine47aSlab = BlockRegistry.whiteLine47aSlab;
    Block whiteLine47bSlab = BlockRegistry.whiteLine47bSlab;
    Block whiteLine48aSlab = BlockRegistry.whiteLine48aSlab;
    Block whiteLine48bSlab = BlockRegistry.whiteLine48bSlab;

    Block yellowLine1Slab = BlockRegistry.yellowLine1Slab;
    Block yellowLine2Slab = BlockRegistry.yellowLine2Slab;
    Block yellowLine3Slab = BlockRegistry.yellowLine3Slab;
    Block yellowLine4Slab = BlockRegistry.yellowLine4Slab;
    Block yellowLine5Slab = BlockRegistry.yellowLine5Slab;
    Block yellowLine6Slab = BlockRegistry.yellowLine6Slab;
    Block yellowLine7Slab = BlockRegistry.yellowLine7Slab;
    Block yellowLine8Slab = BlockRegistry.yellowLine8Slab;
    Block yellowLine9Slab = BlockRegistry.yellowLine9Slab;
    Block yellowLine10aSlab = BlockRegistry.yellowLine10aSlab;
    Block yellowLine10bSlab = BlockRegistry.yellowLine10bSlab;
    Block yellowLine11aSlab = BlockRegistry.yellowLine11aSlab;
    Block yellowLine11bSlab = BlockRegistry.yellowLine11bSlab;
    Block yellowLine12aSlab = BlockRegistry.yellowLine12aSlab;
    Block yellowLine12bSlab = BlockRegistry.yellowLine12bSlab;

    Block whiteYellowLine1aSlab = BlockRegistry.whiteYellowLine1aSlab;
    Block whiteYellowLine1bSlab = BlockRegistry.whiteYellowLine1bSlab;
    Block whiteYellowLine2aSlab = BlockRegistry.whiteYellowLine2aSlab;
    Block whiteYellowLine2bSlab = BlockRegistry.whiteYellowLine2bSlab;
    Block whiteYellowLine3aSlab = BlockRegistry.whiteYellowLine3aSlab;
    Block whiteYellowLine3bSlab = BlockRegistry.whiteYellowLine3bSlab;
    Block whiteYellowLine4Slab = BlockRegistry.whiteYellowLine4Slab;
    Block whiteYellowLine5aSlab = BlockRegistry.whiteYellowLine5aSlab;
    Block whiteYellowLine5bSlab = BlockRegistry.whiteYellowLine5bSlab;
    Block whiteYellowLine5cSlab = BlockRegistry.whiteYellowLine5cSlab;
    Block whiteYellowLine6aSlab = BlockRegistry.whiteYellowLine6aSlab;
    Block whiteYellowLine6bSlab = BlockRegistry.whiteYellowLine6bSlab;
    Block whiteYellowLine6cSlab = BlockRegistry.whiteYellowLine6cSlab;
    Block whiteYellowLine7aSlab = BlockRegistry.whiteYellowLine7aSlab;
    Block whiteYellowLine7bSlab = BlockRegistry.whiteYellowLine7bSlab;
    Block whiteYellowLine7cSlab = BlockRegistry.whiteYellowLine7cSlab;
    Block whiteYellowLine8Slab = BlockRegistry.whiteYellowLine8Slab;

    IBlockState whiteLine1 = BlockRegistry.whiteLine1.getDefaultState();
    IBlockState whiteLine2 = BlockRegistry.whiteLine2.getDefaultState();
    IBlockState whiteLine3 = BlockRegistry.whiteLine3.getDefaultState();
    IBlockState whiteLine4 = BlockRegistry.whiteLine4.getDefaultState();
    IBlockState whiteLine5 = BlockRegistry.whiteLine5.getDefaultState();
    IBlockState whiteLine6 = BlockRegistry.whiteLine6.getDefaultState();
    IBlockState whiteLine7 = BlockRegistry.whiteLine7.getDefaultState();
    IBlockState whiteLine8 = BlockRegistry.whiteLine8.getDefaultState();
    IBlockState whiteLine9a = BlockRegistry.whiteLine9a.getDefaultState();
    IBlockState whiteLine9b = BlockRegistry.whiteLine9b.getDefaultState();
    IBlockState whiteLine10a = BlockRegistry.whiteLine10a.getDefaultState();
    IBlockState whiteLine10b = BlockRegistry.whiteLine10b.getDefaultState();
    IBlockState whiteLine11a = BlockRegistry.whiteLine11a.getDefaultState();
    IBlockState whiteLine11b = BlockRegistry.whiteLine11b.getDefaultState();
    IBlockState whiteLine12a = BlockRegistry.whiteLine12a.getDefaultState();
    IBlockState whiteLine12b = BlockRegistry.whiteLine12b.getDefaultState();
    IBlockState whiteLine13 = BlockRegistry.whiteLine13.getDefaultState();
    IBlockState whiteLine14 = BlockRegistry.whiteLine14.getDefaultState();
    IBlockState whiteLine15 = BlockRegistry.whiteLine15.getDefaultState();
    IBlockState whiteLine16a = BlockRegistry.whiteLine16a.getDefaultState();
    IBlockState whiteLine16b = BlockRegistry.whiteLine16b.getDefaultState();
    IBlockState whiteLine17a = BlockRegistry.whiteLine17a.getDefaultState();
    IBlockState whiteLine17b = BlockRegistry.whiteLine17b.getDefaultState();
    IBlockState whiteLine18a = BlockRegistry.whiteLine18a.getDefaultState();
    IBlockState whiteLine18b = BlockRegistry.whiteLine18b.getDefaultState();
    IBlockState whiteLine19a = BlockRegistry.whiteLine19a.getDefaultState();
    IBlockState whiteLine19b = BlockRegistry.whiteLine19b.getDefaultState();
    IBlockState whiteLine20a = BlockRegistry.whiteLine20a.getDefaultState();
    IBlockState whiteLine20b = BlockRegistry.whiteLine20b.getDefaultState();
    IBlockState whiteLine21a = BlockRegistry.whiteLine21a.getDefaultState();
    IBlockState whiteLine21b = BlockRegistry.whiteLine21b.getDefaultState();
    IBlockState whiteLine22a = BlockRegistry.whiteLine22a.getDefaultState();
    IBlockState whiteLine22b = BlockRegistry.whiteLine22b.getDefaultState();
    IBlockState whiteLine23a = BlockRegistry.whiteLine23a.getDefaultState();
    IBlockState whiteLine23b = BlockRegistry.whiteLine23b.getDefaultState();
    IBlockState whiteLine23c = BlockRegistry.whiteLine23c.getDefaultState();
    IBlockState whiteLine24 = BlockRegistry.whiteLine24.getDefaultState();
    IBlockState whiteLine25 = BlockRegistry.whiteLine25.getDefaultState();
    IBlockState whiteLine26a = BlockRegistry.whiteLine26a.getDefaultState();
    IBlockState whiteLine26b = BlockRegistry.whiteLine26b.getDefaultState();
    IBlockState whiteLine26c = BlockRegistry.whiteLine26c.getDefaultState();
    IBlockState whiteLine27a = BlockRegistry.whiteLine27a.getDefaultState();
    IBlockState whiteLine27b = BlockRegistry.whiteLine27b.getDefaultState();
    IBlockState whiteLine27c = BlockRegistry.whiteLine27c.getDefaultState();
    IBlockState whiteLine28 = BlockRegistry.whiteLine28.getDefaultState();
    IBlockState whiteLine29a = BlockRegistry.whiteLine29a.getDefaultState();
    IBlockState whiteLine29b = BlockRegistry.whiteLine29b.getDefaultState();
    IBlockState whiteLine29c = BlockRegistry.whiteLine29c.getDefaultState();
    IBlockState whiteLine30a = BlockRegistry.whiteLine30a.getDefaultState();
    IBlockState whiteLine30b = BlockRegistry.whiteLine30b.getDefaultState();
    IBlockState whiteLine30c = BlockRegistry.whiteLine30c.getDefaultState();
    IBlockState whiteLine31a = BlockRegistry.whiteLine31a.getDefaultState();
    IBlockState whiteLine31b = BlockRegistry.whiteLine31b.getDefaultState();
    IBlockState whiteLine31c = BlockRegistry.whiteLine31c.getDefaultState();
    IBlockState whiteLine32 = BlockRegistry.whiteLine32.getDefaultState();
    IBlockState whiteLine33a = BlockRegistry.whiteLine33a.getDefaultState();
    IBlockState whiteLine33b = BlockRegistry.whiteLine33b.getDefaultState();
    IBlockState whiteLine34 = BlockRegistry.whiteLine34.getDefaultState();
    IBlockState whiteLine35 = BlockRegistry.whiteLine35.getDefaultState();
    IBlockState whiteLine36 = BlockRegistry.whiteLine36.getDefaultState();
    IBlockState whiteLine37a = BlockRegistry.whiteLine37a.getDefaultState();
    IBlockState whiteLine37b = BlockRegistry.whiteLine37b.getDefaultState();
    IBlockState whiteLine37c = BlockRegistry.whiteLine37c.getDefaultState();
    IBlockState whiteLine37d = BlockRegistry.whiteLine37d.getDefaultState();
    IBlockState whiteLine38a = BlockRegistry.whiteLine38a.getDefaultState();
    IBlockState whiteLine38b = BlockRegistry.whiteLine38b.getDefaultState();
    IBlockState whiteLine38c = BlockRegistry.whiteLine38c.getDefaultState();
    IBlockState whiteLine38d = BlockRegistry.whiteLine38d.getDefaultState();
    IBlockState whiteLine39a = BlockRegistry.whiteLine39a.getDefaultState();
    IBlockState whiteLine39b = BlockRegistry.whiteLine39b.getDefaultState();
    IBlockState whiteLine39c = BlockRegistry.whiteLine39c.getDefaultState();
    IBlockState whiteLine39d = BlockRegistry.whiteLine39d.getDefaultState();
    IBlockState whiteLine40a = BlockRegistry.whiteLine40a.getDefaultState();
    IBlockState whiteLine40b = BlockRegistry.whiteLine40b.getDefaultState();
    IBlockState whiteLine40c = BlockRegistry.whiteLine40c.getDefaultState();
    IBlockState whiteLine40d = BlockRegistry.whiteLine40d.getDefaultState();
    IBlockState whiteLine41a = BlockRegistry.whiteLine41a.getDefaultState();
    IBlockState whiteLine41b = BlockRegistry.whiteLine41b.getDefaultState();
    IBlockState whiteLine41c = BlockRegistry.whiteLine41c.getDefaultState();
    IBlockState whiteLine41d = BlockRegistry.whiteLine41d.getDefaultState();
    IBlockState whiteLine42a = BlockRegistry.whiteLine42a.getDefaultState();
    IBlockState whiteLine42b = BlockRegistry.whiteLine42b.getDefaultState();
    IBlockState whiteLine42c = BlockRegistry.whiteLine42c.getDefaultState();
    IBlockState whiteLine42d = BlockRegistry.whiteLine42d.getDefaultState();
    IBlockState whiteLine43a = BlockRegistry.whiteLine43a.getDefaultState();
    IBlockState whiteLine43b = BlockRegistry.whiteLine43b.getDefaultState();
    IBlockState whiteLine44 = BlockRegistry.whiteLine44.getDefaultState();
    IBlockState whiteLine45 = BlockRegistry.whiteLine45.getDefaultState();
    IBlockState whiteLine46 = BlockRegistry.whiteLine46.getDefaultState();
    IBlockState whiteLine47a = BlockRegistry.whiteLine47a.getDefaultState();
    IBlockState whiteLine47b = BlockRegistry.whiteLine47b.getDefaultState();
    IBlockState whiteLine48a = BlockRegistry.whiteLine48a.getDefaultState();
    IBlockState whiteLine48b = BlockRegistry.whiteLine48b.getDefaultState();

    IBlockState yellowLine1 = BlockRegistry.yellowLine1.getDefaultState();
    IBlockState yellowLine2 = BlockRegistry.yellowLine2.getDefaultState();
    IBlockState yellowLine3 = BlockRegistry.yellowLine3.getDefaultState();
    IBlockState yellowLine4 = BlockRegistry.yellowLine4.getDefaultState();
    IBlockState yellowLine5 = BlockRegistry.yellowLine5.getDefaultState();
    IBlockState yellowLine6 = BlockRegistry.yellowLine6.getDefaultState();
    IBlockState yellowLine7 = BlockRegistry.yellowLine7.getDefaultState();
    IBlockState yellowLine8 = BlockRegistry.yellowLine8.getDefaultState();
    IBlockState yellowLine9 = BlockRegistry.yellowLine9.getDefaultState();
    IBlockState yellowLine10a = BlockRegistry.yellowLine10a.getDefaultState();
    IBlockState yellowLine10b = BlockRegistry.yellowLine10b.getDefaultState();
    IBlockState yellowLine11a = BlockRegistry.yellowLine11a.getDefaultState();
    IBlockState yellowLine11b = BlockRegistry.yellowLine11b.getDefaultState();
    IBlockState yellowLine12a = BlockRegistry.yellowLine12a.getDefaultState();
    IBlockState yellowLine12b = BlockRegistry.yellowLine12b.getDefaultState();

    IBlockState whiteYellowLine1a = BlockRegistry.whiteYellowLine1a.getDefaultState();
    IBlockState whiteYellowLine1b = BlockRegistry.whiteYellowLine1b.getDefaultState();
    IBlockState whiteYellowLine2a = BlockRegistry.whiteYellowLine2a.getDefaultState();
    IBlockState whiteYellowLine2b = BlockRegistry.whiteYellowLine2b.getDefaultState();
    IBlockState whiteYellowLine3a = BlockRegistry.whiteYellowLine3a.getDefaultState();
    IBlockState whiteYellowLine3b = BlockRegistry.whiteYellowLine3b.getDefaultState();
    IBlockState whiteYellowLine4 = BlockRegistry.whiteYellowLine4.getDefaultState();
    IBlockState whiteYellowLine5a = BlockRegistry.whiteYellowLine5a.getDefaultState();
    IBlockState whiteYellowLine5b = BlockRegistry.whiteYellowLine5b.getDefaultState();
    IBlockState whiteYellowLine5c = BlockRegistry.whiteYellowLine5c.getDefaultState();
    IBlockState whiteYellowLine6a = BlockRegistry.whiteYellowLine6a.getDefaultState();
    IBlockState whiteYellowLine6b = BlockRegistry.whiteYellowLine6b.getDefaultState();
    IBlockState whiteYellowLine6c = BlockRegistry.whiteYellowLine6c.getDefaultState();
    IBlockState whiteYellowLine7a = BlockRegistry.whiteYellowLine7a.getDefaultState();
    IBlockState whiteYellowLine7b = BlockRegistry.whiteYellowLine7b.getDefaultState();
    IBlockState whiteYellowLine7c = BlockRegistry.whiteYellowLine7c.getDefaultState();
    IBlockState whiteYellowLine8 = BlockRegistry.whiteYellowLine8.getDefaultState();

    public Block getLineSlab(IBlockState blockState)
    {
        if (blockState.getBlock().equals(whiteLine1Slab))
            return whiteLine1Slab;
        if (blockState.getBlock().equals(whiteLine2Slab))
            return whiteLine2Slab;
        if (blockState.getBlock().equals(whiteLine3Slab))
            return whiteLine3Slab;
        if (blockState.getBlock().equals(whiteLine4Slab))
            return whiteLine4Slab;
        if (blockState.getBlock().equals(whiteLine5Slab))
            return whiteLine5Slab;
        if (blockState.getBlock().equals(whiteLine6Slab))
            return whiteLine6Slab;
        if (blockState.getBlock().equals(whiteLine7Slab))
            return whiteLine7Slab;
        if (blockState.getBlock().equals(whiteLine8Slab))
            return whiteLine8Slab;
        if (blockState.getBlock().equals(whiteLine9aSlab))
            return whiteLine9aSlab;
        if (blockState.getBlock().equals(whiteLine9bSlab))
            return whiteLine9bSlab;
        if (blockState.getBlock().equals(whiteLine10aSlab))
            return whiteLine10aSlab;
        if (blockState.getBlock().equals(whiteLine10bSlab))
            return whiteLine10bSlab;
        if (blockState.getBlock().equals(whiteLine11aSlab))
            return whiteLine11aSlab;
        if (blockState.getBlock().equals(whiteLine11bSlab))
            return whiteLine11bSlab;
        if (blockState.getBlock().equals(whiteLine12aSlab))
            return whiteLine12aSlab;
        if (blockState.getBlock().equals(whiteLine12bSlab))
            return whiteLine12bSlab;
        if (blockState.getBlock().equals(whiteLine13Slab))
            return whiteLine13Slab;
        if (blockState.getBlock().equals(whiteLine14Slab))
            return whiteLine14Slab;
        if (blockState.getBlock().equals(whiteLine15Slab))
            return whiteLine15Slab;
        if (blockState.getBlock().equals(whiteLine16aSlab))
            return whiteLine16aSlab;
        if (blockState.getBlock().equals(whiteLine16bSlab))
            return whiteLine16bSlab;
        if (blockState.getBlock().equals(whiteLine17aSlab))
            return whiteLine17aSlab;
        if (blockState.getBlock().equals(whiteLine17bSlab))
            return whiteLine17bSlab;
        if (blockState.getBlock().equals(whiteLine18aSlab))
            return whiteLine18aSlab;
        if (blockState.getBlock().equals(whiteLine18bSlab))
            return whiteLine18bSlab;
        if (blockState.getBlock().equals(whiteLine19aSlab))
            return whiteLine19aSlab;
        if (blockState.getBlock().equals(whiteLine19bSlab))
            return whiteLine19bSlab;
        if (blockState.getBlock().equals(whiteLine20aSlab))
            return whiteLine20aSlab;
        if (blockState.getBlock().equals(whiteLine20bSlab))
            return whiteLine20bSlab;
        if (blockState.getBlock().equals(whiteLine21aSlab))
            return whiteLine21aSlab;
        if (blockState.getBlock().equals(whiteLine21bSlab))
            return whiteLine21bSlab;
        if (blockState.getBlock().equals(whiteLine22aSlab))
            return whiteLine22aSlab;
        if (blockState.getBlock().equals(whiteLine22bSlab))
            return whiteLine22bSlab;
        if (blockState.getBlock().equals(whiteLine23aSlab))
            return whiteLine23aSlab;
        if (blockState.getBlock().equals(whiteLine23bSlab))
            return whiteLine23bSlab;
        if (blockState.getBlock().equals(whiteLine23cSlab))
            return whiteLine23cSlab;
        if (blockState.getBlock().equals(whiteLine24Slab))
            return whiteLine24Slab;
        if (blockState.getBlock().equals(whiteLine25Slab))
            return whiteLine25Slab;
        if (blockState.getBlock().equals(whiteLine26aSlab))
            return whiteLine26aSlab;
        if (blockState.getBlock().equals(whiteLine26bSlab))
            return whiteLine26bSlab;
        if (blockState.getBlock().equals(whiteLine26cSlab))
            return whiteLine26cSlab;
        if (blockState.getBlock().equals(whiteLine27aSlab))
            return whiteLine27aSlab;
        if (blockState.getBlock().equals(whiteLine27bSlab))
            return whiteLine27bSlab;
        if (blockState.getBlock().equals(whiteLine27cSlab))
            return whiteLine27cSlab;
        if (blockState.getBlock().equals(whiteLine28Slab))
            return whiteLine28Slab;
        if (blockState.getBlock().equals(whiteLine29aSlab))
            return whiteLine29aSlab;
        if (blockState.getBlock().equals(whiteLine29bSlab))
            return whiteLine29bSlab;
        if (blockState.getBlock().equals(whiteLine29cSlab))
            return whiteLine29cSlab;
        if (blockState.getBlock().equals(whiteLine30aSlab))
            return whiteLine30aSlab;
        if (blockState.getBlock().equals(whiteLine30bSlab))
            return whiteLine30bSlab;
        if (blockState.getBlock().equals(whiteLine30cSlab))
            return whiteLine30cSlab;
        if (blockState.getBlock().equals(whiteLine31aSlab))
            return whiteLine31aSlab;
        if (blockState.getBlock().equals(whiteLine31bSlab))
            return whiteLine31bSlab;
        if (blockState.getBlock().equals(whiteLine31cSlab))
            return whiteLine31cSlab;
        if (blockState.getBlock().equals(whiteLine32Slab))
            return whiteLine32Slab;
        if (blockState.getBlock().equals(whiteLine33aSlab))
            return whiteLine33aSlab;
        if (blockState.getBlock().equals(whiteLine33bSlab))
            return whiteLine33bSlab;
        if (blockState.getBlock().equals(whiteLine34Slab))
            return whiteLine34Slab;
        if (blockState.getBlock().equals(whiteLine35Slab))
            return whiteLine35Slab;
        if (blockState.getBlock().equals(whiteLine36Slab))
            return whiteLine36Slab;
        if (blockState.getBlock().equals(whiteLine37aSlab))
            return whiteLine37aSlab;
        if (blockState.getBlock().equals(whiteLine37bSlab))
            return whiteLine37bSlab;
        if (blockState.getBlock().equals(whiteLine37cSlab))
            return whiteLine37cSlab;
        if (blockState.getBlock().equals(whiteLine37dSlab))
            return whiteLine37dSlab;
        if (blockState.getBlock().equals(whiteLine38aSlab))
            return whiteLine38aSlab;
        if (blockState.getBlock().equals(whiteLine38bSlab))
            return whiteLine38bSlab;
        if (blockState.getBlock().equals(whiteLine38cSlab))
            return whiteLine38cSlab;
        if (blockState.getBlock().equals(whiteLine38dSlab))
            return whiteLine38dSlab;
        if (blockState.getBlock().equals(whiteLine39aSlab))
            return whiteLine39aSlab;
        if (blockState.getBlock().equals(whiteLine39bSlab))
            return whiteLine39bSlab;
        if (blockState.getBlock().equals(whiteLine39cSlab))
            return whiteLine39cSlab;
        if (blockState.getBlock().equals(whiteLine39dSlab))
            return whiteLine39dSlab;
        if (blockState.getBlock().equals(whiteLine40aSlab))
            return whiteLine40aSlab;
        if (blockState.getBlock().equals(whiteLine40bSlab))
            return whiteLine40bSlab;
        if (blockState.getBlock().equals(whiteLine40cSlab))
            return whiteLine40cSlab;
        if (blockState.getBlock().equals(whiteLine40dSlab))
            return whiteLine40dSlab;
        if (blockState.getBlock().equals(whiteLine41aSlab))
            return whiteLine41aSlab;
        if (blockState.getBlock().equals(whiteLine41bSlab))
            return whiteLine41bSlab;
        if (blockState.getBlock().equals(whiteLine41cSlab))
            return whiteLine41cSlab;
        if (blockState.getBlock().equals(whiteLine41dSlab))
            return whiteLine41dSlab;
        if (blockState.getBlock().equals(whiteLine42aSlab))
            return whiteLine42aSlab;
        if (blockState.getBlock().equals(whiteLine42bSlab))
            return whiteLine42bSlab;
        if (blockState.getBlock().equals(whiteLine42cSlab))
            return whiteLine42cSlab;
        if (blockState.getBlock().equals(whiteLine42dSlab))
            return whiteLine42dSlab;
        if (blockState.getBlock().equals(whiteLine43aSlab))
            return whiteLine43aSlab;
        if (blockState.getBlock().equals(whiteLine43bSlab))
            return whiteLine43bSlab;
        if (blockState.getBlock().equals(whiteLine44Slab))
            return whiteLine44Slab;
        if (blockState.getBlock().equals(whiteLine45Slab))
            return whiteLine45Slab;
        if (blockState.getBlock().equals(whiteLine46Slab))
            return whiteLine46Slab;
        if (blockState.getBlock().equals(whiteLine47aSlab))
            return whiteLine47aSlab;
        if (blockState.getBlock().equals(whiteLine47bSlab))
            return whiteLine47bSlab;
        if (blockState.getBlock().equals(whiteLine48aSlab))
            return whiteLine48aSlab;
        if (blockState.getBlock().equals(whiteLine48bSlab))
            return whiteLine48bSlab;

        if (blockState.getBlock().equals(yellowLine1Slab))
            return yellowLine1Slab;
        if (blockState.getBlock().equals(yellowLine2Slab))
            return yellowLine2Slab;
        if (blockState.getBlock().equals(yellowLine3Slab))
            return yellowLine3Slab;
        if (blockState.getBlock().equals(yellowLine4Slab))
            return yellowLine4Slab;
        if (blockState.getBlock().equals(yellowLine5Slab))
            return yellowLine5Slab;
        if (blockState.getBlock().equals(yellowLine6Slab))
            return yellowLine6Slab;
        if (blockState.getBlock().equals(yellowLine7Slab))
            return yellowLine7Slab;
        if (blockState.getBlock().equals(yellowLine8Slab))
            return yellowLine8Slab;
        if (blockState.getBlock().equals(yellowLine9Slab))
            return yellowLine9Slab;
        if (blockState.getBlock().equals(yellowLine10aSlab))
            return yellowLine10aSlab;
        if (blockState.getBlock().equals(yellowLine10bSlab))
            return yellowLine10bSlab;
        if (blockState.getBlock().equals(yellowLine11aSlab))
            return yellowLine11aSlab;
        if (blockState.getBlock().equals(yellowLine11bSlab))
            return yellowLine11bSlab;
        if (blockState.getBlock().equals(yellowLine12aSlab))
            return yellowLine12aSlab;
        if (blockState.getBlock().equals(yellowLine12bSlab))
            return yellowLine12bSlab;

        if (blockState.getBlock().equals(whiteYellowLine1aSlab))
            return whiteYellowLine1aSlab;
        if (blockState.getBlock().equals(whiteYellowLine1bSlab))
            return whiteYellowLine1bSlab;
        if (blockState.getBlock().equals(whiteYellowLine2aSlab))
            return whiteYellowLine2aSlab;
        if (blockState.getBlock().equals(whiteYellowLine2bSlab))
            return whiteYellowLine2bSlab;
        if (blockState.getBlock().equals(whiteYellowLine3aSlab))
            return whiteYellowLine3aSlab;
        if (blockState.getBlock().equals(whiteYellowLine3bSlab))
            return whiteYellowLine3bSlab;
        if (blockState.getBlock().equals(whiteYellowLine4Slab))
            return whiteYellowLine4Slab;
        if (blockState.getBlock().equals(whiteYellowLine5aSlab))
            return whiteYellowLine5aSlab;
        if (blockState.getBlock().equals(whiteYellowLine5bSlab))
            return whiteYellowLine5bSlab;
        if (blockState.getBlock().equals(whiteYellowLine5cSlab))
            return whiteYellowLine5cSlab;
        if (blockState.getBlock().equals(whiteYellowLine6aSlab))
            return whiteYellowLine6aSlab;
        if (blockState.getBlock().equals(whiteYellowLine6bSlab))
            return whiteYellowLine6bSlab;
        if (blockState.getBlock().equals(whiteYellowLine6cSlab))
            return whiteYellowLine6cSlab;
        if (blockState.getBlock().equals(whiteYellowLine7aSlab))
            return whiteYellowLine7aSlab;
        if (blockState.getBlock().equals(whiteYellowLine7bSlab))
            return whiteYellowLine7bSlab;
        if (blockState.getBlock().equals(whiteYellowLine7cSlab))
            return whiteYellowLine7cSlab;
        if (blockState.getBlock().equals(whiteYellowLine8Slab))
            return whiteYellowLine8Slab;
        return null;
    }

    public IBlockState getLine(IBlockState blockState)
    {
        if (blockState.getBlock().equals(whiteLine1Slab))
            return whiteLine1;
        if (blockState.getBlock().equals(whiteLine2Slab))
            return whiteLine2;
        if (blockState.getBlock().equals(whiteLine3Slab))
            return whiteLine3;
        if (blockState.getBlock().equals(whiteLine4Slab))
            return whiteLine4;
        if (blockState.getBlock().equals(whiteLine5Slab))
            return whiteLine5;
        if (blockState.getBlock().equals(whiteLine6Slab))
            return whiteLine6;
        if (blockState.getBlock().equals(whiteLine7Slab))
            return whiteLine7;
        if (blockState.getBlock().equals(whiteLine8Slab))
            return whiteLine8;
        if (blockState.getBlock().equals(whiteLine9aSlab))
            return whiteLine9a;
        if (blockState.getBlock().equals(whiteLine9bSlab))
            return whiteLine9b;
        if (blockState.getBlock().equals(whiteLine10aSlab))
            return whiteLine10a;
        if (blockState.getBlock().equals(whiteLine10bSlab))
            return whiteLine10b;
        if (blockState.getBlock().equals(whiteLine11aSlab))
            return whiteLine11a;
        if (blockState.getBlock().equals(whiteLine11bSlab))
            return whiteLine11b;
        if (blockState.getBlock().equals(whiteLine12aSlab))
            return whiteLine12a;
        if (blockState.getBlock().equals(whiteLine12bSlab))
            return whiteLine12b;
        if (blockState.getBlock().equals(whiteLine13Slab))
            return whiteLine13;
        if (blockState.getBlock().equals(whiteLine14Slab))
            return whiteLine14;
        if (blockState.getBlock().equals(whiteLine15Slab))
            return whiteLine15;
        if (blockState.getBlock().equals(whiteLine16aSlab))
            return whiteLine16a;
        if (blockState.getBlock().equals(whiteLine16bSlab))
            return whiteLine16b;
        if (blockState.getBlock().equals(whiteLine17aSlab))
            return whiteLine17a;
        if (blockState.getBlock().equals(whiteLine17bSlab))
            return whiteLine17b;
        if (blockState.getBlock().equals(whiteLine18aSlab))
            return whiteLine18a;
        if (blockState.getBlock().equals(whiteLine18bSlab))
            return whiteLine18b;
        if (blockState.getBlock().equals(whiteLine19aSlab))
            return whiteLine19a;
        if (blockState.getBlock().equals(whiteLine19bSlab))
            return whiteLine19b;
        if (blockState.getBlock().equals(whiteLine20aSlab))
            return whiteLine20a;
        if (blockState.getBlock().equals(whiteLine20bSlab))
            return whiteLine20b;
        if (blockState.getBlock().equals(whiteLine21aSlab))
            return whiteLine21a;
        if (blockState.getBlock().equals(whiteLine21bSlab))
            return whiteLine21b;
        if (blockState.getBlock().equals(whiteLine22aSlab))
            return whiteLine22a;
        if (blockState.getBlock().equals(whiteLine22bSlab))
            return whiteLine22b;
        if (blockState.getBlock().equals(whiteLine23aSlab))
            return whiteLine23a;
        if (blockState.getBlock().equals(whiteLine23bSlab))
            return whiteLine23b;
        if (blockState.getBlock().equals(whiteLine23cSlab))
            return whiteLine23c;
        if (blockState.getBlock().equals(whiteLine24Slab))
            return whiteLine24;
        if (blockState.getBlock().equals(whiteLine25Slab))
            return whiteLine25;
        if (blockState.getBlock().equals(whiteLine26aSlab))
            return whiteLine26a;
        if (blockState.getBlock().equals(whiteLine26bSlab))
            return whiteLine26b;
        if (blockState.getBlock().equals(whiteLine26cSlab))
            return whiteLine26c;
        if (blockState.getBlock().equals(whiteLine27aSlab))
            return whiteLine27a;
        if (blockState.getBlock().equals(whiteLine27bSlab))
            return whiteLine27b;
        if (blockState.getBlock().equals(whiteLine27cSlab))
            return whiteLine27c;
        if (blockState.getBlock().equals(whiteLine28Slab))
            return whiteLine28;
        if (blockState.getBlock().equals(whiteLine29aSlab))
            return whiteLine29a;
        if (blockState.getBlock().equals(whiteLine29bSlab))
            return whiteLine29b;
        if (blockState.getBlock().equals(whiteLine29cSlab))
            return whiteLine29c;
        if (blockState.getBlock().equals(whiteLine30aSlab))
            return whiteLine30a;
        if (blockState.getBlock().equals(whiteLine30bSlab))
            return whiteLine30b;
        if (blockState.getBlock().equals(whiteLine30cSlab))
            return whiteLine30c;
        if (blockState.getBlock().equals(whiteLine31aSlab))
            return whiteLine31a;
        if (blockState.getBlock().equals(whiteLine31bSlab))
            return whiteLine31b;
        if (blockState.getBlock().equals(whiteLine31cSlab))
            return whiteLine31c;
        if (blockState.getBlock().equals(whiteLine32Slab))
            return whiteLine32;
        if (blockState.getBlock().equals(whiteLine33aSlab))
            return whiteLine33a;
        if (blockState.getBlock().equals(whiteLine33bSlab))
            return whiteLine33b;
        if (blockState.getBlock().equals(whiteLine34Slab))
            return whiteLine34;
        if (blockState.getBlock().equals(whiteLine35Slab))
            return whiteLine35;
        if (blockState.getBlock().equals(whiteLine36Slab))
            return whiteLine36;
        if (blockState.getBlock().equals(whiteLine37aSlab))
            return whiteLine37a;
        if (blockState.getBlock().equals(whiteLine37bSlab))
            return whiteLine37b;
        if (blockState.getBlock().equals(whiteLine37cSlab))
            return whiteLine37c;
        if (blockState.getBlock().equals(whiteLine37dSlab))
            return whiteLine37d;
        if (blockState.getBlock().equals(whiteLine38aSlab))
            return whiteLine38a;
        if (blockState.getBlock().equals(whiteLine38bSlab))
            return whiteLine38b;
        if (blockState.getBlock().equals(whiteLine38cSlab))
            return whiteLine38c;
        if (blockState.getBlock().equals(whiteLine38dSlab))
            return whiteLine38d;
        if (blockState.getBlock().equals(whiteLine39aSlab))
            return whiteLine39a;
        if (blockState.getBlock().equals(whiteLine39bSlab))
            return whiteLine39b;
        if (blockState.getBlock().equals(whiteLine39cSlab))
            return whiteLine39c;
        if (blockState.getBlock().equals(whiteLine39dSlab))
            return whiteLine39d;
        if (blockState.getBlock().equals(whiteLine40aSlab))
            return whiteLine40a;
        if (blockState.getBlock().equals(whiteLine40bSlab))
            return whiteLine40b;
        if (blockState.getBlock().equals(whiteLine40cSlab))
            return whiteLine40c;
        if (blockState.getBlock().equals(whiteLine40dSlab))
            return whiteLine40d;
        if (blockState.getBlock().equals(whiteLine41aSlab))
            return whiteLine41a;
        if (blockState.getBlock().equals(whiteLine41bSlab))
            return whiteLine41b;
        if (blockState.getBlock().equals(whiteLine41cSlab))
            return whiteLine41c;
        if (blockState.getBlock().equals(whiteLine41dSlab))
            return whiteLine41d;
        if (blockState.getBlock().equals(whiteLine42aSlab))
            return whiteLine42a;
        if (blockState.getBlock().equals(whiteLine42bSlab))
            return whiteLine42b;
        if (blockState.getBlock().equals(whiteLine42cSlab))
            return whiteLine42c;
        if (blockState.getBlock().equals(whiteLine42dSlab))
            return whiteLine42d;
        if (blockState.getBlock().equals(whiteLine43aSlab))
            return whiteLine43a;
        if (blockState.getBlock().equals(whiteLine43bSlab))
            return whiteLine43b;
        if (blockState.getBlock().equals(whiteLine44Slab))
            return whiteLine44;
        if (blockState.getBlock().equals(whiteLine45Slab))
            return whiteLine45;
        if (blockState.getBlock().equals(whiteLine46Slab))
            return whiteLine46;
        if (blockState.getBlock().equals(whiteLine47aSlab))
            return whiteLine47a;
        if (blockState.getBlock().equals(whiteLine47bSlab))
            return whiteLine47b;
        if (blockState.getBlock().equals(whiteLine48aSlab))
            return whiteLine48a;
        if (blockState.getBlock().equals(whiteLine48bSlab))
            return whiteLine48b;

        if (blockState.getBlock().equals(yellowLine1Slab))
            return yellowLine1;
        if (blockState.getBlock().equals(yellowLine2Slab))
            return yellowLine2;
        if (blockState.getBlock().equals(yellowLine3Slab))
            return yellowLine3;
        if (blockState.getBlock().equals(yellowLine4Slab))
            return yellowLine4;
        if (blockState.getBlock().equals(yellowLine5Slab))
            return yellowLine5;
        if (blockState.getBlock().equals(yellowLine6Slab))
            return yellowLine6;
        if (blockState.getBlock().equals(yellowLine7Slab))
            return yellowLine7;
        if (blockState.getBlock().equals(yellowLine8Slab))
            return yellowLine8;
        if (blockState.getBlock().equals(yellowLine9Slab))
            return yellowLine9;
        if (blockState.getBlock().equals(yellowLine10aSlab))
            return yellowLine10a;
        if (blockState.getBlock().equals(yellowLine10bSlab))
            return yellowLine10b;
        if (blockState.getBlock().equals(yellowLine11aSlab))
            return yellowLine11a;
        if (blockState.getBlock().equals(yellowLine11bSlab))
            return yellowLine11b;
        if (blockState.getBlock().equals(yellowLine12aSlab))
            return yellowLine12a;
        if (blockState.getBlock().equals(yellowLine12bSlab))
            return yellowLine12b;

        if (blockState.getBlock().equals(whiteYellowLine1aSlab))
            return whiteYellowLine1a;
        if (blockState.getBlock().equals(whiteYellowLine1bSlab))
            return whiteYellowLine1b;
        if (blockState.getBlock().equals(whiteYellowLine2aSlab))
            return whiteYellowLine2a;
        if (blockState.getBlock().equals(whiteYellowLine2bSlab))
            return whiteYellowLine2b;
        if (blockState.getBlock().equals(whiteYellowLine3aSlab))
            return whiteYellowLine3a;
        if (blockState.getBlock().equals(whiteYellowLine3bSlab))
            return whiteYellowLine3b;
        if (blockState.getBlock().equals(whiteYellowLine4Slab))
            return whiteYellowLine4;
        if (blockState.getBlock().equals(whiteYellowLine5aSlab))
            return whiteYellowLine5a;
        if (blockState.getBlock().equals(whiteYellowLine5bSlab))
            return whiteYellowLine5b;
        if (blockState.getBlock().equals(whiteYellowLine5cSlab))
            return whiteYellowLine5c;
        if (blockState.getBlock().equals(whiteYellowLine6aSlab))
            return whiteYellowLine6a;
        if (blockState.getBlock().equals(whiteYellowLine6bSlab))
            return whiteYellowLine6b;
        if (blockState.getBlock().equals(whiteYellowLine6cSlab))
            return whiteYellowLine6c;
        if (blockState.getBlock().equals(whiteYellowLine7aSlab))
            return whiteYellowLine7a;
        if (blockState.getBlock().equals(whiteYellowLine7bSlab))
            return whiteYellowLine7b;
        if (blockState.getBlock().equals(whiteYellowLine7cSlab))
            return whiteYellowLine7c;
        if (blockState.getBlock().equals(whiteYellowLine8Slab))
            return whiteYellowLine8;
        return null;
    }

    public IBlockState getSlabToBlock(World worldIn, BlockPos pos, IBlockState blockState)
    {
        if (blockState.getBlock().equals(getLineSlab(blockState)))
        {
            switch (blockState.getValue(FACING))
            {
                case NORTH:
                    worldIn.setBlockState(pos.down(), getLine(blockState).withProperty(FACING, EnumFacing.NORTH));
                    return Blocks.AIR.getDefaultState();
                case SOUTH:
                    worldIn.setBlockState(pos.down(), getLine(blockState).withProperty(FACING, EnumFacing.SOUTH));
                    return Blocks.AIR.getDefaultState();
                case WEST:
                    worldIn.setBlockState(pos.down(), getLine(blockState).withProperty(FACING, EnumFacing.WEST));
                    return Blocks.AIR.getDefaultState();
                case EAST:
                    worldIn.setBlockState(pos.down(), getLine(blockState).withProperty(FACING, EnumFacing.EAST));
                    return Blocks.AIR.getDefaultState();
            }
        }
        return null;
    }

    Item whiteArrow1Item = ItemRegistry.whiteArrow1;
    Item whiteArrow2aItem = ItemRegistry.whiteArrow2a;
    Item whiteArrow2bItem = ItemRegistry.whiteArrow2b;
    Item whiteArrow3aItem = ItemRegistry.whiteArrow3a;
    Item whiteArrow3bItem = ItemRegistry.whiteArrow3b;
    Item whiteArrow4Item = ItemRegistry.whiteArrow4;
    Item whiteArrow5aItem = ItemRegistry.whiteArrow5a;
    Item whiteArrow5bItem = ItemRegistry.whiteArrow5b;
    Item whiteArrow6Item = ItemRegistry.whiteArrow6;
    Item whiteArrow7Item = ItemRegistry.whiteArrow7;
    Item whiteArrow8Item = ItemRegistry.whiteArrow8;

    IBlockState whiteArrow1Block = BlockRegistry.whiteArrow1.getDefaultState();
    IBlockState whiteArrow2aBlock = BlockRegistry.whiteArrow2a.getDefaultState();
    IBlockState whiteArrow2bBlock = BlockRegistry.whiteArrow2b.getDefaultState();
    IBlockState whiteArrow3aBlock = BlockRegistry.whiteArrow3a.getDefaultState();
    IBlockState whiteArrow3bBlock = BlockRegistry.whiteArrow3b.getDefaultState();
    IBlockState whiteArrow4Block = BlockRegistry.whiteArrow4.getDefaultState();
    IBlockState whiteArrow5aBlock = BlockRegistry.whiteArrow5a.getDefaultState();
    IBlockState whiteArrow5bBlock = BlockRegistry.whiteArrow5b.getDefaultState();
    IBlockState whiteArrow6Block = BlockRegistry.whiteArrow6.getDefaultState();
    IBlockState whiteArrow7Block = BlockRegistry.whiteArrow7.getDefaultState();
    IBlockState whiteArrow8Block = BlockRegistry.whiteArrow8.getDefaultState();

    public Item getArrowItem(EntityPlayer playerIn)
    {
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow1Item)
            return whiteArrow1Item;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow2aItem)
            return whiteArrow2aItem;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow2bItem)
            return whiteArrow2bItem;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow3aItem)
            return whiteArrow3aItem;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow3bItem)
            return whiteArrow3bItem;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow4Item)
            return whiteArrow4Item;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow5aItem)
            return whiteArrow5aItem;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow5bItem)
            return whiteArrow5bItem;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow6Item)
            return whiteArrow6Item;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow7Item)
            return whiteArrow7Item;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow8Item)
            return whiteArrow8Item;
        return null;
    }

    public IBlockState getArrowBlock(EntityPlayer playerIn)
    {
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow1Item)
            return whiteArrow1Block;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow2aItem)
            return whiteArrow2aBlock;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow2bItem)
            return whiteArrow2bBlock;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow3aItem)
            return whiteArrow3aBlock;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow3bItem)
            return whiteArrow3bBlock;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow4Item)
            return whiteArrow4Block;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow5aItem)
            return whiteArrow5aBlock;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow5bItem)
            return whiteArrow5bBlock;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow6Item)
            return whiteArrow6Block;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow7Item)
            return whiteArrow7Block;
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == whiteArrow8Item)
            return whiteArrow8Block;
        return null;
    }

    public boolean getItemToBlock(World worldIn, BlockPos pos, EntityPlayer playerIn)
    {
        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() == getArrowItem(playerIn) && worldIn.getBlockState(pos.up()) == Blocks.AIR.getDefaultState())
        {
            EnumFacing Facing = playerIn.getHorizontalFacing();
            worldIn.setBlockState(pos.up(), getArrowBlock(playerIn).withProperty(FACING, Facing.getOpposite()).withProperty(BLOCK_TYPE, BlockType.SLAB_BLOCK));
            return true;
        }
        return false;
    }
}
