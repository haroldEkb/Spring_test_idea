package ru.geekbrains.harold.rifleTask;

public class Rifle implements Gun {

    private Ammo ammo;

    @Override
    public void shoot() {
        System.out.println("Звук выстрела");
        ammo.processing();
    }

    public void setAmmo(Ammo ammo) {
        this.ammo = ammo;
    }
}
