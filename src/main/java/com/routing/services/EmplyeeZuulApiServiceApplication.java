package com.routing.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmplyeeZuulApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmplyeeZuulApiServiceApplication.class, args);
	}
	
}
