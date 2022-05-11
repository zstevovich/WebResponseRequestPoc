package com.example.common.service.web.responses;

import com.example.common.service.data.api.dto.response.ObjectResponseDto;

public class WebResponseObject<T> extends WebResponseBase {
	
	private static final long serialVersionUID = 6370718603675443785L;
	public T result;
	
	public WebResponseObject(T result) {
    	super(null);
    	this.result = result;
    }

    public WebResponseObject(ProblemResponseData messageData) {
        super(messageData);
    }
    
    public WebResponseObject(T result, ProblemResponseData messageData) {
        super(messageData);
        this.result = result;
    }
    
    public WebResponseObject(ObjectResponseDto<T> result) {
        super(result.problemData.toResponse());
        this.result = result.result;
    }
}
