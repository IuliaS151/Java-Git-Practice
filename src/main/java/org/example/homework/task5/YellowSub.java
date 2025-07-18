package org.example.homework.task5;


import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

import static org.example.homework.task5.SongReader.readSongFromFile;
import static org.example.homework.task5.SongReader.isFoundLine;

public class YellowSub {
    public static void main(String[] args) {
       // 2. Save this song as String
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

       // 3. Remove all "","" , ""\n "" and convert all words to lowercase
       String processedText = StringProcessor.processString(songText);

       // 4. Make an array[] (not a List) from the string (array of words)
       String[]  arrayOfWords = processedText.split(" ");
       for (String word: arrayOfWords) {
           System.out.println(word);
       }

       System.out.println("How many words and its counts -------------------------------");
       String[] uniqueWords = new String[arrayOfWords.length];
       int[] counts = new int[arrayOfWords.length];
       int uniqueCount = 0;

       for (String word: arrayOfWords) {
           boolean found = false;

           for (int i = 0; i < uniqueCount; i++){
                if (uniqueWords[i].equals(word)) {
                    counts[i]++;
                    found = true;
                    break;
                }
           }
           if (!found) {
                    uniqueWords[uniqueCount] = word;
                    counts[uniqueCount] = 1;
                    uniqueCount++;
           }
       }
       // 5. Print to consol word and how many times it appeared in the array
       for (int i = 0; i < uniqueCount; i++) {
           System.out.println("Word: '" + uniqueWords[i] + "', Count: " + counts[i]);
        }

        // Part 2
        // 1. Put song from array to List
        List<String> songList = Arrays.asList(arrayOfWords);
        System.out.println(songList);

        // 2. Remove all duplicate words from the song and print to console
       Set<String> uniqueSongWords = new HashSet<>(songList);
       System.out.println("\nWithout duplicates");
       System.out.println(uniqueSongWords);

       //3. Sort song words by String length
       List<String> uniqueSongWordsList = new ArrayList<>(uniqueSongWords);
       uniqueSongWordsList.sort(Comparator.comparing(String::length));
       System.out.println("\nSorted list of words by String length");
       System.out.println(uniqueSongWordsList);

       // Part 3
       // 1. Take List<String> of song from task1
       List<String> songListNew = new ArrayList<>(Arrays.asList(arrayOfWords));
       List<String> songListNew2 = Arrays.asList(arrayOfWords);
       //songListNew2.forEach(i -> songList.));

       // 2. Remove all world ""yellow"" and ""submarine""
       songListNew.removeIf(word -> word.equals("yellow") || word.equals("submarine"));
       System.out.println("\nArray of text without  'submarine' and 'yellow'");
       System.out.println(songListNew);

       // Part 4
       // 1. Save song ""beatles yellow submarine"" to txt file

       /*try {
           Scanner ysTextFromFile = new Scanner("Yellow-Sub.txt");
       } catch (FileNotFoundException e) {
           System.err.println("");
       }*/
        // 2. Read song from file (serialization, use a try with resources)
        System.out.println("Reading text from file: \n ");
        String songContent = readSongFromFile("Yellow-Sub.txt");
        System.out.println(songContent);

        String line = "So we sailed on to the sun,";

        try {
            Scanner ysTextFromFile = new Scanner(new File("Yellow-Sub.txt"));
            boolean isFound = isFoundLine(line, ysTextFromFile.toString());
            if (isFound) {
                throw new BeatlesException("The line: '" + line + "' is found");
            }
        } catch (BeatlesException | FileNotFoundException e){
            System.out.println(e);
        }
    }

}

