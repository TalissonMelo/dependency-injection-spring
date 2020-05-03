package com.talissonmelo.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;
import com.talissonmelo.food.notification.Notification;

@Component
public class ActivateClientService {

	@Autowired
	private List<Notification> notification;

	public void activate(Client client) {
		client.setStatus();

		for (Notification notification : notification) {
			notification.notification(client, "Cadastro no sistema est� ativo!.");
		}
	}
}
