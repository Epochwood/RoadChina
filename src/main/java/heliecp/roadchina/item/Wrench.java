package heliecp.roadchina.item;

import heliecp.roadchina.RoadChina;
import heliecp.roadchina.creativetab.ModTab;
import heliecp.roadchina.creativetab.RoadToolTab;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class Wrench extends Item
{
    public Wrench()
    {
        this.setUnlocalizedName(RoadChina.MODID + ".wrench");
        this.setRegistryName("wrench");
        this.setMaxStackSize(1);
        this.setCreativeTab(ModTab.TAB_ROAD_TOOL);
    }

    @Override
    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            tooltip.add(I18n.format("tooltip.wrench"));
        } else {
            tooltip.add(I18n.format("tooltip.view"));
        }
    }
}
