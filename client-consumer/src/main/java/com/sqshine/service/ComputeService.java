package com.sqshine.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ComputeService {

    private final String SERVICE_URL = "http://service-cloud";

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public Integer addService() {
        return restTemplate.getForEntity(SERVICE_URL + "/add?a=10&b=20", Integer.class).getBody();
    }

    /**
     * 调用服务失败的方法，返回类型必须和调用服务的方法，如addService一致，否则不起作用
     * @return 错误信息
     */
    public Integer addServiceFallback() {
        return -1;
    }

    public String addService2() {
        return restTemplate.getForEntity(SERVICE_URL + "/add?a=30&b=30", String.class).getBody();
    }
}
