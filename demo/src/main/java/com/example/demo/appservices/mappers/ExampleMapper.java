package com.example.demo.appservices.mappers;

import com.example.demo.api.dtos.input.NewExampleDto;
import com.example.demo.api.dtos.output.ExampleDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class ExampleMapper {
    public static ExampleDto exampleDto(NewExampleDto exampleDto)
    {
        return new ExampleDto(exampleDto.getExampleId(),exampleDto.getExampleName());
    }

    public static ExampleDto newExample()
    {
        return new ExampleDto(UUID.randomUUID(), getExampleName());
    }

    public static List<ExampleDto> toList(){
        List<ExampleDto> list = new ArrayList<>();
        list.add(newExample());
        list.add(newExample());
        list.add(newExample());
        return list;
    }

    private static String getExampleName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
