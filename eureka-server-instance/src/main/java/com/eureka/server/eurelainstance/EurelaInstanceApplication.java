package com.eureka.server.eurelainstance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurelaInstanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurelaInstanceApplication.class, args);
    }

}
