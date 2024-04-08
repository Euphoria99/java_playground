package com.arrays_and_arraylist;

import java.util.Arrays;


//7
public class SwapAndReverse {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};

       //1.swapping
       //swap(arr, 1,3);
       //System.out.println(Arrays.toString(arr));

        //2.reversing
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        int start =0;
        int end = arr.length -1;

        while(start <end){
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
