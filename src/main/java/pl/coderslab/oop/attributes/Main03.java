package pl.coderslab.oop.attributes;

public class Main03 {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.name);
        System.out.println("Nazwisko: " + person.surname);
        System.out.println("Wiek: " + person.age);
        System.out.println("Płeć: " + person.gender);
    }
}
//    Aby zmniejszyć kod dane zapisujemy w takiej postaci:
//    public String name = "Jan";
//    public String nazwisko = "Doe";
//    public int wiek = 18;
//    public char gender = 'M';

//    W powyższym kodzie, tworzymy obiekt klasy Person i przypisujemy go do zmiennej person. Następnie, wyświetlamy wartości atrybutów name, surname, age i gender za pomocą metod println().
//
//        Jeśli w klasie Person atrybuty name, surname, age i gender są publiczne, to wartości tych atrybutów zostaną wyświetlone bez problemu.
//
//        Jeśli jednak atrybuty te mają modyfikator dostępu prywatnego lub chronionego, to próba wyświetlenia ich wartości spowoduje błąd kompilacji, ponieważ nie mamy do nich dostępu z poziomu klasy Main03. W takim przypadku, aby odczytać wartości tych atrybutów, konieczne będzie dodanie do klasy Person publicznych metod umożliwiających odczytanie wartości tych atrybutów (np. getName(), getSurname(), getAge(), getGender()). Następnie, w klasie Main03 należy użyć tych metod, aby odczytać wartości atrybutów i wyświetlić je za pomocą metod println().
