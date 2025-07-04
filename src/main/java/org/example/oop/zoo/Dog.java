package org.example.oop.zoo;

// Подкласс
public class Dog extends Animal implements Mammal{
    protected  String breed;

    public Dog(String name, String breed) {
        super(name); // Вызов конструктора суперкласса Animal
        this.breed = breed;
        System.out.println("Dog '" + this.name + "' (breed: " + this.breed + ") created.");
    }

    public void bark() { // Метод, спецефичный для Dog
        System.out.println(name + " (a " + breed + ") barks: Woof woof!");
    }

    // Переопределение метода из суперкласса (см. Полиморфизм)
    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void giveBirth(){
        System.out.println(name + " может оставить потомство");
    }
    public double nurseYoung() {
        System.out.println(name + " кормит щенков молоком.");
        return 0.5; // Например, 0.5 литра в день
    }
    public double regulateBodyTemperature(){
        double temp = 38.7; // Средняя температура собаки
        System.out.println(name + " регулирует температуру тела. Текущая: " + temp + "°C.");
        return temp;
    }
}