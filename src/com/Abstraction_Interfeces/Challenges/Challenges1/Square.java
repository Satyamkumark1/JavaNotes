package com.Abstraction_Interfeces.Challenges.Challenges1;

public class Square extends Shape {

    private  final  double sideIn;

    public Square(double sideIn) {
        this.sideIn = sideIn;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideIn,2) ;
    }
}
