package com.class_and_objects;

import java.util.Arrays;

//1
public class NullObjOne {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student pavan;
        System.out.println(Arrays.toString(students));
    }

    //create a class for every single student
    class Student {
        int rollno;
        String name;
        String email;
        float marks;
    }
}


