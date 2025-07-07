package org.example.ListExamples;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("Молоко");
        shoppingList.add("Хлеб");
        shoppingList.add("Яйца");
        shoppingList.add("Сыр");
        shoppingList.add("Масло");

        System.out.println("Исходный список покупок: " + shoppingList);

        // Сценарий: Вставить "Йогурт" после "Хлеба" и удалить "Яйца" с помощью ListIterator
        ListIterator<String> iterator = shoppingList.listIterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("Хлеб")) {
                iterator.add("Йогурт");
            } else if (item.equals("Яйца")) {
                iterator.remove();
            }
        }

        System.out.println("Список покупок после модификаций: " + shoppingList);

        // Сценарий: Переместить "Масло" в начало списка
        // 1. Найти и удалить "Масло"
        String butter = null;
        iterator = shoppingList.listIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("Масло")) {
                butter = item;
                iterator.remove();
                break;
            }
        }

        // 2. Добавить "Масло" в начало
        if (butter != null) {
            shoppingList.addFirst(butter);
        }

        // Сценарий: Заменить элемент во время итерации (например, "Сыр" на "Чеддер")
        iterator = shoppingList.listIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("Сыр")) {
                iterator.set("Сыр Чеддер");
                break;
            }
        }

        System.out.println("Список покупок после смены сыра: " + shoppingList);
    }
}
