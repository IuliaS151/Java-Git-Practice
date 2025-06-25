package org.example.accessModifiers.app;
import org.example.accessModifiers.model.Product;

public class Store {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop");
        System.out.println(laptop.name);
        laptop.displayInfo();
    }
}
