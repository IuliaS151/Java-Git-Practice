package org.example.oop.zoo;

public class Cat extends Animal implements Mammal{
    private String color;

    public Cat (String name, String color) {
        super(name);
        this.color = color;
        System.out.println("Cat '" + name + "' (color: " + this.color + ") created.");
    }

    public void meow() {
        System.out.println(name + " (a " + color + " cat) meows: Meow meow!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating fish.");
    }

    public String getColor() {
        return color;
    }

    public void giveBirth(){
        System.out.println(name + " окотилась.");
    }

    @Override
    public double nurseYoung() {
        System.out.println(name + " кормит котят молоком.");
        return 0.5; // Например, 0.5 литра в день
    }

    @Override
    public  double regulateBodyTemperature() {
        double temp = 38.5;
        System.out.println(name + " регулирует температуру тела. Текущая: " + temp + "°C.");
        return temp;
    }
}