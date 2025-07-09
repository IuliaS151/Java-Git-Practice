package org.example.MapExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapNonGeneric {
    public static  void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1, "Ivan");
        map.put(2, "Alex");
        map.put(10, "Sam");
        map.put(6, "Mari");
        map.put(5, "Ana");
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
