package org.example.oop.zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooSimulator {
        public static void main(String[] args) {
            System.out.println(Mammal.CLASS_NAME);

            Dog myDog = new Dog("Buddy", "Golden Retriever");
            /*myDog.eat();
            myDog.bark();
            myDog.sleep();
            System.out.println(myDog.getBreed());*/
            Puppy archiePuppy = new Puppy("Archie", "Labrador Retriever", "comfort blanket");
            /*archiePuppy.play();
            archiePuppy.sleep();
            System.out.println(archiePuppy.getToy());*/
            Cat lunaCat = new Cat("Luna", "black");
            /*lunaCat.meow();
            lunaCat.eat();
            System.out.println(lunaCat.getColor());*/

            List<Mammal> mammalsInZoo = new ArrayList<>();
            mammalsInZoo.add(myDog);
            mammalsInZoo.add(archiePuppy);
            mammalsInZoo.add(lunaCat);

            for (Mammal mammal : mammalsInZoo) {
                System.out.println("----------");
                String mammalName = ((Animal) mammal).getName();
                System.out.println("Млекопитающее: " + mammalName);
            }
            Animal genericAnimal = new Animal("Lion");
            genericAnimal.eat();
            genericAnimal.sleep();
        }
}

