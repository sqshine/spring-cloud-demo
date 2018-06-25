package com.sqshine;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author sqshine
 */
@SpringBootApplication
@EnableEurekaServer
@EnableAdminServer
@EnableHystrixDashboard
public class RegistryCenterCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterCloudApplication.class, args);
    }
}