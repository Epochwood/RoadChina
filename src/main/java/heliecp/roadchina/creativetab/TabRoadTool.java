package heliecp.roadchina.creativetab;

import heliecp.roadchina.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabRoadTool extends CreativeTabs
{
    public static final TabRoadTool TAB_ROAD_TOOL = new TabRoadTool();

    public TabRoadTool()
    {
        super("roadtool");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemRegistryHandler.WRENCH);
    }
}
