package pl.coderslab.oop.methods;

//public class Car {
//    private String brand;
//    private String model;
//    private double price;
//
//    public Car(String brand, String model, double price) {
//        this.brand = brand;
//        this.model = model;
//        this.price = price;
//    }
//    public String getBrand() {
//        return brand;
//    }
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//    public String getModel() {
//        return model;
//    }
//    public void setModel(String model) {
//        this.model = model;
//    }
//    public double getPrice() {
//        return price;
//    }
//    public void setPrice(double price) {
//        this.price = price;
//    }
//    @Override
//    public String toString() {
//        return brand + " - " + price;
//    }
//}

//    prywatna marka String;
//        prywatny model String;
//        prywatna podwójna cena;
//
//public String getBrand() {
//        marka zwrotna ;
//        }
//
//public void setBrand(String brand) {
//        tego. marka = marka;
//        }
//
//public String getModel() {
//        Model zwrotu;
//        }
//
//public void setModel(model ciągu znaków ) {
//        tego.  model = model;
//        }
//
//        publiczny podwójny getPrice() {
//        cena zwrotu ;
//        }
//
//public void setPrice(podwójna cena) {
//        tego.  cena = cena;
//        }
//
//@Zastąpić
//public String toString () {
//        return "brand=" + brand + ", model=" + model + ", price=" + price;
//        }

public class Car {

    private String brand;
    private String model;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand=" + brand + ", model=" + model + ", price=" + price;
    }
}

