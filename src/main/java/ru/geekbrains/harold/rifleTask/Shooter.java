package ru.geekbrains.harold.rifleTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Shooter {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Rifle rifle = context.getBean("rifle1",Rifle.class);
        for (int i = 0; i < 3; i++) {
            rifle.shoot();
        }
        System.out.println(rifle.hashCode());
        System.out.println(rifle.getMagazine().hashCode());
        System.out.println(rifle.getMagazine().getAmmo().getName());
        System.out.println();


        rifle = context.getBean("rifle2",Rifle.class);
        rifle.shoot();
        System.out.println(rifle.hashCode());
        System.out.println(rifle.getMagazine().hashCode());
        System.out.println(rifle.getMagazine().getAmmo().getName());
    }
}
