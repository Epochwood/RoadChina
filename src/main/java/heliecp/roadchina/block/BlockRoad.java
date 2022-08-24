package heliecp.roadchina.block;

import heliecp.roadchina.RoadChina;
import heliecp.roadchina.creativetab.TabWhiteRoad;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockRoad extends Block
{

    public BlockRoad()
    {
        super(Material.ROCK);
        this.setUnlocalizedName(RoadChina.MODID + ".road");
        this.setRegistryName("road");
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(TabWhiteRoad.TAB_WHITE_ROAD);
    }
}
