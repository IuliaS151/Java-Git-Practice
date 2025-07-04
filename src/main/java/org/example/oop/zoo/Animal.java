package org.example.oop.zoo;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal '" + this.name + "' created.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return  name;
    }
}
