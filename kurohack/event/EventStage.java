//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\tracy\OneDrive\Desktop\1.12 stable mappings"!

//Decompiled by Procyon!

package kurohack.event;

import net.minecraftforge.fml.common.eventhandler.*;

public class EventStage extends Event
{
    private int stage;
    private boolean canceled;
    
    public EventStage() {
    }
    
    public EventStage(final int stage) {
        this.stage = stage;
    }
    
    public int getStage() {
        return this.stage;
    }
    
    public void setStage(final int stage) {
        this.stage = stage;
    }
    
    public void setCanceledE(final boolean c) {
        this.canceled = c;
    }
    
    public boolean isCanceledE() {
        return this.canceled;
    }
}
