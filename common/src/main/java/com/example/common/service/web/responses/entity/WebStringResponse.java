package com.example.common.service.web.responses.entity;

import com.example.common.service.data.api.dto.response.ObjectResponseDto;
import com.example.common.service.web.responses.ProblemResponseData;

public class WebStringResponse extends WebResponseEntity<String> {
	
	public WebStringResponse(String result) {
    	super(result);
    }

    public WebStringResponse(ProblemResponseData problemResponseData) {
        super(problemResponseData);
    }
    
    public WebStringResponse(ObjectResponseDto<String> result) {
    	super(result);
    }
}