package heliecp.roadchina.item;

import heliecp.roadchina.RoadChina;
import heliecp.roadchina.creativetab.TabRoadTool;
import heliecp.roadchina.creativetab.TabWhiteRoad;
import net.minecraft.item.Item;

public class ItemWrench extends Item
{
    public ItemWrench()
    {
        this.setUnlocalizedName(RoadChina.MODID + ".wrench");
        this.setRegistryName("wrench");
        this.setMaxStackSize(1);
        this.setCreativeTab(TabRoadTool.TAB_ROAD_TOOL);
    }
}
