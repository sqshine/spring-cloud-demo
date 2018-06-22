package com.sqshine;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sqshine
 */
@SpringBootApplication
@EnableEurekaServer
@EnableAdminServer
public class RegistryCenterCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterCloudApplication.class, args);
    }
}