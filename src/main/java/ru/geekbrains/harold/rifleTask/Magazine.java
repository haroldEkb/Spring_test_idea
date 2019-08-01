package ru.geekbrains.harold.rifleTask;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Magazine {

    private Ammo ammo;
    @Value("2")
    private int count;

    public Ammo getAmmo() {
        return ammo;
    }

    public void setAmmo(Ammo ammo) {
        this.ammo = ammo;
    }

    public int getCount() {
        return count;
    }

    public void shot(){
        if (count > 0){
            count--;
            System.out.println("В магазине осталось " + count + " зарядов типа " + ammo.getName());
        } else {
            System.out.println("Магазин пустой");
        }
    }

}
