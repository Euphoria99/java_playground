package com.basics;


import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt()) ;
//        System.out.println(input.next());

        //type casting example
//        int num = (int)(56.90);
//        System.out.println(num);

        //automatic type promotion
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f *b) + (i / c) - (d * s);
        // float + int - double
        System.out.println((f *b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}