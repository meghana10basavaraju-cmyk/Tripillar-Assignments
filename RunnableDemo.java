package module5;
class MyTeam implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        MyTeam obj = new MyTeam();
        Thread t = new Thread(obj);
        t.start();
    }
}
