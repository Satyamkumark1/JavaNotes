package com.MultiThreading.Synchronize;

public class TestingSynchronize  {
    public static void main(String[] args) throws  InterruptedException{

        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);
        t1.start();
        t2.start();
        t1.join();

        t2.join();
        long endTime = System.currentTimeMillis();

        System.out.printf("Final counter value: %d and Time taken: %d", counter.getCount(), (endTime - startTime));

    }
}
