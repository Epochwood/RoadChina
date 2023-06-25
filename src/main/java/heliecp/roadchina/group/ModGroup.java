package heliecp.roadchina.group;

import heliecp.roadchina.Utils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModGroup
{
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Utils.MOD_ID);
    
    public static final RegistryObject<CreativeModeTab> WHITE_LINE_GROUP = TABS.register("white_line_group", () -> new WhiteLineGroup().output());
    public static final RegistryObject<CreativeModeTab> YELLOW_LINE_GROUP = TABS.register("yellow_line_group", () -> new YellowLineGroup().output());;
    public static final RegistryObject<CreativeModeTab> MARKING_GROUP = TABS.register("marking_group", () -> new MarkingGroup().output());;
    public static final RegistryObject<CreativeModeTab> ROAD_SIGN_GROUP = TABS.register("road_sign_group", () -> new RoadSignGroup().output());;
    public static final RegistryObject<CreativeModeTab> ROAD_TOOL_GROUP = TABS.register("road_tool_group", () -> new RoadToolGroup().output());;
}
