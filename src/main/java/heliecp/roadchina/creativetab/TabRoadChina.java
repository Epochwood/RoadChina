package heliecp.roadchina.creativetab;

import heliecp.roadchina.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabRoadChina extends CreativeTabs
{
    public static final TabRoadChina TAB_ROAD_CHINA = new TabRoadChina();

    public TabRoadChina()
    {
        super("roadchina");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemRegistryHandler.ITEM_BLOCK_WHITE_LINE);
    }
}
