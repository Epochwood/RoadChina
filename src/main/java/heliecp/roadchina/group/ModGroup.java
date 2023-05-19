package heliecp.roadchina.group;

import heliecp.roadchina.Utils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.List;

public class ModGroup
{
    public static CreativeModeTab WHITE_LINE_GROUP;
    public static CreativeModeTab YELLOW_LINE_GROUP;
    public static CreativeModeTab MARKING_GROUP;
    public static CreativeModeTab ROAD_SIGN_GROUP;
    public static CreativeModeTab ROAD_TOOL_GROUP;

    @SubscribeEvent
    public static void registerTabs(CreativeModeTabEvent.Register event)
    {
        WHITE_LINE_GROUP = event.registerCreativeModeTab(new ResourceLocation(Utils.MOD_ID, "white_line_group"), builder -> new WhiteLineGroup().output(builder).build());
        YELLOW_LINE_GROUP = event.registerCreativeModeTab(new ResourceLocation(Utils.MOD_ID, "yellow_line_group"), List.of(), List.of(WHITE_LINE_GROUP), builder -> new YellowLineGroup().output(builder).build());
        MARKING_GROUP = event.registerCreativeModeTab(new ResourceLocation(Utils.MOD_ID, "marking_group"), List.of(), List.of(YELLOW_LINE_GROUP), builder -> new MarkingGroup().output(builder).build());
        ROAD_SIGN_GROUP = event.registerCreativeModeTab(new ResourceLocation(Utils.MOD_ID, "road_sign_group"), List.of(), List.of(MARKING_GROUP), builder -> new RoadSignGroup().output(builder).build());
        ROAD_TOOL_GROUP = event.registerCreativeModeTab(new ResourceLocation(Utils.MOD_ID, "road_tool_group"), List.of(), List.of(ROAD_SIGN_GROUP), builder -> new RoadToolGroup().output(builder).build());
    }
}
