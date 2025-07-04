package org.example.firstPractice;

public class firstPractice {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// Compute distance light travels using long variables.
class Light {
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 *60 *60; //convert to seconds
        distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.print(distance + " miles.");
    }
}

// Compute the area of a circle.
class Area{
    public static void main(String args[]) {
        double pi, r, a;

        r = 10.8;
        pi = 3.1416;

        a = pi * r * r;

        System.out.println("Area of circle is " + a);
    }
}

class TypeCasting {
    public static void main(String args[]) {
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        double myDoubletoInt = 9.78d;
        int myIntfromDouble = (int) myDoubletoInt;

        System.out.println(myDoubletoInt);
        System.out.println(myIntfromDouble);
    }
}