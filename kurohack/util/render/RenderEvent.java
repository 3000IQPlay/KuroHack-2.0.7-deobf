//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\tracy\OneDrive\Desktop\1.12 stable mappings"!

//Decompiled by Procyon!

package kurohack.util.render;

import net.minecraft.util.math.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;

public class RenderEvent
{
    private final Tessellator tessellator;
    private final Vec3d renderPos;
    private final float partialTicks;
    ScaledResolution resolution;
    
    public RenderEvent(final Tessellator tessellator, final Vec3d renderPos, final float ticks) {
        this.resolution = new ScaledResolution(Minecraft.getMinecraft());
        this.tessellator = tessellator;
        this.renderPos = renderPos;
        this.partialTicks = ticks;
    }
    
    public double getScreenWidth() {
        return this.resolution.getScaledWidth_double();
    }
    
    public double getScreenHeight() {
        return this.resolution.getScaledHeight_double();
    }
    
    public BufferBuilder getBuffer() {
        return this.tessellator.getBuffer();
    }
    
    public void setTranslation(final Vec3d translation) {
        this.getBuffer().setTranslation(-translation.x, -translation.y, -translation.z);
    }
    
    public void resetTranslation() {
        this.setTranslation(this.renderPos);
    }
    
    public float getPartialTicks() {
        return this.partialTicks;
    }
}
