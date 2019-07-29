package ru.geekbrains.harold.rifleTask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.geekbrains.harold.rifleTask")
public class AppConfig {
    @Bean(name = "buckshot")
    public Ammo buckshot(){
        return new Buckshot();
    }

    @Bean(name = "rifle")
    public Gun rifle(Ammo buckshot){
        Rifle rifle = new Rifle();
        rifle.setAmmo(buckshot);
        return rifle;
    }
}
