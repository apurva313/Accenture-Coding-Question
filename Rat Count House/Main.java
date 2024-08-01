import java.util.*;

public class Main {
    public static int solve(int r, int unit, int arr[], int n) {
        if (arr == null)
            return -1;
        int res = r * unit;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            count++;
            if (sum >= res)
                break;
        }
        if (sum < res)
            return 0;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the r: ");
        int r = sc.nextInt();
        System.out.println("Enter the unit: ");
        int unit = sc.nextInt();
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        System.out.println("Enter the array Element: ");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(solve(r, unit, arr, n));
    }
}