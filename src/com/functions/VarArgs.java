package com.functions;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(1,2,8,6,7,3,3,7,32,7,3,3,2);

        multiple(2,5, "pavan" , "bikes");
    }


    //single type

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    //multiple type
    static void multiple(int a,int b,String ...v){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.print("v: " + Arrays.toString(v));
    }
}
