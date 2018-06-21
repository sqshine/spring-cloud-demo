package com.sqshine.controller;

import com.sqshine.ComputeClient;
import com.sqshine.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sqshine
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @Autowired
    private ComputeClient computeClient;

    /**
     * 使用断路器保护
     *
     * @return 计算结果
     */
    @GetMapping("/add")
    public Integer add() {
        return computeService.addService();
    }

    /**
     * 未使用断路器
     *
     * @return 计算结果
     */
    @GetMapping("/add2")
    public String add2() {
        return computeService.addService2();
    }

    @GetMapping("/add1")
    public Integer add1() {
        return computeClient.add(20, 60);
    }
}
