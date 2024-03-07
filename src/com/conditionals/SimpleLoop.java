package com.conditionals;

public class SimpleLoop {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
    /*
        int salary = 25400;
        if (salary > 10000) {
            salary += 2000;  //salary = salary + 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
     */

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 0; num < n; num++) {
//            System.out.println("Zawardu " + num);
//        }

//        int num =1;
//        while(num <=5){
//            System.out.println(num);
//            num +=1;
//        }

        int n =1;
        do {
            System.out.println(n);
        } while(n <=5);

    }
}