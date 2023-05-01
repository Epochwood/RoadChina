package heliecp.roadchina.item;

import com.mojang.blaze3d.platform.InputConstants;
import heliecp.roadchina.group.ModGroup;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class Wrench extends Item
{
    public Wrench()
    {
        super(new Item.Properties().tab(ModGroup.ROAD_TOOL_GROUP).stacksTo(1));
    }

    @Override
    public void appendHoverText(ItemStack stack, Level player, List<Component> tooltip, TooltipFlag advanced)
    {
        if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT) ||
                InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_RIGHT_SHIFT))
        {
            tooltip.add(Component.nullToEmpty(I18n.get("tooltip.wrench")));
        }
        else
        {
            tooltip.add(Component.nullToEmpty(I18n.get("tooltip.view")));
        }
    }

}
