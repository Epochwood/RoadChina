package heliecp.roadchina.item;

import heliecp.roadchina.RoadChina;
import heliecp.roadchina.creativetab.TabRoadChina;
import net.minecraft.item.Item;

public class ItemWrench extends Item
{
    public ItemWrench()
    {
        this.setUnlocalizedName(RoadChina.MODID + ".wrench");
        this.setRegistryName("wrench");
        this.setMaxStackSize(1);
        this.setCreativeTab(TabRoadChina.TAB_ROAD_CHINA);
    }
}
