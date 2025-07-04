package org.example.oop.zoo;

public interface Bird {
    String CLASS_NAME = "Aves";
    void layEggs();
    void chirp();
    default void fly() {
        System.out.println("Птица летает в небе.");
    }

}
