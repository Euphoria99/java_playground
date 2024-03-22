package com.functions;

import java.util.Arrays;

public class FnOverloading {
    public static void main(String[] args) {
        //example 1
        fun(2);
        fun("pavan");

        //example 2
        int res = sum(2,6);
        System.out.println(res);

        //example 3
        demo("pavan", "bikes");
        demo(1,2,56);
    }

    static void fun(int a ){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static int sum(int a, int b){
        System.out.println("First one");
        return a+b;
    }
    static int sum(int a, int b , int c){
        System.out.println("Second one");
        return a+b+c;
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
