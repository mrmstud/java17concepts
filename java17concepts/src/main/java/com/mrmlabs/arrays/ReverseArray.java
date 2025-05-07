package com.mrmlabs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
   public static void main(String[] args) {
     List<Integer> intlist = List.of(1,3,5,7,9);
     ReverseArray.reverseArray(intlist).stream().forEach(System.out::println);
   }

    private static List<Integer> reverseArray(List<Integer> a) {
       List<Integer> resuList = new ArrayList<>();
       for (int i = a.size()-1; i >=0; i--) {
        resuList.add(a.get(i));
       }
       System.out.println("Resultlist size = " + resuList.size());
       return resuList;
    }
}
