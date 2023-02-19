package heliecp.roadchina.Item;

import heliecp.roadchina.Group.ModGroup;
import net.minecraft.world.item.Item;

public class Wrench extends Item
{
    public Wrench()
    {
        super(new Item.Properties().tab(ModGroup.ROAD_TOOL_GROUP).stacksTo(1));
    }


}
