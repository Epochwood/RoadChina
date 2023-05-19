package heliecp.roadchina.mixin;

import heliecp.roadchina.Utils;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.players.PlayerList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerList.class)
public abstract class EventMixin {

    @Inject(at = @At("TAIL"), method = "placeNewPlayer", cancellable = true)
    private void placeNewPlayer(Connection connection, ServerPlayer player, CallbackInfo info)
    {
        String Tip = "-----------------------------------------------\n" + "§4道路中国 | Road China     版本 | Version " + Utils.MOD_VERSION + "\n§f" + "-----------------------------------------------\n" + "作者 | Author | Credits: Heliecp\n" + "-----------------------------------------------\n" + "(c) 2023 Heliecp. All Rights Reserved\n" + "-----------------------------------------------";
        Component TipText = Component.nullToEmpty(Tip);
        player.sendSystemMessage(TipText);
    }
}
