package com.class_and_objects;


//6
public class Finals {
    public static void main(String[] args) {

        //final keyword
        final int bonus = 2;
//        bonus =3; //will give error


        //
        final A pavan = new A("Pavan");
        pavan.name ="other name";

//        when a non primitive is final, you cannout reassign it
//        pavan = new A("new pavan");
    }
}

class A {
    final int num =1;
    String name;

    public A(String name) {
        this.name = name;
    }
}
