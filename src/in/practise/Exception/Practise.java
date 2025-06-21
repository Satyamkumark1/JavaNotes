package in.practise.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Practise {
    public static void main(String[] args) throws  Exception{
        // Use try-with-resources to automatically close resources
        try (FileReader fileReader = new FileReader("Java.textt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            // Read each line until null is returned
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e){
            throw  new Exception("bakchodi matt kar lawde");
        }
    }
}