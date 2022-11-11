package com.routing.services;

import java.net.URI;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class CustomGlobalFilter implements GlobalFilter, Ordered {
	
    Log log = LogFactory.getLog(getClass());
    
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("custom global filter:"+exchange.getLogPrefix()+ " Req:"+exchange.getRequest()+" Res:"+exchange.getResponse() +" ToString:"+exchange);
        return chain.filter(exchange);
    }
    
    @Override
    public int getOrder() {
        return -1;
    }
    

}
