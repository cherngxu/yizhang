package cn.cherng.ying;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YingApplication {
    public static void main(String[] args) {
        SpringApplication.run(YingApp.class,args);
        Application.launch(YingApp.class,args);
    }
}
