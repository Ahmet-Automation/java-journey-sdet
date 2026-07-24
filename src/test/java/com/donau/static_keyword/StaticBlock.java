package com.donau.static_keyword;

public class StaticBlock {

    // public static int num = 100;
    public static int num;

    static {

        num = 100;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {

        System.out.println("Main method executed");
        System.out.println(num);
    }



}




