package heliecp.roadchina.group;

import heliecp.roadchina.item.ItemRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RoadSignGroup {

    public CreativeModeTab output ()
    {
        return CreativeModeTab.builder().title(Component.translatable("itemGroup.road_sign_group"))
                .withTabsBefore(ModGroup.MARKING_GROUP.getKey())
                .icon(() -> new ItemStack(ItemRegistry.postGrayNC1.get()))
                .displayItems((parameters, output) ->
                {
                    output.accept(ItemRegistry.thinPostGray.get());
                    output.accept(ItemRegistry.thinPostSilver.get());

                    output.accept(ItemRegistry.thinPostGrayNC1.get());
                    output.accept(ItemRegistry.thinPostSilverNC1.get());

                    output.accept(ItemRegistry.thinPostGrayBase.get());
                    output.accept(ItemRegistry.thinPostSilverBase.get());

                    output.accept(ItemRegistry.postBlack.get());
                    output.accept(ItemRegistry.postGray.get());
                    output.accept(ItemRegistry.postSilver.get());
                    output.accept(ItemRegistry.postBlue.get());
                    output.accept(ItemRegistry.postWhite.get());

                    output.accept(ItemRegistry.postBlackNC1.get());
                    output.accept(ItemRegistry.postGrayNC1.get());
                    output.accept(ItemRegistry.postSilverNC1.get());
                    output.accept(ItemRegistry.postBlueNC1.get());
                    output.accept(ItemRegistry.postWhiteNC1.get());

                    output.accept(ItemRegistry.postGrayBase.get());
                    output.accept(ItemRegistry.postSilverBase.get());
                }).build();
    }
}
