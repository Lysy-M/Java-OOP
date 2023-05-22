package pl.coderslab.oop.attributes;

public class Main02 {

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        
        System.out.println(testAttribute.publicAttribute);  
        System.out.println(testAttribute.protectedAttribute);

        testAttribute.protectedAttribute = 10;
        testAttribute.publicAttribute = "Coderslab";

        System.out.println(testAttribute.publicAttribute);
        System.out.println(testAttribute.protectedAttribute);
    }
}
//    W powyższym kodzie, tworzymy obiekt klasy AccessModifier i przypisujemy go do zmiennej testAttribute. Następnie, próbujemy wyświetlić wartości atrybutów publicznego i chronionego, które jeszcze nie zostały ustawione. Jednak, ponieważ nie mamy do nich dostępu z poziomu klasy Main02, to wyświetlenie próbuje dostępować do wartości tych atrybutów, które są niezainicjowane. W przypadku atrybutu publicznego, jego wartość jest null, więc wyświetlona zostanie wartość "null". Natomiast próba wyświetlenia atrybutu chronionego spowoduje błąd kompilacji, ponieważ nie mamy do niego dostępu z poziomu klasy Main02.
//
//        Następnie, próbujemy przypisać wartość 10 do atrybutu chronionego, co spowoduje błąd kompilacji, ponieważ atrybut chroniony jest niedostępny z poziomu klasy Main02. Natomiast, przypisujemy wartość "Coderslab" do atrybutu publicznego i wyświetlamy go za pomocą metody println(). Wynik wyświetlenia zależy od wartości, jaką przypisaliśmy do atrybutu publicznego.
//
//        W ostatniej linii, ponownie próbujemy wyświetlić wartość atrybutu chronionego, który jest niedostępny z poziomu klasy Main02. Natomiast, wyświetlamy wartość atrybutu publicznego, którą wcześniej przypisaliśmy, za pomocą metody println(). Wynik wyświetlenia zależy od wartości, jaką przypisaliśmy do atrybutu publicznego.










