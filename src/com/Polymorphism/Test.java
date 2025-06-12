package com.Polymorphism;

public class Test {
    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        Plane plane = new Plane();

        vehicle.start();
        plane.start();
    }
}
