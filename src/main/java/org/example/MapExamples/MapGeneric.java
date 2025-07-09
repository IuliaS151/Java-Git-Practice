package org.example.MapExamples;

import java.util.HashMap;
import java.util.Map;

public class MapGeneric {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(100,"Apple");
        map.put(200,"Apricot");
        map.put(199,"Tomato");
        map.put(37,"Potato");
        for(Map.Entry m: map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
