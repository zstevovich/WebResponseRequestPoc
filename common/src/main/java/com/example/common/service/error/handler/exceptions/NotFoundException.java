package com.example.common.service.error.handler.exceptions;

public class NotFoundException extends BusinessLogicException {

	private static final long serialVersionUID = -7269853378289337402L;

	public NotFoundException(int code, String message, String details) {
		super(code, "exception-14", message, details);
	}
}
