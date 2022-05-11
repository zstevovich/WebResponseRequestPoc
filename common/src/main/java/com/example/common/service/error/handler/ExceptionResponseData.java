package com.example.common.service.error.handler;
import com.example.common.service.data.error.ProblemBase;
import com.example.common.service.data.error.list.ProblemsList;
import com.example.common.service.web.responses.ProblemResponseData;

public class ExceptionResponseData extends ProblemResponseData {
	
	private static final long serialVersionUID = -4808820379013859314L;
	
	public String time;
	public String traceId;
	
    public ExceptionResponseData(int code, ProblemBase problem, String traceId, String time) {
    	super(code, problem);
    	this.traceId = traceId;
    	this.time = time;
    }

    public ExceptionResponseData(int code, ProblemBase[] problems, String traceId, String time) {
    	super(code);
    	this.problems = problems;
    	this.traceId = traceId;
    	this.time = time;
    	this.error = true;
    }
    
    public ExceptionResponseData(int code, ProblemsList problems, String traceId, String time) {
    	super(code, problems);
    	this.traceId = traceId;
    	this.time = time;
    }
}
