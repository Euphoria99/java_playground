package com.conditionals;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        int ans;
        int rem;
        for(ans = 0; num > 0; ans = ans * 10 + rem) {
            rem = num % 10;
            num /= 10;
        }

        System.out.println("The answer is " + ans);
    }
}