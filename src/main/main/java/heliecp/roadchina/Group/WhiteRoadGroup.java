package heliecp.roadchina.Group;

import heliecp.roadchina.Item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WhiteRoadGroup extends ItemGroup {
    public WhiteRoadGroup() {
        super("white_road_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.whiteLine1.get());
    }
}
