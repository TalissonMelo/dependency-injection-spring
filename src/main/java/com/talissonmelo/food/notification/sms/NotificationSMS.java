package com.talissonmelo.food.notification.sms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;
import com.talissonmelo.food.notification.Notification;
import com.talissonmelo.food.notification.anotation.TypeNotification;
import com.talissonmelo.food.notification.enums.TypeUrgency;

@TypeNotification(TypeUrgency.URGENT)
@Component
public class NotificationSMS implements Notification {
	
	@Value("${notification.email.host-servidor}")
	private String host;
	
	@Value("${notification.email.port-servidor}")
	private Integer port;

	@Override
	public void notification(Client client, String msg) {
		System.out.println("ROST : " + this.host);
		System.out.println("PORT : " + this.port);
		
		System.out.println("Notificando : " 
						+ client.getName() 
						+ ", através de SMS pelo telefone: " 
						+ client.getPhone()
						+ ", msg: " 
						+ msg);
	}
}
