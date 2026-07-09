package com.donau.methods2;

public class EmployeeInfo {

    public static void main(String[] args) {
        displayEmployeeInfo("James", 23, "Vienna");  // Arguments order must be the same with parameter's order.

        System.out.println("----------------------------------------");

        String name = "Thomas";
        int age = 27;
        String city = "Salzburg";
        displayEmployeeInfo(name, age, city);
    }

    public static void displayEmployeeInfo(String name, int age, String city) {
        System.out.println("Employee name is: " + name);
        System.out.println("Employee age is: " + age);
        System.out.println(name + " is " + age + " years old");
        System.out.println(name + " is from " + city);

    }
}
