package heliecp.roadchina.creativetab;

import heliecp.roadchina.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabWhiteRoad extends CreativeTabs
{
    public static final TabWhiteRoad TAB_WHITE_ROAD = new TabWhiteRoad();

    public TabWhiteRoad()
    {
        super("whiteroad");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemRegistryHandler.ITEM_BLOCK_WHITE_LINE);
    }
}
