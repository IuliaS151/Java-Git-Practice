package org.example.accessmodifiers.extended;

import org.example.accessmodifiers.core.Vehicle;

public class Car extends Vehicle {
    public Car() {
        super("Sports Car"); // Доступ к protected конструктору базового класса
    }

    public void drive() {
        System.out.println("Driving the " + this.type); // Доступ к protected полю
        accelerate(); // Доступ к protected методу
    }
}
