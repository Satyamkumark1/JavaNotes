package in.practise.Exception;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two number,");
        int first = input.nextInt();
        int second = input.nextInt();

       try {
           int[] num = new int[3];
           num[4] = first / second ;
           System.out.println(num[4]);
       } catch (ArithmeticException exception){
           System.out.printf("%s ,enter vaild value",exception.getMessage());
       } catch (Exception e) {
           System.out.println("error");
       }

    }
}
