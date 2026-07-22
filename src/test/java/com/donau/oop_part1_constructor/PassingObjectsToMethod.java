package com.donau.oop_part1_constructor;

class Apple {

String color = "Red";

}

public class PassingObjectsToMethod {

    public static void main(String[] args) {

        Apple apple1 = new Apple();
        System.out.println(apple1.color);

        changeApple(apple1);

        System.out.println(apple1.color);

    }


public static void changeApple(Apple apple) {
    apple.color = "White";

}
}
