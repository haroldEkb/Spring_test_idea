package ru.geekbrains.harold.rifleTask;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ExtraConfig.class)
@ComponentScan("ru.geekbrains.harold.rifleTask")
public class AppConfig {

    @Bean(name = "buckshot")
    public Ammo buckshot(){
        return new Buckshot();
    }

    @Bean(name = "bullet")
    public Ammo bullet(){
        return new Bullet();
    }

    @Bean
    @Qualifier("magazine1")
    public Magazine magazine1(Ammo buckshot){
        Magazine magazine = new Magazine();
        magazine.setAmmo(buckshot);
        return magazine;
    }

    @Bean
    @Qualifier("magazine2")
    public Magazine magazine2(Ammo bullet){
        Magazine magazine = new Magazine();
        magazine.setAmmo(bullet);
        return magazine;
    }

}
