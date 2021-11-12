//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\tracy\OneDrive\Desktop\1.12 stable mappings"!

//Decompiled by Procyon!

package kurohack.features.modules.combat;

import kurohack.features.modules.*;

public class AutoRun extends Module
{
    public AutoRun() {
        super("AutoRun", "AutoRun if you have bariton", Category.COMBAT, true, false, false);
    }
    
    @Override
    public void onEnable() {
        AutoRun.mc.player.sendChatMessage("#goto ~100 ~ ~100");
        this.disable();
    }
}
