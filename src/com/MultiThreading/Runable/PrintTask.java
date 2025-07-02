package com.MultiThreading.Runable;

public class PrintTask implements  Runnable{
    public PrintTask(char character) {
        this.character = character;
    }

    @Override
    public void run() {
        // Loop from 0 to 999, printing each number followed by '*'
        for (int i = 0; i < 10; i++) {
            System.out.printf(" \n %c " ,character); // Print the current value of i with a '*' symbol
        }
        // Print the name of the current thread and indicate task completion
        System.out.printf(" %s* task complete",Thread.currentThread().getName(), character);
//        return null;
    }

    private  final  char character;

}

