package heliecp.roadchina.creativetab;

import heliecp.roadchina.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabRoadMarking extends CreativeTabs
{
    public static final TabRoadMarking TAB_ROAD_MARKING = new TabRoadMarking();

    public TabRoadMarking()
    {
        super("roadmarking");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemRegistryHandler.ITEM_BLOCK_WHITE_ARROW_1);
    }
}
