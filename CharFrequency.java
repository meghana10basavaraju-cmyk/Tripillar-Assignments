package module8;

public class CharFrequency {
    public static void main(String[] args) {

        String str = "programming";
        int count;

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            count = 1;

            if (ch[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0';
                }
            }

            System.out.println(ch[i] + " = " + count);
        }
    }
}
