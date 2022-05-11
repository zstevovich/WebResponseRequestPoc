package com.example.demo.api.dtos.input;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor
public class NewExampleDto {
    private UUID exampleId;
    private String exampleName;

    public NewExampleDto(UUID exampleId, String exampleName) {
        this.exampleId = exampleId;
        this.exampleName = exampleName;
    }
}
