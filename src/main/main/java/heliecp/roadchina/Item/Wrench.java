package heliecp.roadchina.Item;

import heliecp.roadchina.Group.ModGroup;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Wrench extends Item
{
    public Wrench ()
    {
        super(new Item.Properties().tab(ModGroup.ROAD_TOOL_GROUP).stacksTo(1));
    }

    public void appendHoverText(ItemStack stack, World player, List<ITextComponent> tooltip, ITooltipFlag advanced)
    {

    }

}
