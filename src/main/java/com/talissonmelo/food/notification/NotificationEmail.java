package com.talissonmelo.food.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;

@Qualifier("email")
@Component
public class NotificationEmail implements Notification {

	@Override
	public void notification(Client client, String msg) {
		System.out.println("Notificando : " 
						+ client.getName() 
						+ ", através do email: " 
						+ client.getEmail() 
						+ ", msg: " 
						+ msg);
	}
}
