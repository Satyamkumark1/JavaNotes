package com.Abstraction_Interfeces.Challenges.Challenges1;

public class Circle extends Shape {
    private double  radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius ,2);
    }
}
