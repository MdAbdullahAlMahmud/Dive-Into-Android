package com.mkrlabs.class04;

public abstract class Employee {

    private String name;
    private int age;
    private String address;
    private int duration;

    public abstract void calculateSalary();


    public Employee(String name, int age, String address, int duration) {
        this.name = name;
        this.age = age;
        this.address = address;

        if (duration<0){
            System.out.println("Invalid Duration");
            this.duration = 0;
        }else {
            this.duration = duration;
        }


    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void information(){
        System.out.println("Name : "+ getName());
        System.out.println("Age : "+ getAge());
        System.out.println("Address : "+ getAddress());
    }
}
