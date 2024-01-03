package com.mrmlabs.sorting;

import java.util.List;
import java.util.stream.Collectors;
import com.mrmlabs.streams.DataProvider;
import com.mrmlabs.streams.Student;

public class SortingArraysDemo {
    public static void main(String[] args) {
       //get students
       List<Student> studentList = DataProvider.getStudentList();

       //filter & sort by fname
       List<Student> resuList = studentList.stream().filter(s->s.getAge()<30)
                            .sorted()
                            .collect(Collectors.toList());
        
       resuList.forEach(s->System.out.println(s.getFirstName()));
    }
}
