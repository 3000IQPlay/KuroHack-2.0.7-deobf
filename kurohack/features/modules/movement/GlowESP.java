//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\tracy\OneDrive\Desktop\1.12 stable mappings"!

//Decompiled by Procyon!

package kurohack.features.modules.movement;

import kurohack.features.modules.*;
import net.minecraft.entity.player.*;
import java.util.*;
import kurohack.event.events.*;
import net.minecraft.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class GlowESP extends Module
{
    public GlowESP() {
        super("GlowESP", "GLOW PLAYER", Module.Category.MISC, true, false, false);
    }
    
    public void onDisable() {
        for (final EntityPlayer player : GlowESP.mc.world.playerEntities) {
            if (!player.isGlowing()) {
                continue;
            }
            player.setGlowing(false);
        }
        super.onDisable();
    }
    
    @SubscribeEvent
    public void onEvent(final UpdateEvent e) {
        if (GlowESP.mc.player == null) {
            return;
        }
        for (final Entity player : GlowESP.mc.world.loadedEntityList) {
            if (!(player instanceof EntityPlayer)) {
                continue;
            }
            player.setGlowing(true);
        }
    }
}
