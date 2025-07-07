package org.example.ListExamples;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeExample {
    public static void main(String[] args) {
        Deque<String> commandHistory = new LinkedList<>();

        System.out.println("Операции с историей команд (Deque):");

        // Добавляем команды в конец (например, история команд, которая накапливается)
        commandHistory.addLast("ls -l");
        commandHistory.addLast("cd src");
        commandHistory.addLast("git status");

        System.out.println("Исходная история: " + commandHistory);

        // Добавляем высокоприоритетную команду в начало (например, команду "отменить")
        commandHistory.addFirst("отменить последнее действие");
        System.out.println("История после добавления в начало: " + commandHistory);

        // Получаем первую команду (просто смотрим, не удаляя)
        System.out.println("Следующая команда к выполнению (первая): " + commandHistory.peekFirst());

        // Получаем последнюю команду (просто смотрим на самую последнюю)
        System.out.println("Самая последняя команда (последняя): " + commandHistory.peekLast());

        // Выполняем первую команду (удаляем из начала)
        String executedCommand = commandHistory.removeFirst();
        System.out.println("Выполняем команду: " + executedCommand);
        System.out.println("История после выполнения первой: " + commandHistory);

        // Удаляем самую последнюю команду (например, если она была отменена)
        String rollerBackCommand = commandHistory.removeLast();
        System.out.println("Откатываем команду: " + rollerBackCommand);
        System.out.println("История после отката последней: " + commandHistory);

        // Опрашиваем (удаляем первую) до тех пор, пока список не опустеет
        System.out.println("\nОбработка отсавшихся команд: ");
        while (!commandHistory.isEmpty()) {
            System.out.println(" Обрабатываем: " + commandHistory.pollFirst());
        }
        System.out.println("Финальная история: " + commandHistory);
    }
}
