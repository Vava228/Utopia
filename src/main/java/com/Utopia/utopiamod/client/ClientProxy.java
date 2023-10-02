package com.Utopia.utopiamod.client;

import com.Utopia.utopiamod.IProxy;
import com.Utopia.utopiamod.Utopia;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import com.Utopia.utopiamod.items.GunItem;

public class ClientProxy implements IProxy {

    @Override
    public void registerForgeEventListeners(IEventBus bus) {
        bus.addListener(this::clientTick);
    }

    public void clientTick(ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            PlayerEntity entityPlayer = getPlayer();

            if (entityPlayer == null) {
                return;
            }

            if (isShooting()) {
                ItemStack itemStack = entityPlayer.getItemInHand(Hand.MAIN_HAND);
                if (itemStack.getItem() instanceof GunItem) {
                    GunItem gun = (GunItem) itemStack.getItem();
                    gun.tryShootOrReload(entityPlayer);
                    Utopia.LOGGER.debug("LMB CLICK!!! BIM BIM BAM BAM");
                }
            }
        }
    }

    public static Minecraft getMC() {
        return Minecraft.getInstance();
    }

    public static  PlayerEntity getPlayer(){
        return getMC().player;
    }

    public static boolean isShooting() {
        return getMC().options.keyAttack.isDown();
    }

    public static boolean isAiming() {
        return getMC().options.keyUse.isDown();
    }
}
