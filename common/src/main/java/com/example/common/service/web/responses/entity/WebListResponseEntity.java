package com.example.common.service.web.responses.entity;

import java.util.Collection;

import com.example.common.service.data.api.dto.response.ListResponseDto;
import com.example.common.service.web.responses.ProblemResponseData;
import org.springframework.http.HttpStatus;

public class WebListResponseEntity<T> extends WebResponseEntity<Collection<T>> {
	
	public WebListResponseEntity(Collection<T> response, HttpStatus status) {
		super(response, status);
	}
	
	public WebListResponseEntity(Collection<T> response) {
		super(response, HttpStatus.OK);
	}
	
	public WebListResponseEntity(ProblemResponseData problemData, HttpStatus status) {
		super(problemData, status);
	}
	
	public WebListResponseEntity(ProblemResponseData problemData) {
		super(problemData);
	}
	
	public WebListResponseEntity(ListResponseDto<T> responseData, HttpStatus status) {
		super(responseData, status);
	}
	
	public WebListResponseEntity(ListResponseDto<T> responseData) {
		super(responseData);
	}
}
