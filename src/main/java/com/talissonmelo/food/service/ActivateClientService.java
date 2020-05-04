package com.talissonmelo.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.talissonmelo.food.model.Client;

@Component
public class ActivateClientService {
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;

	public void activate(Client client) {
		client.setStatus();
		
		eventPublisher.publishEvent(new ActivateClientEvent(client));
	}
}
