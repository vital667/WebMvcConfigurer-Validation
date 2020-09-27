package com.example.springvalidationmvc;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class PersonForm {

    @NotNull
    @Size(min=2, max=30)
//    @Pattern(regexp = "^([^0-9]*)$")
    private String name;

    @NotNull
    @Min(18)
    private Integer age;
}
