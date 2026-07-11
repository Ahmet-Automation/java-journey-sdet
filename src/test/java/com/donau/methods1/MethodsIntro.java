package com.donau.methods1;

public class MethodsIntro {

    public static void main(String[] args) {

        System.out.println("Test started");

        eat();
        walk();  // we can create as many methods as we want in a class
       //MethodsIntro.play();
        play();

        System.out.println("Test completed");

    }

    public static void eat () {

        System.out.println("I am eating");
    }

    public static void walk() {

        System.out.println("I am walking");
    }

    public static void play() {

        walk();

        System.out.println("I am playing");
    }


}
