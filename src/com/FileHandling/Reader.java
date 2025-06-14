package com.FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        String fileName = "java.texttt";

        int read ;
        try(FileReader  reader = new FileReader(fileName)) {
             do {
                 read = reader.read();
                 System.out.print( (char) read);
             } while (read!= -1);

        } catch (IOException e){
            System.out.println("exception");
        }
    }
}
