package pl.coderslab.oop.constructor;

public class Calculator2 {
    private String[] history;
    private int historySize;

    public Calculator2() {
        this.history = new String[0];
        this.historySize = 0;
    }

    private void addToHistory(String operation) {
        int newHistorySize = this.historySize + 1;
        String[] newHistory = new String[newHistorySize];
        System.arraycopy(this.history, 0, newHistory, 0, this.historySize);
        newHistory[this.historySize] = operation;
        this.history = newHistory;
        this.historySize = newHistorySize;
    }

    public int add(int num1, int num2) {
        int result = num1 + num2;
        String operation = "added " + num1 + " to " + num2 + " got " + result;
        addToHistory(operation);
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        String operation = "multiplied " + num1 + " with " + num2 + " got " + result;
        addToHistory(operation);
        return result;
    }

    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        String operation = "subtracted " + num2 + " from " + num1 + " got " + result;
        addToHistory(operation);
        return result;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        int result = num1 / num2;
        String operation = "divided " + num1 + " by " + num2 + " got " + result;
        addToHistory(operation);
        return result;
    }

    public void printOperations() {
        for (String operation : this.history) {
            System.out.println(operation);
        }
    }

    public void clearOperations() {
        this.history = new String[0];
        this.historySize = 0;
    }
}











//    Ten kod jest implementacją prostego kalkulatora w języku Java. Poniżej znajduje się opis każdej linijki kodu:
//
//public class Calculator { - Deklaruje klasę o nazwie "Calculator".
//
//    private String[] history; - Deklaruje prywatne pole history, które jest tablicą napisów (String).
//
//    private int historySize; - Deklaruje prywatne pole historySize, które jest liczbą całkowitą (int).
//
//    public Calculator() { - Deklaruje konstruktor klasy Calculator.
//
//            this.history = new String[0]; - Inicjalizuje pole history jako pustą tablicę napisów.
//
//        this.historySize = 0; - Inicjalizuje pole historySize wartością 0.
//
//        private void addToHistory(String operation) { - Deklaruje prywatną metodę addToHistory, która przyjmuje napis (String) o nazwie operation jako argument.
//
//            int newHistorySize = this.historySize + 1; - Deklaruje zmienną newHistorySize i przypisuje jej wartość o jeden większą niż historySize.
//
//                    String[] newHistory = new String[newHistorySize]; - Tworzy nową tablicę napisów newHistory o rozmiarze newHistorySize.
//
//                    System.arraycopy(this.history, 0, newHistory, 0, this.historySize); - Kopiuje zawartość tablicy history do tablicy newHistory za pomocą metody arraycopy.
//
//            newHistory[this.historySize] = operation; - Dodaje operation na ostatnią pozycję tablicy newHistory.
//
//            this.history = newHistory; - Aktualizuje pole history, przypisując do niego wartość nowej tablicy newHistory.
//
//                    this.historySize = newHistorySize; - Aktualizuje pole historySize, przypisując do niego wartość newHistorySize.
//
//            public int add(int num1, int num2) { - Deklaruje publiczną metodę add, która przyjmuje dwie liczby całkowite (num1 i num2) jako argumenty.
//
//                int result = num1 + num2; - Dodaje num1 do num2 i przypisuje wynik do zmiennej result.
//
//                String operation = "added " + num1 + " to " + num2 + " got " + result; - Tworzy napis operation, który opisuje wykonywaną operację dodawania.
//
//                addToHistory(operation); - Wywołuje metodę addToHistory, przekazując jej napis operation.
//
//                return result; - Zwraca wartość zmiennej result.
//
//                public int multiply(int num1, int num2) { - Deklaruje publiczną metodę multiply, która przyjmuje dwie liczby całkowite (num1 i num2) jako argumenty.
//
//                    int result = num1 * num2; - Mnoży num1 przez `
//