package heliecp.roadchina.Client;

import heliecp.roadchina.Block.BlockRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RenderTypeRegistry
{
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            RenderType cutout = RenderType.cutout();
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.whiteArrow1.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.whiteArrow2a.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.whiteArrow2b.get(), cutout);
        });
    }
}
