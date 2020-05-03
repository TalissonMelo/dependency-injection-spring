package com.talissonmelo.food.notification;

import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;

@Component
public class NotificationSMS implements Notification {

	@Override
	public void notification(Client client, String msg) {
		System.out.println("Notificando : " 
						+ client.getName() 
						+ ", através de SMS pelo telefone: " 
						+ client.getPhone()
						+ ", msg: " 
						+ msg);
	}
}
