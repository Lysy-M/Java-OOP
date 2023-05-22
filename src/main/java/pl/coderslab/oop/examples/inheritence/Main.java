package pl.coderslab.oop.examples.inheritence;

public class Main {

    public static void main(String[] args) {
        Vehicle pojazd = new Vehicle();

        Bicycle bike = new Bicycle();

        Car car = new Car();

        System.out.println("Prędkość pojazdu: " + pojazd.getSpeed());
        System.out.println("Kolor pojazdu: " + pojazd.getColor());
        System.out.println("---------------");
        System.out.println("Prędkość roweru: " + bike.getSpeed());
        System.out.println("Kolor roweru: " + bike.getColor());
        System.out.println("Liczba kół: " + bike.getNumberOfWheels());
        System.out.println("---------------");
        System.out.println("Prędkość samochodu: " + car.getSpeed());
        System.out.println("Kolor samochodu: " + car.getColor());
        System.out.println("Liczba drzwi: " + car.getNumberOfDoors());
    }
}