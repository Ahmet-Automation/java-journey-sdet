package com.donau.methods2;

public class ReturnMethods {

    public static void main(String[] args) {
       int result = addNumbers(23, 31);

        System.out.println(result);

        System.out.println(addNumbers(17, 43));

    }

    public static int addNumbers(int num1, int num2) {

        int num3 = num1 + num2;
        return num3;

    }
}
