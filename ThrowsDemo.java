package module5;

public class ThrowsDemo {
    static void checkNumber(int num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException("Number cannot be negative");
        } else {
            System.out.println("Number is: " + num);
        }
    }

    public static void main(String[] args) {
        checkNumber(-5);
    }
}
