import java.util.Scanner;

public class OddEvenDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = calculateDifference(arr, n);
        System.out.println("Difference between sum of odd index and XOR of even index values: " + result);

        sc.close();
    }

    public static int calculateDifference(int[] arr, int n) {
        int oddIndexSum = 0;
        int evenIndexXOR = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { 
                evenIndexXOR ^= arr[i];
            } else { 
                oddIndexSum += arr[i];
            }
        }
        return oddIndexSum - evenIndexXOR;
    }
}
