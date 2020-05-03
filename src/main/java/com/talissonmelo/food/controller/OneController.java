package com.talissonmelo.food.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talissonmelo.food.model.Client;
import com.talissonmelo.food.service.ActivateClientService;

@RestController
@RequestMapping(value = "/msgs")
public class OneController {

	private ActivateClientService client;

	public OneController(ActivateClientService client) {
		this.client = client;
	}

	@GetMapping
	public String get() {
		
		Client talisson = new Client("Talisson Melo", "talisson@gmail.com", "3242-3415");
		client.activate(talisson);
		return "Primeiro Controlador";
	}
}
