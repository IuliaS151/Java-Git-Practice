package org.example.arrayListExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformanceComparsion {

    private static final int NUM_ELEMENTS = 100_000;
    private static final int NUM_OPERATIONS = 10_000;

    // Заполняет список указанным количеством элементов
    private static void populateList(List<Integer> list, int count){
        for (int i = 0; i <count; i++) {
            list.add(i);
        }
    }

    // Вставляет элементы в середину списка
    private static void insertMiddle(List<Integer> list, int numOperations) {
        Random random = new Random();
        for (int i = 0; i < numOperations; i++) {
            int index = list.size() / 2;
            list.add(index, random.nextInt());
        }
    }

    // Удаляет элементы из середины списка
    private static void removeMiddle(List<Integer> list, int numOperations) {
        for (int i = 0; i < numOperations; i++) {
            if (list.isEmpty()) break;
            int index = list.size() / 2;
            list.remove(index);
        }
    }

    public static void main(String[] args) {
        System.out.println("Сравнение производительности: ArrayList vs. LinkedList");
        System.out.println("----------------------------------------------");

        // --- Производительность ArrayList ---
        System.out.println("Тесты ArrayList:");
        List<Integer> arrayList = new ArrayList<>();
        populateList(arrayList, NUM_ELEMENTS);

        long startTime = System.nanoTime();
        insertMiddle(arrayList, NUM_OPERATIONS);
        long endTime = System.nanoTime();
        System.out.printf("  Время для %d вставок в середину (ArrayList): %.3f мс%n", NUM_OPERATIONS, (endTime - startTime) / 1_000_000.0);

        startTime = System.nanoTime();
        removeMiddle(arrayList, NUM_OPERATIONS);
        endTime = System.nanoTime();
        System.out.printf("  Время для %d удаления из середины (ArrayList): %.3f мс%n", NUM_OPERATIONS, (endTime - startTime) / 1_000_000.0);

        // --- Производительность LinkedList ---
        System.out.println("\nТесты LinkedList:");
        List<Integer> linkedList = new LinkedList<>();
        populateList(linkedList, NUM_ELEMENTS);

        startTime = System.nanoTime();
        insertMiddle(linkedList, NUM_OPERATIONS);
        endTime = System.nanoTime();
        System.out.printf("  Время для %d вставок в середину (LinkedList): %.3f мс%n", NUM_OPERATIONS, (endTime - startTime) / 1_000_000.0);

        startTime = System.nanoTime();
        removeMiddle(linkedList, NUM_OPERATIONS);
        endTime = System.nanoTime();
        System.out.printf("  Время для %d удалений из середины (LinkedList): %.3f мс%n", NUM_OPERATIONS, (endTime - startTime) / 1_000_000.0);
    }

}
