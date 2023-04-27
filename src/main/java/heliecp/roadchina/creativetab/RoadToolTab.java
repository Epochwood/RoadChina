package heliecp.roadchina.creativetab;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RoadToolTab extends CreativeTabs
{
    public RoadToolTab() {
        super("road_tool");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistry.wrench);
    }
}
