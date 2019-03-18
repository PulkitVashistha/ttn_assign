package com.ttn.sling.project.core.service;


public class Student {

    int id;
    String name;
    int marks;
    int age;

    Student() {

    }

    Student(int id, String name, int marks, int age) {
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student [ID: "+id+" NAME: "+name+" PASSING MARKS: "+marks+" AGE: "+age+"]";
    }

}
