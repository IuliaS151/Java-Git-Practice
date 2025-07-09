package org.example.MapExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapInsertionOrderExample {
    public static  void main(String[] args) {
        // Создание LinkedHashMap с дефолтным порядком вставки
        Map<String, String> userActions = new LinkedHashMap<>();

        // Добавляем элементы
        userActions.put("UserA", "Login");
        userActions.put("UserB", "View Profile");
        userActions.put("UserC", "Edit Settings");
        userActions.put("UserD", "Logout");

        System.out.println("Действия пользователей (порядок вставки): ");
        // Итерация будет в порядке добавления
        for (Map.Entry<String, String> entry : userActions.entrySet()) {
            System.out.println(entry.getKey() + " -> " +entry.getValue());
        }

        // Обновление сущетвующего ключа не меняет его позицию в порядке вставки
        userActions.put("UserB", "Update Profile");
        System.out.println("\nПосле обновления UserB:");
        for (Map.Entry<String, String> entry : userActions.entrySet()) {
            System.out.println(entry.getKey() + " -> " +entry.getValue());
        }

        // Добавление null ключа и значения
        userActions.put(null, "Admin Action");
        userActions.put("UserE", null);
        System.out.println("\nС null ключом и значением:");
        for (Map.Entry<String, String> entry : userActions.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
