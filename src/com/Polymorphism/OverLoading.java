package com.Polymorphism;

public class OverLoading {
    public  int sum(int a, int b) {
        return a + b;
    }
    public int sum(int a , int b,int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverLoading overLoading = new OverLoading();
        System.out.println(overLoading.sum(2,1));
        System.out.println(overLoading.sum(21,1,1));



    }
}
