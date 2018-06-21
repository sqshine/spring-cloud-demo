package com.sqshine.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sqshine
 */
@RestController
@Slf4j
public class ComputeController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private Registration registration;

    @GetMapping("/")
    public String home() {
        return "Hello world";
    }

    @GetMapping(value = "/add")
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        String serviceId = registration.getServiceId();
        List<ServiceInstance> list = discoveryClient.getInstances(serviceId);
        Integer result = a + b;
        if (list != null && list.size() > 0) {
            ServiceInstance serviceInstance = list.get(0);
            log.info("/add, host:{}" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId() + ", result:" + result);
        }

        return result;
    }

}
