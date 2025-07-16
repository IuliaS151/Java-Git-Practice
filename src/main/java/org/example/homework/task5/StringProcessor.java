package org.example.homework.task5;

public class StringProcessor {
    public static String prcessString(String originalString) {
        String noCommas = originalString.replace(",", "").replace(", ", "");
        String noNewLines = noCommas.replace("\n", "").replace("\r", "");
        String lowerCaseString = noNewLines.toLowerCase();
        return lowerCaseString;
    }

}
