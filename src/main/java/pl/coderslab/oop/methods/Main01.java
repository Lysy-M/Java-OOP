package pl.coderslab.oop.methods;

public class Main01 {
    public static void main(String[] args) {
        double dogAgeInHumanYears = 1.5;
      //  double dogAgeInHumanYears = 5;
        double dogAgeInDogYears = dogAge(dogAgeInHumanYears);
        System.out.println("Wiek psa w psich latach: " + dogAgeInDogYears);
    }

    public static double dogAge(double dogAge) {
        if (dogAge <= 2) {
            return dogAge * 10.5;
        } else {
            return 2 * 10.5 + (dogAge - 2) * 4;
        }
    }
}





















//    Opis kodu:
//
//        Metoda dogAge przyjmuje wiek psa jako parametr typu double.
//        Jeśli wiek psa jest mniejszy lub równy 2, używamy prostego wzoru dogAge * 10.5 do przeliczenia wieku psa na psie lata.
//        W przeciwnym przypadku, gdy wiek psa jest większy niż 2, korzystamy z wzoru 2 * 10.5 + (dogAge - 2) * 4, gdzie pierwsze dwa lata psa są równoważne 21 ludzkim latom (2 * 10.5), a każdy kolejny rok psa jest równoważny 4 ludzkim latom.
//        Zwracamy obliczony wiek psa.
//        W metodzie main testujemy funkcję, podając przykładowy wiek psa 1.5 i 5, a następnie wyświetlamy wyniki.
//        Dla dogAge = 1.5, otrzymamy oczekiwany wynik 15.75.
//        Dla dogAge = 5, otrzymamy oczekiwany wynik 33.