package com.example.demo.appservices.services;

import com.example.demo.api.dtos.input.NewExampleDto;
import com.example.demo.api.dtos.output.ExampleDto;
import com.example.demo.api.serviceinterfaces.ExampleService;
import com.example.demo.appservices.mappers.ExampleMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ExampleServiceImpl implements ExampleService {
    @Override
    public boolean addNewExample(NewExampleDto exampleDto) {
        return true;
    }

    @Override
    public ExampleDto getExample(UUID exampleId) {
        return ExampleMapper.newExample();
    }

    @Override
    public List<ExampleDto> getAll() {
        return ExampleMapper.toList();
    }
}
