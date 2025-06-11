package in.practise.utils;

import in.practise.geometry.Circle;
import in.practise.geometry.Rectangle;

public class Calulator {

    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(5,5);

        double calculateTheAreaOfCircle = Math.PI * Math.pow(circle.radius, 2);
        System.out.println("Area of circle :" + calculateTheAreaOfCircle);

    }
}
