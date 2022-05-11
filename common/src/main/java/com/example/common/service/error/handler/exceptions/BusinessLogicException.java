package com.example.common.service.error.handler.exceptions;

import com.example.common.service.data.error.ExceptionError;
import com.example.common.service.error.handler.exceptions.base.ServiceExceptionBase;
import com.example.common.service.web.responses.ProblemResponseData;
import org.springframework.http.HttpStatus;

public class BusinessLogicException extends ServiceExceptionBase {
	
	private static final long serialVersionUID = 1015388434114326921L;

	public BusinessLogicException(int code, String message, String details) {
		super(HttpStatus.BAD_REQUEST.value(), message, new ProblemResponseData(code, new ExceptionError("exception-12", message, details)));
	}
	
	
	protected BusinessLogicException(int code, String error, String message, String details) {
		super(HttpStatus.BAD_REQUEST.value(), message, new ProblemResponseData(code, new ExceptionError(error, message, details)));
	}

	
	protected BusinessLogicException(String message, ProblemResponseData problem) {
		super(HttpStatus.BAD_REQUEST.value(), message, problem);
	}
}
