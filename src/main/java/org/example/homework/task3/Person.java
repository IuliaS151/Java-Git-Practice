package org.example.homework.task3;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public String getName(){
        return name;
    }

    public  int getAge() {
        return age;
    }
}
