package org.example.homework.task5;
// 3. Define a custom exception : BeatlesException extending Exception, add a ""Beatles"" to a caught exception message
public class BeatlesException extends Exception{

    public BeatlesException() { System.out.println("Beatles ");}

    public BeatlesException(String message) {
        super("Beatles " + message);
    }
}
