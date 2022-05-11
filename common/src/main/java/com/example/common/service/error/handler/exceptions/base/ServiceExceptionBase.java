package com.example.common.service.error.handler.exceptions.base;
import com.example.common.service.web.responses.ProblemResponseData;

public abstract class ServiceExceptionBase extends RuntimeException implements ServiceException {
	private static final long serialVersionUID = 2068386679725656527L;

	protected ProblemResponseData problem;
	protected int status;
	
	public ServiceExceptionBase(int status, String message, ProblemResponseData problem) {
		super(message);
		this.problem = problem;
		this.status = status;
	}
	
	@Override 
	public int getStatus() {
		return status;
	}
	
	@Override 
	public ProblemResponseData getProblem() {
		return problem;
	}
}
