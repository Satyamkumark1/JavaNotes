package com.Polymorphism.passBy;

public class TestPassBy {

    public  static  int add(int a, int b){
        a+=b;
        return  a ;
    }
    public static void main(String[] args) {

        int a = 5;
        int b = 4;

         int sum = add(a,b);

        System.out.printf("x=%d ,y=%d, sum=%d" , a,b,sum);
    }
}
