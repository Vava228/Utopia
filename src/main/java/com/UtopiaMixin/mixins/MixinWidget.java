package com.UtopiaMixin.mixins;


import net.minecraft.client.gui.widget.Widget;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Widget.class)
public class MixinWidget
{
    //Inject(at = @At(value = "HEAD"), method = "")
}