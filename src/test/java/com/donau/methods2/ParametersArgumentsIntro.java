package com.donau.methods2;

public class ParametersArgumentsIntro {

    public static void main(String[] args) {

        eligibleToVote(21);
        eligibleToVote(16);

        int age = 19;
        eligibleToVote(age);
    }

    public static void eligibleToVote (int age) {  // Parameter
        if (age >= 18) {  // Argument
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }




}
