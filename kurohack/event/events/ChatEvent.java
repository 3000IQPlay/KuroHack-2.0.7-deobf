//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\tracy\OneDrive\Desktop\1.12 stable mappings"!

//Decompiled by Procyon!

package kurohack.event.events;

import kurohack.event.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Cancelable
public class ChatEvent extends EventStage
{
    private final String msg;
    
    public ChatEvent(final String msg) {
        this.msg = msg;
    }
    
    public String getMsg() {
        return this.msg;
    }
}
