package com.example.demo.controllers;

import com.example.common.service.data.request.OperatorUserRequestInfo;
import com.example.common.service.web.responses.entity.WebBooleanResponse;
import com.example.common.service.web.responses.entity.WebListResponseEntity;
import com.example.common.service.web.responses.entity.WebResponseEntity;
import com.example.demo.api.dtos.input.NewExampleDto;
import com.example.demo.api.dtos.output.ExampleDto;
import com.example.demo.api.serviceinterfaces.ExampleService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/example")
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebBooleanResponse addNewExample(@RequestBody NewExampleDto newExampleDto, @RequestHeader Map<String, String> headers) {
        return Optional.of(new OperatorUserRequestInfo(headers))
                .map(userRequestInfo -> exampleService.addNewExample(newExampleDto))
                .map(WebBooleanResponse::new)
                .get();
    }
    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebListResponseEntity<ExampleDto> getAllExample(@RequestHeader Map<String, String> headers) {
        return Optional.of(new OperatorUserRequestInfo(headers))
                .map(userRequestInfo -> exampleService.getAll())
                .map(WebListResponseEntity::new)
                .get();
    }
    @GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponseEntity<ExampleDto> getAllExample(@RequestParam("id") UUID id, @RequestHeader Map<String, String> headers) {
        return Optional.of(new OperatorUserRequestInfo(headers))
                .map(userRequestInfo -> exampleService.getExample(id))
                .map(WebResponseEntity::new)
                .get();
    }
}
