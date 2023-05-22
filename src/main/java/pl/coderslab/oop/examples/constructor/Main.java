package pl.coderslab.oop.examples.constructor;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        book.setId(1);
        book.setTitle("Harry Potter");
        book.setPrice(49.99);

        Book mojaKsiazka = new Book(2, "Lord of the rings");

        Author author = new Author("Krzysztof", "Bednarczyk", 35, "Polish");

        Book myFavouriteBook = new Book(3,"Moja autobiografia", 39.99, author);

        myFavouriteBook.setTitle("Moja pierwsza autobiografia");


        System.out.println("My first book is " + book.getTitle());

        System.out.println("My second book is " + mojaKsiazka.getTitle());

        System.out.println("Moja ulubiona książka to " + myFavouriteBook.getTitle() + ", której autorem jest "+ author.getFirstName() + " " + author.getLastName());

    }
}

