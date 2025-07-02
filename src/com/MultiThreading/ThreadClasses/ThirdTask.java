package com.MultiThreading.ThreadClasses; // Declares the package name

// ThirdTask class extends Thread to create a custom thread
public class ThirdTask extends Thread{
    // Overrides the run() method which contains the code to be executed by the thread
    @Override
    public void run() {
        // Loop from 0 to 999, printing each number followed by '#'
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d# " ,i); // Print the current value of i with a '#' symbol
        }
        // Print the name of the current thread and indicate task completion
        System.out.printf("%s* task complete",Thread.currentThread().getName());
//        return null;
    }
}
