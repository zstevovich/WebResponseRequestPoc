package com.example.common.service.data.api.dto;

import java.io.Serializable;
import com.example.common.service.data.error.ProblemBase;
import com.example.common.service.data.error.list.ProblemsList;
import com.example.common.service.web.responses.ProblemResponseData;

public class ProblemResponseDtoData implements Serializable {
	
    private static final long serialVersionUID = -6255080816701499147L;
    
	public int code;				// error code
    public ProblemsList problems = new ProblemsList();

    public ProblemResponseDtoData(int code, ProblemBase problem) {
    	
    	this.code = code;
    	if (problem != null) {
    		this.problems.add(problem);
    	}
    }

    public ProblemResponseDtoData(int code, ProblemsList problemsList) {
    	this.code = code;
    	this.problems = problemsList;
    }
    
    public ProblemResponseData toResponse() {
    	ProblemResponseData response = new ProblemResponseData(code, problems);
    	return response;
    }
    
    public boolean hasErrors() {
    	return problems != null && problems.hasAnyErrors();
    }
    
    public boolean hasProblems() {
    	return problems != null && !problems.isEmpty();
    }
    
    
}