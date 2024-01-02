package com.mrmlabs.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMapSort {
    public static void main(String[] args) {
        // Data
        List<Student> students = DataProvider.getStudentList();

        // Filter, map, sort
        List<String> result = students.stream().filter(s -> s.getAge() < 40)
                .sorted()
                .map(s -> s.getLasName() + "," + s.getFirstName())
                .collect(Collectors.toList());
        // print
        result.forEach(System.out::println);
    }
}
