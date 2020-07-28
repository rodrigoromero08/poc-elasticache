package com.rodrigoromero.poc.elasticache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PocElasticacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocElasticacheApplication.class, args);
	}

}
