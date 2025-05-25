import java.util.Scanner;

public class count {
    public static void Printcount() {
        int Poscount = 0;
        int Negcount = 0;
        int zerocount = 0;
        char choice;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter the number");
            int n = sc.nextInt();

            if (n < 0) {
                Negcount = Negcount + 1;
            } else if (n > 0) {
                Poscount = Poscount + 1;
            } else {
                zerocount = zerocount + 1;
            }
            System.out.println("Do you want to entr another number ? (y/n)");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Result Display;
        System.out.println("Result are:");
        System.out.println("Positive Count is :" + Poscount);
        System.out.println("Negative Count is :" + Negcount);
        System.out.println("Zero Count is : " + zerocount);
        sc.close();
    }

    public static void main(String[] args) {
        Printcount();
    }
}