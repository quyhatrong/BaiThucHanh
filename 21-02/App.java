import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int tong = 0;
            System.out.println("Nhap vao 1 so nguyen duong: ");
            int x = sc.nextInt();

            while (x <= 0) {
                System.out.println(x + " khong phai la so nguyen duong :<");
                x = sc.nextInt();
            }
            do {
                tong = tong + x % 10;
                x = x / 10;
            } while (x > 0);

            System.out.println("Tong cac chu so = " + tong);
        }
    }
}
