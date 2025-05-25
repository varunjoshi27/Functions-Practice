import java.util.Scanner;

public class search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Element to search : ");
        int x = sc.nextInt();

        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        // For the output
        if (index != -1) {
            System.out.println("The element is found at the index : " + index);
        } else {
            System.out.println("The element is not present in the array");
        }
        sc.close();
    }
}