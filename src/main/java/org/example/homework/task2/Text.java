package org.example.homework.task2;

class Text {

    public String toReverse(String sentence) {
        StringBuffer reversedBuffer = new StringBuffer(sentence);
        reversedBuffer.reverse();
        String reversedString = reversedBuffer.toString();
        return reversedString;
    }

    public String toReverse2(String sentence) {
        String[] elements = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = elements.length - 1; i >= 0; i--) {
            StringBuilder reversedWord = new StringBuilder(elements[i]);
            reversedWord.reverse();
            reversedSentence = reversedSentence.append(reversedWord);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }

    public String toReverse3(String sentence) {
        String[] elements = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = elements.length - 1; i >= 0; i--) {
            String originalWord = elements[i];
            StringBuilder reversedWord = new StringBuilder();

            for (int j = originalWord.length() - 1; j >= 0; j--) {
                reversedWord.append(originalWord.charAt(j));
            }
            reversedSentence.append(reversedWord);
            if (i > 0){
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }

    public String toReverse4(String sentence) {
        String reversedSentence = "";
        for (int i = sentence.length() - 1; i >= 0; i--){
            reversedSentence += sentence.charAt(i);
        }
        return reversedSentence;
    }
}