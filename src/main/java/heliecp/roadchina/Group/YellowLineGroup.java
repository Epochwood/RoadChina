package heliecp.roadchina.Group;

import heliecp.roadchina.Item.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class YellowLineGroup extends CreativeModeTab {
    public YellowLineGroup() {
        super("yellow_line_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.yellowLine1.get());
    }
}
