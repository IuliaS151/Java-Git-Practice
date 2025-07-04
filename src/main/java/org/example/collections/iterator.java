package org.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        Collection<String> myCollection = new ArrayList<>();
        myCollection.add("Apple");
        myCollection.add("Banana");
        myCollection.add("Orange");
        myCollection.add("Pineapple");
        myCollection.add("Grapes");
        myCollection.add("Watermelon");

        Iterator<String> iterator = myCollection.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("Grapes")){
                iterator.remove();
            }
        }
        System.out.println(myCollection);
    }
}
