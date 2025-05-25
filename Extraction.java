import java.util.Scanner;

public class Extraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int count = 0;
        while (n > 0) {
            n = n / 10;
            count = count + 1;
        }
        System.out.println("Therefore the total number of digit are : ");
        System.out.println(count);
        sc.close();
    }
}
