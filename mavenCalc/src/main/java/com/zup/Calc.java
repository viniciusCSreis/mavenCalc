package com.zup;

class Calc {
    protected double sum(double a, double b) {
        if(a < 0 || b < 0)
            throw new RuntimeException("Nao Deve somar numero negativo");
        return a + b;
    }
    protected double multiple(double a, double b){
        return a * b;
    }
}
