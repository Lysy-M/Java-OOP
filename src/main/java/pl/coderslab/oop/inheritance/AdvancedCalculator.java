package pl.coderslab.oop.inheritance;

import pl.coderslab.oop.constructor.Calculator;

public class AdvancedCalculator extends Calculator {

    public double pow(double num1, double num2) {
        double result = Math.pow(num1, num2);
        String operation = num1 + "^" + num2 + " equals " + result;
        saveOperation(operation);
        return result;
    }

    public double root(double num1, double num2) {
        double result = Math.round(Math.pow(num1, 1.0 / num2));
        String operation = num2 +  " root of " + num1 + " equals " + result;
        saveOperation(operation);
        return result;
    }
}