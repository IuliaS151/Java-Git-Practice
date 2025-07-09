package org.example.MapExamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // Создание HashMap
        Map<String,Integer> studentGrades = new HashMap<>();

        // 1. put(key, value)
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 88);
        studentGrades.put("Charlie", 72);
        studentGrades.put("David", 95);
        studentGrades.put("Eve", null);

        System.out.println("Оценки студентов: " + studentGrades);

        studentGrades.put(null, 100);
        System.out.println("Оценки студентов с null ключом:" + studentGrades);

        Integer oldGrade = studentGrades.put("Alice", 98);
        System.out.println("Старая оценка Алисы: " + oldGrade);
        System.out.println("Новая оценка Алисы: " + studentGrades.get("Alice"));
        System.out.println("Оценки студентов после обновления Алисы: " + studentGrades);

        // 2. get(key) - Получение значения
        System.out.println("Оценка Боба: " + studentGrades.get("Bob"));
        System.out.println("Оценка несуществующего студента (Franck): " + studentGrades.get("Fred"));
        System.out.println("Оценка по null ключу: " + studentGrades.get(null));
        System.out.println("Оценка Eve: " + studentGrades.get("Eve"));

        // 3. containsKey() и containsValue()
        System.out.println("Есть ли оценка у Чарли?: " + studentGrades.containsKey("Charlie"));
        System.out.println("Есть ли студент с оценкой 72?: " + studentGrades.containsValue(72));
        System.out.println("Есть ли сутдент с оценкой 90?: " + studentGrades.containsValue(90));

        // 4. remove(key) - Удаление элемента
        Integer removedGrade = studentGrades.remove("Charlie");
        System.out.println("Удаленная оценка Чарли: " + removedGrade);
        System.out.println("Оценки студентов после удаления Чарли: " + studentGrades);
        System.out.println("Попытка удалить несуществующий ключ: " + studentGrades.remove("Grace"));

        // 5. Итерация по HashMap
        // a) Через keySet()
        System.out.println("\nИтерация по ключам: ");
        Set<String> studentNames = studentGrades.keySet();
        for (String name : studentNames) {
            System.out.println("Студент: " + name + ", Оценка: " + studentGrades.get(name));
        }

        // b) Через values()
        System.out.println("\nИтерация по значениям:");
        Collection<Integer> grades = studentGrades.values();
        for (Integer grade : grades) {
            System.out.println("Оценка: " + grade);
        }

        // c) Через entrySet() - наиболее эффективный способ
        System.out.println("\nИтерация по парам 'ключ-значение' (entrySet):");
        Set<Map.Entry<String,Integer>> entries = studentGrades.entrySet();
        for (Map.Entry<String,Integer> entry : entries) {
            System.out.println("Студент: " + entry.getKey() + ", Оценка: " + entry.getValue());
        }

        // 6. Размер и очистка
        System.out.println("\nРазмер HashMap: " + studentGrades.size());
        studentGrades.clear();
        System.out.println("Размер HashMap после очистки: " + studentGrades.size());
        System.out.println("HashMap пуста? " + studentGrades.isEmpty());
    }
}
