package org.example.accessModifiers.data;

class Customer { // default
    String customerId;

    Customer(String customerId) {
        this.customerId = customerId;
    }

    void displayCustomerId() {
        System.out.println("Customer ID: " +customerId);
    }
}

public class DataManager {
    public static void main(String[] args) {
        Customer c1 = new Customer("C001"); // Доступ к default конструктору (в том же пакете)
        System.out.println(c1.customerId); // Доступ к default полю (в том же пакете)
        c1.displayCustomerId(); // Доступ к default методу (в том же пакете)
    }
}
