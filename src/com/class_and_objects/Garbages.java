package com.class_and_objects;

//7
public class Garbages {
    public static void main(String[] args) {

        A obj;

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }
    }

    static class A {
        String name;

        public A(String name) {
//            System.out.println("Object created");
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable{
            System.out.println("Object is destroyed");
        }
    }
}
