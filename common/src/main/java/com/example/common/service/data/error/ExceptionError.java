package com.example.common.service.data.error;

public class ExceptionError extends CommonError {
	
	private static final long serialVersionUID = 5263894349479070741L;

	public ExceptionError(String errorId, String errorMessage, String errorDetail) {
		super(errorId, errorMessage, errorDetail);
		type = "exception-error";
	}
}
