package com.class_and_objects;

//4
// things covered: creating constructor, this keyword, object creation

public class ConstructorObject {

    public static void main(String[] args) {

//       Student pavan = new Student();
       Student pavan = new Student(17,"Euphoria new", 90.1f);

//       pavan.changeName("Euphoria");
//       pavan.greeting();

        System.out.println(pavan.rno);
        System.out.println(pavan.name);
        System.out.println(pavan.marks);
    }
}

class Student {
    int rno;
    String name;
    float marks =90;

    //we need a way to add the values of the above
    //properties to object

    //we need one word to access every object

    void greeting(){
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }

    //constructor
    Student(){
        this.rno = 7;
        this.name = "Pavan Bhat";
        this.marks = 88.5f;
    }

    Student(int roll, String name, float marks){
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }
}
