package heliecp.roadchina.Group;

import heliecp.roadchina.Item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class YellowLineGroup extends ItemGroup {
    public YellowLineGroup() {
        super("yellow_line_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.yellowLine1.get());
    }
}
