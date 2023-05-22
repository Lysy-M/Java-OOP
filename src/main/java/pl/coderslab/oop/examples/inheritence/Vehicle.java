package pl.coderslab.oop.examples.inheritence;

public class Vehicle {

    public Vehicle() {
        System.out.println("Torzymy pojazd");
    }

    private int speed = 40;

    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void start(){
        System.out.println("Pojazd ruszył z ogromną prędkością: " + this.speed);
    }

}