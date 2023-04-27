package heliecp.roadchina.creativetab;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class WhiteLineTab extends CreativeTabs
{

    public WhiteLineTab() {
        super("white_line");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistry.whiteLine1);
    }
}
