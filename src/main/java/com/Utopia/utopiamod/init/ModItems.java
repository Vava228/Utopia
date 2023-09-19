package com.Utopia.utopiamod.init;

import com.Utopia.utopiamod.Utopia;
import com.Utopia.utopiamod.items.MaterialItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, Utopia.MOD_ID);

    public static final RegistryObject<Item> CITRINE = Items.register("citrine", MaterialItem::new);
}
ggggggggggggggggggfgfgfgffgfggg