package com.talissonmelo.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.talissonmelo.food.notification.NotificationEmail;

@Configuration
public class NotificationConfig {
	
	@Bean
	public NotificationEmail notificationEmail() {
		NotificationEmail notificationEmail = new NotificationEmail("smtp.google.com.br");
		notificationEmail.setUpperCase(true);
		
		return notificationEmail;
	}

}
