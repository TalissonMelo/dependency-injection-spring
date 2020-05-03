package com.talissonmelo.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;
import com.talissonmelo.food.notification.Notification;
import com.talissonmelo.food.notification.TypeNotification;
import com.talissonmelo.food.notification.enums.TypeUrgency;

@Component
public class ActivateClientService {

	@TypeNotification(TypeUrgency.NOT_URGENT)
	@Autowired
	private Notification notification;

	public void activate(Client client) {
		client.setStatus();

		this.notification.notification(client, "Cadastro no sistema est� ativo!.");

	}
}
