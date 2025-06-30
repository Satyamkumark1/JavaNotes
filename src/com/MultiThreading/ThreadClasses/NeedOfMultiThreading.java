package com.MultiThreading.ThreadClasses; // Declares the package name

// Demonstrates the need for multithreading by running tasks sequentially
public class NeedOfMultiThreading {
    public static void main(String[] args) {

       long currentTime =  System.currentTimeMillis(); // Record the start time in milliseconds

        // First task: print numbers 0 to 999 with '*'
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d* " ,i); // Print the current value of i with a '*' symbol
        }
        System.out.println("* task complete"); // Indicate completion of the first task

        // Second task: print numbers 0 to 999 with '$'
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d$ " ,i); // Print the current value of i with a '$' symbol
        }
        System.out.println("* task complete"); // Indicate completion of the second task

        // Third Task: print numbers 0 to 999 with '#' (each on a new line)
        for (int i = 0; i < 1000; i++) {
            System.out.printf("\n%d# " ,i); // Print the current value of i with a '#' symbol, each on a new line
        }
        System.out.println("* task complete"); // Indicate completion of the third task

        long endTime = System.currentTimeMillis(); // Record the end time in milliseconds
        System.out.printf("Total time taken : %d", (endTime - currentTime)); // Print the total time taken for all tasks

    }

}
