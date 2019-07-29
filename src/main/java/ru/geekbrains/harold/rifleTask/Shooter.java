package ru.geekbrains.harold.rifleTask;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Shooter {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Gun rifle = context.getBean("rifle", Gun.class);
        rifle.shoot();
    }
}