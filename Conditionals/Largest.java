package Conditionals;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        /*
         * We can also use the in-built Math.max() function to find the largest number
         * among the three numbers as follows:
         */

        // int max = Math.max(a, Math.max(b, c));
        System.out.println("Largest number is " + max);
        in.close();
    }
}