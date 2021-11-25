package com.mkrlabs.class04;

public class NiloyCalculator implements  CalculatorAction{


    @Override
    public void addition(int num1, int num2) {
        int ans = num1+num2;
        System.out.println(ans);

    }

    @Override
    public void multiplication(int num1, int num2) {

        int ans = num1*num2;
        System.out.println(ans);
    }

    @Override
    public void subtruction(int num1, int num2) {
        int ans = num1-num2;
        System.out.println(ans);
    }
}
