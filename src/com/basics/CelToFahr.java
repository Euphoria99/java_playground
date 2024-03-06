package com.basics;

import java.util.Scanner;

public class CelToFahr {
    public static void main(String[] args) {
        System.out.println("Please Enter temp in C");
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        double result = (num * 1.8) + 32;
        //the same in float
        //float result = (num * 9/5) +32;
        System.out.println("The F Value is " + result);
    }
}