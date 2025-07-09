package org.example.MapExamples;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // 1. Создание TreeMap с использованием естественного порядка для ключей (Integer)
        TreeMap<Integer, String> studentScores = new TreeMap<>();

        studentScores.put(85, "Alice");
        studentScores.put(92, "Bob");
        studentScores.put(78, "Charlie");
        studentScores.put(92, "David"); // Ключ 92 уже есть, Bob будет заменен на David
        studentScores.put(65, "Eve");
        studentScores.put(81, "Sarah");
        studentScores.put(85, "Cristian");
        studentScores.put(87, "Amber");
        studentScores.put(79, "Mave");

        System.out.println("Оценки студентов (отсортировано по оценке): " + studentScores);

        // Попытка добавить null ключ - вызовет NullPointerException
        //studentScores.put(null, "Frank");

        // null - значение разрешено
        studentScores.put(100, null);
        System.out.println("После добавления 100 с null: " + studentScores);

        // 2. Использование методов SortedMap
        System.out.println("\n--- Методы SortedMap ---");
        System.out.println("Самая низкая оценка: " + studentScores.firstKey());
        System.out.println("Сама выокая оценка: " + studentScores.lastKey());
        System.out.println("Студент с самой низкой оценкой: " + studentScores.firstEntry().getValue());
        System.out.println("Студент с самой высокой оценкой: " + studentScores.lastEntry().getValue());

        System.out.println("Оценки ниже 80: " + studentScores.headMap(80));
        System.out.println("Оценки 85 и выше: " + studentScores.tailMap(85));
        System.out.println("Оценки от 70 (вкл) и до 90 (искл): " + studentScores.subMap(70, 90));

        System.out.println("Компаратор, используемый: " + studentScores.comparator());

        // 3. Использование методов NavigableMap
        System.out.println("\n--- Методы NavigableMap ---");
        System.out.println("Ключ, строго меньше 85: " + studentScores.lowerKey(85)); // 78
        System.out.println("Ключ, меньше или равный 85: " + studentScores.floorKey(85)); // 85
        System.out.println("Ключ, строго больше 85: " + studentScores.higherKey(85)); // 92
        System.out.println("Ключ, больше или равный 85: " + studentScores.ceilingKey(85)); // 85

        System.out.println("Удаление и получение наименьшей записи: " + studentScores.pollFirstEntry()); // 65=Eve
        System.out.println("Карта после pollFirstEntry: " + studentScores); // {78=Charlie, 85=Alice, 92=David, 100=null}

        System.out.println("Удаление и получение наибольшей записи: " + studentScores.pollLastEntry()); // 100=null
        System.out.println("Карта после pollLastEntry: " + studentScores); // {78=Charlie, 85=Alice, 92=David}

        // Итерация в обратном порядке ключей
        System.out.println("\nИтерация по ключам в обратном порядке:");
        for (Integer score : studentScores.descendingKeySet()) {
            System.out.println("Оценка: " + score + ", Студент: " + studentScores.get(score));
        }

        // 4. Создание TreeMap с пользовательским компаратором (например, для строк по длине)
        TreeMap<String, Integer> wordsByLength = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // Сначала сравниваем по длине
                int lenghtComparsion = Integer.compare(o1.length(), o2.length());
                if (lenghtComparsion != 0) {
                    return lenghtComparsion;
                }
                return o1.compareTo(o2);
            }
        });

        wordsByLength.put("apple", 5);
        wordsByLength.put("kiwi", 4);
        wordsByLength.put("banana", 6);
        wordsByLength.put("cat", 3);
        wordsByLength.put("dog", 3);
        wordsByLength.put("apricot", 7);
        System.out.println("\nСлова, отсортированные по длине, затем лексикографически:");
        System.out.println(wordsByLength);
    }
}
