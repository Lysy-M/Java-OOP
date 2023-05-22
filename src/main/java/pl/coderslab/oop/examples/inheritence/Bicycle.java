package pl.coderslab.oop.examples.inheritence;

public class Bicycle extends Vehicle{

    private int bikeSpeed = 50;
    private int numberOfWheels;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void start(){
        System.out.println("Rower ruszył z prędkością " + this.bikeSpeed );
    }

    public void start(int speed){
        int result = 5 * speed;
        System.out.println("Rower jedzie z prędkością " + result);
    }



    @Override
    public String toString() {
        return "Bicycle{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }
}