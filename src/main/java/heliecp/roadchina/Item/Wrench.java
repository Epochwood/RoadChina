package heliecp.roadchina.Item;

import heliecp.roadchina.Group.ModGroup;
import net.minecraft.item.Item;

public class Wrench extends Item
{
    public Wrench ()
    {
        super(new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP).stacksTo(1));
    }
}
