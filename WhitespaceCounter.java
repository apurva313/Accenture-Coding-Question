import java.util.Scanner;

public class WhitespaceCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String result = countWhitespace(input);
        System.out.println(result);
        sc.close();
    }

    public static String countWhitespace(String input) {
        int whitespaceCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                whitespaceCount++;
            }
        }

        String parity = (whitespaceCount % 2 == 0) ? "even" : "odd";
        String ans=whitespaceCount+":"+parity;

        return ans;

    }
}
