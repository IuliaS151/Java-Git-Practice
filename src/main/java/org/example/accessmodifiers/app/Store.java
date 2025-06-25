package org.example.accessmodifiers.app;
import org.example.accessmodifiers.model.Product;

public class Store {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop");
        System.out.println(laptop.name);
        laptop.displayInfo();
    }
}
