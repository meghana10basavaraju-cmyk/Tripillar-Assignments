package module4;

public class StringBuilderConcat {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" ");
        sb.append("World");

        System.out.println("Concatenated String: " + sb);
    }
}
