import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for the palindrome : ");
        int n = sc.nextInt();
        int dup = n;

        int reverse = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n / 10;
        }

        if (reverse == dup) {
            System.out.println("The number " + dup + " is the palindrome number");
        } else {
            System.out.println("The number is " + dup + " not the palindrome number");
        }
        sc.close();
    }
}
