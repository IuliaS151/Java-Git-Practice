package org.example.MapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class CorrectCustomKey {
    String name;
    int id;

    public CorrectCustomKey(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        CorrectCustomKey that = (CorrectCustomKey) o;
        return (id == that.id) && (Objects.equals(name, that.name));
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "CorrectCustomKey{" + "name='" + name + '\''  + ", id=" + id + "}";
    }
}

public class CorrectHashMapUsage {
    public static  void main(String[] args) {
        Map<CorrectCustomKey, String> myMap = new HashMap<>();

        CorrectCustomKey key1 = new CorrectCustomKey("ItemA", 1);
        CorrectCustomKey key2 = new CorrectCustomKey("ItemA", 1);

        myMap.put(key1, "Value1");
        System.out.println("myMap: " + myMap);

        System.out.println("Значение для key2: " + myMap.get(key2));
        System.out.println("myMap.containsKey(key2): " + myMap.containsKey(key2));

        // Если мы добавим key2, он перезапишет старое значение
        myMap.put(key2, "Value2");
        System.out.println("myMap после добавления key2: " + myMap); // {CorrectCustomKey{name='ItemA', id=1}=Value2}
        System.out.println("Размер myMap: " + myMap.size()); // 1 - ПРАВИЛЬНО!
    }
}
