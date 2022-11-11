package com.routing.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import io.netty.handler.logging.LogLevel;
import reactor.netty.http.client.HttpClient;
import reactor.netty.transport.logging.AdvancedByteBufFormat;

@SpringBootApplication
@EnableEurekaClient
public class EmplyeeZuulApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmplyeeZuulApiServiceApplication.class, args);
	}
	
//	@Bean
//	public GlobalFilter customFilter() {
//	    return new CustomGlobalFilter();
//	}
//	
//	@Bean
//	HttpClient httpClient() {
//	    return HttpClient.create().wiretap("LoggingFilter", LogLevel.INFO, AdvancedByteBufFormat.TEXTUAL);
//	}
}
