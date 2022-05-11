package com.example.common.service.data.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.example.common.service.error.handler.exceptions.BadRequestHeaderException;
import org.springframework.http.HttpHeaders;

public class AgentUserRequestInfo {
	
	public static class AgentInfo {
		public UUID userId;
		public UUID terminalId;
		public UUID locationId;
		public UUID agentId;
		
		public AgentInfo(UUID userId, UUID terminalId, UUID locationId, UUID agentId) {
			this.userId = userId;
			this.terminalId = terminalId;
			this.locationId = locationId;
			this.agentId = agentId;
		}
	}
	
	public UUID platformOperatorId;
	public String country;
	public String language;
	public AgentInfo agent;
	
	
	public AgentUserRequestInfo(Map<String, String> webHeader) throws BadRequestHeaderException {
		
		List<String> missingFields = new ArrayList<String>();
		
		platformOperatorId = UUID.fromString(webHeader.get("platformoperatorid"));
		if (platformOperatorId == null)
			missingFields.add("platformoperatorid");
		
		country = webHeader.get("country");
		if (country == null || country.isEmpty())
			missingFields.add("country");
		
		
		String userId = webHeader.get("userid");
		if (userId == null || userId.isEmpty())
			missingFields.add("userid");
		
		String terminalId = webHeader.get("terminalid");
		if (terminalId == null || terminalId.isEmpty())
			missingFields.add("terminalid");
		
		String locationId = webHeader.get("locationid");
		if (locationId == null || locationId.isEmpty())
			missingFields.add("locationid");
		
		String agentId = webHeader.get("agentid");
		if (agentId == null || agentId.isEmpty())
			missingFields.add("agentid");
		
		language = webHeader.get("ACCEPT_LANGUAGE");
		if (language == null || language.isEmpty())
			language = "en-US";
		
		//if (!missingFields.isEmpty())
		//	throw new BadRequestHeaderException(missingFields);
		
		agent = new AgentInfo(UUID.fromString(userId), UUID.fromString(terminalId), UUID.fromString(locationId), UUID.fromString(agentId));
		
	}
}
