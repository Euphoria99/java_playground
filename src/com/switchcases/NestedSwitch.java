package com.switchcases;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee id: ");
        int empId = in.nextInt();
        String department = in.next();

        switch(empId){
            case 1:
                System.out.println("Pavan Bhat");
                break;
            case 2:
                System.out.println("Alice");
                break;
            case 3:
                System.out.println("Mikey");
                switch(department){
                    case "IT":
                        System.out.println("Developer");
                        break;
                    case "Management":
                        System.out.println("Digital Marketer");
                        break;
                    default:
                        System.out.println("No Department found");
                }
                break;
            default:
                System.out.println("Enter correct employee id");
        }
    }
}
