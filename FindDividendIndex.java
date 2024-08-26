import java.util.Scanner;

public class FindDividendIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array (N):");
        int n = sc.nextInt();

        int[] dividends = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            dividends[i] = sc.nextInt();
        }

        System.out.println("Enter the value of divisor (D):");
        int D = sc.nextInt();

        System.out.println("Enter the value of quotient (Q):");
        int Q = sc.nextInt();

        System.out.println("Enter the value of remainder (R):");
        int R = sc.nextInt();

        int result = findDividendIndex(dividends, D, Q, R, n);
        System.out.println(result);

        sc.close();
    }

    public static int findDividendIndex(int[] dividends, int D, int Q, int R, int n) {
        for (int i = 0; i < n; i++) {
            if (dividends[i] == (Q * D + R)) {
                return i; 
            }
        }
        return -1; 
    }
}
