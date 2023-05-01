package heliecp.roadchina.event;

import net.minecraft.entity.Entity;
import net.minecraft.util.Util;
import net.minecraft.util.text.*;
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
        if (!entity.level.isClientSide && entity instanceof PlayerEntity)
        {
            String Tip = "---------------------------------------\n" + "§4道路中国 | Road China      版本 | Version " + "23m05a" + "\n§f" + "---------------------------------------\n" + "作者 | Author | Credits: Heliecp\n" + "---------------------------------------\n" + "(c) 2023 Heliecp. All Rights Reserved\n" + "---------------------------------------";
            ITextComponent TipText = new StringTextComponent(Tip);
            //ITextComponent T2 = ;
            entity.sendMessage(TipText, Util.NIL_UUID);
        }
    }
}
