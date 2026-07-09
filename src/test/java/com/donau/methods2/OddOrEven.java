package com.donau.methods2;

public class OddOrEven {

    public static void main(String[] args) {

        oddOrEven(99);
        oddOrEven(180);

        int a = 203;
        oddOrEven(a);
    }

    public static void oddOrEven(int number) {

        if (number %2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }
}
