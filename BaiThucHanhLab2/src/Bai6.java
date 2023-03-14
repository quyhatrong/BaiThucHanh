import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number;
            do {
                System.out.println("Nhap vao so nguyen n>0: ");
                number = sc.nextInt();
            } while (number <= 0);

            long n = 1;
            for (int i = 1; i <= number; i++) {
                n = n * i;
            }

            System.out.println("Giai thua cua " + number + " la: " + n);
        }
    }
}
