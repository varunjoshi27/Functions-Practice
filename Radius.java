import java.util.Scanner;

public class Radius {
    public static void calradius(float rad) {
        float cir = (float) (2 * 3.14 * rad);
        System.out.println("The circumference of the circle is :" + cir);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float rad = sc.nextFloat();
        calradius(rad);
        sc.close();

    }
}
