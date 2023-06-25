package heliecp.roadchina.group;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RoadToolGroup {

    public CreativeModeTab output ()
    {
        return CreativeModeTab.builder().title(Component.translatable("itemGroup.road_tool_group"))
                .withTabsBefore(ModGroup.ROAD_SIGN_GROUP.getKey())
                .icon(() -> new ItemStack(ItemRegistry.wrench.get()))
                .displayItems((parameters, output) ->
                {
                    output.accept(ItemRegistry.wrench.get());
                }).build();
    }
}
