package com.talissonmelo.food.service;

import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;
import com.talissonmelo.food.notification.NotificationEmail;

@Component
public class ActivateClientService {

	private NotificationEmail notification;

	public void activate(Client client) {
		client.setStatus();

		this.notification.notification(client, "Cadastro no sistema est� ativo!.");
	}
}
