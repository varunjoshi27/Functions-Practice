package Array;

public class smallest {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 7, 8, 0, 1 };
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];

            }
        }
        System.out.println(smallest);
    }
}
