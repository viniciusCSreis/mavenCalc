package com.zup;

import junit.framework.TestCase;

public class CalcTest extends TestCase{

    public void testSun(){
        Calc calc = new Calc();
        assertEquals(calc.sum(1, 2), 0.0);
    }
}
