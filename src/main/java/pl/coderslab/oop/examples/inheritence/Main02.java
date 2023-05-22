package pl.coderslab.oop.examples.inheritence;

public class Main02 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bicycle bicycle = new Bicycle();
        Car car = new Car();



        System.out.println(bicycle instanceof Vehicle); // sprawdzamy czy bicycle jest rozszerzeniem klasy Vehicle
        System.out.println(car instanceof Vehicle); // sprawdzamy czy bicycle jest rozszerzeniem klasy Vehicle

        System.out.println(vehicle instanceof Bicycle);


    }
}