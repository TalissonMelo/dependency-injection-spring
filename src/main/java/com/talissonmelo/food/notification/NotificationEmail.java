package com.talissonmelo.food.notification;

import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;

@Component
public class NotificationEmail {
	
	public void notification(Client client, String msg) {
		System.out.println("Notificando : " 
								+ client.getName() 
								+ ", atrav�s do email: " 
								+ client.getEmail() 
								+ ", msg: " 
								+ msg);
	}
}
