package org.example;

public class Calculator {

    public int subtract(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }

    public int add(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public int multiply(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }

    public double divide(int numerator, int denominator) {
        if (denominator == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) numerator / denominator;
    }
}
