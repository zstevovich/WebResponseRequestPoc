package com.example.common.service.web.responses;

import java.io.Serializable;


public class WebResponseBase implements Serializable {

	private static final long serialVersionUID = 3593393804184756969L;
	
	public ProblemResponseData problemResponseData;

	public WebResponseBase(ProblemResponseData problemResponseData) {
		this.problemResponseData = problemResponseData;
	}

	public WebResponseBase() {
	}
}
