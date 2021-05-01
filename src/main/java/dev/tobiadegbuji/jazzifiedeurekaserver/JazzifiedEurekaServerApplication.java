package dev.tobiadegbuji.jazzifiedeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //Enables Eureka server
public class JazzifiedEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JazzifiedEurekaServerApplication.class, args);
    }

}
