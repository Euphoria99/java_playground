package com.arrays_and_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

//5
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
//        list.add(67);
//        list.add(1);
//        list.add(647);
//        list.add(77);
//        list.add(60);
//        list.add(671);
//        list.add(13);
//        list.add(45);
//
//        System.out.println(list.contains(60));
//
//        System.out.println(list);
//        list.set(0,100);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here to print individual values, list[index] syntax will not work here
        }

        System.out.println(list);
    }

}
