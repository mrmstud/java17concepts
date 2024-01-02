package com.mrmlabs;

import java.util.stream.Stream;

import com.mrmlabs.streams.DataProvider;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //test getIntArray
        int[] randomIntArray = DataProvider.getRandomIntArray(5);
        for (int i : randomIntArray) {
           System.out.println(i);
        }
    }

    
}