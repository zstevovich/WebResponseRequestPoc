package com.example.common.service.data.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.example.common.service.error.handler.exceptions.BadRequestHeaderException;

public class OperatorUserRequestInfo {
	public UUID platformOperatorId;
	public String country;
	public String language;
	public UUID userId;
	
	public OperatorUserRequestInfo(Map<String, String> webHeader) throws BadRequestHeaderException {
		List<String> missingFields = new ArrayList<String>();
		
		country = webHeader.get("country");
		if (country == null || country.isEmpty())
			missingFields.add("country");
		
		language = webHeader.get("ACCEPT_LANGUAGE");
		if (language == null || language.isEmpty())
			language = "en-US";
		
//		if (!missingFields.isEmpty())
//			throw new BadRequestHeaderException(missingFields);
		
	}
}
