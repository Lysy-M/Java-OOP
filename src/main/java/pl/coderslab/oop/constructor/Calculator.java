package pl.coderslab.oop.constructor;

import java.util.Arrays;

public class Calculator {

    private String[] operationHistory;

    public Calculator() {
        this.operationHistory = new String[0];
    }

    public int add(int num1, int num2) {
        int result = num1 + num2;
        String operation = "added " + num1 + " to " + num2 + " got " + result;
        this.operationHistory = Arrays.copyOf(this.operationHistory, this.operationHistory.length + 1); // ["Dodawanie", "Dodawanie", "Dodawamnie", null]
        this.operationHistory[this.operationHistory.length - 1] = operation; // -> this.operationHistory[3] = "Dodawanie" -> ["Dodawanie", "Dodawanie", "Dodawamnie", "Dodawamnie"]
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        String operation = "multiplied " + num1 + " with " + num2 + " got " + result;
        saveOperation(operation); // wykorzystanie metody pomocniczej do zapisu operacji
        return result;
    }

    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        String operation = "subtracted " + num2 + " from " + num1 + " got " + result;
        saveOperation(operation);
        return result;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Nie dziel przez zero!");
        }
        double result = num1 / num2;
        String operation = "divided " + num1 + " by " + num2 + " got " + result;
        saveOperation(operation);
        return result;
    }

    public void printOperations() {
//        System.out.println(Arrays.toString(this.operationHistory)); // - alternatywna opcja wydruku opracji
        if (this.operationHistory.length == 0) {
            System.out.println("Tablica operacji jest pusta");
        } else {
            for (int i = 0; i < this.operationHistory.length; i++) {
                System.out.println(this.operationHistory[i]);
            }
        }
    }

    public void clearOperations() {
        this.operationHistory = new String[0];
    }

    public void saveOperation(String operation){
        this.operationHistory = Arrays.copyOf(this.operationHistory, this.operationHistory.length + 1);
        this.operationHistory[operationHistory.length - 1] = operation;
    }

}