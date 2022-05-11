package com.example.common.service.error.handler.exceptions;

import com.example.common.service.data.error.FieldError;
import com.example.common.service.web.responses.ProblemResponseData;

public class BadRequestParametersException extends BusinessLogicException {

	private static final long serialVersionUID = 3382817244548634279L;

	public BadRequestParametersException(String message, String details) {
		super(ProblemResponseData.SERVICE_CODE, "exception-13", message, details);
	}
	
	public BadRequestParametersException(String message, String details, String fieldName) {
		super(message, new ProblemResponseData(ProblemResponseData.SERVICE_CODE, new FieldError(message, details, fieldName)));
	}
}
