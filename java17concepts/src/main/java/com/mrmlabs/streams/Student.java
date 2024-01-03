package com.mrmlabs.streams;

import java.util.Comparator;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student implements Comparable<Student> {
    private String firstName;
    private String lasName;
    private String email;
    private int age;
    private Long id;

    @Override
    public int compareTo(Student o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }
}
