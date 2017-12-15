package com.example.logdemo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LogDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LogDemoApplication.class, args);
	}
}
