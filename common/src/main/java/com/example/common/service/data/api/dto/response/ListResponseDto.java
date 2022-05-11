package com.example.common.service.data.api.dto.response;

import com.example.common.service.data.api.dto.ProblemResponseDtoData;

import java.util.Collection;

public class ListResponseDto<T> extends ObjectResponseDto<Collection<T>> {

	private static final long serialVersionUID = 2869693489198781236L;

	public ListResponseDto() {
    }

    public ListResponseDto(Collection<T> result, ProblemResponseDtoData problemData) {
    	super(result, problemData);
    }
}
