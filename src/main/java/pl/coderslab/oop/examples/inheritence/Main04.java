package pl.coderslab.oop.examples.inheritence;

public class Main04 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.start();

        Bicycle bicycle = new Bicycle();


        System.out.println("----------");

        bicycle.start(50);
        bicycle.start();

    }
}