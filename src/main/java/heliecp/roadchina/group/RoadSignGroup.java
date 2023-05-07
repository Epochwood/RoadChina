package heliecp.roadchina.group;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RoadSignGroup extends CreativeModeTab {
    public RoadSignGroup() {
        super("road_sign_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.postGrayNC1.get());
    }
}
