package com.sqshine.controller;

import com.sqshine.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    private final String SERVICE_URL = "http://service-cloud";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ComputeClient computeClient;

    @GetMapping("/add")
    public String add() {
        return restTemplate.getForEntity(SERVICE_URL + "/add?a=10&b=20", String.class).getBody();
    }

    @GetMapping("/add2")
    public String add2() {
        return restTemplate.getForEntity(SERVICE_URL + "/add?a=30&b=30", String.class).getBody();
    }

    @GetMapping("/add1")
    public Integer add1() {
        return computeClient.add(20, 60);
    }
}
