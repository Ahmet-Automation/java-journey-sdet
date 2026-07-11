package com.donau.methods1;

public class HierarchicalMethodCalls {

    public static void main(String[] args) {

//        read();
//        write();
        learn();

    }

    public static void read () {
        System.out.println("I am reading");
    }

    public static void write() {
        System.out.println("I am writing");
    }

    public static void learn() {
        read();
        write();
        System.out.println("I am learning");
    }


}
