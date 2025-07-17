package org.example.ybExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arrayListEx {
    public static void main(String[] args){
        LinkedList<Person> listOfPersons= new LinkedList<>();

        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");

        listOfPersons.add(person1);
        listOfPersons.add(person2);

        boolean removed = listOfPersons.remove(person1);
        Person person = listOfPersons.get(0);
        System.out.println(person);

        System.out.println(removed);
    }

}
