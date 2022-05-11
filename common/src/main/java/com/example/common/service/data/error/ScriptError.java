package com.example.common.service.data.error;

public class ScriptError extends CommonError {
	
	private static final long serialVersionUID = 4663467050685251205L;
	public String scriptName;
    
	public ScriptError(String errorId, String errorMessage, String errorDetail, String scriptName) {
		super(errorId, errorMessage, errorDetail);
		this.scriptName = scriptName;
		type = "common-js-script-error";
	}
}
