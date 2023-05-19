package heliecp.roadchina.group;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MarkingGroup {

    public CreativeModeTab.Builder output (CreativeModeTab.Builder builder)
    {
        return builder.title(Component.translatable("itemGroup.marking_group"))
                .icon(() -> new ItemStack(ItemRegistry.whiteArrow1.get()))
                .displayItems((parameters, output) ->
                {
                    output.accept(ItemRegistry.whiteArrow1.get());
                    output.accept(ItemRegistry.whiteArrow2a.get());
                    output.accept(ItemRegistry.whiteArrow2b.get());
                    output.accept(ItemRegistry.whiteArrow3a.get());
                    output.accept(ItemRegistry.whiteArrow3b.get());
                    output.accept(ItemRegistry.whiteArrow4.get());
                    output.accept(ItemRegistry.whiteArrow5a.get());
                    output.accept(ItemRegistry.whiteArrow5b.get());
                    output.accept(ItemRegistry.whiteArrow6.get());
                    output.accept(ItemRegistry.whiteArrow7.get());
                    output.accept(ItemRegistry.whiteArrow8.get());

                    output.accept(ItemRegistry.whiteMarking1.get());
                    output.accept(ItemRegistry.whiteMarking2.get());
                    output.accept(ItemRegistry.whiteMarking3.get());
                    output.accept(ItemRegistry.whiteMarking4.get());
                    output.accept(ItemRegistry.whiteMarking5.get());
                    output.accept(ItemRegistry.whiteMarking6.get());
                    output.accept(ItemRegistry.whiteMarkingTing.get());
                });
    }
}
