package com.podio.notification;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

public enum NotificationContextType {

	STATUS,
	TASK,
	PROFILES,
	SPACE,
	ITEM,
	BULLETIN,
	APP;

	@Override
	@JsonValue
	public String toString() {
		return name().toLowerCase();
	}

	@JsonCreator
	public static NotificationContextType getByName(String value) {
		return valueOf(value.toUpperCase());
	}

}