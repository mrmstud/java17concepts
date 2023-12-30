package com.mrmlabs.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FindAListOfStudentsWithAgeGreaterThan20AndLessThan40 {
 public static void main(String[] args) {
    //Data
    List<Student> studList = DataProvider.getStudentList();

    //Stream and Filter
    List<Student> result = studList.stream()
    .filter(student->student.getAge()>20 && student.getAge()<40)
    .collect(Collectors.toList());

    //Using map print names of filtered result
    List<String> nameList = result.stream()
            .map(student->student.getLasName()+","+student.getFirstName())
            .collect(Collectors.toList());
    
    nameList.forEach(System.out::println);

 }

}
