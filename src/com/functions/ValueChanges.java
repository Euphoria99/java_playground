package com.functions;

import java.util.Arrays;

public class ValueChanges {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] nums) {
        nums[0] = 99;
    }
}
