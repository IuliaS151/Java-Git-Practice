package org.example.oop;

class Animal {
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

// Подкласс
class Dog extends Animal {
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
}

// Grand-child class
class Puppy extends Dog {
    private String toy;

    public Puppy(String name, String breed, String toy){
        super(name, breed);
        this.toy = toy;
        System.out.println("Puppy '" + this.name + "' (toy: " + this.toy + " ) created.");
    }

    public void play() {
        System.out.println(name + " is playing with " + toy +".");
    }

    // Переопределение метода из Animal (через Dog)
    @Override
    public void sleep(){
        System.out.println(name + " is sleeping soundly in its bed.");
    }

    public String getToy() {
        return toy;
    }
}

class Cat extends Animal {
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
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.eat();
        myDog.bark();
        myDog.sleep();
        System.out.println(myDog.getBreed());

        Puppy archiePuppy = new Puppy("Archie", "Labrador Retriever", "comfort blanket");
        archiePuppy.play();
        archiePuppy.sleep();
        System.out.println(archiePuppy.getToy());

        Cat lunaCat = new Cat("Luna", "black");
        lunaCat.meow();
        lunaCat.eat();
        System.out.println(lunaCat.getColor());

        Animal genericAnimal = new Animal("Lion");
        genericAnimal.eat();
        genericAnimal.sleep();
    }
}
