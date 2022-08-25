package heliecp.roadchina.block;

import heliecp.roadchina.RoadChina;
import heliecp.roadchina.creativetab.TabWhiteRoad;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockRoadSlab extends Block
{
    public BlockRoadSlab()
    {
        super(Material.ROCK);
        this.setUnlocalizedName(RoadChina.MODID + ".roadSlab");
        this.setRegistryName("road_slab");
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(TabWhiteRoad.TAB_WHITE_ROAD);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(0, 0, 0, 1, 0.5, 1);
    }
}
