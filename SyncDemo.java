package module5;
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class MyRunnable implements Runnable {
    Counter c;

    MyRunnable(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class SyncDemo {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        MyRunnable r = new MyRunnable(c);

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + c.count);
    }
}



