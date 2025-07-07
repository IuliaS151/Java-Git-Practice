package org.example.SetExamples;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueWordsExtractor {
    public static void main(String[] args) {
        String text = "Java — это объектно-ориентированный язык программирования. Java широко используется для разработки корпоративных приложений, мобильных приложений (Android) и веб-приложений. Это очень популярный язык.";

        // Регулярное выражение для извлечения слов (буквы, цифры, без пунктуации)
        // \b - граница слова, \w+ - одно или более буквенно-цифровых символов
        Pattern pattern = Pattern.compile("\\b[\\p{L}0-9]+\\b");
        Matcher matcher = pattern.matcher(text.toLowerCase());

        Set<String> uniqueWords = new HashSet<>();

        while(matcher.find()) {
            uniqueWords.add(matcher.group());
        }

        System.out.println("Исходный текст:");
        System.out.println(text);

        System.out.println("\nУникальные слова (HashSet):");
        int count = 0;
        for (String word : uniqueWords) {
            System.out.println(word + (count % 5 == 4 ? "\n" : " "));
            count++;
        }

        System.out.println("\nВсего уникальных слов: " + uniqueWords.size());
    }
}
