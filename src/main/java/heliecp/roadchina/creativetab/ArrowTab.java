package heliecp.roadchina.creativetab;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ArrowTab extends CreativeTabs
{

    public ArrowTab() {
        super("arrow");
    }


    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistry.whiteArrow1);
    }
}
