package com.example.common.service.error.handler.exceptions.base;

import com.example.common.service.web.responses.ProblemResponseData;

public interface ServiceException {
	int getStatus();
	ProblemResponseData getProblem();
}
