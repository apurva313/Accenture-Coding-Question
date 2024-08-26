import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder res = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' && count == 0) {
                count = 0;
            } else if (c == '0' && count > 0) {
                res.append((char) ('A' + count - 1));
                count = 0;
            } else {
                count++;
            }
        }

        // Check if the last character is '1' and add the corresponding letter if needed
        if (s.charAt(s.length() - 1) == '1') {
            res.append((char) ('A' + count - 1));
        }

        System.out.println(res.toString());
    }
}
