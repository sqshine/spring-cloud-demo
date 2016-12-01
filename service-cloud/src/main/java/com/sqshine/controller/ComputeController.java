package com.sqshine.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(getClass());

    @GetMapping("/")
    public String home() {
        return "Hello world";
    }

    @GetMapping(value = "/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        logger.info("服务被调用");
        return a + b;
    }

}
