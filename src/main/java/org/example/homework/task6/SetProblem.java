package org.example.homework.task6;

import java.util.*;

public class SetProblem {
    static class User {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {   return name;    }

        public void setName(String name) {  this.name = name;   }

        public int getAge() {   return age; }

        public void setAge(int age) {   this.age = age; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }



    public static void main(String[] args) {

        Set<User> users = new HashSet<>();
        users.add(new User("Max", 27));
        users.add(new User("Veronika", 20));
        users.add(new User("Denis", 30));
        users.add(new User("Max", 27));
        //users.add(new User("Maria", 18));


        if (users.size() == 3) {

            System.out.println("System works well!");
            for (User u : users) {
                System.out.println(u);
            }

        } else {

            throw new RuntimeException("Users set size should be 3!");
        }
    }
}