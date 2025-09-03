public class digit {

    public static void main(String[] args) {
        int n = 6;
        int count = 0;
        while (n > 0) {
            int last = n % 10;
            System.out.println(last);
            n = n / 10;
            count++;

        }
        System.out.println(count);
    }
}