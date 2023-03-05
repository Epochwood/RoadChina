package heliecp.roadchina.Group;

import heliecp.roadchina.Item.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class WhiteLineGroup extends CreativeModeTab {
    public WhiteLineGroup() {
        super("white_line_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.whiteLine1.get());
    }
}
