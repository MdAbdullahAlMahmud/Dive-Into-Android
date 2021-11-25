package com.mkrlabs.class04.developer;

import com.mkrlabs.class04.Employee;
import com.mkrlabs.class04.utlls.BaseSalary;

public class Developer extends Employee {
    private String designation;

    public Developer(String name, int age, String address, String designation,int duration) {
        super(name, age, address,duration);
        this.designation= designation;
    }




    @Override
    public void calculateSalary() {

        if (designation.equals(BaseSalary.DES_JUNIOR_ANDROID_DEVELOPER)){
            System.out.println("Salary "+ (BaseSalary.JUNIOR_ANDROID_DEVELOPER + (super.getDuration()*5000)));
        }
        if (designation.equals(BaseSalary.DES_SENIOR_ANDROID_DEVELOPER)){
            System.out.println("Salary "+ BaseSalary.SENIOR_ANDROID_DEVELOPER + (super.getDuration()*5000));
        }
        if (designation.equals(BaseSalary.DES_PROJECT_MANAGER)){
            System.out.println("Salary "+ BaseSalary.PROJECT_MANAGER+ (super.getDuration()*5000));
        }


    }

    @Override
    public void information() {
        super.information();
        calculateSalary();
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
