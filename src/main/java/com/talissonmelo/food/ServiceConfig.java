package com.talissonmelo.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.talissonmelo.food.service.ActivateClientService;

@Configuration
public class ServiceConfig {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public ActivateClientService activateClient() {
		return new ActivateClientService();
	}

}
