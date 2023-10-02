package com.Utopia.utopiamod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Utopia.MOD_ID)
public class CraftingDisableMod {

    @SubscribeEvent
    public static void onCrafting(PlayerEvent.ItemCraftedEvent event) {
        event.setCanceled(true); // Отменяем событие крафта
    }

    public CraftingDisableMod() {
        MinecraftForge.EVENT_BUS.register(this); // Регистрируем обработчик событий
    }
}
