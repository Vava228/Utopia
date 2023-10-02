package com.Utopia.utopiamod;


import com.Utopia.utopiamod.block.ModBlocks;
import com.Utopia.utopiamod.client.ClientProxy;
import com.Utopia.utopiamod.init.ModItems;
import com.Utopia.utopiamod.server.ServerProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Utopia.MOD_ID)
public class Utopia
{
    // CTRL + B => Move to native file;
    public static final String MOD_ID = "utopia";

    public static final Logger LOGGER = LogManager.getLogger();

    public static  IProxy proxy;

    public Utopia() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);
        eventBus.addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        Utopia.proxy = new ClientProxy();
        Utopia.proxy.registerForgeEventListeners(MinecraftForge.EVENT_BUS);
    }



    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

}

