package com.talissonmelo.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;
import com.talissonmelo.food.notification.Notification;

@Component
public class ActivateClientService {

	@Autowired
	private Notification notification;

//	@Autowired
//	public ActivateClientService(Notification notification) {
//		this.notification = notification;
//	}

//	public ActivateClientService(String notification) {
//	 }

	public void activate(Client client) {
		client.setStatus();

		this.notification.notification(client, "Cadastro no sistema est� ativo!.");
	}

//	@Autowired
//	public void setNotification(Notification notification) {
//		this.notification = notification;
//	}
}
