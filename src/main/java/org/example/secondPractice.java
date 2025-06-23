package org.example;

import java.lang.*;
import java.nio.CharBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.example.TextProcessor.containsDigit;


// Compute distance light travels using long variables.
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

        /*/ Declare String without using new operator - String literal
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

        StringBuilder str = new StringBuilder();
        str.append("GFG");
    }
}
