import java.util.Scanner;

public class Eligible {
    public static void printeligble(int age) {
        if (age >= 18) {
            System.out.println("The Person is Eligible to vote");
        } else {
            System.out.println("The person is not eligible to vote");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age = sc.nextInt();
        printeligble(age);
        sc.close();
    }
}
