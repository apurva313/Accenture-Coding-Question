import java.util.*;

class Solution {
    public static int largeSmallSum(int[] arr) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        even.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);

        return even.get(even.size() - 2) + odd.get(1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(largeSmallSum(arr));
    }
}

/*
 Example

Input

arr:3 2 1 7 5 4

Output

7

Explanation

Second largest among even position elements(1 3 5) is 3
Second smallest among odd position element is 4
Thus output is 3+4 = 7
 */