package heliecp.roadchina.client;

import heliecp.roadchina.block.BlockRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
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
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteArrow1.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteArrow2a.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteArrow2b.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteArrow3a.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteArrow3b.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteArrow4.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteArrow5a.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteArrow5b.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteArrow6.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteArrow7.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteArrow8.get(), cutout);

            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteMarking1.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteMarking2.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteMarking3.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteMarking4.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteMarking5.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteMarking6.get(), cutout);
            RenderTypeLookup.setRenderLayer(BlockRegistry.whiteMarkingTing.get(), cutout);
        });
    }
}
