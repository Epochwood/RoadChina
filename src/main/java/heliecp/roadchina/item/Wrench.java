package heliecp.roadchina.item;

import heliecp.roadchina.group.ModGroup;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class Wrench extends Item {

    public Wrench() {
        super(new Item.Properties().tab(ModGroup.ROAD_TOOL_GROUP).stacksTo(1));
    }

    @Override
    public void appendHoverText(ItemStack stack, World player, List<ITextComponent> tooltip, ITooltipFlag advanced) {
        if (InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT) ||
                InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_RIGHT_SHIFT))
        {
            tooltip.add(ITextComponent.nullToEmpty(I18n.get("tooltip.wrench")));
        }
        else
        {
            tooltip.add(ITextComponent.nullToEmpty(I18n.get("tooltip.view")));
        }
    }
}
