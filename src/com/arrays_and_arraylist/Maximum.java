package com.arrays_and_arraylist;

import java.util.Arrays;

//8
public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }

     static int max(int[] arr){
        //assuming arr[0] is max value initially
         int maxVal = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if(arr[i] > maxVal){
                 maxVal = arr[i];
             }
         }
         return maxVal;
    }
     static int maxRange(int[] arr,int start, int end){
        //assuming arr[start] is max value initially
         int maxVal = arr[start];
         for (int i = start; i <= end; i++) {
             if(arr[i] > maxVal){
                 maxVal = arr[i];
             }
         }
         return maxVal;
    }

}
