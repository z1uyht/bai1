package bai1;
public class SumCalculator {

    public static void main(String[] args) {
        int n = 10; // Thử với n = 10
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        if (n % 2 == 0) {
            System.out.println("So chan");
        } else {
            System.out.println("So le");
        }

        System.out.println("Tong cac so tu 1 den " + n + " là: " + sum);
    }
}
