package module4;

public class StringImmutableDemo {
    public static void main(String[] args) {
        String s = "Good";

        System.out.println("Original String: " + s);

        s.concat(" Morning");   // Trying to change the string

        System.out.println("After concat: " + s);

        s = s.concat(" Morning");  // Creating a new object

        System.out.println("New String: " + s);
    }
}
