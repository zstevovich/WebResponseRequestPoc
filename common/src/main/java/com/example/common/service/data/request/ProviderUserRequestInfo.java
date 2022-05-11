package com.example.common.service.data.request;

import com.example.common.service.error.handler.exceptions.BadRequestHeaderException;

import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ProviderUserRequestInfo {
	public UUID userId;
	public String language;
	
	public ProviderUserRequestInfo(Map<String, String> webHeader) throws BadRequestHeaderException {
		List<String> missingFields = new ArrayList<String>();
		
		userId = UUID.fromString(webHeader.get("userid"));
		if (userId == null)
			missingFields.add("userid");

		language = webHeader.get("ACCEPT_LANGUAGE");
		if (language == null || language.isEmpty())
			language = "en-US";
		
		//if (!missingFields.isEmpty())
		//	throw new BadRequestHeaderException(missingFields);
	}
}
