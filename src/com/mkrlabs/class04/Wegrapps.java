package com.mkrlabs.class04;

import com.mkrlabs.class04.developer.Developer;
import com.mkrlabs.class04.utlls.BaseSalary;

public class Wegrapps {

    public static void main(String[] args) {

        Developer developer = new Developer("Niloy",21,"Dhaka", BaseSalary.DES_JUNIOR_ANDROID_DEVELOPER,5);

        developer.information();
        //developer.calculateSalary();

        NiloyCalculator niloyCalculator = new NiloyCalculator();
        niloyCalculator.addition(5,8);

        FajleCalculator fajleCalculator = new FajleCalculator();
        fajleCalculator.addition(5,8);

    }
}
