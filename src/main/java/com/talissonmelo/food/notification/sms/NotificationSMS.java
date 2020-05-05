package com.talissonmelo.food.notification.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;
import com.talissonmelo.food.notification.Notification;
import com.talissonmelo.food.notification.NotificationProperties;
import com.talissonmelo.food.notification.anotation.TypeNotification;
import com.talissonmelo.food.notification.enums.TypeUrgency;

@TypeNotification(TypeUrgency.URGENT)
@Component
public class NotificationSMS implements Notification {
	
	@Autowired
	private NotificationProperties properties;

	@Override
	public void notification(Client client, String msg) {
		System.out.println("HOST : " + properties.getHostServidor());
		System.out.println("PORT : " + properties.getPortServidor());
		
		System.out.println("Notificando : " 
						+ client.getName() 
						+ ", através de SMS pelo telefone: " 
						+ client.getPhone()
						+ ", msg: " 
						+ msg);
	}
}
