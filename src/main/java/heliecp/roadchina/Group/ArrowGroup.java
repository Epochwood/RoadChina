package heliecp.roadchina.Group;

import heliecp.roadchina.Item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ArrowGroup extends ItemGroup
{
    public ArrowGroup() {
        super("arrow_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.whiteArrow1.get());
    }
}
