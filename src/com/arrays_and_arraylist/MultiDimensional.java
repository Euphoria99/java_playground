package com.arrays_and_arraylist;

import java.util.Scanner;

//3
public class MultiDimensional {
    public static void main(String[] args) {
        /*
         1 2 3
         4 5 6
         7 8 9
         */

        //syntax
        //int[][] = new int[3][3];

//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        //input
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
