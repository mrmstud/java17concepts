package com.mrmlabs.streams;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private String firstName;
    private String lasName;
    private String email;
    private int age;
    private Long id;
}
