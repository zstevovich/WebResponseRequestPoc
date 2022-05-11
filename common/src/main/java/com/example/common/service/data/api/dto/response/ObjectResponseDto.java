package com.example.common.service.data.api.dto.response;

import com.example.common.service.data.api.dto.ProblemResponseDtoData;
import com.example.common.service.web.responses.WebResponseObject;

public class ObjectResponseDto<T> extends ServiceResponseDtoBase {

	private static final long serialVersionUID = -5321077324106252021L;
	
	public T result;
	
	public ObjectResponseDto() {
    }

    public ObjectResponseDto(T result, ProblemResponseDtoData problemData) {
    	this.result = result;
    	this.problemData = problemData;
    }

    public WebResponseObject<T> toResponse() {
    	if (problemData == null)
    		return new WebResponseObject<T>(result);
    	else {
    		return new WebResponseObject<T>(problemData.hasErrors() ? null : result, problemData.toResponse());
    	}
    }
}
