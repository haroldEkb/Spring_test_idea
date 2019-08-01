package ru.geekbrains.harold.rifleTask;

import org.springframework.stereotype.Component;

@Component
public class Rifle{

    private Magazine magazine;

    public Rifle(){}


    public Rifle(Magazine magazine){
        this.magazine = magazine;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public void shoot(){
        if (magazine.getCount() > 0){
            System.out.println("Звук выстрела");
            magazine.shot();
        } else {
            System.out.println("Щёлк");
        }
    }
}
