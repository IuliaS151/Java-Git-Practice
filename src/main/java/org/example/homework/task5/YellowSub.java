package org.example.homework.task5;


import java.lang.reflect.Array;

public class YellowSub {
    public static void main(String[] args) {
       String songText = "In the town where I was born\n" +
               "Lived a man who sailed to sea\n" +
               "And he told us of his life\n" +
               "In the land of submarines\n" +
               "So we sailed on to the sun\n" +
               "Till we found a sea of green\n" +
               "And we lived beneath the waves\n" +
               "In our yellow submarine\n" +
               "We all live in a yellow submarine\n" +
               "Yellow submarine, yellow submarine\n" +
               "We all live in a yellow submarine\n" +
               "Yellow submarine, yellow submarine\n" +
               "And our friends are all aboard\n" +
               "Many more of them live next door\n" +
               "And the band begins to play\n" +
               "We all live in a yellow submarine\n" +
               "Yellow submarine, yellow submarine\n" +
               "We all live in a yellow submarine\n" +
               "Yellow submarine, yellow submarine\n" +
               "{Full speed ahead Mr. Boatswain, full speed ahead\n" +
               "Full speed ahead it is, Sgt.\n" +
               "Cut the cable, drop the cable\n" +
               "Aye, aye, Sir, aye, aye Captain, captain}\n" +
               "As we live a life of ease\n" +
               "Every one of us has all we need\n" +
               "(One of us, has all we need)\n" +
               "Sky of blue and sea of green\n" +
               "(Sky of blue, sea of green)\n" +
               "In our yellow submarine\n" +
               "(In our yellow, submarine, aha)\n" +
               "We all live in a yellow submarine\n" +
               "A yellow submarine, yellow submarine\n" +
               "We all live in a yellow submarine\n" +
               "A yellow submarine, yellow submarine\n" +
               "We all live in a yellow submarine\n" +
               "Yellow submarine, yellow submarine\n" +
               "We all live in a yellow submarine\n" +
               "Yellow submarine, yellow submarine";

       System.out.println("Initial: " + songText);
       String processedText = StringProcessor.prcessString(songText);
       System.out.println("Processed:" + processedText);

       String[]  arrayOfWords = processedText.split(" ");
       for (String word: arrayOfWords) {
           System.out.println(word);
       }

    }


}

