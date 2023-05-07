package heliecp.roadchina.group;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class RoadSignGroup extends ItemGroup
{
    public RoadSignGroup() {
        super("road_sign_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.postGrayNC1.get());
    }
}
