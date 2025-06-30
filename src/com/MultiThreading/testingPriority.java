package com.MultiThreading;

import com.MultiThreading.Runable.PrintTask;

public class testingPriority {
    public static void main(String[] args) {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('%');

        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

    }
}
