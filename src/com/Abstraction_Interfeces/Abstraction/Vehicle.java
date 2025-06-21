package com.Abstraction_Interfeces.Abstraction;
// By using abstract key word in parent class now no one can make its object
public abstract class Vehicle implements Transport {
    private int noOfTires;

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void comut() {
        System.out.println("Starting..........");
    }

    @Override
    public abstract void getsetGo();

    public abstract void makeCarSound();
}

