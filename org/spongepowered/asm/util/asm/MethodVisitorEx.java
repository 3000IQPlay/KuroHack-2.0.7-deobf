//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\tracy\OneDrive\Desktop\1.12 stable mappings"!

//Decompiled by Procyon!

package org.spongepowered.asm.util.asm;

import org.spongepowered.asm.lib.*;
import org.spongepowered.asm.util.*;

public class MethodVisitorEx extends MethodVisitor
{
    public MethodVisitorEx(final MethodVisitor mv) {
        super(327680, mv);
    }
    
    public void visitConstant(final byte constant) {
        if (constant > -2 && constant < 6) {
            this.visitInsn(Bytecode.CONSTANTS_INT[constant + 1]);
            return;
        }
        this.visitIntInsn(16, (int)constant);
    }
}
