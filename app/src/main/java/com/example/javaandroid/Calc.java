package com.example.javaandroid;

public class Calc {
    public Double add(Double a, Double b) {
        return a + b;
    }

    public Double subtract(Double a, Double b) {
        return a - b;
    }

    public Double multiply(Double a, Double b) {
        return a * b;
    }

    public Double divide(Double a, Double b) {
        if (b == 0) {
            return 0.0;
        }
        return a / b;
    }
}
