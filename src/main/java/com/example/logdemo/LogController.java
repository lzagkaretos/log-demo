package com.example.logdemo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class LogController {
    
    private static final Logger logger = LogManager.getLogger(LogController.class);
    
    @GetMapping("log")
    public void logSomething() {
        logger.info("Custom Message");
    }
}
