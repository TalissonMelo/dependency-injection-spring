package com.talissonmelo.food.service;

import com.talissonmelo.food.model.Client;

public class ActivateClientEvent {

	private Client client;

	public ActivateClientEvent(Client client) {
		this.client = client;
	}

	public Client getClient() {
		return client;
	}
}
