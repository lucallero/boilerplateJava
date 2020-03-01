package com.boilerplate.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Status {

    private Logger log = LoggerFactory.getLogger(Status.class);

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/info")
    public String info() {
        log.info("A INFO Message from " + name);
        return name;
    }

    @RequestMapping("/health")
    public String health() {
        log.trace("I'm good. A TRACE Message from " + name);
        return name;
    }
}