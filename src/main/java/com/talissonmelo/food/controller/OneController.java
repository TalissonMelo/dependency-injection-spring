package com.talissonmelo.food.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/msgs")
public class OneController {

	@GetMapping
	public String get() {
		return "Primeiro Controlador";
	}	
}
