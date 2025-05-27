import java.util.Scanner;

public class bubble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        // Defining the array
        int arr[] = new int[size];

        // Taking input of the elements of the array
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println("The sorted array is : ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}