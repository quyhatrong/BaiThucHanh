import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a;

            do {
                System.out.println("Nhap vao 1 so hop le (so nguyen): ");
                a = sc.nextInt();

            } while (a <= 0);

            if (a % 2 == 0) {
                System.out.println("So input la so chan !!!");
            } else {
                System.out.println("So input la so le !!!");
            }
        }
    }
}
