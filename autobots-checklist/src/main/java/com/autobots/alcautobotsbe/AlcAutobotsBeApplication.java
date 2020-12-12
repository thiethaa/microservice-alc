package com.autobots.alcautobotsbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AlcAutobotsBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlcAutobotsBeApplication.class, args);
    }

}
