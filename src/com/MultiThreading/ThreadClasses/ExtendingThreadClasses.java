package com.MultiThreading.ThreadClasses; // Declares the package name

// Demonstrates creating and starting multiple threads by extending Thread class
public class ExtendingThreadClasses {
    public static void main(String[] args) {
        long currentTime =  System.currentTimeMillis(); // Record the start time in milliseconds

        FirstTask t1 = new FirstTask(); // Create an instance of FirstTask (thread)
        SecondTask t2 = new SecondTask(); // Create an instance of SecondTask (thread)
        ThirdTask t3 = new ThirdTask(); // Create an instance of ThirdTask (thread)

        System.out.printf("First Task"); // Print message before starting first thread
        t1.start(); // Start the first thread (calls run() in FirstTask)
        System.out.printf("Second task"); // Print message before starting second thread
        t2.start(); // Start the second thread (calls run() in SecondTask)
        System.out.printf("Third Task"); // Print message before starting third thread
        t3.start(); // Start the third thread (calls run() in ThirdTask)

        long endTime = System.currentTimeMillis(); // Record the end time in milliseconds
        System.out.println("\nTime taken" + (endTime - currentTime)); // Print the time taken to start all threads
    }
}
// This code demonstrates how to create and start multiple threads by extending the Thread class.
// Each task (FirstTask, SecondTask, ThirdTask) runs concurrently, allowing for parallel execution of tasks.
// The main method creates instances of these tasks, starts them, and measures the time taken to start all threads.
// The output will show the tasks being executed concurrently, with each task printing its own output format.
// The time taken to start all threads is printed at the end, showing the               
