package com.Abstraction_Interfeces.Abstraction;

public class Car extends Vehicle{

    public Car(int noOfTires) {
        super(noOfTires);
    }

    @Override
    public void makeCarSound() {
        System.out.println("brurrururururuurururr");

    }



}
