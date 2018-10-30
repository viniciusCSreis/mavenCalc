package com.zup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcTest{

    private Calc calc;
    private double delta = 0.0001;

    @BeforeEach
    protected void init(){
        this.calc = new Calc();

    }

    //addition

    @Test
    protected void additionOfPositiveNumbersInAscendingOrder() {
        assertEquals(calc.addition(1, 2), 3,delta);
    }
    @Test
    protected void additionOfPositiveNumbersInDecreasingOrder() {
        assertEquals(calc.addition(5, 4), 9,delta);
    }

    @Test
    protected void additionOfNegativeNumbers(){

        assertThrows(MyException.class, () -> calc.addition(-1,1));
        assertThrows(MyException.class, () -> calc.addition(1,-1));
        assertThrows(MyException.class, () -> calc.addition(-1,-1));
    }

    //subtraction

    @Test
    protected void subtractionOfPositiveNumbersInAscendingOrder(){
        assertEquals(calc.subtraction(5,4),1,delta);
    }
    @Test
    protected void subtractionOfPositiveNumbersInDecreasingOrder(){
        assertEquals(calc.subtraction(4,5),-1,delta);
    }
    @Test
    protected void subtractionOfNegativeNumbersInDecreasingOrder(){
        assertEquals(calc.subtraction(-4,-5),1,delta);
    }
    @Test
    protected void subtractionOfNegativeNumbersInAscendingOrder(){
        assertEquals(calc.subtraction(-5,-4),-1,delta);
    }


    //multiplication
    @Test
    protected void multiplicationOf1Positiveand1Negative(){
        assertEquals(calc.multiplication(5,-4),-20,delta);
    }
    @Test
    protected void multiplicationOf2Positive(){
        assertEquals(calc.multiplication(4,5),20,delta);
    }
    @Test
    protected void multiplicationOf1Negativeand1Positive(){
        assertEquals(calc.multiplication(-4,2),-8,delta);
    }
    @Test
    protected void multiplicationOf2Negative(){
        assertEquals(calc.multiplication(-5,-3),15,delta);
    }

    //division

    @Test
    protected void divisionOf1Positiveand1Negative(){
        assertEquals(calc.division(20,-4),-5,delta);
    }
    @Test
    protected void divisionOf2Positive(){
        assertEquals(calc.division(20,5),4,delta);
    }
    @Test
    protected void divisionOf1Negativeand1Positive(){
        assertEquals(calc.division(-20,2),-10,delta);
    }
    @Test
    protected void divisionOf2Negative(){
        assertEquals(calc.division(-20,-5),4,delta);
    }

    @Test
    protected void divisionOfNumberByZero(){
        assertThrows(ArithmeticException.class,()->calc.division(20,0));
    }




}

