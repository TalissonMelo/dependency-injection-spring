package com.talissonmelo.food.notification;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notification.email")
public class NotificationProperties {

	private String hostServidor;
	private Integer portServidor;

	public String getHostServidor() {
		return hostServidor;
	}

	public void setHostServidor(String hostServidor) {
		this.hostServidor = hostServidor;
	}

	public Integer getPortServidor() {
		return portServidor;
	}

	public void setPortServidor(Integer portServidor) {
		this.portServidor = portServidor;
	}
}
