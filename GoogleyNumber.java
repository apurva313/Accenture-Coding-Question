import java.util.Scanner;

public class GoogleyNumber {
    // Method to check if a number is prime
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        int num = scanner.nextInt();
        int sumOfDigits = 0;

        // Calculate the sum of digits
        while (num > 0) {
            int digit = num % 10;
            sumOfDigits += digit;
            num /= 10;
        }

        // Check if the sum of digits is prime
        boolean isPrime = checkPrime(sumOfDigits);

        // Print the result
        System.out.println(isPrime);
    }
}
