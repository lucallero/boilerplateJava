package com.boilerplate.system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Info {

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/info")
    public String info() {
        return name;
    }

}