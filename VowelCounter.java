import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String result = countVowels(input);
        System.out.println(result);

        sc.close();
    }

    public static String countVowels(String input) {
        int vowelCount = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        String parity = (vowelCount % 2 == 0) ? "even" : "odd";

       String ans=parity+": "+vowelCount;

       return ans;
    }
}
