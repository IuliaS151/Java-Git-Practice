package org.example.courseraJavaMasterclass;

import java.util.Scanner;

public class handlingExceptions72 {
    public static void main(String[] args) {
        int year = 2025;

//        System.out.println(getInputFromConsole(year));

        try {
            System.out.println(getInputFromConsole(year));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(year));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, what's your Name?");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static  String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, what's your Name?");
        System.out.println("Hi, what's your Name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

//        String dateOfBirth = System.console().readLine("What year were you born?");
        System.out.println("What year were you born?");
        String dateOfBirth = scanner.nextLine();

        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
}
