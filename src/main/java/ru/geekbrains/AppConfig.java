package ru.geekbrains;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.gorin.Camera;
import ru.geekbrains.gorin.CameraRoll;
import ru.geekbrains.gorin.ColorCameraRoll;

@Configuration
@ComponentScan("ru.geekbrains.gorin")
public class AppConfig {
    @Bean(name="cameraRoll")
    public CameraRoll cameraRoll() {
        return new ColorCameraRoll() ;
    }

    @Bean(name="camera")
    public Camera camera(CameraRoll cameraRoll){
        Camera camera = new Camera();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}
