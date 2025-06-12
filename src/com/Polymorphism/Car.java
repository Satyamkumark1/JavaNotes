package com.Polymorphism;

public class Car  extends  Vehicle{

    int x = 10;

    void print(){
        System.out.println(x);


    }

    public static void main(String[] args) {
        Car car =  new Car();
        car.print();

    }
}
