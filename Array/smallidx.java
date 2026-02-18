package Array;

public class smallidx {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 4, 6, 0 };
        int smallest = arr[0];
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
