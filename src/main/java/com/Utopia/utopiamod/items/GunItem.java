package com.Utopia.utopiamod.items;

import com.Utopia.utopiamod.utils.ModItemGroups;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;

public class GunItem extends Item {

    protected int damage;
    protected int reloadTime;
    protected int fireRate;

    protected int currAmmo;
    protected int maxAmmo;
    int shootTimer = 0;
    int reloadTimer = 0;
    private boolean isReloading = false;

    public GunItem() {
        this(1, 1, 1, 1);
    }

    public GunItem(int damage, int reloadTime, int fireRate, int maxAmmo) {
        super(new Item.Properties().tab(ModItemGroups.MOD_GUNS_TAB).stacksTo(1));
        this.damage = damage;
        this.reloadTime = reloadTime;
        this.fireRate = fireRate;
        this.maxAmmo = maxAmmo;
    }


    public int getDamage() {
        return this.damage;
    }

    public int getReloadTime() {
        return this.reloadTime;
    }

    public int getFireRate() {
        return fireRate;
    }

    public void tryShootOrReload(PlayerEntity player) {
        if (this.canShoot(player)) {
            this.shoot(player);
        } else {
            this.reload(player);
        }
    }

    private void shoot(PlayerEntity player) {
        this.currAmmo--;
    }

    public void reload(PlayerEntity player) {
        if (this.canReload(player)) {
            this.isReloading = true;
            this.currAmmo = this.maxAmmo;
            this.reloadTimer = this.reloadTime;
        } else if (this.isReloading){
            this.reloadTimer--;
        }
    }

    public boolean isReloading() {
        return this.isReloading;
    }

    private boolean hasAmmo(PlayerEntity player) {
        return true;
    }

    private boolean canReload(PlayerEntity player) {
        return !this.isReloading && this.reloadTimer == 0 && this.hasAmmo(player);
    }

    private boolean canShoot(PlayerEntity player) {
        return this.shootTimer == 0 && this.currAmmo > 0 || player.isCreative();
    }
}
