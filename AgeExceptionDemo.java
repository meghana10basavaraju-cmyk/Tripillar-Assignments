package module5;

public class AgeExceptionDemo {
    public static void main(String[] args) {
        int age = 16;

        if (age < 18) {
            throw new ArithmeticException("Age is less than 18, not allowed");
        } else {
            System.out.println("Access granted");
        }
    }
}
