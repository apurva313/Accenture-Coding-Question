import java.util.Scanner;

public class MaxProductPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = findMaxProductPair(arr, n);

        if (result != null) {
            System.out.println("{" + result[0] + ", " + result[1] + "}");
        } else {
            System.out.println("No valid pair found.");
        }

        sc.close();
    }

    public static int[] findMaxProductPair(int[] arr, int n) {
        int[] maxPair = null;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == 18 && arr[i] > arr[j]) {
                    int product = arr[i] * arr[j];
                    if (product > maxProduct) {
                        maxProduct = product;
                        maxPair = new int[]{arr[i], arr[j]};
                    }
                }
            }
        }
        return maxPair;
    }
}
