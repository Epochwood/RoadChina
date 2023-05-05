package heliecp.roadchina.group;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RoadToolGroup extends CreativeModeTab {
    public RoadToolGroup() {
        super("road_tool_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.wrench.get());
    }
}
