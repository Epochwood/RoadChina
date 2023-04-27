package heliecp.roadchina.block.arrow;

import heliecp.roadchina.creativetab.ModTab;
import heliecp.roadchina.item.Wrench;
import heliecp.roadchina.properties.BlockType;
import heliecp.roadchina.RoadChina;
import heliecp.roadchina.creativetab.ArrowTab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class ArrowA extends Block
{
    private static final IProperty<EnumFacing> FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    public static final PropertyEnum<BlockType> BLOCK_TYPE = PropertyEnum.<BlockType>create("block_type", BlockType.class);

    public ArrowA(String Name)
    {
        super(Material.ROCK);
        this.setUnlocalizedName(RoadChina.MODID + "." + Name);
        this.setCreativeTab(ModTab.TAB_ARROW_TAB);
        this.setRegistryName(Name);
        this.setHardness(1.5F);
        this.setSoundType(SoundType.STONE);
        this.setDefaultState(this.getDefaultState().withProperty(FACING,EnumFacing.NORTH).withProperty(BLOCK_TYPE, BlockType.FULL_BLOCK));
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

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        switch (state.getValue(BLOCK_TYPE))
        {
            case FULL_BLOCK:
                switch (state.getValue(FACING)) {
                    case NORTH:
                    case SOUTH:
                    default:
                        return new AxisAlignedBB(0.25D, 0.0D, -1.0D, 0.75D, 0.0D, 2.0D);
                    case EAST:
                    case WEST:
                        return new AxisAlignedBB(-1.0D, 0.0D, 0.25D, 2.0D, 0.0D, 0.75D);
                }
            case SLAB_BLOCK:
                switch (state.getValue(FACING)) {
                     case NORTH:
                     case SOUTH:
                     default:
                         return new AxisAlignedBB(0.25D, -0.5D, -1.0D, 0.75D, -0.5D, 2.0D);
                     case EAST:
                     case WEST:
                         return new AxisAlignedBB(-1.0D, -0.5D, 0.25D, 2.0D, -0.5D, 0.75D);
                }
            }
        return null;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, FACING, BLOCK_TYPE);
    }

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot)
    {
         if (state.getValue(BLOCK_TYPE) == BlockType.SLAB_BLOCK)
         {
             return state.withProperty(FACING, rot.rotate(state.getValue(FACING))).withProperty(BLOCK_TYPE, BlockType.SLAB_BLOCK);
         }
        return state.withProperty(FACING, rot.rotate(state.getValue(FACING))).withProperty(BLOCK_TYPE, BlockType.FULL_BLOCK);
    }

    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
    {
        if (state.getValue(BLOCK_TYPE) == BlockType.SLAB_BLOCK)
        {
            return state.withRotation(mirrorIn.toRotation(state.getValue(FACING))).withProperty(BLOCK_TYPE, BlockType.SLAB_BLOCK);
        }
        return state.withRotation(mirrorIn.toRotation(state.getValue(FACING))).withProperty(BLOCK_TYPE, BlockType.FULL_BLOCK);
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta)).withProperty(BLOCK_TYPE, BlockType.getIndex(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(FACING).getHorizontalIndex();
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        IBlockState blockState = worldIn.getBlockState(pos);
        if (!(blockState.getBlock() == this))
            return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite()).withProperty(BLOCK_TYPE, BlockType.FULL_BLOCK);
        return null;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
                                    EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            return true;
        }

        if (playerIn.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Wrench) {
            EnumFacing Facing = state.getValue(FACING);
            worldIn.setBlockState(pos, state.withProperty(FACING, Facing.rotateY()).withProperty(BLOCK_TYPE, state.getValue(BLOCK_TYPE) == BlockType.FULL_BLOCK ? BlockType.FULL_BLOCK : BlockType.SLAB_BLOCK));
            return true;

        }
        return false;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

}

