package com.example.common.service.web.responses.entity;

import com.example.common.service.data.api.dto.response.ObjectResponseDto;
import com.example.common.service.web.responses.ProblemResponseData;

import java.util.UUID;

public class WebUUIDResponse extends WebResponseEntity<UUID> {

    public WebUUIDResponse(UUID result) {
        super(result);
    }

    public WebUUIDResponse(ProblemResponseData problemResponseData) {
        super(problemResponseData);
    }
    
    public WebUUIDResponse(ObjectResponseDto<UUID> result) {
    	super(result);
    }
}
