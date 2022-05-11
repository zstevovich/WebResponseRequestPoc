package com.example.demo.api.serviceinterfaces;

import com.example.demo.api.dtos.input.NewExampleDto;
import com.example.demo.api.dtos.output.ExampleDto;

import java.util.List;
import java.util.UUID;

public interface ExampleService {
    boolean addNewExample(NewExampleDto exampleDto);
    ExampleDto getExample(UUID exampleId);
    List<ExampleDto>getAll();
}
