import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dup = n;
        int sum = 0;
        int digits = (n == 0) ? 1 : (int) Math.log10(n) + 1;

        while (n > 0) {
            int ld = n % 10;
            n = n / 10;
            sum = sum + (int) Math.pow(ld, digits);

        }
        if (sum == dup) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}