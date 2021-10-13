package com.company;

public class Calculator implements CalculatorService{
    CalculatorService service;

    public Calculator(CalculatorService service) {
        this.service = service;
    }

    @Override
    public int add(int firstNumber, int secondNumber) {
        return service.add(firstNumber, secondNumber);
    }

    @Override
    public int subtract(int firstNumber, int secondNumber) {
        return service.subtract(firstNumber, secondNumber);
    }

    @Override
    public int multiply(int firstNumber, int secondNumber) {
        return service.multiply(firstNumber, secondNumber);
    }
}
