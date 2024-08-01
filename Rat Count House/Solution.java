import java.util.*;

public class Solution {
    public static int Solution(int r, int unit, int[] arr, int n) {
        int rat = r * unit;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            count++;
            if (sum >= rat) {
                return count; 
            }
        }

     //sdknlflxhb
        return 0;
    }

    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int n = 5;
        int[] arr = {1, 5, 4, 6, 8};

        int result = Solution(r, unit, arr, n);
        System.out.println(result); 
    }
}
