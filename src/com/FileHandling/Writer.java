package com.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {

        String fileName = "Java.texttt";

        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello");
            for (int i = 0; i < 1000; i++) {
                writer.write("* ");

            }



        } catch (IOException e){
            System.out.printf("An excetions occurd %s" , e.getMessage());
        }
    }


}
