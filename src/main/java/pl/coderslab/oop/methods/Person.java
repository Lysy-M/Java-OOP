package pl.coderslab.oop.methods;

public class Person {
    private String name = "KSJMXKSLKSLL<MSLLK";
    private String surname = "kxjxjx";
    private int age = 121;
    private char gender = 'M';

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return String.join(" ", name, surname);
    }

    public int increaseAge() {
        return ++age;
    }
}
//    public String getFullName() {
//        return String. join(" ", imię, nazwisko);   Kod zapisany w innej formie niż ten wyżej.
//    }
//
//    public int increaseWiek() {
//        powrót ++ wiek;
//    }
//}