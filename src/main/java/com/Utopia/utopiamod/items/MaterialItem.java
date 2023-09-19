package com.Utopia.utopiamod.items;

import com.Utopia.utopiamod.utils.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MaterialItem extends Item
{
    public MaterialItem() {
        super(new Item.Properties().tab(ModItemGroups.MOD_MATERIALS_TAB));
    }
}
