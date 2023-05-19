package heliecp.roadchina.group;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

public class YellowLineGroup{

    public CreativeModeTab.Builder output (CreativeModeTab.Builder builder)
    {
        return builder.title(Component.translatable("itemGroup.yellow_line_group"))
                .icon(() -> new ItemStack(ItemRegistry.yellowLine1.get()))
                .displayItems((featureFlags, output, hasOp) ->
                {
                    output.accept(ItemRegistry.yellowAsphaltRoad.get());

                    output.accept(ItemRegistry.yellowLine1.get());
                    output.accept(ItemRegistry.yellowLine2.get());
                    output.accept(ItemRegistry.yellowLine3.get());
                    output.accept(ItemRegistry.yellowLine4.get());
                    output.accept(ItemRegistry.yellowLine5.get());
                    output.accept(ItemRegistry.yellowLine6.get());
                    output.accept(ItemRegistry.yellowLine7.get());
                    output.accept(ItemRegistry.yellowLine8.get());
                    output.accept(ItemRegistry.yellowLine9.get());
                    output.accept(ItemRegistry.yellowLine10a.get());
                    output.accept(ItemRegistry.yellowLine10b.get());
                    output.accept(ItemRegistry.yellowLine11a.get());
                    output.accept(ItemRegistry.yellowLine11b.get());

                    output.accept(ItemRegistry.whiteYellowLine1a.get());
                    output.accept(ItemRegistry.whiteYellowLine1b.get());
                    output.accept(ItemRegistry.whiteYellowLine2a.get());
                    output.accept(ItemRegistry.whiteYellowLine2b.get());
                    output.accept(ItemRegistry.whiteYellowLine3a.get());
                    output.accept(ItemRegistry.whiteYellowLine3b.get());
                    output.accept(ItemRegistry.whiteYellowLine4.get());
                    output.accept(ItemRegistry.whiteYellowLine5a.get());
                    output.accept(ItemRegistry.whiteYellowLine5b.get());
                    output.accept(ItemRegistry.whiteYellowLine5c.get());
                    output.accept(ItemRegistry.whiteYellowLine6a.get());
                    output.accept(ItemRegistry.whiteYellowLine6b.get());
                    output.accept(ItemRegistry.whiteYellowLine6c.get());
                    output.accept(ItemRegistry.whiteYellowLine7a.get());
                    output.accept(ItemRegistry.whiteYellowLine7b.get());
                    output.accept(ItemRegistry.whiteYellowLine7c.get());
                    output.accept(ItemRegistry.whiteYellowLine8.get());

                    output.accept(ItemRegistry.yellowAsphaltRoadSlab.get());

                    output.accept(ItemRegistry.yellowLine1Slab.get());
                    output.accept(ItemRegistry.yellowLine2Slab.get());
                    output.accept(ItemRegistry.yellowLine3Slab.get());
                    output.accept(ItemRegistry.yellowLine4Slab.get());
                    output.accept(ItemRegistry.yellowLine5Slab.get());
                    output.accept(ItemRegistry.yellowLine6Slab.get());
                    output.accept(ItemRegistry.yellowLine7Slab.get());
                    output.accept(ItemRegistry.yellowLine8Slab.get());
                    output.accept(ItemRegistry.yellowLine9Slab.get());
                    output.accept(ItemRegistry.yellowLine10aSlab.get());
                    output.accept(ItemRegistry.yellowLine10bSlab.get());
                    output.accept(ItemRegistry.yellowLine11aSlab.get());
                    output.accept(ItemRegistry.yellowLine11bSlab.get());

                    output.accept(ItemRegistry.whiteYellowLine1aSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine1bSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine2aSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine2bSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine3aSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine3bSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine4Slab.get());
                    output.accept(ItemRegistry.whiteYellowLine5aSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine5bSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine5cSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine6aSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine6bSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine6cSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine7aSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine7bSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine7cSlab.get());
                    output.accept(ItemRegistry.whiteYellowLine8Slab.get());
                });
    }
}
