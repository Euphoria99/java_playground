package com.functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //q1: check for prime number
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        boolean test = isPrime(num);
        System.out.println(test);

        //q2: check for armstrong number
        System.out.print("Enter a 3 digit number: ");
        int num2 = in.nextInt();
        boolean test2 = isAmStrong(num2);
        System.out.println(test2);


        //all 3 digit armstrong numbers between 100 and 1000
        for(int i=100; i <= 1000; i++){
            if(isAmStrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c =2;
        while(c * c <=n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n ;
    }

    static boolean isAmStrong(int n){
        int original =n;
        int sum =0;
        while(n >0){
            int rem = n % 10;
            n = n /10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
