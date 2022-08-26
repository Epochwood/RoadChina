package heliecp.roadchina.block;

import heliecp.roadchina.RoadChina;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class BlockRegistryHandler
{
    public static final BlockRoad BLOCK_ROAD = new BlockRoad();
    public static final BlockLine BLOCK_WHITE_LINE_1 = new BlockLine(RoadChina.MODID + ".whiteLine1","white_line_1");
    public static final BlockLine BLOCK_WHITE_LINE_2 = new BlockLine(RoadChina.MODID + ".whiteLine2","white_line_2");
    public static final BlockLine BLOCK_WHITE_LINE_3 = new BlockLine(RoadChina.MODID + ".whiteLine3","white_line_3");
    public static final BlockLine BLOCK_WHITE_LINE_4 = new BlockLine(RoadChina.MODID + ".whiteLine4","white_line_4");
    public static final BlockLine BLOCK_WHITE_LINE_5 = new BlockLine(RoadChina.MODID + ".whiteLine5","white_line_5");
    public static final BlockLine BLOCK_WHITE_LINE_6 = new BlockLine(RoadChina.MODID + ".whiteLine6","white_line_6");
    public static final BlockLine BLOCK_WHITE_LINE_7 = new BlockLine(RoadChina.MODID + ".whiteLine7","white_line_7");
    public static final BlockRoadSlab BLOCK_ROAD_SLAB = new BlockRoadSlab();
    public static final BlockLineSlab BLOCK_WHITE_LINE_1_SLAB = new BlockLineSlab(RoadChina.MODID + ".whiteLine1Slab","white_line_1_slab");
    public static final BlockLineSlab BLOCK_WHITE_LINE_2_SLAB = new BlockLineSlab(RoadChina.MODID + ".whiteLine2Slab","white_line_2_slab");
    public static final BlockArrow1 BLOCK_WHITE_ARROW_1 = new BlockArrow1(RoadChina.MODID + ".whiteArrow1","white_arrow_1");
    @SubscribeEvent
    public static void onRegistry(Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(BLOCK_ROAD);
        registry.register(BLOCK_WHITE_LINE_1);
        registry.register(BLOCK_WHITE_LINE_2);
        registry.register(BLOCK_WHITE_LINE_3);
        registry.register(BLOCK_WHITE_LINE_4);
        registry.register(BLOCK_WHITE_LINE_5);
        registry.register(BLOCK_WHITE_LINE_6);
        registry.register(BLOCK_WHITE_LINE_7);
        registry.register(BLOCK_ROAD_SLAB);
        registry.register(BLOCK_WHITE_LINE_1_SLAB);
        registry.register(BLOCK_WHITE_LINE_2_SLAB);
        registry.register(BLOCK_WHITE_ARROW_1);
    }
}

