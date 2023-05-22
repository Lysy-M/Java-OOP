package pl.coderslab.oop.examples.inheritence;

public class Car extends Vehicle{

    public Car() {
        super(); // odwołanie do konstruktora klasy Vehicle
        System.out.println("Tworzymy samochód");
    }

    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}