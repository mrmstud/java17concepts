package com.mrmlabs.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.mrmlabs.streams.DataProvider;
import com.mrmlabs.streams.Student;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Student> studentList = DataProvider.getStudentList();

        // Collectors Set
        System.out.println("************  Collectors Set Demo ********");
        setDemo(studentList);

        // Collectors Map
         System.out.println("************  Collectors Map Demo ********");
        mapDemo(studentList);

        //Collectors GroupBy
    }

    /**
     * The toMap() method is a static method of Collectors class which returns a Collector that 
     * accumulates elements into a Map whose keys and values are the result of applying the provided 
     * mapping functions to the input elements. Note that keys are unique and if in any case the keys 
     * are duplicated then an IllegalStateException is thrown when the collection operation is performed.
     * @param studentList
     */
    private static void mapDemo(List<Student> studentList) {
        Map<String, String> studentMap = studentList.stream().filter(s->s.getAge()>20)
                            .collect(Collectors.toMap(Student::getFirstName, Student::getEmail));


        System.out.println("Using Streams:");
        studentMap.entrySet().stream().forEach(s->System.out.println(s.getKey()+"," + s.getValue()));
        
    }

    /**
     * 
     * @param studentList
     */
    private static void setDemo(List<Student> studentList) {
        Set<Student> students = studentList.stream().filter(s -> s.getAge() < 20)
                .collect(Collectors.toSet());
        students.forEach(System.out::println);
    }
}
