import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int dup = n;
        int sum = 0;
        int digits = 0;
        int temp = n;

        // Count the number of digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;
        while (temp > 0) {
            int ld = temp % 10;
            int power = 1;

            // Calculate ld raised to the power of 'digits'
            for (int i = 0; i < digits; i++) {
                power *= ld;
            }

            sum += power;
            temp = temp / 10;
        }

        if (dup == sum) {
            System.out.println(dup + " is an Armstrong number");
        } else {
            System.out.println(dup + " is not an Armstrong number");
        }

        sc.close();
    }
}
