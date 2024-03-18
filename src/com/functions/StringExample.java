package com.functions;

import java.util.Scanner;

//string example with passing arguments

public class StringExample {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String name  = in.next();
        String personalised = Greet(name);
        System.out.println(personalised);
    }

    static String Greet(String name){
        String message = "Hello " + name;
        return message;
    }
}
