import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // For the input from the user
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element is : " + max);

        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element is : " + min);

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = min;
                min = arr[i];

            }
            if (min == Integer.MIN_VALUE) {
                System.out.println("No second largest element (all elements might be equal).");
            } else {
                System.out.println("Second largest element is: " + min);
            }
        }
        sc.close();

    }
}
