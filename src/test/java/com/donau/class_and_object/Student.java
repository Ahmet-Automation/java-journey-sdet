package com.donau.class_and_object;

public class Student {  // default constructor
    public String name;
    public int age;

    public Student() {
        name = "Unknown";
        age = 11;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
