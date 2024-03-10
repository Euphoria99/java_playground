package com.conditionals;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2; //because we have 2 nos a and b

        while (count <= n){
            int temp =b;
            b = b+a;
            a = temp;
            count++;
        }
        
        System.out.println("The n is " +b);
    }

}
