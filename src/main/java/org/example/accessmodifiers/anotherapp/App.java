package org.example.accessmodifiers.anotherapp;

import org.example.accessmodifiers.extended.Car;

public class App {
    public static void main(String[] args) {
        Car mySportCar = new Car(); // OK
        mySportCar.drive(); // OK

        //Vehicle genericVehicle = new Vehicle("Motorcycle"); // ОШИБКА: protected конструктор недоступен извне пакета для не-подкласса
        // Исключение: если класс-пользователь является подклассом, то ок
    }
}
