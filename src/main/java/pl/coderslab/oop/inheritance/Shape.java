package pl.coderslab.oop.inheritance;

public class Shape {
    private double x;
    private double y;
    private String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        return "Shape with center at (" + x + ", " + y + ") and color " + color;
    }

    public double getDistance(Shape shape) {
        double dx = x - shape.x;
        double dy = y - shape.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
//    W powyższym kodzie, tworzymy klasę Shape z prywatnymi atrybutami x, y i color oraz konstruktorem, który pozwala na ich inicjalizację. Metoda getDescription() zwraca opis kształtu, a metoda getDistance() oblicza odległość między środkami dwóch kształtów.
//
//        Jeśli zmienimy dostęp do poszczególnych funkcji z publicznego na prywatny, to nie będziemy mogli ich wywołać z zewnątrz klasy Shape. Na przykład, jeśli zmienimy dostęp metody getDescription() na prywatny, to nie będziemy mogli wywołać tej metody z innego miejsca w programie. Podobnie, jeśli zmienimy dostęp do atrybutów x, y i color na prywatny, to nie będziemy mogli ich bezpośrednio modyfikować z zewnątrz klasy Shape.

