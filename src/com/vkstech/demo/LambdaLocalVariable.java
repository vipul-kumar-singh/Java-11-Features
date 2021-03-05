package com.vkstech.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLocalVariable {

    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String resultString = sampleList.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(resultString);
    }
}
