package org.example.SetExamples;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // 1. Создание TreeSet с использованием естественного порядка
        TreeSet<String> names = new TreeSet<>();
        names.add("Alice");
        names.add("Eva");
        names.add("Bob");
        names.add("Fred");
        names.add("David");

        System.out.println("Имена в отсортированном порядке (естественный): " + names);

        // 2. Добавление дубликата - не добавится, так как это Set
        boolean addedDuplicate = names.add("Bob");
        System.out.println("Попытка добавить 'Bob' еще раз: " + addedDuplicate); // false
        System.out.println("Имена после попытки добавить дубликат: " + names);

        // 3. Удаление элемента
        names.remove("Fred");
        System.out.println("Имена после удаления 'Fred': " + names);

        // 4. Проверка наличия элемента
        System.out.println("Содержит ли набор 'Alice'?: " + names.contains("Alice")); // true
        System.out.println("Содержит ли набор 'Charlie'?: " + names.contains("Charlie")); // false

        // 5. Использование итератора
        System.out.println("Итерация по элементам:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 6. Получение первого и последнего элемента
        System.out.println("Первый элемент: " + names.first());
        System.out.println("Последний элемент: " + names.last());

        // 7. Получение подмножества элементов (headSet, tailSet, subSet)
        // headSet(toElement) - возвращает элементы МЕНЬШЕ toElement
        System.out.println("Элементы меньше 'David': " + names.headSet("David")); // [Alice, Bob]

        // tailSet(fromElement) - возвращает элементы БОЛЬШЕ ИЛИ РАВНЫЕ fromElement
        System.out.println("Элементы больше или равные 'Bob': " + names.tailSet("Bob"));

        // subSet(fromElement, toElement) - возвращает элементы БОЛЬШЕ ИЛИ РАВНЫЕ fromElement
        // и МЕНЬШЕ toElement
        System.out.println("Элементы между 'Alice' (включительно) и 'David' (исключительно): " + names.subSet("Alice", "David")); // [Alice, Bob]

        System.out.println("Очистка набора");
        names.clear();
        System.out.println("Набор пуст?: " + names.isEmpty()); // true

        System.out.println("Размер набора: " + names.size()); // 0

        System.out.println("\n--- Использование компаратора ---");

        // 8. Создание TreeSet с пользовательским компаратором (например, для обратного порядка)
        TreeSet<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
        numbers.add(8);
        numbers.add(5);
        numbers.add(90);
        numbers.add(34);
        numbers.add(5);
        numbers.add(21);

        System.out.println("Числа в обратном порядке: " + numbers);

        // Пользовательский компаратор для строк по длине
        TreeSet<String> wordsByLength = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int lengthComparsion = Integer.compare(o1.length(), o2.length());
                if (lengthComparsion != 0){
                    return  lengthComparsion;
                }
                return o1.compareTo(o2);
            }
        });

        wordsByLength.add("apple");
        wordsByLength.add("cat");
        wordsByLength.add("apricot");
        wordsByLength.add("tomato");
        wordsByLength.add("kiwi");
        wordsByLength.add("tea");
        wordsByLength.add("phone");
        wordsByLength.add("java");

        System.out.println("Слова, отсортированные по длине, затем лексикографически: " + wordsByLength);
    }
}
