package heliecp.roadchina;

import heliecp.roadchina.Block.BlockRegistry;
import heliecp.roadchina.Item.ItemRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class RoadChina
{
    public RoadChina()
    {
        IEventBus eventBus = (FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEMS.register(eventBus);
        BlockRegistry.BLOCKS.register(eventBus);
    }

}
