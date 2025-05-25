import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // For the input from the user
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // For the sum of elements
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("The sum of the elements in the array is : " + sum);
        sc.close();
    }
}
