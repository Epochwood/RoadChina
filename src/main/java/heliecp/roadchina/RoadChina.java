package heliecp.roadchina;

import heliecp.roadchina.block.BlockRegistry;
import heliecp.roadchina.group.*;
import heliecp.roadchina.item.ItemRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
@Mod.EventBusSubscriber
public class RoadChina
{
    public RoadChina()
    {
        IEventBus eventBus = (FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEMS.register(eventBus);
        BlockRegistry.BLOCKS.register(eventBus);
        eventBus.addListener(ModGroup::registerTabs);
    }
}
