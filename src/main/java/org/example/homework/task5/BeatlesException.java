package org.example.homework.task5;

public class BeatlesException extends  Exception{

    public BeatlesException(String message) {
        super("Beatles " + message);
    }
}
