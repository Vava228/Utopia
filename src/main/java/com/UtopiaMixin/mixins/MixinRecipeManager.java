package com.UtopiaMixin.mixins;
/*
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ICraftingRecipe;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.NonNullList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(RecipeManager.class)
public abstract class MixinRecipeManager {

    @Inject(method = "getRemainingItemsFor", at = @At("HEAD"), cancellable = true, remap = false)
    private void removeCraftingWithoutCraftingTable(ICraftingRecipe recipe, CraftingInventory inventory, CallbackInfoReturnable<NonNullList<ItemStack>> info) {
        NonNullList<ItemStack> defaultedList = NonNullList.withSize(inventory.getContainerSize(), ItemStack.EMPTY);
        info.setReturnValue(defaultedList);
        info.cancel();
        // Убираем механику крафта без верстака
        for (int i = 0; i < defaultedList.size(); ++i) {
            ItemStack itemStack = inventory.getItem(i);
            if (itemStack.hasContainerItem()) {
                defaultedList.set(i, itemStack.getContainerItem());
            }
        }



    }

}*/




