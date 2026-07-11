package com.donau.methods2;

public class MethodOverloading {

    public static void main(String[] args) {

        displayValue(23, 42.2);
        displayValue(14.00);
        displayValue(10);

    }


    public static void displayValue(int a) {
        System.out.println("First Method");
    }

    public static void displayValue(double a){
        System.out.println("Second Method");

    }

    public static int displayValue(int a, double b) {
        System.out.println("Third Method");
        return 0;
    }

    public static void displayValue(double a, int b){
        System.out.println("Fourth Method");
    }



}
