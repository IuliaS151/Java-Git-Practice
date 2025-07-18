package org.example.homework.task5;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SongReader {
    public static  String readSongFromFile(String fileName) {
        StringBuilder songBuilder = new StringBuilder();

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e ){
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
        return songBuilder.toString();
    }

    public  static boolean isFoundLine (String line, String text) {

        boolean isFound = false;

        if (text.contains(line)){
            isFound = true;
        }
        return isFound;
    }
}
