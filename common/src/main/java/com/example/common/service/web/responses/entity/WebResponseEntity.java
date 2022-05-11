package com.example.common.service.web.responses.entity;

import com.example.common.service.data.api.dto.response.ObjectResponseDto;
import com.example.common.service.web.responses.ProblemResponseData;
import com.example.common.service.web.responses.WebResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class WebResponseEntity<T> extends ResponseEntity<WebResponseObject<T>> {

	public WebResponseEntity(T response, HttpStatus status) {
		super(new WebResponseObject<T>(response), status);
	}
	
	public WebResponseEntity(T response) {
		super(new WebResponseObject<T>(response), HttpStatus.OK);
	}
	
	public WebResponseEntity(ProblemResponseData problemData, HttpStatus status) {
		super(new WebResponseObject<T>(problemData), status);
	}
	
	public WebResponseEntity(ProblemResponseData problemData) {
		super(new WebResponseObject<T>(problemData), (problemData != null && problemData.error) ? HttpStatus.BAD_REQUEST : HttpStatus.OK);
	}
	
	public WebResponseEntity(ObjectResponseDto<T> responseData, HttpStatus status) {
		super(responseData.toResponse(), status);
	}
	
	public WebResponseEntity(ObjectResponseDto<T> responseData) {
		super(responseData.toResponse(), (responseData.problemData != null && responseData.problemData.hasErrors()) ? HttpStatus.BAD_REQUEST : HttpStatus.OK);
	}
}
