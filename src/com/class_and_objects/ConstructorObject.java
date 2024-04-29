package com.class_and_objects;

//4
// things covered: creating constructor, this keyword, object creation

public class ConstructorObject {

    public static void main(String[] args) {

       Student pavan = new Student();
//       Student pavan = new Student(17,"Euphoria new", 90.1f);

//       pavan.changeName("Euphoria");
//       pavan.greeting();

        System.out.println(pavan.rno);
        System.out.println(pavan.name);
        System.out.println(pavan.marks);

        Student random = new Student(pavan);
        System.out.println("random name " + random.name);
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

    //Student phill = new Student(17,"phill", 81.2f);
    //here, this will be replaced with phill
    Student(int roll, String name, float marks){
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}
