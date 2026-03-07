package module5;
class ThreadLife extends Thread {

    public void run() {
        System.out.println("Thread is running");

        try {
            Thread.sleep(1000);   // thread goes to waiting state
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread execution finished");
    }
}

public class LifeCycleDemo {
    public static void main(String[] args) {

        ThreadLife t1 = new ThreadLife();

        System.out.println("State after creation: " + t1.getState());

        t1.start();
        System.out.println("State after start: " + t1.getState());

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("State after completion: " + t1.getState());
    }
}