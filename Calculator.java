import java.util.Scanner;

public class Calculator {
    public static int printsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The sum of the odd number is: " + printsum(n));
        sc.close();
    }
}