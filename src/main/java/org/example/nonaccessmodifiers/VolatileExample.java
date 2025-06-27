package org.example.nonaccessmodifiers;

class SharedFlag {
    private volatile  boolean flag = false;

    public void setFlag() {
        flag = true;
        System.out.println("Flag set to true by " + Thread.currentThread().getName());
    }

    public void waitForFlag() {
        System.out.println(Thread.currentThread().getName() + " is waiting for flag...");
        while (!flag) {
            // Busy-wait loop, но изменения flag будут видны стразу
        }
        System.out.println(Thread.currentThread().getName() + " detected flag is true!");
    }
}

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        SharedFlag sharedFlag = new SharedFlag();

        Thread writerThread = new Thread(sharedFlag::setFlag, "Writer");
        Thread readerThread = new Thread(sharedFlag::waitForFlag, "Reader");

        readerThread.start();
        Thread.sleep(100);
        writerThread.start();

        readerThread.join();
    }
}
