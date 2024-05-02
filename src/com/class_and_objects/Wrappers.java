package com.class_and_objects;

//5
public class Wrappers {
    public static void main(String[] args) {

        //wrapper classes
        Integer num = 45;
        String myString = num.toString();
        System.out.println("wrapper: "+ myString.length());


        //pass by referrence, will not swap
        int a =10;
        int b = 20;
//        swap(a, b);


        //pass objects
        Integer c = 10;
        Integer d = 20;
        swap(a, b);

        System.out.println(a + " " + b);
    }

    static void swap(int a, int b){
        int temp =a;
        a =b;
        b = temp;
    }

    static void swap(Integer a, Integer b){
        Integer temp =a;
        a =b;
        b = temp;
    }
}
