package com.MultiThreading.join;

import com.MultiThreading.Runable.PrintTask;

// Demonstrates the use of join() to control thread execution order
public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        PrintTask p1 = new PrintTask('*'); // Create PrintTask with '*' character
        PrintTask p2 = new PrintTask('%'); // Create PrintTask with '%' character
        PrintTask p3 = new PrintTask('@'); // Create PrintTask with '@' character

        Thread t1 = new Thread(p1); // Create thread for first task
        System.out.println("\nThread 1 started");
        t1.start(); // Start first thread

        Thread t2 = new Thread(p2); // Create thread for second task
        t2.start(); // Start second thread
        System.out.println("\nThread 2 started");

        t1.join(); // Wait for t1 to finish before proceeding

        Thread t3 = new Thread(p3); // Create thread for third task
        System.out.println("\nThread 3 started");
        t2.join(); // Wait for t2 to finish before starting t3

        t3.start(); // Start third thread after t1 and t2 have finished
    }
}
