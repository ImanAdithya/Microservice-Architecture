package lk.ijse.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AppInitializer {
    public static void main(String[] args) {
        SpringApplication.run (AppInitializer.class,args);
    }
}
