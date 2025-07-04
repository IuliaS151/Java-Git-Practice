package org.example.oop.zoo;

public interface Reptile {
    String CLASS_NAME = "Reptilia";
    // Абстрактный метод: Все рептилии линяют (сбрасывают кожу)
    void shedSkin();

    // Абстрактный метод: Все рептилии имеют чешуйки
    void hasScales(); // Можно было бы сделать как boolean hasScales(), но для примера пусть будет void

    // Default метод (с Java 8): Общее поведение ползания/движения
    default void crawl() {
        System.out.println("Рептилия ползет по земле.");
    }
}
