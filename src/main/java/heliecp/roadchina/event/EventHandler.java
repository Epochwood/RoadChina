package heliecp.roadchina.event;

import heliecp.roadchina.Utils;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class EventHandler {

    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinLevelEvent event)
    {
        Entity entity = event.getEntity();
        if (!entity.level.isClientSide && entity instanceof Player && entity.level.dimension() == Level.OVERWORLD)
        {
            String Tip = "---------------------------------------\n" + "§4道路中国 | Road China      版本 | Version " + Utils.MOD_VERSION + "\n§f" + "---------------------------------------\n" + "作者 | Author | Credits: Heliecp\n" + "---------------------------------------\n" + "(c) 2023 Heliecp. All Rights Reserved\n" + "---------------------------------------";
            Component TipText = Component.nullToEmpty(Tip);
            entity.sendSystemMessage(TipText);

        }
    }
}
