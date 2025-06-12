package com.Polymorphism.passBy;

public class TestPassByValue {
    public static  class  Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Point point = new Point(3,3);

    }
}
