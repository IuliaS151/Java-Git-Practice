package org.example.SetExamples;

import java.util.HashSet;
import java.util.Objects;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object anyStudent) {
        if (this == anyStudent) return true;
        if (anyStudent == null || getClass() != anyStudent.getClass()) return false;
        Student student = (Student) anyStudent;
        return (age == student.age) && Objects.equals(name, student.name);
    }

    @Override
    public  int hashCode() {
        return Objects.hash(name, age);
    }
}
public class HashcodeEquals {
    public static void main(String[] args) {
        Student alex1 = new Student("Alex" ,23);
        Student alex2 = new Student("Alex", 23);
        HashSet<Student> students = new HashSet<Student>();

        students.add(alex1);
        students.add(alex2);

        System.out.println("HashSet size = " + students.size());

        System.out.println("HashSet contains Alex = " + students.contains(new Student("Alex", 23)));
    }
}
