package com.rodrigoromero.poc.elasticache.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rodrigoromero.poc.elasticache.clients.CustomErrorDecoder;

import feign.codec.ErrorDecoder;

@Configuration
public class ClientConfiguration {

	@Bean
	public ErrorDecoder errorDecoder() {
		return new CustomErrorDecoder(); 
	}
}
