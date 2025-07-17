package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Создание ArrayList
        List<String> fruits = new ArrayList<>();


        // Добавление элементов
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial list: " + fruits);

        // Добавление элемента по индексу
        fruits.add(1,"Orange");
        System.out.println("After adding 'Orange' at index 1: " + fruits);

        // Получение элемента по индексу
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Изменение элемента по индексу
        fruits.set(2, "Grape");
        System.out.println("After setting index 2 to 'Grape': " + fruits);

        // Удаление элемента по значению
        fruits.remove("Orange");
        System.out.println("After removing 'Orange': " + fruits);

        // Удаление элемента по индексу
        fruits.remove(0);
        System.out.println("After removing element at index 0: " + fruits);

        // Размер списка
        System.out.println("Size of the list: " + fruits.size());

        // Проверка на пустоту
        System.out.println("Is list empty? " + fruits.isEmpty());

        // Проверка на содержание элемента
        System.out.println("Does list contain 'Cherry'? " + fruits.contains("Cherry"));

        // Итерация по элементам (можно использовать for-each или Iterator)
        System.out.println("\nIterating with for-each loop: ");
        for (String fruit : fruits){
            System.out.println("Fruit: " + fruit);
        }

        // Очистка списка
        fruits.clear();
        System.out.println("After clearing the list: " + fruits); // []
        System.out.println("Is list empty now? " + fruits.isEmpty()); // true
    }
}
