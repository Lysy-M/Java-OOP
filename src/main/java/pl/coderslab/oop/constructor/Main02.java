package pl.coderslab.oop.constructor;

public class Main02 {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.add(4, 5);
        myCalculator.subtract(9, 2);
        myCalculator.clearOperations();
        myCalculator.multiply(4, 6);
//        myCalculator.divide(3,0); // rzuci wyjątek
        myCalculator.divide(3,4);
        myCalculator.add(1, 5);
        myCalculator.subtract(9, 4);
        myCalculator.printOperations();
    }
}