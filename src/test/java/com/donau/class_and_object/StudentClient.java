package com.donau.class_and_object;

public class StudentClient {

    public static void main(String[] args) {
        Student student1 = new Student("James", 18);

//        student1.name = "James";
//        student1.age = 18;

        System.out.println(student1.name);
        System.out.println(student1.age);

        System.out.println("------------------------");

        Student student2 = new Student();

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------------");

        Student student3 = new Student("Ali");

        System.out.println(student3);

    }

}
