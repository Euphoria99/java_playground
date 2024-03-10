package com.conditionals;

import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        System.out.println("Enter a target no");
        int target = in.nextInt();
        int count =0;
        while(n > 0){
            int rem = (n % 10);
            if(rem == target){
                count++;
            }
            n = (n / 10);
        }
        if (count > 0) {
            System.out.println("The number of occurrences of " + target + " is " + count);
        } else {
            System.out.println("The input number does not contain the target digit: " + target);
        }
    }
}
