package com.talissonmelo.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;
import com.talissonmelo.food.notification.Notification;

@Component
public class ActivateClientService {

	@Autowired(required = false)
	private Notification notification;

	public void activate(Client client) {
		client.setStatus();

		if (notification != null) {
			this.notification.notification(client, "Cadastro no sistema est� ativo!.");
		}else {
			System.out.println("Não existe notificador, mas cliente foi ativado.");
		}
	}
}
