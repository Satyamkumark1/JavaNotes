package in.practise.Exception;

import java.util.Scanner;

public class Challenge {

    public  void  divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            if(e.getMessage().equals(" / by zero")){
                System.out.println("Divide by zero occur");
            } else {
                throw e;
            }

        }

    }

    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = input.nextInt();
        System.out.println("Enter the second number:");
        int b = input.nextInt();

        challenge.divide(a,b);


    }
}
