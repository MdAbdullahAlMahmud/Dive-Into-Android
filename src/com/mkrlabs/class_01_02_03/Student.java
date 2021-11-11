package com.mkrlabs.class_01_02_03;

public class Student {

    String name ;
    int  age ;
    String address ;
    String phone ;

    public Student(String name , int age , String address ){
        this.name = name;
        this.age= age;
        this.address =address;

        System.out.println("3 parameter cons. called");

    }
    public Student(String name , int age , String address ,String phone){
        this(name,age,address);

        System.out.println("4 parameter cons. called");
        /*this.name = name;
        this.age= age;
        this.address =address;*/
        this.phone= phone;
        displayInfo();

    }

    /* public Student(String name){}
    public Student(String address, String versity){}

    */


    public void displayInfo(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Address " + address);
        System.out.println("Phone " + phone);

    }





}
