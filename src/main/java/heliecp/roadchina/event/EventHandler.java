package heliecp.roadchina.event;

import heliecp.roadchina.Utils;
import net.minecraft.entity.Entity;
import net.minecraft.util.Util;
import net.minecraft.util.text.*;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class EventHandler {

    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinWorldEvent event)
    {
        Entity entity = event.getEntity();
        if (!entity.level.isClientSide && entity instanceof PlayerEntity && entity.level.dimension() == World.OVERWORLD)
        {
            String Tip = "---------------------------------------\n" + "§4道路中国 | Road China      版本 | Version " + Utils.MOD_VERSION + "\n§f" + "---------------------------------------\n" + "作者 | Author | Credits: Heliecp\n" + "---------------------------------------\n" + "(c) 2023 Heliecp. All Rights Reserved\n" + "---------------------------------------";
            ITextComponent TipText = new StringTextComponent(Tip);
            entity.sendMessage(TipText, Util.NIL_UUID);
        }
    }
}
