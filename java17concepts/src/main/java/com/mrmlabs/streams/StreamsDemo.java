package com.mrmlabs.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> cityList = setup();

        //Stream
        String result = cityList.stream().filter(s->s.startsWith("A"))
        .collect(Collectors.joining(","));

        //print result
        System.out.println(result);;
    }

    private static List<String> setup() {
        List<String> cityLsit = List.of("Akola", "Pune", "Nagpur", 
        "Kolkata", "Dallas", "North Liberty", "Irving","Alaska");
        return cityLsit;
    }
}
