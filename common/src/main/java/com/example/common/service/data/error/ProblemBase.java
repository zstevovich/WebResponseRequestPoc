package com.example.common.service.data.error;

import java.io.Serializable;

public abstract class ProblemBase implements Serializable {
	
	private static final long serialVersionUID = -4123235227614715823L;
	
	public String id;	//"aml-1021"
	public String message;	//""
	public String details;	//""
	
	public String type = "";
	
	public ProblemBase(String id, String message, String details) {
		this.id = id;
	    this.message = message;
	    this.details = details;
	}
}
