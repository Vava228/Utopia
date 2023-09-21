package com.Utopia.utopiamod.mixin;

import net.minecraft.client.gui.widget.Widget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(Widget.class)
public class MixinWidget {

    @Inject(at = @At(value = "HEAD"), )

}
