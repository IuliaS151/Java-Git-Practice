package org.example.oop;

class Car {
    // Поля - определяют состояние объекта
    String make;
    String model;
    String color;
    int year;
    int speed;
    static int numberOfCarsCreated = 0;

    // Конструктор - специальный метод для создание объектов класса
    public  Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = 0;
        numberOfCarsCreated++;
    }

    // Методы - определяют, что объект Car может делать
    public void start() {
        System.out.println(make + " " + model + " is starting.");
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println(make + " " + model + " is accelerating. Current speed: " + speed + " km/h.");
    }

    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0; // Скорость не может быть отрицательной
        System.out.println(make + " " + model + " is braking. Current speed: " + speed + " km/h.");
    }

    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Color: " + color + ", Year: " + year + ", Speed: " + speed + " km/h.");
    }
}
public class ClassesAndObjectsPractice {
    public static void main(String[] args) {
        // Создание первого объекта Car (экземпляра класса Car)
        // new Car(...) вызывает конструктор класса Car
        Car myCar = new Car("Toyota", "Camry", "Red", 2022);
        Car anotherCar = new Car("Honda", "Civic", "Blue", 2020);

        // Доступ к полям объекта myCar
        System.out.println("My car is a " + myCar.color + " " + myCar.make); // My car is a Red Toyota

        // Вызов методов объекта myCar
        myCar.start();      // Toyota Camry is starting.
        myCar.accelerate(50); // Toyota Camry is accelerating. Current speed: 50 km/h.
        myCar.displayInfo(); // Make: Toyota, Model: Camry, Color: Red, Year: 2022, Speed: 50 km/h.

        System.out.println("\n--- Another Car ---");

        // Доступ к полям объекта anotherCar
        System.out.println("Another car is a " + anotherCar.color + " " + anotherCar.make); // Another car is a Blue Honda

        // Вызов методов объекта anotherCar
        anotherCar.start();     // Honda Civic is starting.
        anotherCar.accelerate(30); // Honda Civic is accelerating. Current speed: 30 km/h.
        anotherCar.brake(10);    // Honda Civic is braking. Current speed: 20 km/h.
        anotherCar.displayInfo(); // Make: Honda, Model: Civic, Color: Blue, Year: 2020, Speed: 20 km/h.

        // Обратите внимание: myCar и anotherCar имеют свои собственные значения полей (скорость, цвет и т.д.)
        // Действия, выполненные с myCar, не влияют на anotherCar.

        // Доступ к статическому полю через имя класса (предпочтительный способ)
        System.out.println("Total cars created (via ClassName): " + Car.numberOfCarsCreated); // 2
    }
}