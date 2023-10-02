package com.Utopia.utopiamod.utils;

import com.Utopia.utopiamod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;

public class ModItemGroups {
    public static ItemGroup createGroup(String id, RegistryObject<Item> icon) {
        return new ItemGroup(id) {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(icon.get());
            }
        };
    }

    public static ItemGroup MOD_MATERIALS_TAB = createGroup("mod_materials_tab", ModItems.CITRINE);
    public static ItemGroup MOD_GUNS_TAB = createGroup("mod_guns_tab", ModItems.TESTGUN);
}
