package module4;

public class StaticDemo {
    static int count = 0;

    static void display() {
        System.out.println("Count value: " + count);
    }

    public static void main(String[] args) {
        StaticDemo.count = 50;
        StaticDemo.display();
    }
}
