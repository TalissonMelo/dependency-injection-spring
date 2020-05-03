package com.talissonmelo.food.notification.email;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;
import com.talissonmelo.food.notification.Notification;
import com.talissonmelo.food.notification.anotation.TypeNotification;
import com.talissonmelo.food.notification.enums.TypeUrgency;

@Profile("test")
@TypeNotification(TypeUrgency.NOT_URGENT)
@Component
public class NotificationEmailMock implements Notification {
	
	public NotificationEmailMock() {
		System.out.println("Notificador Email MOCK...");
	}

	@Override
	public void notification(Client client, String msg) {
		System.out.println("Simulando Email para : " 
						+ client.getName() 
						+ ", através do email: " 
						+ client.getEmail() 
						+ ", msg: " 
						+ msg);
	}
}
