package org.example.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        // Создание LinkedList
        LinkedList<String> names = new LinkedList<>();

        // Добавление элементов (как List)
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Initial list: " + names);

        // ДОбавление в начало и в конец (как Deque)
        names.addFirst("David");
        names.addLast("Eve");
        System.out.println("After addFirst/addLast: " + names);

        // Получние первого и последнего элемента
        System.out.println("First element: " + names.getFirst());
        System.out.println("Last element: " + names.getLast());

        // Удаление первого и последнего элемента
        String removedFirst = names.removeFirst();
        String removedLast = names.removeLast();
        System.out.println("Removed first: " + removedFirst + ", Removed last: " + removedLast);
        System.out.println("After removing first/last: " + names);

        // Использование как стек (LIFO)
        System.out.println("\n--- Using as a Stack (LIFO) ---");
        names.push("Frank");
        System.out.println("After push 'Frank': " + names);
        String popped = names.pop();
        System.out.println("Popped: " + popped); // Frank
        System.out.println("After pop: " + names); // [Alice, Bob, Charlie]

        // Использование как очереди (FIFO)
        System.out.println("\n--- Using as a Queue (FIFO) ---");
        names.offer("Grace"); // Добавляем в конец очереди
        System.out.println("After offer 'Grace': " + names); // [Alice, Bob, Charlie, Grace]
        String polled = names.poll(); // Удаляем из начала очереди
        System.out.println("Polled: " + polled); // Alice
        System.out.println("After poll: " + names); // [Bob, Charlie, Grace]

        // 8. Доступ по индексу (менее эффективный)
        System.out.println("Element at index 1: " + names.get(1)); // Charlie (будет пройден от начала или конца)

        // 9. Очистка
        names.clear();
        System.out.println("List after clear: " + names); // []

    }
}
