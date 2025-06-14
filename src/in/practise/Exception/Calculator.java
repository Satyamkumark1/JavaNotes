package in.practise.Exception;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public void readFile(String fileName) throws IOException {
        if (fileName == null) {
            // Throwing an exception
            throw new IOException("File name cannot be null");
        } else {
            System.out.println("Reading file: " + fileName);
        }
    }

    public static void main(String[] args) throws IOException {

        Calculator calculator = new Calculator();
        calculator.readFile(null);


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter two number,");
//        int first = input.nextInt();
//        int second = input.nextInt();
//
//       try {
//           int[] num = new int[3];
//           num[4] = first / second ;
//           System.out.println(num[4]);
//       } catch (ArithmeticException exception){
//           System.out.printf("%s ,enter vaild value",exception.getMessage());
//       } catch (Throwable th) {
//           System.out.println("error");
//           throw  th;
//       }
//
//    }


    }
}
