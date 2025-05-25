import java.util.Scanner;

public class power {
    public static void calpower(double a, double b) {
        double sum = Math.pow(a, b);
        System.out.println("The value of one over aither is :" + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the Exponent(a)");
        double a = sc.nextInt();
        System.out.println("Enter the power of the Exponent (b)");
        double b = sc.nextInt();
        calpower(a, b);
        sc.close();
    }
}
