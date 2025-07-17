package org.example.ybExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(123689, "Onnie Cha");
        map1.put(457893, "Maine Hodi");
        map1.put(198863, "Luik Herve");
        map1.put(209874, "Sivon Roy");
        map1.put(309876, "Garrin Maay");
        map1.put(409857, "Sauri Koi");

        //Map<Student, Double> mapOfStudents = new HashMap<>();

        Student st1 = new Student("Onnie", "Cha", 3);
        Student st2 = new Student("Maine", "Hodi", 2);
        Student st3 = new Student("Luik", "Herve", 1);
        Student st4 = new Student("Sivon", "Roy", 2);
        Student st5 = new Student("Sauri", "Koi", 4);
        Student st6 = new Student("Sauri", "Koi", 3);
        Student st7 = new Student("Mona", "Rubyu", 2);
        Student st8 = new Student("Mona", "Rubyu", 1);

        /*mapOfStudents.put(st1, 6.8);
        mapOfStudents.put(st2, 8.9);
        mapOfStudents.put(st3, 8.8);
        mapOfStudents.put(st4, 7.7);
        mapOfStudents.put(st5, 6.0);
        mapOfStudents.put(st6, 5.7);
        mapOfStudents.put(st7, 8.0);

        System.out.println(mapOfStudents);
        System.out.println(st6.hashCode());
        System.out.println(st5.hashCode());

        for (Map.Entry<Student, Double> entry: mapOfStudents.entrySet()) {
            System.out.println(entry.getKey() + ":" +entry.getValue());
        }*/

        TreeMap<Student, Double> treeMap = new TreeMap<>();

        treeMap.put(st1, 2.5);
        treeMap.put(st5, 9.9);
        treeMap.put(st7, 6.7);
        treeMap.put(st4, 8.0);
        treeMap.put(st2, 7.9);
        treeMap.put(st3, 5.5);
        treeMap.put(st6, 8.7);
        treeMap.put(st8, 3.2);

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        //System.out.println(treeMap.tailMap("A"));

    }
}

final class Student implements Comparable<Student>{
    final private String name;
    final private String surname;
    final private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
