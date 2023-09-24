package com.Utopia.utopiamod;


import com.Utopia.utopiamod.block.ModBlocks;
import com.Utopia.utopiamod.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
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

    private static final Logger LOGGER = LogManager.getLogger();

    public Utopia() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);
        eventBus.addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
        ModItems.Items.register(eventBus);
        ModBlocks.register(eventBus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

}

