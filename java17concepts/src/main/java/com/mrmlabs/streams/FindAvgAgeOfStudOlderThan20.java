package com.mrmlabs.streams;

import java.util.List;
import java.util.OptionalDouble;

public class FindAvgAgeOfStudOlderThan20 {
    public static void main(String[] args) {
        List<Student> studentList = DataProvider.getStudentList();
        double average = studentList.stream().filter(s->s.getAge()>20)
                            .mapToInt(s->s.getAge())
                            .average()
                            .orElseThrow();
        System.out.println("average is " + average);
    }
}
