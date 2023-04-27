package heliecp.roadchina.block;

import heliecp.roadchina.RoadChina;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Road extends Block
{
    public Road(String Name,CreativeTabs Tab)
    {
        super(Material.ROCK);
        this.setUnlocalizedName(RoadChina.MODID + "." + Name);
        this.setCreativeTab(Tab);
        this.setRegistryName(Name);
        this.setHardness(1.5F);
        this.setSoundType(SoundType.STONE);
    }
}
