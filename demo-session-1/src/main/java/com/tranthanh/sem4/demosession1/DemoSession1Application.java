package com.tranthanh.sem4.demosession1;

import com.tranthanh.sem4.demosession1.services.StorageProperties;
import com.tranthanh.sem4.demosession1.services.StorageServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class DemoSession1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSession1Application.class, args);
    }

    @Bean
    CommandLineRunner init(StorageServices storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
}
