package com.rodrigoromero.poc.elasticache.configurations;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator{

	 private boolean isHealthy = true;
	 
	  
	 
	    @Override
	    public Health health() {
	        return isHealthy ? Health.up().build() : Health.down().build();
	    }
	
}
