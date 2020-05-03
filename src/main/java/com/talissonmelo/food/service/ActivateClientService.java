package com.talissonmelo.food.service;

import com.talissonmelo.food.model.Client;
import com.talissonmelo.food.notification.Notification;

public class ActivateClientService {

	private Notification notification;

	public ActivateClientService(Notification notification) {
		this.notification = notification;
		
		System.out.println("Ativação Cliente : " + notification);
	}

	public void activate(Client client) {
		client.setStatus();

		this.notification.notification(client, "Cadastro no sistema est� ativo!.");
	}
}