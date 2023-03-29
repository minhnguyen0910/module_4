package com.codegym.service.impl;

public class CalculatorService implements ICalculatorService {
    public double calculator(double first, double second, String calculation) {
        switch (calculation) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
        }
        return 0;
    }
}
