package heliecp.roadchina.group;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MarkingGroup extends CreativeModeTab {
    public MarkingGroup() {
        super("marking_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.whiteArrow1.get());
    }
}
