package pl.coderslab.oop.examples.inheritence;


public class Ebook extends Book{

    //    private String name; - odziedziczone z klasy Book
//    private double price; - odziedziczone z klasy Book
//    private String author; - odziedziczone z klasy Book
    private String sizeInMB;

    public Ebook(String name, double price, String author, String sizeInMB) {
        super(name, price, author);
        this.sizeInMB = sizeInMB;
    }
}