package com.Utopia.utopiamod.Gun;

import net.minecraft.block.material.Material;

public enum GunItems
{
    AEK(40,30,"AEK",Material.CORAL);
//    m4;

    private double damage;
    private  int bulletNum;
    private  String name;
    private Material gunMaterial;

    GunItems(double damage, int bulletNum, String name, Material gunMaterial){
        this.damage=damage;
        this.bulletNum=bulletNum;
        this.name=name;
        this.gunMaterial=gunMaterial;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getBulletNum() {
        return bulletNum;
    }

    public void setBulletNum(int bulletNum) {
        this.bulletNum = bulletNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getGunMaterial() {
        return gunMaterial;
    }

    public void setGunMaterial(Material gunMaterial) {
        this.gunMaterial = gunMaterial;
    }
}
