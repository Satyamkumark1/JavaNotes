package com.Abstraction_Interfeces.Abstraction;
// By using abstract key word in parent class know no one can make its object
public abstract   class Vehicle{
    private  int noOfTires;

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    public  void comut() {
        System.out.println("Starting..........");
    }
    public  abstract  void  makeCarSound();

}

