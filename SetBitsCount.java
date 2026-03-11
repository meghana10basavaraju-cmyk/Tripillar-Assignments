package module8;

public class SetBitsCount {
    public static void main(String[] args) {

        int num = 13;   // Binary of 13 is 1101
        int count = 0;

        while (num > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num = num / 2;
        }

        System.out.println("Number of set bits: " + count);
    }
}
