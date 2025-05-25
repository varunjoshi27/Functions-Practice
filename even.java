import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        // For the user input
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evencount = 0;
        int oddcount = 0;
        // Checking the odd or even count
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evencount = evencount + 1;
            } else {
                oddcount = oddcount + 1;
            }
        }

        System.out.println("The number of even and odd Numbers are:");
        System.out.println("Even numbers are : " + evencount);
        System.out.println("Odd numbers are : " + oddcount);
        sc.close();
    }
}
