package org.example.nonaccessmodifiers;

class Counter {
    static int counter = 0;

    public Counter() {
        counter++;
    }

    public static int getCount() {
        return counter;
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.getCount());
    }
}
