package org.example.oop.zoo;

public class Eagle extends Animal implements Bird{
    private double wingspan;

    public Eagle(String name, double wingspan) {
        super(name);
        this.wingspan = wingspan;
        System.out.println("Создан орел: '" + this.name + "' (размах крыльев: " + this.wingspan + ").");
    }

    @Override
    public void eat() {
        System.out.println(name + " охотится на добычу с воздуха.");
    }

    @Override
    public void layEggs(){
    }

    @Override
    public void chirp(){
        System.out.println(name + " издает резкий клекот.");
    }

    @Override
    public void fly(){
        System.out.println(name + " парит высоко в небе.");
    }
}
