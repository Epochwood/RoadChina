package heliecp.roadchina.creativetab;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class YellowLineTab extends CreativeTabs
{

    public YellowLineTab() {
        super("yellow_line");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistry.yellowLine1);
    }
}
