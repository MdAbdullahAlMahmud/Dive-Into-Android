package com.mkrlabs.class04;

public class FajleCalculator implements CalculatorAction{

    @Override
    public void addition(int num1, int num2) {
        System.out.println(num1+num2);
    }

    @Override
    public void multiplication(int num1, int num2) {
        System.out.println(num1*num2);
    }

    @Override
    public void subtruction(int num1, int num2) {
        int ans = num1-num2;
        System.out.println(ans);
    }
}
