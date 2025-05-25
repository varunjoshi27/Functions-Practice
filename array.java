import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        // For taking input from the user
        int marks[] = new int[size];
        System.out.println("Enter the marks of the user");
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        // For the output of the marks we use
        System.out.println("The marks of the student are:");
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }

        sc.close();
    }
}