// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class LowercaseCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        
        String s = sc.nextLine();

        int lowercaseCount = 0;
        StringBuilder lowercaseCharacters = new StringBuilder();

        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                lowercaseCount++; 
                lowercaseCharacters.append(currentChar);
            }
        }
        System.out.println("Number of lowercase characters: " + lowercaseCount);
        System.out.println("Lowercase characters: " + lowercaseCharacters.toString());

        //This type of output needed!
        System.out.println(lowercaseCharacters.toString()+":"+lowercaseCount);

        sc.close();
    }
}

// public static String Lowercase(String input1, int input2){
//     int count=0;
//     String ans="";
//     for(int i=0; i<input2; i++){
//         int c=input1.charAt(i);
//         if(c>='a' && c<='z'){
//             count++;
//             ans+=c;
//         }
//     }
//     String res=c+":"+count;

//     return res;
// }
