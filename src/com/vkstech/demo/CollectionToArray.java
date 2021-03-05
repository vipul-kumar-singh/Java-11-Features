package com.vkstech.demo;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray {

    public static void main(String[] args) {
        List sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = (String[]) sampleList.toArray(String[]::new);

        for (String sa : sampleArray)
            System.out.println(sa);
    }
}
