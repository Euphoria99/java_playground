package com.basics;

import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.printf("Please enter a number:");
//        int numberInput = input.nextInt();
//        System.out.println("Your entered number is " + numberInput);
        //starts here
        System.out.printf("Enter your name: ");
        String name = input.nextLine();
        System.out.printf("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your name is " + name + " and your age is " + age);

        float marks = input.nextFloat();
        System.out.println("THe marks Entered is "+ marks);
    }
}