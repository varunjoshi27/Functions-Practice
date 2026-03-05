package Conditionals;

public class arrlar {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 4, 0 };
        int largest = arr[0];

        // Looping for the largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element in the array is :" + largest);
    }
}
