package Conditionals;

public class sorted {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 5, 6, 7 };

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {

            } else {
                System.out.println("The array is not sorted");
                return;
            }
        }
        System.out.println("Array is sorted");
    }
}
