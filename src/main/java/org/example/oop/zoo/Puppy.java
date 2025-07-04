package org.example.oop.zoo;

// Grand-child class
public class Puppy extends Dog implements Mammal{
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

    public void giveBirth(){
        System.out.println(name + " слишком мал для потомства.");
    }

    public double nurseYoung(){
        System.out.println(name + " пьет молоко.");
        return 0.2;
    }

     public double regulateBodyTemperature(){
        double temp = 38.5;
        System.out.println(name + " регулирует температуру тела. Текущая: " + temp + "°C.");
        return temp;
     }
}