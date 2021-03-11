package com.thearmyofcoders.cpc;

public class Calculator {
    public int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        final int result = calculator.divide(4, 0);
        System.out.println(result);
    }
}
