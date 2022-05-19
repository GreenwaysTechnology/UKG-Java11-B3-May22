package com.ukg.java11features.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadWriteFromStrings {
    public static void main(String[] args) {
        Path path = null;
        String data = "Hello, How are you!!!1";
        try {
            path = Files.writeString(Files.createTempFile("test", "txt"), data);
            System.out.println(path);
            //read data from the file as string
            String output= Files.readString(path);
            System.out.println(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
