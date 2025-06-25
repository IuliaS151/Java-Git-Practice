package org.example.accessmodifiers.model;

public class Product {
    public String name;

    public Product(String name) {
        this.name= name;
    }

    public void displayInfo(){
        System.out.println("Product: " + name);
    }
}
