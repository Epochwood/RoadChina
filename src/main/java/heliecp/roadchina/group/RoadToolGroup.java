package heliecp.roadchina.group;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

public class RoadToolGroup {

    public CreativeModeTab.Builder output (CreativeModeTab.Builder builder)
    {
        return builder.title(Component.translatable("itemGroup.road_tool_group"))
                .icon(() -> new ItemStack(ItemRegistry.wrench.get()))
                .displayItems((featureFlags, output, hasOp) ->
                {
                    output.accept(ItemRegistry.wrench.get());
                });
    }
}
