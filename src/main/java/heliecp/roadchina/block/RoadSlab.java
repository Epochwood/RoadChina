package heliecp.roadchina.block;

import heliecp.roadchina.properties.BlockType;
import heliecp.roadchina.RoadChina;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RoadSlab extends Block
{
    private static final IProperty<EnumFacing> FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    public static final PropertyEnum<BlockType> BLOCK_TYPE = PropertyEnum.<BlockType>create("block_type", BlockType.class);
    protected static final AxisAlignedBB BOTTOM = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

    public RoadSlab(String Name,CreativeTabs Tab)
    {
        super(Material.ROCK);
        this.setUnlocalizedName(RoadChina.MODID + "." + Name);
        this.setCreativeTab(Tab);
        this.setRegistryName(Name);
        this.setHardness(1.5F);
        this.setSoundType(SoundType.STONE);
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return BOTTOM;
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

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        IBlockState blockState = worldIn.getBlockState(pos.down());
        GetBlock getBlock = new GetBlock();

        if (worldIn.getBlockState(pos.down()).getBlock().equals(this))
        {
            return getBlock.getSlabToBlockForRoad(worldIn,pos,blockState);
        }
        return this.getDefaultState();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
                                    EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            return true;
        }

        GetBlock getBlock = new GetBlock();

        return getBlock.getItemToBlock(worldIn, pos, playerIn);

    }
}
