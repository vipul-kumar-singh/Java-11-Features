package com.vkstech.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethods {

    public static void main(String[] args) throws IOException {
        Path filePath = Files.writeString(Files.createTempFile( "some", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent);
    }
}
