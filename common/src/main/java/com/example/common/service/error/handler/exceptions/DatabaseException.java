package com.example.common.service.error.handler.exceptions;

import com.example.common.service.data.error.ExceptionError;
import com.example.common.service.error.handler.exceptions.base.ServiceExceptionBase;
import com.example.common.service.web.responses.ProblemResponseData;
import org.springframework.http.HttpStatus;

public class DatabaseException extends ServiceExceptionBase {

	private static final long serialVersionUID = -4505840664935957018L;

	public DatabaseException(int code, String message, String details) {
		super(HttpStatus.INTERNAL_SERVER_ERROR.value(), message, new ProblemResponseData(code, new ExceptionError("exception-15", message, details)));
	}
}
