package heliecp.roadchina.creativetab;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RoadSignTab extends CreativeTabs
{
    public RoadSignTab() {
        super("road_sign");
    }


    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistry.thinPostGary);
    }
}
