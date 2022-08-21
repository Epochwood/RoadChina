package heliecp.roadchina.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class BlockRegistryHandler
{
    public static final BlockRoad BLOCK_ROAD = new BlockRoad();
    public static final BlockWhiteLine BLOCK_WHITE_LINE = new BlockWhiteLine();

    @SubscribeEvent
    public static void onRegistry(Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(BLOCK_ROAD);
        registry.register(BLOCK_WHITE_LINE);
    }
}

