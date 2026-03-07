package module4;
 interface FaceInter {
     void start();
 }

class Car implements FaceInter {
    public void start() {
        System.out.println("Car is starting");
    }
}

public class FaceInterDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }

}
