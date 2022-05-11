package com.example.common.service.web.responses.entity;

import com.example.common.service.data.api.dto.response.ObjectResponseDto;
import com.example.common.service.web.responses.ProblemResponseData;

public class WebBooleanResponse extends WebResponseEntity<Boolean> {
	
	public WebBooleanResponse(boolean result) {
    	super(result);
    }
	
	public WebBooleanResponse(ProblemResponseData messageData) {
        super(messageData);
    }
	
	public WebBooleanResponse(ObjectResponseDto<Boolean> result) {
    	super(result);
    }
}