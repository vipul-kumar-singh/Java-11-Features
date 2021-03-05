package com.vkstech.demo;

import java.util.List;
import java.util.stream.Collectors;

public class StringMultiline {

    public static void main(String[] args) {
        String multilineString = "Baeldung helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());

        lines.forEach(System.out::println);
    }
}
