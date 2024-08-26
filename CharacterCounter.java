import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String result = countCharacters(input);
        System.out.println(result);

        sc.close();
    }

    public static String countCharacters(String input) {
        int characterCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isWhitespace(input.charAt(i))) {
                characterCount++;
            }
        }

        String parity = (characterCount % 2 == 0) ? "even" : "odd";

        String ans=parity+": "+characterCount;

        return ans;
    }
}
