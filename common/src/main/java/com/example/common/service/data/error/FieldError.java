package com.example.common.service.data.error;

public class FieldError extends CommonError {
	
	private static final long serialVersionUID = -3105791083200816947L;
	public String fieldName;
    
	public FieldError(String errorMessage, String errorDetail, String fieldName) {
		super("validation-" + fieldName, errorMessage, errorDetail);
		this.fieldName = fieldName;
		type = "field-error";
	}
}
