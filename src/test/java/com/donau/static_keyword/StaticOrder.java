package com.donau.static_keyword;

public class StaticOrder {


    static int x = 5;

    static {
        System.out.println("Static block1 executed");
        x += 10;
    }


    static {

        System.out.println("Static block2 executed");
        x /= 3;
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        System.out.println(x);
    }


}
