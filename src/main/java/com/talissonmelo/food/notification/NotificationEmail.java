package com.talissonmelo.food.notification;

import com.talissonmelo.food.model.Client;

public class NotificationEmail implements Notification {

	private boolean upperCase;
	private String hostServidorSmtp;

	public NotificationEmail(String hostServidorSmtp) {
		System.out.println("Notificador Email : ");
		this.hostServidorSmtp = hostServidorSmtp;
	}

	@Override
	public void notification(Client client, String msg) {

		if (this.upperCase) {
			msg = msg.toUpperCase();
		}

		System.out.println("Notificando : " 
						+ client.getName() 
						+ ", através do email: " 
						+ client.getEmail() 
						+ ", usando SMTP : "
						+ 	this.hostServidorSmtp
						+ ", msg: " 
						+ msg);
	}

	public void setUpperCase(boolean upperCase) {
		this.upperCase = upperCase;
	}
}
