package com.talissonmelo.food.notification;

import com.talissonmelo.food.model.Client;

public interface Notification {

	void notification(Client client, String msg);

}