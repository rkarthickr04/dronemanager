package com.dronemanager.dronemanager.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseObject extends ResponseEntity<Object> {
    
	public ResponseObject(final String message, final Object payload) {
		this(message, payload, null);
	}

	public ResponseObject(final String message) {
		this(message, null, null);
	}

    public ResponseObject(final String message, final Object payload, final Long totalCount) {
		super(new Payload(message, payload, totalCount), HttpStatus.OK);
	}
}
