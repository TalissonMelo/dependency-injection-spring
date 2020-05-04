package com.talissonmelo.food.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.talissonmelo.food.model.Client;
import com.talissonmelo.food.notification.Notification;
import com.talissonmelo.food.notification.anotation.TypeNotification;
import com.talissonmelo.food.notification.enums.TypeUrgency;

//@Component
public class ActivateClientService {

	@TypeNotification(TypeUrgency.NOT_URGENT)
	@Autowired
	private Notification notification;

//	@PostConstruct
	public void init() {
		System.out.println("INIT" + notification);
	}

//	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}

	public void activate(Client client) {
		client.setStatus();

		this.notification.notification(client, "Cadastro no sistema est� ativo!.");

	}
}
