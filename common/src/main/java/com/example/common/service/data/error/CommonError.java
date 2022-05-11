package com.example.common.service.data.error;

public class CommonError extends ProblemBase {
	
	private static final long serialVersionUID = -6519798711097613567L;

	public CommonError(String errorId, String errorMessage, String errorDetails) {
        super(errorId, errorMessage, errorDetails);
    	type = "common-error";
    }
}
