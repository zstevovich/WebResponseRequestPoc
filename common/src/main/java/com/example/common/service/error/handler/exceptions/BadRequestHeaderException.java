package com.example.common.service.error.handler.exceptions;

import java.util.List;

import com.example.common.service.data.error.ExceptionError;
import com.example.common.service.error.handler.exceptions.base.ServiceExceptionBase;
import com.example.common.service.web.responses.ProblemResponseData;
import org.springframework.http.HttpStatus;

public class BadRequestHeaderException extends ServiceExceptionBase {
	
	private static final long serialVersionUID = -1836308831108425114L;

	public BadRequestHeaderException(List<String> headerFieldsNames) {
		super(HttpStatus.BAD_REQUEST.value(), "Required fields in request header are missing!", null);
		
		String fieldsList = "";
		for (String item : headerFieldsNames)
			fieldsList += item + ", ";
		
		fieldsList = fieldsList.substring(0, fieldsList.length() - 2);
		
		String errorMessage = "";
		if (headerFieldsNames.size() == 1) 
			errorMessage = "A field in request header is missing!";
		else if (headerFieldsNames.size() > 1)
			errorMessage = "Some fields in request header are missing!";

		problem = new ProblemResponseData(ProblemResponseData.SERVICE_CODE, new ExceptionError("exception-11", errorMessage, fieldsList));
	}
}
