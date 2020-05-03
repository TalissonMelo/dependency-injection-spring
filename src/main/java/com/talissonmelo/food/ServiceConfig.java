package com.talissonmelo.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.talissonmelo.food.notification.Notification;
import com.talissonmelo.food.service.ActivateClientService;

@Configuration
public class ServiceConfig {

	@Bean
	public ActivateClientService activateClient(Notification notification) {
		return  new ActivateClientService(notification);
	}
}
