package com.FileHandling.Challenge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the File Name :");
        String fileName = input.nextLine();
        int read;
        try(FileReader reader = new FileReader(fileName)) {
            do{
                read = reader.read();
                System.out.print( (char) read);

            } while (read!= -1);



        }  catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.print("file not found"
                    );
        }

    }

}
