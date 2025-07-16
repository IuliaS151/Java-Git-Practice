package org.example.homework.task5;

public class StringProcessor {
    public static String processString(String originalString) {
        String noCommas = originalString.replace(",", "").replace(".", "")
                .replace("(", "").replace(")", "")
                .replace("{", "").replace("}", "");
        String noNewLines = noCommas.replace("\n", " ").replace("\r", " ");
        String lowerCaseString = noNewLines.toLowerCase();
        return lowerCaseString;
    }

}
