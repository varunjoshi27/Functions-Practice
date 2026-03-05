package Conditionals;

public class seclar {

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 5, 3, 6 };
        int largest = arr[0];
        int slargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }
}