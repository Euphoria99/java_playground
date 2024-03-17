package com.functions;

public class ValueDoesNotChanges {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swapNum(a,b);

        System.out.println(a +" " + b);

        //string example

        String name = "Amanda";
        changeN(name);
        System.out.println(name);

    }

    static void swapNum(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
    }

     static void changeN(String naam) {
        naam = "Juanita";  //here we are creating new object, not changing the object & you cannot change strings/immutable
    }
}
