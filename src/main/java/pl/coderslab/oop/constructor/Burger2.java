package pl.coderslab.oop.constructor;
public class Burger2 {

    private int size;
    private double price;

    public Burger2(int size, double price) {
        this.size = size;
        this.price = price;
    }

    public Burger2() {
        // Domyślne wartości
        this.size = 100;
        this.price = 10.0;
    }

    // Gettery i settery
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
//    W powyższym kodzie, tworzymy klasę Burger z prywatnymi atrybutami size i price. W konstruktorze z dwoma argumentami, ustawiamy wartości tych atrybutów na wartości podane jako argumenty. W konstruktorze bezargumentowym, ustawiamy domyślne wartości dla atrybutów.
//
//        Dodatkowo, dodajemy publiczne gettery i settery dla atrybutów size i price, aby umożliwić dostęp do ich wartości z poziomu innych klas.