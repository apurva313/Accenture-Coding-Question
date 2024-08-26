import java.util.Scanner;

public class LowerUpperCounter {
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        int l = 0;
        int u = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                u++;
            } else if(c >= 'a' && c <= 'z') {
                l++;
            }
        }

        System.out.println("Number of lowercase letters: " + l);
        System.out.println("Number of uppercase letters: " + u);

        if(l>u){
            s=s.toLowerCase();
        } else if(u>l){
            s=s.toUpperCase();
        }

        System.out.println("The String is: "+ s);
    }
}
