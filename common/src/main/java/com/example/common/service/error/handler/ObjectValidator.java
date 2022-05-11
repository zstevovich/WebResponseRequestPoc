package com.example.common.service.error.handler;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import com.example.common.service.data.api.dto.ProblemResponseDtoData;
import com.example.common.service.data.error.FieldError;
import com.example.common.service.data.error.list.ProblemsList;
import com.example.common.service.web.responses.ProblemResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectValidator {
	
	@Autowired
    private Validator validator;
    
    public ProblemResponseDtoData validate(Object dtoObject) {
        
        Set<ConstraintViolation<Object>> violations = validator.validate(dtoObject);

        if (!violations.isEmpty()) {
        	ProblemsList problems = new ProblemsList();
        	for (ConstraintViolation<Object> constraintViolation : violations) {
        		problems.add(new FieldError(constraintViolation.getMessage(), null, constraintViolation.getPropertyPath().toString()));
            }
        	
        	return new ProblemResponseDtoData(ProblemResponseData.SERVICE_CODE, problems);
        }         
        return null;
    }
	
}
