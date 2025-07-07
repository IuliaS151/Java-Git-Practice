package org.example.ListExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCapacityManagement {

    public static void main(String[] args) {
        // Сценарий 1: Инициализация с известной емкостью
        System.out.println("Сценарий 1: Инициализация с известной емкостью");
        long startTime = System.nanoTime();
        List<Integer> preAllocation = new ArrayList<>(1_000_000); // Предварительно выделяем память для 1 миллиона элементов
        for (int i = 0; i < 1_000_000; i++) {
            preAllocation.add(i);
        }
        long endTime = System.nanoTime();
        System.out.printf("  Время с предварительно выделенной емкостью: %.3f мс%n", (endTime - startTime) / 1_000_000.0);

        // Сценарий 2: Емкость по умолчанию (будет многократное изменение размера)
        System.out.println("\nСценарий 2: Емкость по умолчанию (изменение размера)");
        startTime = System.nanoTime();
        List<Integer> defaultCapacity = new ArrayList<>();
        for (int i = 0; i <1_000_000; i++) {
            defaultCapacity.add(i);
        }
        endTime = System.nanoTime();
        System.out.printf("  Время с емкостью по умолчанию: %.3f мс%n", (endTime - startTime) / 1_000_000.0);

        // Сценарий 3: Добавление коллекции
        System.out.println("\nСценарий 3: Добавление коллекции (addAll)");
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");

        List<String> moreItems = Arrays.asList("Date", "Elderberry", "Fig");

        items.addAll(moreItems);
        System.out.println("Объединенный список: " + items);

        // Гарантировать емкость для будущих добавлений (если у вас есть оценка позже)
        ((ArrayList<String>) items).ensureCapacity(20); // Гарантирует емкость как минимум для 20 элементов
        System.out.println("Текущий размер списка: " + items.size());
        // Фактический размер внутреннего массива может быть больше 20 из-за внутреннего фактора роста.
        // Не существует прямого публичного метода для получения *фактической* емкости, только размер.
    }
}
