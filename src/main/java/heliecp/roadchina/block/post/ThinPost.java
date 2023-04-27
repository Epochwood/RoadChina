package heliecp.roadchina.block.post;

import heliecp.roadchina.RoadChina;
import heliecp.roadchina.creativetab.ModTab;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class ThinPost extends Block
{
    protected static final PropertyBool UP = PropertyBool.create("up");
    protected static final PropertyBool DOWN = PropertyBool.create("down");
    protected static final PropertyBool NORTH = PropertyBool.create("north");
    protected static final PropertyBool SOUTH = PropertyBool.create("south");
    protected static final PropertyBool WEST = PropertyBool.create("west");
    protected static final PropertyBool EAST = PropertyBool.create("east");

    public ThinPost(String Name)
    {
        super(Material.ROCK);
        this.setUnlocalizedName(RoadChina.MODID + "." + Name);
        this.setCreativeTab(ModTab.TAB_ROAD_SIGN_TAB);
        this.setRegistryName(Name);
        this.setHardness(1.5F);
        this.setSoundType(SoundType.STONE);
        this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, Boolean.FALSE)
                .withProperty(EAST, Boolean.FALSE)
                .withProperty(SOUTH, Boolean.FALSE)
                .withProperty(WEST, Boolean.FALSE)
                .withProperty(UP, Boolean.FALSE)
                .withProperty(DOWN, Boolean.FALSE));
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, NORTH, EAST, SOUTH, WEST, UP, DOWN);
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }


    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        Block block = worldIn.getBlockState(pos.down()).getBlock();
        Block block1 = worldIn.getBlockState(pos.up()).getBlock();
        Block block2 = worldIn.getBlockState(pos.north()).getBlock();
        Block block3 = worldIn.getBlockState(pos.east()).getBlock();
        Block block4 = worldIn.getBlockState(pos.south()).getBlock();
        Block block5 = worldIn.getBlockState(pos.west()).getBlock();
        return state.withProperty(DOWN, block == this)
                .withProperty(UP, block1 == this)
                .withProperty(NORTH, block2 == this)
                .withProperty(EAST, block3 == this)
                .withProperty(SOUTH, block4 == this)
                .withProperty(WEST, block5 == this);
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return getBoundingBox(blockState, worldIn, pos);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        state = state.getActualState(source, pos);
        float f = 0.375F;
        float f1 = (Boolean) state.getValue(WEST) ? 0.0F : 0.375F;
        float f2 = (Boolean) state.getValue(DOWN) ? 0.0F : 0.375F;
        float f3 = (Boolean) state.getValue(NORTH) ? 0.0F : 0.375F;
        float f4 = (Boolean) state.getValue(EAST) ? 1.0F : 0.625F;
        float f5 = (Boolean) state.getValue(UP) ? 1.0F : 0.625F;
        float f6 = (Boolean) state.getValue(SOUTH) ? 1.0F : 0.625F;
        return new AxisAlignedBB((double)f1, (double)f2, (double)f3, (double)f4, (double)f5, (double)f6);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

}
