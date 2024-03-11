package com.switchcases;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next().toLowerCase();

        switch(fruit){
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("Red fruits");
                break;
            case "orange":
                System.out.println("Round fruits");
                break;
            case "grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }
    }
}
