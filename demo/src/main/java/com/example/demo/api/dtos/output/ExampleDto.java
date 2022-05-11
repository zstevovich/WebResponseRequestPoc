package com.example.demo.api.dtos.output;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor
public class ExampleDto {
    private UUID exampleId;
    private String exampleName;

    public ExampleDto(UUID exampleId, String exampleName) {
        this.exampleId = exampleId;
        this.exampleName = exampleName;
    }
}
