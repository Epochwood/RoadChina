package heliecp.roadchina.event;

import heliecp.roadchina.RoadChina;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EventHandler
{
    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinWorldEvent event)
    {
        Entity entity = event.getEntity();
        if (!entity.world.isRemote && entity instanceof EntityPlayer)
        {
            String Tip = "------------------------------------------------\n" + "§4道路中国 | Road China      版本 | Version " + "§4" + RoadChina.VERSION + "\n" + "------------------------------------------------\n" + "作者 | Author | Credits: Heliecp\n" + "------------------------------------------------\n" + "(c) 2023 Heliecp. All Rights Reserved\n" + "------------------------------------------------";
            TextComponentString TipText = new TextComponentString(Tip);
            entity.sendMessage(TipText);
            //entity.sendMessage(new TextComponentTranslation("message.fmltutor.welcome", RoadChina.NAME, entity.getName()));
        }
    }

}
