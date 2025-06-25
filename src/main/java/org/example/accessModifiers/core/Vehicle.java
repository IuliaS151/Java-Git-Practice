package org.example.accessModifiers.core;

public class Vehicle {
    protected String type;

    protected Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle created: " + type);
    }

    protected void accelerate() {
        System.out.println( type + " is accelerating.");
    }
}
class garage {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car"); // Доступ к protected конструктору (в том же пакете)
        car.accelerate();                 // Доступ к protected методу (в том же пакете)
        System.out.println(car.type);     // Доступ к protected полю (в том же пакете)
    }
}
