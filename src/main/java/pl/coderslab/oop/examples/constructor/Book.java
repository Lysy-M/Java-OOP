package pl.coderslab.oop.examples.constructor;

public class Book {

    private int id;

    private String title;

    private double price;

    private Author author;

    private Author[] additionalAuthors;


    /**
     * kontruktor bez parametrów
     //     */
    public Book(){
        System.out.println("Tworzy się nowa książka");
    }


    /**
     *
     * @param id
     * @param title
     * konstruktor, który ustawia wybrane atrybuty klasy
     */
    public Book(int id, String title){
        this.id = id;
        this.title = title;
    }

    /**
     *
     * @param id
     * @param title
     * @param price
     * @param author
     * konstruktor, który ustawia wszystkie atrybuty klasy
     */

    public Book(int id, String title, double price, Author author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}