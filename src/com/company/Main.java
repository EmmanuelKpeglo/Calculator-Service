package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CalculatorServiceImplementation someService = new CalculatorServiceImplementation();

        Calculator myCalculator = new Calculator(someService);

        System.out.println(myCalculator.add(8, 7));
        System.out.println(myCalculator.subtract(8, 7));
        System.out.println(myCalculator.multiply(8, 7));

    }
}
