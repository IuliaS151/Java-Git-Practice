package org.example.MapExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapLRUCacheExample {

    // Простой LRU-кеш
    private static class LRUCache<K, V> extends LinkedHashMap<K, V> {
        private  final  int capacity;

        public LRUCache(int capacity) {
            super(capacity, 0.7f, true);
            this.capacity = capacity;
        }

        // Этот метод вызывается LinkedHashMap при добавлении новой записи
        // или после доступа к записи, чтобы определить, нужно ли удалить старейшую запись.
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > capacity;
        }
    }

    private static void printCache(Map<Integer, String> cache) {
        System.out.print("Кеш: [");
        boolean first = true;
        for (Map.Entry<Integer, String> entry : cache.entrySet()) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print("(" + entry.getKey() + "," + entry.getValue() + ")");
            first = false;
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        System.out.println("Добавляем элементы:");
        cache.put(1, "Value A");
        cache.put(2, "Value B");
        cache.put(3, "Value C");
        printCache(cache);

        System.out.println("\nДоступ к 1 (делает его самым новым):");
        cache.get(1);
        printCache(cache);

        System.out.println("\nДобавляем 4 (вытесняет 2 - самый старый):");
        cache.put(4, "Value D");
        printCache(cache);

        System.out.println("\nДобавляем 5 (вытесняет 3 - самый старый):");
        cache.put(5, "Value E");
        printCache(cache);

        System.out.println("\nДоступ к 4:");
        cache.get(4);
        printCache(cache);

        System.out.println("\nДобавляем 6 (вытесняет 1):");
        cache.put(6, "Value F");
        printCache(cache);
    }
}
