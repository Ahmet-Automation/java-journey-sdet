package com.donau.class_and_object;

public class Student {  // default constructor
    public String name;
    public int age;
    public String gender;
    public double gpa;

    public Student() {
        name = "Unknown";
        age = 11;

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name, int age, String gender) {
        this(name, age);
        this.gender = gender;
    }

    public Student(String name, int age, String gender, double gpa) {
        this(name, age, gender);
        this. gpa = gpa;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", grade='" + gpa + '\'' +
                '}';
    }
}
