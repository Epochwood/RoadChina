package heliecp.roadchina.Group;

import heliecp.roadchina.Item.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ArrowGroup extends CreativeModeTab {
    public ArrowGroup() {
        super("arrow_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.whiteArrow1.get());
    }
}
