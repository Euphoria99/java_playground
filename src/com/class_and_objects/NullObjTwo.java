package com.class_and_objects;

import java.util.Arrays;

//2
public class NullObjTwo {
    public static void main(String[] args) {
        Student[] students = new Student[5];

//        Student pavan;

        //1st way
//        pavan = new Student();

        //2nd way, in 1 line
        Student pavan = new Student();

        // default value of pavan
        System.out.println(pavan);

        //default value of individual elements
        System.out.println(pavan.rollno);
        System.out.println(pavan.name);
        System.out.println(pavan.email);
        System.out.println(pavan.marks);

    }

    //create a class for every single student
    static class Student {
        int rollno;
        String name;
        String email;
        float marks;
    }
}


