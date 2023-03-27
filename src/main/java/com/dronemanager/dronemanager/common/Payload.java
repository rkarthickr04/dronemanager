package com.dronemanager.dronemanager.common;

import lombok.Data;

@Data
public class Payload {
    
    private String message;

	private Object response;

	private Long count;

	public Payload(final String message, final Object payload, final Long count) {
		this.message = message;
		this.response = payload;
		this.count   = count;
	}
}
