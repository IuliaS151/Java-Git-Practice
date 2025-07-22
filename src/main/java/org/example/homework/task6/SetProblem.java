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
            if (o == null || getClass() != o.getClass()) return false;
            User that = (User) o;
            return age == that.age && Objects.equals(name, that.name);
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

    public static void addUser(Set<User> users, User user) {

        if (users.contains(user)){  return; }

        if (users.size() >= 3) {
            Iterator<User> it = users.iterator();
            if (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        users.add(user);
    }

    public static void main(String[] args) {

        Set<User> users = new LinkedHashSet<>();
        addUser(users, new User("Max", 27));
        addUser(users, new User("Veronika", 20));
        addUser(users, new User("Denis", 30));
        addUser(users, new User("Max", 27));
        addUser(users, new User("Maria", 18));


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