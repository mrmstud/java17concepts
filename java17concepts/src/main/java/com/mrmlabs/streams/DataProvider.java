package com.mrmlabs.streams;

import java.time.LocalDate;
import java.util.List;
/**
 * This is class which provides data to be used in other classes
 * This class act like a dummy database.
 */
public class DataProvider {
    public static List<Student> getStudentList() {
        Student s1 = Student.builder().firstName("Parth")
                .lasName("Mahalle")
                .age(10)
                .email("pm@gmail.com")
                .id(101L).build();
        Student s2 = Student.builder().firstName("Grishma")
                .lasName("Mahalle")
                .age(5)
                .email("pm@gmail.com")
                .id(102L).build();
        Student s3 = Student.builder().firstName("Mahesh")
                .lasName("Mahalle")
                .age(40)
                .email("pm@gmail.com")
                .id(103L).build();
        Student s4 = Student.builder().firstName("Sam")
                .lasName("Mahalle")
                .age(38)
                .email("pm@gmail.com")
                .id(104L).build();
        Student s5 = Student.builder().firstName("Yogesh")
                .lasName("Mahalle")
                .age(35)
                .email("pm@gmail.com")
                .id(105L).build();
        Student s6 = Student.builder().firstName("Ashwini")
                .lasName("Mahalle")
                .age(33)
                .email("pm@gmail.com")
                .id(106L).build();
        Student s7 = Student.builder().firstName("Vansh")
                .lasName("Mahalle")
                .age(6)
                .email("pm@gmail.com")
                .id(107L).build();
        Student s8 = Student.builder().firstName("Kaustubh")
                .lasName("Mahalle")
                .age(5)
                .email("pm@gmail.com")
                .id(108L).build();
        Student s9 = Student.builder().firstName("Suman")
                .lasName("Mahalle")
                .age(55)
                .email("pm@gmail.com")
                .id(109L).build();
        Student s10 = Student.builder().firstName("Ram")
                .lasName("Mahalle")
                .age(65)
                .email("pm@gmail.com")
                .id(110L).build();
        return List.of(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
    }

    public static int[] getRandomIntArray(int size) {
        int[] array = new int[size];
        for (int j = 0; j < array.length; j++) {
                array[j]=(int)(Math.random()*10+LocalDate.now().getYear()); 
        }
        return array;
    }
}
