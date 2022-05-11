package com.example.common.service.data.api.dto.response;

import com.example.common.service.data.api.dto.ProblemResponseDtoData;

import java.io.Serializable;


public abstract class ServiceResponseDtoBase implements Serializable {

	private static final long serialVersionUID = 522302564740624219L;
	
	public ProblemResponseDtoData problemData;
	
    public boolean hasAnyProblems() {
		return  problemData != null && !problemData.problems.isEmpty();
	}
    
    public boolean hasNoProblems() {
		return  problemData == null || problemData.problems.isEmpty();
	}
    
    public boolean hasAnyErrors() {
		return problemData != null && problemData.problems.hasAnyErrors();
	}
    
    public boolean hasNoErrors() {
    	return problemData == null || problemData.problems.hasNoErrors();
	}
}
