package org.example.accessmodifiers.reports;

// import org.example.accessModifiers.data.Customer; // ОШИБКА: Customer имеет default доступ и не может быть импортирован

public class ReportGenerator {
    public static void main(String[] args) {
        // Customer c2 = new Customer("C002"); // ОШИБКА: Не могу создать объект Customer (класс недоступен)
        // Если бы класс Customer был public, но метод displayCustomerId() был default:
        // c2.displayCustomerId(); // ОШИБКА: Метод недоступен
    }
}
