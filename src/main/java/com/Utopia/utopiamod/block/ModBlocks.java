package com.Utopia.utopiamod.block;


import com.Utopia.utopiamod.Utopia;
import com.Utopia.utopiamod.init.ModItems;
import com.Utopia.utopiamod.utils.ModItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import  net.minecraftforge.registries.DeferredRegister;
import  net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import static net.minecraft.block.material.Material.*;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.util.NonNullList;

import java.util.List;
import java.util.Collections;
import java.util.function.Supplier;

public class ModBlocks
{
    public  static  final DeferredRegister<Block> BLOCK =
         DeferredRegister.create(ForgeRegistries.BLOCKS, Utopia.MOD_ID);


    public  static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            () -> new Block(AbstractBlock.Properties.of(HEAVY_METAL)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.BONE_BLOCK).strength(4,6).requiresCorrectToolForDrops()));

    public  static final RegistryObject<Block> CITRINE_BLOCK =registerBlock("citrine_block",
    () -> new Block(AbstractBlock.Properties.of(GLASS).harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .sound(SoundType.BONE_BLOCK).strength(6,10).requiresCorrectToolForDrops()));


    private static RegistryObject<Block> registerBlock(String name, Supplier<Block> block){
        RegistryObject<Block> toReturn = BLOCK.register(name,block);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }

    private static void  registerBlockItem(String  name, RegistryObject<Block> block){
        ModItems.Items.register(name, ()-> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroups.MOD_MATERIALS_TAB)));
    }


    public  static  void  register(IEventBus eventBus){
        BLOCK.register(eventBus);
    }


}
