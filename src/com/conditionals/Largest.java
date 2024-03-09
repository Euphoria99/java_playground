package com.conditionals;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Enter any 3 numbers: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max =a;
        if(b > max){
            max =b;
        }
        if(c > max){
            max =c;
        }
        System.out.println("The Max is " + max);

        /* another way
        int max = Math.max(c, Math.max(a.b));
             System.out.println(max);

         */
    }
}
