package com.talissonmelo.food.notification.anotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

import com.talissonmelo.food.notification.enums.TypeUrgency;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TypeNotification {

	TypeUrgency value();
}
