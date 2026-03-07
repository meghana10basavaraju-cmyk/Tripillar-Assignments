package module4;
final class Vehicle {
    void show() {
        System.out.println("Vehicle class is final");
    }
}


public class FinalClassDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.show();
    }
}
