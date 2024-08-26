public class LongestCommonSubstring {

    public static int findEncodedSecret(String S1, String S2) {
        int maxLength = 0;
        String longestCommonSubstring = "";

        // Generate all substrings of S1
        for (int i = 0; i < S1.length(); i++) {
            for (int j = i + 1; j <= S1.length(); j++) {
                String subStr = S1.substring(i, j);

                // Check if this substring is present in S2
                if (S2.contains(subStr)) {
                    // Update the longest common substring if needed
                    if (subStr.length() > maxLength) {
                        maxLength = subStr.length();
                        longestCommonSubstring = subStr;
                    }
                }
            }
        }

        // If no common substring is found, return 0
        if (maxLength == 0) {
            return 0;
        }

        // Calculate the ASCII sum of the longest common substring
        int asciiSum = 0;
        for (char c : longestCommonSubstring.toCharArray()) {
            asciiSum += (int) c;
        }

        return asciiSum;
    }

    public static void main(String[] args) {
        // Test cases
        String S1 = "abcde";
        String S2 = "bcdef";

        int result = findEncodedSecret(S1, S2);
        System.out.println(result);  // Output: 394 (ASCII sum of "bcde")
    }
}
