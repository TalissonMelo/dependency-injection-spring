package com.talissonmelo.food.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

	@EventListener
	public void clientActivateListener(ActivateClientEvent event) {
		System.out.println("Sua nota fiscal foi emetida." + event.getClient().getEmail());
	}
}
