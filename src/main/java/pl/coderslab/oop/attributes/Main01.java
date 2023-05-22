package pl.coderslab.oop.attributes;

public class Main01 {

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        System.out.println(testAttribute.publicAttribute); // Przykład użycia atrybutu publicznego
                                                           // testAttribute.publicAttribute = "Public value";
        System.out.println(testAttribute.protectedAttribute); // Przykład użycia atrybutu chronionego - dostępny tylko                                                                dla klas dziedziczących
                                                              // testAttribute.protectedAttribute = "Protected value";
//        System.out.println(testAttribute.privateAttribute); // Przykład użycia atrybutu prywatnego - spowoduje błąd                                                                 kompilacji
                                                              // testAttribute.privateAttribute = "Private value";

    }
}
//    W powyższym kodzie, tworzymy obiekt klasy AccessModifier i przypisujemy go do zmiennej testAttribute. Następnie, używając atrybutu publicznego, przypisujemy mu wartość i wyświetlamy ją za pomocą metody println().
//
//        Atrybut prywatny jest niedostępny z poziomu klasy Main01, więc próba przypisania mu wartości spowoduje błąd kompilacji. Podobnie, atrybut chroniony jest dostępny tylko dla klas dziedziczących, więc próba użycia go również spowoduje błąd kompilacji.
//        Wynik wykonania kodu zależy od tego, czy został on zmodyfikowany zgodnie z sugestiami z mojej poprzedniej odpowiedzi. W przypadku, gdy kod nie został zmodyfikowany, to próba dostępu do atrybutów chronionego i prywatnego spowoduje błąd kompilacji, więc wynik będzie składał się tylko z wyświetlenia wartości atrybutu publicznego.
//
//        W pierwszej linii kodu tworzymy obiekt klasy AccessModifier i przypisujemy go do zmiennej testAttribute. Następnie, w drugiej linii, używając atrybutu publicznego, wyświetlamy jego wartość za pomocą metody println(). Wynik wyświetlenia zależy od wartości, jaką przypisaliśmy do atrybutu publicznego w klasie AccessModifier.
//
//        W trzeciej linii, próbujemy wyświetlić wartość atrybutu chronionego, który jest dostępny tylko dla klas dziedziczących. W przypadku, gdy kod nie został zmodyfikowany, próba dostępu do atrybutu spowoduje błąd kompilacji, więc nie będzie wyświetlonej żadnej wartości.
//
//        Podsumowując, wynik wykonania kodu zależy od wartości przypisanej do atrybutu publicznego oraz od tego, czy próba dostępu do atrybutów chronionego i prywatnego spowoduje błąd kompilacji czy nie.