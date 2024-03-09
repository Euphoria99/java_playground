package com.conditionals;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        } else {
            System.out.println("Upper Case");
        }
    }
}
