package com.eureka.client.instance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientInstanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientInstanceApplication.class, args);
    }

}
