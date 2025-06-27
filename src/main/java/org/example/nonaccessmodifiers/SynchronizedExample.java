package org.example.nonaccessmodifiers;

class CounterS {
    private int count = 0;

    // Только один поток может выполнить этот метод одновременно на одном объекте Counter
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " increment to: " + count);
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        CounterS counter = new CounterS();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
