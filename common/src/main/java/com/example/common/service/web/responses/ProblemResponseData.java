package com.example.common.service.web.responses;

import com.example.common.service.data.error.CommonError;
import com.example.common.service.data.error.ProblemBase;
import com.example.common.service.data.error.list.ProblemsList;

import java.io.Serializable;


public class ProblemResponseData implements Serializable {
	
	private static final long serialVersionUID = -5989412615181354833L;
	
	public static int SERVICE_CODE = 100;
	
	public int code;				// error code (domain service id)
	public boolean error;			// contains error message
    public ProblemBase[] problems;	// list of error items
    
    public ProblemResponseData(int code) {
    	this.code = code;
    }

    public ProblemResponseData(int code, ProblemBase problem) {
    	
    	this.code = code;
    	
    	if (problem != null) {
    		this.problems = new ProblemBase[1];
    		this.problems[0] = problem;
    		this.error = problem instanceof CommonError;
    	}
    }

    public ProblemResponseData(int code, ProblemsList problemsList) {
    	this.code = code;
    	this.problems = problemsList.toProblemsArray();
    	this.error = problemsList.hasAnyErrors();
    }
}
