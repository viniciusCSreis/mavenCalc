package com.zup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcTest{

    private Calc calc;

    @BeforeEach
    protected void init(){
        this.calc = new Calc();

    }

    @Test
    protected void sumOfPositiveNumbersInAscendingOrder() {
        assertEquals(calc.sum(1, 2), 3,0.0001);
    }
    @Test
    protected void sumOfPositiveNumbersInDecreasingOrder() {
        assertEquals(calc.sum(5, 4), 9,0.0001);
    }

    @Test
    protected void sumOfNegativeNumbers(){
        assertThrows(RuntimeException.class, () -> calc.sum(-1,1));
    }

}
