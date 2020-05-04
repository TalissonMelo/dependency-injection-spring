package com.talissonmelo.food.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.talissonmelo.food.notification.Notification;
import com.talissonmelo.food.notification.anotation.TypeNotification;
import com.talissonmelo.food.notification.enums.TypeUrgency;
import com.talissonmelo.food.service.ActivateClientEvent;

@Component
public class NotificationService {
	
	@TypeNotification(value = TypeUrgency.URGENT)
	@Autowired
	private Notification notification;

	@EventListener
	public void clientActivateListener(ActivateClientEvent event) {
		notification.notification(event.getClient(), "Seu cadastro está ativo.");
	}
	
}
