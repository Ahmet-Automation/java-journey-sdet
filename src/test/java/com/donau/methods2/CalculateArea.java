package com.donau.methods2;

public class CalculateArea {

    public static void main(String[] args) {

        double areaOfCircle = calculateArea(2.5);

        System.out.println("areaOfCircle = " + areaOfCircle);

        double areaOfRectangle = calculateArea(2.5, 3.5);

        System.out.println("areaOfRectangle = " + areaOfRectangle);

    }
    public static double calculateArea(double radius) {

        double area = radius * radius * 3.14; // for calculating the area of circle

        return area;
    }

    public static double calculateArea(double length, double width) {

        return length * width; // for calculating the area of rectangle
    }


}
