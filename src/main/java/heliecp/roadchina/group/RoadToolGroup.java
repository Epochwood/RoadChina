package heliecp.roadchina.group;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class RoadToolGroup extends ItemGroup {

    public RoadToolGroup() {
        super("road_tool_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.wrench.get());
    }
}