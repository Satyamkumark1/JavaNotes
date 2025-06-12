package com.Abstraction_Interfeces.Challenges.Challenges1;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(32.3);
        Square square = new Square(67);
        System.out.println(circle.getRadius());
        System.out.println(square.calculateArea());
    }
}
