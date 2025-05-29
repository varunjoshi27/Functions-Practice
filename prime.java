import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you have to check the prime  : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0) {
                count++;
            }
            if (count == 2) {
                System.out.println(n + "This number is a prime number");
            } else {
                System.out.println("The given number is not the prime number");

            }
        }

        sc.close();
    }
}
