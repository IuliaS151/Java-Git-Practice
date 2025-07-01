package org.example.homework.task3;

public class MakingChanges {

    public static void changeIdentities(Person p1, Person p2) {
        Person temp = new Person(p1.getName(), p1.getAge());
        p1.setName(p2.getName());
        p1.setAge(p2.getAge());

        p2.setName(temp.getName());
        p2.setAge(temp.getAge());
    }

   public static void main(String [] args) {
        Person person1 = new Person("Ana", 27);
        Person person2 = new Person("Max", 30);

        System.out.println("First person info: Name: '" + person1.getName() + "', age: " + person1.getAge());
        System.out.println("Second person info: Name '" + person2.getName() + "', age: " + person2.getAge());

        System.out.println("Change identities ---------------------");
        changeIdentities(person1, person2);

        System.out.println("First person info: Name: '" + person1.getName() + "', age: " + person1.getAge());
        System.out.println("Second person info: Name '" + person2.getName() + "', age: " + person2.getAge());
    }
}
