package com.zup;

class Calc{
    protected double addition(double a, double b) {
        if(a < 0 || b < 0)
            throw new MyException("Nao Deve somar numero negativo");
        return a + b;
    }
    protected double multiplication(double a, double b){
        return a*b;
    }
    protected double subtraction(double a , double b){return a-b;}

    protected double division(double a , double b) {

        if (b == 0) {
            throw new ArithmeticException("division by zero");
        }
        return a / b;
    }
}
