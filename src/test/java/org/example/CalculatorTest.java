package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void add_twoNumbers_Pass(){
        //Arrange
        int numberOne = 10;
        int numberTwo = -18;
        Calculator calculator = new Calculator();

        //Act
        int sum = calculator.add(numberOne, numberTwo);

        //Assert
        assertEquals(-8, sum);
    }

    @Test
    public void multiple_twoNumbers_Pass(){
        //Arrange
        int numberOne = 5;
        int numberTwo = 5;
        Calculator calculator = new Calculator();

        //Act
        int product = calculator.multiply(numberOne,numberTwo);

        //Assert
        assertEquals(25, product);
    }

    @Test
    public void divide_twoNumbers_throwsException(){
        //Arrange
        int numerator = 8;
        int denominator = 0;
        Calculator calculator = new Calculator();

        //Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(numerator, denominator));

        //Assert
        assertEquals("Cannot divide by zero",exception.getMessage());
    }



}