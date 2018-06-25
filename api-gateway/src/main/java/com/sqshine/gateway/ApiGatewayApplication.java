package com.sqshine.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

/**
 * @author sqshine
 */
@SpringBootApplication
@RestController
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @GetMapping("/hello")
    public Mono<String> hello() {
        return null;
    }
}
