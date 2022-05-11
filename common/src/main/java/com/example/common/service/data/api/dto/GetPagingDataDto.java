package com.example.common.service.data.api.dto;

import java.util.Collection;

public class GetPagingDataDto<T> {
	
	public Collection<T> list;
	public long totalCount;
	
	
	public GetPagingDataDto(Collection<T> list, long totalCount) {
		this.list = list;
		this.totalCount = totalCount;
	}
}
