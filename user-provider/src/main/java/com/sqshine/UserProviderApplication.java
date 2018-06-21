package com.sqshine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sqshine
 */
@SpringBootApplication
//@EnableDiscoveryClient  //新版本不需要这个注解
public class UserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication.class, args);
    }
}
