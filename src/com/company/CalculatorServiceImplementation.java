package com.company;

public class CalculatorServiceImplementation implements CalculatorService{
    @Override
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
