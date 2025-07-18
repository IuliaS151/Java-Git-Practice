package org.example.courseraJavaMasterclass;

import org.example.homework.task5.SongReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.example.homework.task5.SongReader.readSongFromFile;

public class readFile {
    public static void main(String[] args) {


        int a  = 10;
        int b = 0;


        try (Scanner ysTextFromFile = new Scanner(new File("Yellow-Sub.txt"))) {
            while (ysTextFromFile.hasNextLine()) {
                String line = ysTextFromFile.next();
                System.out.println(line);
                if (line.equals("yellow")) {
                    BeatlesException me = new BeatlesException("Aha");
                    throw  me;
                }
            }

       } catch (BeatlesException | FileNotFoundException e) {
           System.err.println(e.getMessage());
       }
    }


    static class BeatlesException extends Exception {
        public BeatlesException(String message){ super("Beatles" + message); }
    }
}
