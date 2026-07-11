package com.donau.methods2;

public class ReturnOddOrEven {

    public static void main(String[] args) {

      String s1 =  returnOddOrEven(73);

        System.out.println(s1);

        System.out.println(returnOddOrEven(100));

    }

    public static String returnOddOrEven(int number) {

        if (number % 2 ==0) {
            return "Even";
        } else {
            return "Odd";
        }
    }



}
