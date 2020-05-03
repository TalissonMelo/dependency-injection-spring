package com.talissonmelo.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.talissonmelo.food.notification.NotificationEmail;
import com.talissonmelo.food.service.ActivateClientService;

//@Configuration
public class FoodConfig {

	@Bean
	public NotificationEmail notificationEmail() {
		NotificationEmail notification = new NotificationEmail("smtp.google.com.br");
		notification.setUpperCase(true);
		
		return notification;
	}
	
	@Bean
	public ActivateClientService activateClient() {
		return new ActivateClientService(notificationEmail());
	}
}
