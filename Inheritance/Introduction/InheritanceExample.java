package Introduction;
// package Inheritance;


class Vehicle{
    double price;
    double mileage;
    String color;

    void display(){
        System.out.println("Price " + price);
        System.out.println("Mileage " + mileage);
        System.out.println("color " + color);
    }
}

class Car extends Vehicle{
    String fuelType;
    boolean sunroof;
    String brand;
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car car1 = new Car();

        // Can access data of child class as well as parent class by usinig of object of child class,
        //  as it simplifies how child class is inheritating properties of parent class

        car1.brand = "Tata";
        car1.price = 1500000;
        car1.mileage = 18.3;
        car1.fuelType = "Diesel";
        car1.color = "Black";
        car1.sunroof = true;
        car1.display();
    }
}
