package ru.geekbrains.harold.rifleTask;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtraConfig {

    @Bean(name = "rifle1")
    public Rifle rifle1(@Qualifier("magazine1") Magazine magazine){
        Rifle rifle = new Rifle();
        rifle.setMagazine(magazine);
        return rifle;
    }

    @Bean(name = "rifle2")
    public Rifle rifle2(@Qualifier("magazine2") Magazine magazine){
        Rifle rifle = new Rifle();
        rifle.setMagazine(magazine);
        return rifle;
    }
}
