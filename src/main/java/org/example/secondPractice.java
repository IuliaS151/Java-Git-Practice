package org.example;

import java.lang.*;
import java.nio.CharBuffer;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.example.TextProcessor.containsDigit;

class Dog {
    String breed;
    String name;

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    void  bark() {
        System.out.println(name + " barks!");
    }
}

class TextProcessor {
    public static boolean containsDigit(CharSequence text) {
        Pattern pattern = Pattern.compile("\\d"); // Ищем цифру
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}

// Теперь добавим класс-оболочку для main метода,
// так как в Java 8 код должен выполняться из main метода.
public class secondPractice { // Имя файла должно совпадать с именем public класса
    public static void main(String[] args) { // Главный метод, откуда начинается выполнение
        System.out.println("Non-primitive Data types in Java:");
        Dog myDog = new Dog("Golden Retriever", "Buddy"); // Обычный синтаксис конструктора
        myDog.bark();

        /* Declare String without using new operator - String literal
        String s = "GeeksforGeeks";

        // Prints the String
        System.out.println("String s = " + s);

        // Declare String using new operator - Useing new keywoed
        String s1 = new String("GeeksforGeeks");

        // Prints the String
        System.out.println("String s1 = " + s1);

        // Declare String using StringBuffer
        StringBuffer s2 = new StringBuffer("GeeksforGeeks");
         */

        String s = "Hello123World";
        StringBuilder sb = new StringBuilder("NoDigitsHere");
        CharBuffer cb = CharBuffer.wrap("BufferTest456");

        System.out.println(containsDigit(s));  // true
        System.out.println(containsDigit(sb)); // false
        System.out.println(containsDigit(cb)); // true

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        CharBuffer wrappedBuffer = CharBuffer.wrap(charArray);
        System.out.println(wrappedBuffer); // Hello (toString() выводит содержимое)
        System.out.println("-------------------------------------\n");

        StringBuilder str = new StringBuilder();
        str.append("GFG");

        String text = "Hello World Java";
        StringTokenizer tokenizer = new StringTokenizer(text);

        String text2 = "apple,banana;orange.grape";
        StringTokenizer tokenizer2 = new StringTokenizer(text, ",;.");
        // Разделители: ',', ';', '.'
        // Токены: "apple", "banana", "orange", "grape"

        String text3 = "hello;world";
        StringTokenizer tokenizer3 = new StringTokenizer(text, ";", true);
        // Токены: "hello", ";", "world"

        while(tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        System.out.println("-------------------------------------\n");

        StringJoiner sj1 = new StringJoiner(", "); // Разделитель: ", "
        sj1.add("apple");
        sj1.add("banana");
        System.out.println(sj1.toString()); // apple, banana
        System.out.println("-------------------------------------\n");

        StringJoiner sj2 = new StringJoiner(":", "{", "}"); // Разделитель: ":", Префикс: "{", Суффикс: "}"
        // sj2.add("key1");
        // sj2.add("value1");
        // System.out.println(sj2.toString()); // {key1:value1}
    }
}
